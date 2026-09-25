package com.example.demo.entity;

import lombok.Data;

/**
 * 車の情報 Entity
 */
@Data
public class Car {

	/**
	 * 車Id
	 */
	private Long saleId;

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
	 * 元所有者Id
	 */
	private String formerOwnerId;
	
	/**
     * 都道府県コード
     */
    private int prefectureId;

    /**
     * 都道府県名
     */
    private String prefecture;
}