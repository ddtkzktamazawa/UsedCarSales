package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.CarAdditionRequest;
import com.example.demo.entity.Car;

/**
 * 車情報 Mapper
 */
@Mapper
public interface CarAdditionRepository {
	/**
	 * 車情報追加
	 * @param form 追加用リクエストデータ
	 * @return 車情報
	 */
	Car addition(CarAdditionRequest form);
}