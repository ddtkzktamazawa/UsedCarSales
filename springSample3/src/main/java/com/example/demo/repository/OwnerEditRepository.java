package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.FormerOwnerRequest;
import com.example.demo.entity.FormerOwner;

/**
 * 元所有者情報 Mapper
 */
@Mapper
public interface OwnerEditRepository {
	/**
	 * 元所有者情報編集
	 * @param form 編集用リクエストデータ
	 * @return 元所有者情報
	 */
	FormerOwner edit(FormerOwnerRequest form);
}