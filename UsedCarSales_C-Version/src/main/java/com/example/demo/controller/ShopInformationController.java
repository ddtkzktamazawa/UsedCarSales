package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Branch;
import com.example.demo.service.ShopInformationService;

@Controller
@RequestMapping("/shop-information")
public class ShopInformationController {

	@Autowired
	private ShopInformationService shopInformationService;

	// 一覧画面の表示
	@GetMapping("/list")
	public String list(Model model) {
		List<Branch> list = shopInformationService.search(null);
		model.addAttribute("shopList", list);
		return "shopInformation/list";
	}
}