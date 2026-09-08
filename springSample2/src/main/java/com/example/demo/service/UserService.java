package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;

/**
 * ユーザー情報 Service
 */
@Service
public class UserService {
	/**
	 * ユーザー情報 Mapper
	 */
	@Autowired
	private UserMapper userMapper;

	/**
	 * ユーザー情報検索
	 * @param userSearchRequest リクエストデータ
	 * @return 検索結果
	 * @throws Exception 
	 */
	public List<User> searchSaleInformation(UserSearchRequest condition) throws Exception {
		List<User> list = userMapper.search(condition);
		if(list.size() != 0) {
			return userMapper.search(condition);
		}else {
			throw new Exception();
		}
	}
}