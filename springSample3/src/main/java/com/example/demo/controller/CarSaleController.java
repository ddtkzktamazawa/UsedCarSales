package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.CarSaleRequest;
import com.example.demo.service.CarSaleService;

/**
 * 車情報 Controller
 */
@Controller
public class CarSaleController {
	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	CarSaleService carSaleService;

	/**
	 * 車情報販売画面を表示
	 * @param model Model
	 * @return 車情報一覧画面
	 */
	@GetMapping(value = "/car/sale")
	public String handleCarSale(Model model) {
		model.addAttribute("carSaleRequest", new CarSaleRequest());
		return "car/sale";
	}

	/**
	 * 車情報販売
	 * @param condition リクエストデータ
	 * @param model Model
	 * @return 車情報一覧画面
	 */
	@RequestMapping(value = "/car/id_sale", method = RequestMethod.POST)
	public String sale(@ModelAttribute CarSaleRequest form, Model model) {
		carSaleService.processCarSale(form);
		model.addAttribute("message", "車を販売しました。");
		return "car/sale";
	}
}