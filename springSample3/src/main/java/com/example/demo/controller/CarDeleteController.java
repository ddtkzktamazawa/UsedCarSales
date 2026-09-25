package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.CarDeleteRequest;
import com.example.demo.service.CarDeleteService;

/**
 * 車削除 Controller
 */
@Controller
public class CarDeleteController {
	/**
	 * 車削除 Service
	 */
	@Autowired
	CarDeleteService carDeleteService;

	/**
	 * 車削除画面を表示
	 * @param model Model
	 * @return 車削除処理画面
	 */
	@GetMapping(value = "/car/infodelete")
	public String handleCarDelete(Model model) {
		model.addAttribute("carDeleteRequest", new CarDeleteRequest());
		return "car/delete";
	}

	/**
	 * 車情報削除
	 * @param form リクエストデータ
	 * @param model Model
	 * @return 車情報一覧画面
	 */
	@RequestMapping(value = "/car/info_delete", method = RequestMethod.POST)
	public String delete(@ModelAttribute CarDeleteRequest form, Model model) {
		carDeleteService.processCarDelete(form);
		model.addAttribute("message", "車情報を削除しました。");
		return "car/delete";
	}
}