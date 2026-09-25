package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.CarAdditionRequest;
import com.example.demo.service.CarAdditionService;

/**
 * 車情報 Controller
 */
@Controller
public class CarAdditionController {
	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	CarAdditionService carAdditionService;

	/**
	 * 車追加画面を表示
	 * @param model Model
	 * @return 車追加処理画面
	 */
	@GetMapping(value = "/car/infoaddition")
	public String handleCarAddition(Model model) {
		model.addAttribute("carAdditionRequest", new CarAdditionRequest());
		return "car/addition";
	}

	/**
	 * 車情報追加
	 * @param form リクエストデータ
	 * @param model Model
	 * @return 車情報一覧画面
	 */
	@RequestMapping(value = "/car/info_addition", method = RequestMethod.POST)
	public String addition(@ModelAttribute CarAdditionRequest form, Model model) {
		carAdditionService.processCarAddition(form);
		model.addAttribute("message", "車情報を追加しました。");
		return "car/addition";
	}
}