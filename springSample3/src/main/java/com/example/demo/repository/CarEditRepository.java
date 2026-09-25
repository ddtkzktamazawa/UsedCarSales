package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.CarEditRequest;
import com.example.demo.entity.Car;

/**
 * 車情報 Mapper
 */
@Mapper
public interface CarEditRepository {
	/**
	 * 車情報編集
	 * @param form 編集用リクエストデータ
	 * @return 車情報
	 */
	Car edit(CarEditRequest form);
}