package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.CsvSaleHistory;

/**
 * 販売履歴CSV追加用情報 Mapper
 */
@Mapper
public interface CsvSaleHistoryRepository {
	/**
	 * 販売履歴CSV取り込み
	 * @param history CSV追加用リクエストデータ
	 */
	void csvImport(CsvSaleHistory history);
}