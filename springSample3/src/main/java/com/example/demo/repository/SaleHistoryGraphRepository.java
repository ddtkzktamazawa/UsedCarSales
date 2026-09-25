package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.SaleHistory;

/**
 * 販売履歴情報 Mapper
 */
@Mapper
public interface SaleHistoryGraphRepository {
	/**
	 * 販売履歴グラフ表示
	 */
	List<SaleHistory> findAll();
}