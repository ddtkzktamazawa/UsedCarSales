package com.example.demo.entity;

import java.time.LocalDate;

import lombok.Data;

/**
 * CSV用販売履歴の情報 Entity
 */
@Data
public class CsvSaleHistory {
	/**
	 * 都道府県名
	 */
	//@CsvBindByName(column = "都道府県", required = true)
	private String prefecture;

	/**
	 * 販売店名
	 */
	//@CsvBindByName(column = "販売店", required = true)
	private String shopName;

	/**
	 * 支店名
	 */
	//@CsvBindByName(column = "支店名", required = true)
	private String branchName;

	/**
	 * 販売日
	 */
	//@CsvBindByName(column = "販売日", required = true)
	private LocalDate saleDate;

	/**
	 * 販売額
	 */
	//@CsvBindByName(column = "販売額", required = true)
	private int saleAmount;

	/**
	 * メーカー名
	 */
	//@CsvBindByName(column = "メーカー", required = true)
	private String maker;

	/**
	 * タイプ名
	 */
	//@CsvBindByName(column = "タイプ", required = true)
	private String type;

	/**
	 * 車種名
	 */
	//@CsvBindByName(column = "車種", required = true)
	private String model;
}