package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ShopInformationRequest;
import com.example.demo.entity.Shop;
import com.example.demo.repository.ShopInformationRepository;

/**
 * 店舗情報 Service
 */
@Service
public class ShopInformationService {
	/**
	 * 店舗情報 repository
	 */
	@Autowired
	private ShopInformationRepository shopInformationRepository;

	/**
	 * 店舗情報検索
	 * @param ShopInformationRequest リクエストデータ
	 * @return 検索結果
	 * @throws Exception 
	 */
	public List<Shop> searchShopInformation(ShopInformationRequest condition) throws Exception {
		List<Shop> list = shopInformationRepository.search(condition);
		if(list.size() != 0) {
			return shopInformationRepository.search(condition);
		}else {
			throw new Exception();
		}
	}
	/**
	 * 店舗情報追加
	 * @param ShopInformationRequest リクエストデータ
	 */ 
	public void processShopAddition(ShopInformationRequest form) {
	}
	/**
	 * 店舗情報編集
	 * @param ShopInformationRequest リクエストデータ
	 */ 
	public void processShopEdit(ShopInformationRequest form) {
	}
	/**
	 * 店舗情報削除
	 * @param shopDeleteRequest リクエストデータ
	 */ 
	public void processShopDelete(ShopInformationRequest form) {
	}
}