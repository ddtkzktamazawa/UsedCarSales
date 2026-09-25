package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.CarSaleRequest;
import com.example.demo.entity.Car;

/**
 * 車情報 Mapper
 */
@Mapper
public interface SaleHistoryAddtionRepository {
	/**
	 * 車販売履歴追加
	 * @param form 履歴追加用リクエストデータ
	 * @return 車販売履歴
	 */
	Car historyAddition(CarSaleRequest form);
}