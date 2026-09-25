package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.ShopInformationRequest;
import com.example.demo.entity.Shop;

/**
 * 車情報 Mapper
 */
@Mapper
public interface ShopAdditionRepository {
	/**
	 * 店舗情報追加
	 * @param form 追加用リクエストデータ
	 * @return 店舗情報
	 */
	Shop addition(ShopInformationRequest form);
}