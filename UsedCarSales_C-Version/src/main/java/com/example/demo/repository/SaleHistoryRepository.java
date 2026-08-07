package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.SaleHistory;

@Repository
public class SaleHistoryRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// 店舗IDと年月で検索
	public List<SaleHistory> findByBranchAndMonth(Long branchId, String month) {
		String sql = "SELECT * FROM sale_history WHERE branch_id = ? AND sale_month = ?";
		return jdbcTemplate.query(sql, DataClassRowMapper.newInstance(SaleHistory.class), branchId, month);
	}

	// 一括保存
	public void saveAll(List<SaleHistory> list) {
		String sql = "INSERT INTO sale_history (sale_history_id, branch_id, sale_date, sale_amount) VALUES (?, ?, ?, ?)";
		for (SaleHistory history : list) {
			jdbcTemplate.update(
					sql, 
					history.getSaleHistoryId(),
					history.getBranch() != null ? history.getBranch().getBranchId() : null, // Branchオブジェクトから取得
							history.getSaleDate(),
							history.getSaleAmount()
					);
		}
	}

	// CSVインポート処理
	public boolean importCsv(MultipartFile file) {
		return true;
	}

	// 全件取得
	public List<SaleHistory> findAll() {
		String sql = "SELECT * FROM sale_history";
		return jdbcTemplate.query(sql, DataClassRowMapper.newInstance(SaleHistory.class));
	}
}