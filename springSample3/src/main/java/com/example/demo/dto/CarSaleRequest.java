package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 車情報 販売用リクエストデータ
 */
@Data
public class CarSaleRequest implements Serializable {

	/**
	 * 都道府県
	 */
	private String prefecture;

	/**
	 * 販売店
	 */
	private String shopName;

	/**
	 * 店舗
	 */
	private String branch;

	/**
	 * 販売日
	 */
	private Date saleDate;

	/**
	 * 販売額
	 */
	private int saleAmount;

	/**
	 * メーカー
	 */
	private String maker;

	/**
	 * タイプ
	 */
	private String type;

	/**
	 * 車種
	 */
	private String model;

	/**
	 * 元所有者Id
	 */
	private String formerOwnerId;
}