package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.CarSearchRequest;
import com.example.demo.entity.Car;
import com.example.demo.repository.CarRepository;
import com.example.demo.service.CarService;

/**
 * 車情報 Controller
 */
@Controller
public class CarController {
	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	CarService carService;
	@Autowired
	CarRepository carRepository;

	/**
	 * 車情報検索画面を表示
	 * @param model Model
	 * @return 車情報一覧画面
	 */
	@GetMapping(value = "/car/pos")
	public String handlecarInformation(Model model) {
		List<Car> prefectureList = carRepository.search(null);
		model.addAttribute("prefectures", prefectureList);
		model.addAttribute("carSearchRequest", new CarSearchRequest());
		return "car/pos";
	}

	/**
	 * 車情報検索
	 * @param condition リクエストデータ
	 * @param model Model
	 * @return 車情報一覧画面
	 * @throws Exception
	 */
	@RequestMapping(value = "/car/id_pos", method = RequestMethod.POST)
	public String search(@ModelAttribute CarSearchRequest condition, Model model) throws Exception {
		List<Car> cars = carService.searchSaleInformation(condition);
		model.addAttribute("carinfo", cars);
		return "car/pos";
	}
}