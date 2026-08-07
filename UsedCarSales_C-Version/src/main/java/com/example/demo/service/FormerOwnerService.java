package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FormerOwner;
import com.example.demo.repository.FormerOwnerRepository;

@Service
public class FormerOwnerService {

	@Autowired
	private FormerOwnerRepository formerOwnerRepository;

	// 条件検索
	public List<FormerOwner> search(Object condition) {
		return formerOwnerRepository.findByConditions(condition);
	}

	// 新規登録
	public void register(FormerOwner entity) {
		formerOwnerRepository.insert(entity);
	}

	// 更新
	public void update(FormerOwner entity) {
		formerOwnerRepository.update(entity);
	}

	// 削除
	public void delete(Long id) {
		formerOwnerRepository.delete(id);
	}
}