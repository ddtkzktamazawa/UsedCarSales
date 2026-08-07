package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CarType;

@Repository
public class CarTypeRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<CarType> findAll() {
		String sql = "SELECT * FROM car_type";
		return jdbcTemplate.query(sql, DataClassRowMapper.newInstance(CarType.class));
	}
	// タイプ名のリストを取得する
	public List<String> findAllTypeNames() {
		String sql = "SELECT DISTINCT タイプ FROM carmodel_price";
		return jdbcTemplate.queryForList(sql, String.class);
	}
}