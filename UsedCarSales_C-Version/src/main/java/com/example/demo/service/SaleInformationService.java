package com.example.demo.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UsedCarPrice;
import com.example.demo.repository.UsedCarPriceRepository;

@Service
public class SaleInformationService {

	@Autowired
	private UsedCarPriceRepository usedCarPriceRepository;

	// 検索処理 (未検索時は空リストを返し、検索実行時は引数をすべてRepositoryへ渡す)
	public List<UsedCarPrice> searchSalesInformation(
			boolean isSearched, 
			String prefectureName, 
			String branchName, 
			String makerName, 
			String typeName, 
			String carModelName) {

		// 検索ボタンが押されていない初期表示時は0件(空リスト)を返す
		if (!isSearched) {
			return Collections.emptyList();
		}

		// Repositoryで絞り込み検索を実行
		List<UsedCarPrice> list = usedCarPriceRepository.search(
				prefectureName, branchName, makerName, typeName, carModelName);

		// 検索した結果、該当するデータが1件もない場合
		if (list.isEmpty()) {
			throw new IllegalArgumentException("該当する中古車情報が存在しません。");
		}

		return list;
	}

	// 1件取得
	public UsedCarPrice getById(Long id) {
		UsedCarPrice car = usedCarPriceRepository.findById(id);
		if (car == null) {
			throw new IllegalArgumentException("対象の中古車情報が見つかりません。");
		}
		return car;
	}

	// 保存 (追加・更新の判定)
	public void save(UsedCarPrice car) {
		if (car.getUsedCarPriceId() == null || usedCarPriceRepository.findById(car.getUsedCarPriceId()) == null) {
			usedCarPriceRepository.insert(car);
		} else {
			usedCarPriceRepository.update(car);
		}
	}

	// 削除
	public void delete(Long id) {
		usedCarPriceRepository.delete(id);
	}
}