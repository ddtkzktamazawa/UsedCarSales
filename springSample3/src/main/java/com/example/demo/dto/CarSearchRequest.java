package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * 車情報 検索用リクエストデータ
 */
@Data
public class CarSearchRequest implements Serializable {

	/**
	 * 元所有者のID
	 */
	private Long formerOwnerId;
	
	/**
	 * ドロップダウンから選択された都道府県コード
	 */
	private String prefectureCode;
}