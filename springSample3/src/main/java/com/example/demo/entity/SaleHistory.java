package com.example.demo.entity;

import java.util.Date;

import lombok.Data;

/**
 * 販売履歴の情報 Entity
 */
@Data
public class SaleHistory {
	/**
	 * 販売履歴Id
	 */
	private String saleHistoryId;

	/**
	 * 都道府県名
	 */
	private String prefecture;

	/**
	 * 販売店
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
	 * 車種
	 */
	private String model;
}