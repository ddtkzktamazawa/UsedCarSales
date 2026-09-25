package com.example.demo.entity;

import java.util.Date;

import lombok.Data;

/**
 * 販売履歴グラフ表示用の情報 Entity
 */
@Data
public class DisplayGraph {
	/**
	 * 販売店
	 */
	private String shopName;

	/**
	 * 販売日
	 */
	private Date saleDate;

	/**
	 * 販売額
	 */
	private int saleAmount;
}