package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.example.demo.entity.CsvSaleHistory;

import lombok.Data;

/**
 * 販売履歴情報 検索用リクエストデータ
 */
@Data
public class CsvSaleHistoryRequest implements Serializable {
	/**
	 * 都道府県名
	 */
	private String prefecture;

	/**
	 * 販売店名
	 */
	private String shopName;

	/**
	 * 支店名
	 */
	private String branchName;

	/**
	 * 販売日
	 */
	private Date saleDate;

	/**
	 * 販売額
	 */
	private int saleAmount;

	/**
	 * メーカー名
	 */
	private String maker;

	/**
	 * タイプ名
	 */
	private String type;

	/**
	 * 車種名
	 */
	private String model;

	/**
	 * 販売履歴のリスト（CSV出力対象データ）
	 */
	private List<CsvSaleHistory> saleHistoryList;
}