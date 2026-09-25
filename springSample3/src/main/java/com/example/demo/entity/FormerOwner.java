package com.example.demo.entity;

import lombok.Data;

/**
 * 元所有者の情報 Entity
 */
@Data
public class FormerOwner {
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