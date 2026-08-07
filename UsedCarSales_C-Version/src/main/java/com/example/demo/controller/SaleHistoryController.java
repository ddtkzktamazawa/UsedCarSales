package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.SaleHistory;
import com.example.demo.service.SaleHistoryService;

@Controller
@RequestMapping("/sale-history")
public class SaleHistoryController {

	@Autowired
	private SaleHistoryService saleHistoryService;

	// 一覧画面の表示
	@GetMapping("/list")
	public String list(Model model) {
		List<SaleHistory> list = saleHistoryService.findAll();
		model.addAttribute("saleHistoryList", list);
		return "saleHistory/list";
	}
}