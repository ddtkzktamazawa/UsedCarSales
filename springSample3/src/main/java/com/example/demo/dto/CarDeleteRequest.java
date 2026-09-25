package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * 車情報 削除用リクエストデータ
 */
@Data
public class CarDeleteRequest implements Serializable {

	/**
	 * 店舗
	 */
	private String branch;

	/**
	 * 車種
	 */
	private String model;

	/**
	 * 販売額
	 */
	private int saleAmount;

	/**
	 *販売車Id
	 */
	private String saleId;
}