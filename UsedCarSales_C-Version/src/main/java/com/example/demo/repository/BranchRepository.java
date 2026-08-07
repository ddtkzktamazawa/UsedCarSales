package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Branch;

@Repository
public class BranchRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// 条件検索
	public List<Branch> findByConditions(Object condition) {
		String sql = "SELECT * FROM branch";
		return jdbcTemplate.query(sql, DataClassRowMapper.newInstance(Branch.class));
	}

	// 新規登録
	public void insert(Branch entity) {
		String sql = "INSERT INTO branch (branch_id, branch_name) VALUES (?, ?)";
		jdbcTemplate.update(sql, entity.getBranchId(), entity.getBranchName());
	}

	// 更新
	public void update(Branch entity) {
		String sql = "UPDATE branch SET branch_name = ? WHERE branch_id = ?";
		jdbcTemplate.update(sql, entity.getBranchName(), entity.getBranchId());
	}

	// 削除
	public void delete(Long branchId) {
		String sql = "DELETE FROM branch WHERE branch_id = ?";
		jdbcTemplate.update(sql, branchId);
	}
	// 店舗名のリストを取得する
	public List<String> findAllBranchNames() {
		String sql = "SELECT DISTINCT 支店名 FROM shopinformation";
		return jdbcTemplate.queryForList(sql, String.class);
	}
}