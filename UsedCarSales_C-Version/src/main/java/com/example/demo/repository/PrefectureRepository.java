package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PrefectureRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// 都道府県名の一覧を取得する
	public List<String> findAllPrefectureNames() {
		String sql = "SELECT prefecture FROM prefecturecode";
		return jdbcTemplate.queryForList(sql, String.class);
	}
}