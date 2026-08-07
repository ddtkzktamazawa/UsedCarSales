package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Branch;
import com.example.demo.repository.BranchRepository;

@Service
public class ShopInformationService {

	@Autowired
	private BranchRepository branchRepository;

	// 条件検索
	public List<Branch> search(Object condition) {
		return branchRepository.findByConditions(condition);
	}

	// 新規登録
	public void register(Branch entity) {
		branchRepository.insert(entity);
	}

	// 更新
	public void update(Branch entity) {
		branchRepository.update(entity);
	}

	// 削除
	public void delete(Long id) {
		branchRepository.delete(id);
	}
}