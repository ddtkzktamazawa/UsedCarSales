package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.ShopInformationRequest;
import com.example.demo.entity.Shop;

/**
 * 元所有者情報 Mapper
 */
@Mapper
public interface ShopInformationRepository {
	/**
	 * 店舗情報検索
	 * @param condition 検索用リクエストデータ
	 * @return 店舗情報
	 */
	List<Shop> search(ShopInformationRequest condition);
}