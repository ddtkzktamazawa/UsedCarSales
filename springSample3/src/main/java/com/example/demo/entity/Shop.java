package com.example.demo.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * 元所有者情報 検索用リクエストデータ
 */
@Data
public class Shop implements Serializable {
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