package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.ShopInformationRequest;
import com.example.demo.entity.Shop;

/**
 * 元所有者情報 Mapper
 */
@Mapper
public interface ShopDeleteRepository {
	/**
	 * 店舗情報削除
	 * @param form 削除用リクエストデータ
	 * @return 店舗情報
	 */
	Shop delete(ShopInformationRequest form);
}