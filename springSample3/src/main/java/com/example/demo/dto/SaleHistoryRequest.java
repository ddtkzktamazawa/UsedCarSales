package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 販売履歴情報 検索用リクエストデータ
 */
@Data
public class SaleHistoryRequest implements Serializable {
	/**
	 * 販売店
	 */
	private String shopName;

	/**
	 * 販売日
	 */
	private Date saleDate;
}
