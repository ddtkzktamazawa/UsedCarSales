package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Branch;
import com.example.demo.entity.CarModel;
import com.example.demo.entity.CarType;
import com.example.demo.entity.Dealer;
import com.example.demo.entity.Maker;
import com.example.demo.entity.Prefecture;
import com.example.demo.entity.UsedCarPrice;

@Repository
public class UsedCarPriceRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// RowMapper: DBの検索結果をオブジェクト階層構造にマッピング
	private final RowMapper<UsedCarPrice> rowMapper = (rs, rowNum) -> {
		UsedCarPrice car = new UsedCarPrice();
		car.setUsedCarPriceId(rs.getLong("owner_id"));
		car.setPrice(rs.getInt("used_price"));

		// Prefecture -> Dealer -> Branch 構造の生成
		Prefecture prefecture = new Prefecture();
		prefecture.setPrefectureName(rs.getString("prefecture_name"));

		Dealer dealer = new Dealer();
		dealer.setPrefecture(prefecture);

		Branch branch = new Branch();
		branch.setBranchName(rs.getString("branch_name"));
		branch.setDealer(dealer);
		car.setBranch(branch);

		// CarType
		CarType carType = new CarType();
		carType.setCarTypeName(rs.getString("type_name"));
		car.setCarType(carType);

		// Maker
		Maker maker = new Maker();
		maker.setMakerName(rs.getString("maker_name"));

		// CarModel (Makerをセット)
		CarModel carModel = new CarModel();
		carModel.setCarModelName(rs.getString("car_model_name"));
		carModel.setMaker(maker);
		car.setCarModel(carModel);

		return car;
	};

	// 絞り込み検索 (動的SQL & LIKE検索)
	public List<UsedCarPrice> search(String prefectureName, String branchName, String makerName, String typeName, String carModelName) {
		StringBuilder sql = new StringBuilder("SELECT * FROM used_car_prices WHERE 1=1");
		List<Object> params = new ArrayList<>();

		// 都道府県名 (部分一致検索)
		if (prefectureName != null && !prefectureName.trim().isEmpty()) {
			sql.append(" AND prefecture_name LIKE ?");
			params.add("%" + prefectureName.trim() + "%");
		}
		// 店舗名
		if (branchName != null && !branchName.trim().isEmpty()) {
			sql.append(" AND branch_name LIKE ?");
			params.add("%" + branchName.trim() + "%");
		}
		// メーカー名
		if (makerName != null && !makerName.trim().isEmpty()) {
			sql.append(" AND maker_name LIKE ?");
			params.add("%" + makerName.trim() + "%");
		}
		// タイプ名
		if (typeName != null && !typeName.trim().isEmpty()) {
			sql.append(" AND type_name LIKE ?");
			params.add("%" + typeName.trim() + "%");
		}
		// 車種名
		if (carModelName != null && !carModelName.trim().isEmpty()) {
			sql.append(" AND car_model_name LIKE ?");
			params.add("%" + carModelName.trim() + "%");
		}

		return jdbcTemplate.query(sql.toString(), rowMapper, params.toArray());
	}

	// IDによる1件取得
	public UsedCarPrice findById(Long id) {
		String sql = "SELECT * FROM used_car_prices WHERE owner_id = ?";
		List<UsedCarPrice> list = jdbcTemplate.query(sql, rowMapper, id);
		return list.isEmpty() ? null : list.get(0);
	}

	// 新規追加 (INSERT)
	public void insert(UsedCarPrice car) {
		String sql = "INSERT INTO used_car_prices (prefecture_name, branch_name, maker_name, type_name, car_model_name, used_price, owner_id) " +
				"VALUES (?, ?, ?, ?, ?, ?, ?)";

		jdbcTemplate.update(sql, 
				getPrefectureNameFromCar(car),
				car.getBranch() != null ? car.getBranch().getBranchName() : null,
						(car.getCarModel() != null && car.getCarModel().getMaker() != null) ? car.getCarModel().getMaker().getMakerName() : null,
								car.getCarType() != null ? car.getCarType().getCarTypeName() : null,
										car.getCarModel() != null ? car.getCarModel().getCarModelName() : null,
												car.getPrice(),
												car.getUsedCarPriceId()
				);
	}

	// 編集・更新 (UPDATE)
	public void update(UsedCarPrice car) {
		String sql = "UPDATE used_car_prices SET prefecture_name = ?, branch_name = ?, maker_name = ?, type_name = ?, car_model_name = ?, used_price = ? " +
				"WHERE owner_id = ?";

		jdbcTemplate.update(sql, 
				getPrefectureNameFromCar(car),
				car.getBranch() != null ? car.getBranch().getBranchName() : null,
						(car.getCarModel() != null && car.getCarModel().getMaker() != null) ? car.getCarModel().getMaker().getMakerName() : null,
								car.getCarType() != null ? car.getCarType().getCarTypeName() : null,
										car.getCarModel() != null ? car.getCarModel().getCarModelName() : null,
												car.getPrice(),
												car.getUsedCarPriceId()
				);
	}

	// 削除 (DELETE)
	public void delete(Long id) {
		String sql = "DELETE FROM used_car_prices WHERE owner_id = ?";
		jdbcTemplate.update(sql, id);
	}

	// UsedCarPriceオブジェクトから都道府県名を取得するヘルパーメソッド
	private String getPrefectureNameFromCar(UsedCarPrice car) {
		if (car.getBranch() != null && 
				car.getBranch().getDealer() != null && 
				car.getBranch().getDealer().getPrefecture() != null) {
			return car.getBranch().getDealer().getPrefecture().getPrefectureName();
		}
		return null;
	}
}