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
		// ※DBの列名が日本語の「都道府県名」になっている場合
		String sql = "SELECT 都道府県名 FROM prefecturecode";
		return jdbcTemplate.queryForList(sql, String.class);
	}
}