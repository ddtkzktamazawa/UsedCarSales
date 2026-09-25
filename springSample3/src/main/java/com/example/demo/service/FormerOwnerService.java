package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.FormerOwnerRequest;
import com.example.demo.entity.FormerOwner;
import com.example.demo.repository.FormerOwnerRepository;

/**
 * 元所有者情報 Service
 */
@Service
public class FormerOwnerService {
	/**
	 * 元所有者情報 repository
	 */
	@Autowired
	private FormerOwnerRepository formerOwnerRepository;

	/**
	 * 元所有者情報検索
	 * @param FormerOwnerRequest リクエストデータ
	 * @return 検索結果
	 * @throws Exception 
	 */
	public List<FormerOwner> searchOwnerInformation(FormerOwnerRequest condition) throws Exception {
		List<FormerOwner> list = formerOwnerRepository.search(condition);
		if(list.size() != 0) {
			return formerOwnerRepository.search(condition);
		}else {
			throw new Exception();
		}
	}
	/**
	 * 元所有者情報追加
	 * @param FormerOwnerRequest リクエストデータ
	 */ 
	public void processOwnerAddition(FormerOwnerRequest form) {
	}
	/**
	 * 元所有者情報編集
	 * @param FormerOwnerRequest リクエストデータ
	 */ 
	public void processOwnerEdit(FormerOwnerRequest form) {
	}
	/**
	 * 元所有者情報削除
	 * @param ownerDeleteRequest リクエストデータ
	 */ 
	public void processOwnerDelete(FormerOwnerRequest form) {
	}
}