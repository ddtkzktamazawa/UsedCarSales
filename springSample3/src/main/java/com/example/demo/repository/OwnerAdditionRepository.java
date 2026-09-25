package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.FormerOwnerRequest;
import com.example.demo.entity.FormerOwner;

/**
 * 元所有者情報 Mapper
 */
@Mapper
public interface OwnerAdditionRepository {
	/**
	 * 元所有者情報追加
	 * @param form 追加用リクエストデータ
	 * @return 元所有者情報
	 */
	FormerOwner addition(FormerOwnerRequest form);
}