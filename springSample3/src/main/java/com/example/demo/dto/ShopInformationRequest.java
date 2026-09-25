package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * 店舗情報 検索用リクエストデータ
 */
@Data
public class ShopInformationRequest implements Serializable {
	/**
	 * 都道府県名
	 */
	private String prefecture;

	/**
	 * 店舗名
	 */
	private String shopName;

	/**
	 * 支店名
	 */
	private String branch;

}