package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * 元所有者情報 検索用リクエストデータ
 */
@Data
public class FormerOwnerRequest implements Serializable {
	/**
	 * 元所有者Id
	 */
	private Long formerOwnerId;

	/**
	 * 名前
	 */
	private String name;

	/**
	 * 性別
	 */
	private String sex;

	/**
	 * 年齢
	 */
	private int age;
}