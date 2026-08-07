package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CarModel;

@Repository
public class CarModelRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<CarModel> findAll() {
		String sql = "SELECT * FROM car_model";
		return jdbcTemplate.query(sql, DataClassRowMapper.newInstance(CarModel.class));
	}

	public List<CarModel> findByMakerCode(String makerCode) {
		String sql = "SELECT * FROM car_model WHERE maker_code = ?";
		return jdbcTemplate.query(sql, DataClassRowMapper.newInstance(CarModel.class), makerCode);
	}
	// 車種名のリストを取得する
	public List<String> findAllModelNames() {
		String sql = "SELECT DISTINCT 車種 FROM carmodel_price";
		return jdbcTemplate.queryForList(sql, String.class);
	}
}