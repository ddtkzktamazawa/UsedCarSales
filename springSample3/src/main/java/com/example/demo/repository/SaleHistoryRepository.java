package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.SaleHistoryRequest;
import com.example.demo.entity.SaleHistory;

/**
 * 元所有者情報 Mapper
 */
@Mapper
public interface SaleHistoryRepository {
	/**
	 * 販売履歴情報検索
	 * @param condition 検索用リクエストデータ
	 * @return 販売履歴情報
	 */
	List<SaleHistory> search(SaleHistoryRequest condition);
}