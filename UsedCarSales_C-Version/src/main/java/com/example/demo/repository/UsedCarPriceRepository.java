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
import com.example.demo.entity.Maker;
import com.example.demo.entity.Prefecture;
import com.example.demo.entity.UsedCarPrice;

@Repository
public class UsedCarPriceRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// RowMapper: saleinformation テーブルの構造にマッピング
	private final RowMapper<UsedCarPrice> rowMapper = (rs, rowNum) -> {
		UsedCarPrice car = new UsedCarPrice();

		// saleId は varchar(20) なので、Longに変換するかエンティティ側を合わせる必要があります
		// ここでは一旦 Long にパースする例（もしエンティティ側が String なら rs.getString("saleId") にしてください）
		try {
			car.setUsedCarPriceId(Long.parseLong(rs.getString("saleId")));
		} catch (Exception e) {
			car.setUsedCarPriceId(0L);
		}

		car.setPrice(rs.getInt("saleAmount"));

		// Branch
		Branch branch = new Branch();
		branch.setBranchName(rs.getString("branchName"));

		// 必要に応じてshopinformationなどから都道府県を引くか、ここでは一旦空、または結合した結果を入れる
		car.setBranch(branch);

		// CarType
		CarType carType = new CarType();
		carType.setCarTypeName(rs.getString("type"));
		car.setCarType(carType);

		// Maker & CarModel
		Maker maker = new Maker();
		maker.setMakerName(rs.getString("maker"));

		CarModel carModel = new CarModel();
		carModel.setCarModelName(rs.getString("model"));
		carModel.setMaker(maker);
		car.setCarModel(carModel);

		return car;
	};

	// 絞り込み検索 (動的SQL & LIKE検索)
	// 絞り込み検索 (動的SQL & LIKE検索)
	public List<UsedCarPrice> search(String prefectureName, String branchName, String makerName, String typeName, String carModelName) {
		StringBuilder sql = new StringBuilder(
				"SELECT s.saleId, s.branchName, s.maker, s.type, s.model, s.saleAmount, si.prefecture AS prefecture_name " +
						"FROM saleinformation s " +
						"LEFT JOIN shopinformation si ON s.branchName = si.branchName " +
						"WHERE 1=1"
				);
		List<Object> params = new ArrayList<>();

		// 都道府県名 (shopinformation側のカラムで絞り込み)
		if (prefectureName != null && !prefectureName.trim().isEmpty()) {
			sql.append(" AND si.prefecture LIKE ?");
			params.add("%" + prefectureName.trim() + "%");
		}
		// 店舗名
		if (branchName != null && !branchName.trim().isEmpty()) {
			sql.append(" AND s.branchName LIKE ?");
			params.add("%" + branchName.trim() + "%");
		}
		// メーカー名
		if (makerName != null && !makerName.trim().isEmpty()) {
			sql.append(" AND s.maker LIKE ?");
			params.add("%" + makerName.trim() + "%");
		}
		// タイプ名
		if (typeName != null && !typeName.trim().isEmpty()) {
			sql.append(" AND s.type LIKE ?");
			params.add("%" + typeName.trim() + "%");
		}
		// 車種名
		if (carModelName != null && !carModelName.trim().isEmpty()) {
			sql.append(" AND s.model LIKE ?");
			params.add("%" + carModelName.trim() + "%");
		}

		return jdbcTemplate.query(sql.toString(), (rs, rowNum) -> {
			UsedCarPrice car = rowMapper.mapRow(rs, rowNum);
			if (car != null && car.getBranch() != null) {
				Prefecture pref = new Prefecture();
				// si.prefecture の値を取得（NULL安全）
				pref.setPrefectureName(rs.getString("prefecture_name"));
				car.getBranch().setPrefecture(pref);
			}
			return car;
		}, params.toArray());
	}

	// IDによる1件取得
	public UsedCarPrice findById(Long id) {
		String sql = "SELECT * FROM saleinformation WHERE saleId = ?";
		List<UsedCarPrice> list = jdbcTemplate.query(sql, rowMapper, id);
		return list.isEmpty() ? null : list.get(0);
	}

	// 新規追加 (INSERT)
	public void insert(UsedCarPrice car) {
		String sql = "INSERT INTO saleinformation (saleId, branchName, maker, type, model, saleAmount) " +
				"VALUES (?, ?, ?, ?, ?, ?)";

		jdbcTemplate.update(sql, 
				car.getUsedCarPriceId() != null ? String.valueOf(car.getUsedCarPriceId()) : null,
						car.getBranch() != null ? car.getBranch().getBranchName() : null,
								(car.getCarModel() != null && car.getCarModel().getMaker() != null) ? car.getCarModel().getMaker().getMakerName() : null,
										car.getCarType() != null ? car.getCarType().getCarTypeName() : null,
												car.getCarModel() != null ? car.getCarModel().getCarModelName() : null,
														car.getPrice()
				);
	}

	// 編集・更新 (UPDATE)
	public void update(UsedCarPrice car) {
		String sql = "UPDATE saleinformation SET branchName = ?, maker = ?, type = ?, model = ?, saleAmount = ? " +
				"WHERE saleId = ?";

		jdbcTemplate.update(sql, 
				car.getBranch() != null ? car.getBranch().getBranchName() : null,
						(car.getCarModel() != null && car.getCarModel().getMaker() != null) ? car.getCarModel().getMaker().getMakerName() : null,
								car.getCarType() != null ? car.getCarType().getCarTypeName() : null,
										car.getCarModel() != null ? car.getCarModel().getCarModelName() : null,
												car.getPrice(),
												car.getUsedCarPriceId() != null ? String.valueOf(car.getUsedCarPriceId()) : null
				);
	}

	// 削除 (DELETE)
	public void delete(Long id) {
		String sql = "DELETE FROM saleinformation WHERE saleId = ?";
		jdbcTemplate.update(sql, String.valueOf(id));
	}
}