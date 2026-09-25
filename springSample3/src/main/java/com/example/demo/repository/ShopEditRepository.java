package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.ShopInformationRequest;
import com.example.demo.entity.Shop;

/**
 * 元所有者情報 Mapper
 */
@Mapper
public interface ShopEditRepository {
	/**
	 * 店舗情報編集
	 * @param form 編集用リクエストデータ
	 * @return 店舗情報
	 */
	Shop edit(ShopInformationRequest form);
}