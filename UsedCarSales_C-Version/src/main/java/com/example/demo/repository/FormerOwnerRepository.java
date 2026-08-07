package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.FormerOwner;

@Repository
public class FormerOwnerRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// 条件検索
	public List<FormerOwner> findByConditions(Object condition) {
		String sql = "SELECT * FROM former_owner";
		return jdbcTemplate.query(sql, DataClassRowMapper.newInstance(FormerOwner.class));
	}

	// 新規登録
	public void insert(FormerOwner entity) {
		String sql = "INSERT INTO former_owner (owner_id, owner_name) VALUES (?, ?)";
		jdbcTemplate.update(sql, entity.getFormerOwnerId(), entity.getOwnerName());
	}

	// 更新
	public void update(FormerOwner entity) {
		String sql = "UPDATE former_owner SET owner_name = ? WHERE owner_id = ?";
		jdbcTemplate.update(sql, entity.getOwnerName(), entity.getFormerOwnerId());
	}

	// 削除
	public void delete(Long ownerId) {
		String sql = "DELETE FROM former_owner WHERE owner_id = ?";
		jdbcTemplate.update(sql, ownerId);
	}
}