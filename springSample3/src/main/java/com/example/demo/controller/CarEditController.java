package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.CarEditRequest;
import com.example.demo.service.CarEditService;

/**
 * 車編集 Controller
 */
@Controller
public class CarEditController {
	/**
	 * 車編集 Service
	 */
	@Autowired
	CarEditService carEditService;

	/**
	 * 車編集画面を表示
	 * @param model Model
	 * @return 車編集処理画面
	 */
	@GetMapping(value = "/car/infoedit")
	public String handleCarEdit(Model model) {
		model.addAttribute("carEditRequest", new CarEditRequest());
		return "car/edit";
	}

	/**
	 * 車情報編集
	 * @param form リクエストデータ
	 * @param model Model
	 * @return 車情報一覧画面
	 */
	@RequestMapping(value = "/car/info_edit", method = RequestMethod.POST)
	public String edit(@ModelAttribute CarEditRequest form, Model model) {
		carEditService.processCarEdit(form);
		model.addAttribute("message", "車情報を編集しました。");
		return "car/edit";
	}
}