package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Maker;

@Repository
public class MakerRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Maker> findAll() {
		String sql = "SELECT * FROM maker";
		return jdbcTemplate.query(sql, DataClassRowMapper.newInstance(Maker.class));
	}
	// メーカー名のリストを取得する
	public List<String> findAllMakerNames() {
		String sql = "SELECT DISTINCT メーカー FROM carmodel_price";
		return jdbcTemplate.queryForList(sql, String.class);
	}
}