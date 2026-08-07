package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.FormerOwner;
import com.example.demo.service.FormerOwnerService;

@Controller
@RequestMapping("/former-owner")
public class FormerOwnerController {

	@Autowired
	private FormerOwnerService formerOwnerService;

	// 一覧画面の表示
	@GetMapping("/list")
	public String list(Model model) {
		List<FormerOwner> list = formerOwnerService.search(null);
		model.addAttribute("formerOwnerList", list);
		return "formerOwner/list";
	}
}