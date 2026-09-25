package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * 車情報 編集用リクエストデータ
 */
@Data
public class CarEditRequest implements Serializable {

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
	 * 元所有者Id
	 */
	private String formerOwnerId;
}