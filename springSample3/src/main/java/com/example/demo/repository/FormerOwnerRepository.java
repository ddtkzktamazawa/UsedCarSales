package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.FormerOwnerRequest;
import com.example.demo.entity.FormerOwner;

/**
 * 元所有者情報 Mapper
 */
@Mapper
public interface FormerOwnerRepository {
	/**
	 * 元所有者情報検索
	 * @param condition 検索用リクエストデータ
	 * @return 元所有者情報
	 */
	List<FormerOwner> search(FormerOwnerRequest condition);
}