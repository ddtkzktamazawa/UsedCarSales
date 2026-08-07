package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.SaleHistory;
import com.example.demo.repository.SaleHistoryRepository;

@Service
public class SaleHistoryService {

	@Autowired
	private SaleHistoryRepository saleHistoryRepository;

	// 店舗IDと年月で検索
	public List<SaleHistory> findByBranchAndMonth(Long branchId, String month) {
		return saleHistoryRepository.findByBranchAndMonth(branchId, month);
	}

	// CSVインポート
	public boolean importCsv(MultipartFile file) {
		return saleHistoryRepository.importCsv(file);
	}

	// 全件取得
	public List<SaleHistory> findAll() {
		return saleHistoryRepository.findAll();
	}
}