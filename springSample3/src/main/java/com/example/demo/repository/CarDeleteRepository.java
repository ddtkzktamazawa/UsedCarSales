package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.CarDeleteRequest;
import com.example.demo.entity.Car;

/**
 * 車情報 Mapper
 */
@Mapper
public interface CarDeleteRepository {
	/**
	 * 車情報削除
	 * @param form 削除用リクエストデータ
	 * @return 車情報
	 */
	Car delete(CarDeleteRequest form);
}