package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.CarSaleRequest;
import com.example.demo.entity.Car;

/**
 * 車情報 Mapper
 */
@Mapper
public interface CarSaleRepository {
	/**
	 * 車販売
	 * @param form 販売用リクエストデータ
	 * @return 車情報
	 */
	Car sale(CarSaleRequest form);
}