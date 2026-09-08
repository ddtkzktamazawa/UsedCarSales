package com.example.demo.entity;

import lombok.Data;

/**
 * 車の情報 Entity
 */
@Data
public class User {

	/**
	 * ID
	 */
	private String saleId;

	/**
	 * 店舗名
	 */
	private String branchName;

	/**
	 * メーカー
	 */
	private String maker;

	/**
	 * タイプ
	 */
	private String type;

	/**
	 * モデル
	 */
	private String model;

	/**
	 * 販売価格
	 */
	private int saleAmount;

	/**
	 * 元所有者ID
	 */
	private int formerOwnerId;
}