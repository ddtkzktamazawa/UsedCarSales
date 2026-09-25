package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.FormerOwnerRequest;
import com.example.demo.entity.FormerOwner;

/**
 * 元所有者情報 Mapper
 */
@Mapper
public interface OwnerDeleteRepository {
	/**
	 * 元所有者情報削除
	 * @param form 削除用リクエストデータ
	 * @return 元所有者情報
	 */
	FormerOwner delete(FormerOwnerRequest form);
}