package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.CarSearchRequest;
import com.example.demo.entity.Car;

/**
 * 車情報 Mapper
 */
@Mapper
public interface CarRepository {
	/**
	 * 車情報検索
	 * @param condition 検索用リクエストデータ
	 * @return 車情報
	 */
	List<Car> search(CarSearchRequest condition);
	
	List<Car> findPrefectureList();

}