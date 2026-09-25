package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.CarSaleRequest;
import com.example.demo.repository.CarSaleRepository;
import com.example.demo.repository.SaleHistoryAddtionRepository;

/**
 * 車情報 Service
 */
@Service
public class CarSaleService {
	/**
	 * 車情報 repository
	 */
	@Autowired
	private CarSaleRepository carSaleRepository;
	private SaleHistoryAddtionRepository saleHistoryAddtionRepository;

	/**
	 * 車販売
	 * @param carSaleRequest リクエストデータ
	 */
	@Transactional
	public void processCarSale(CarSaleRequest form) {
		carSaleRepository.sale(form);
		saleHistoryAddtionRepository.historyAddition(form);
	}
}