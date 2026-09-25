package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CarSearchRequest;
import com.example.demo.entity.Car;
import com.example.demo.repository.CarRepository;

/**
 * 車情報 Service
 */
@Service
public class CarService {
	/**
	 * 車情報 repository
	 */
	@Autowired
	private CarRepository carRepository;

	/**
	 * 車情報検索
	 * @param carSearchRequest リクエストデータ
	 * @return 検索結果
	 * @throws Exception 
	 */
	public List<Car> searchSaleInformation(CarSearchRequest condition) throws Exception {
		List<Car> list = carRepository.search(condition);
		if(list.size() != 0) {
			return carRepository.search(condition);
		}else {
			throw new Exception();
		}
	}

	public List<Car> getPrefectureList() {
		return carRepository.findPrefectureList();
	}
}