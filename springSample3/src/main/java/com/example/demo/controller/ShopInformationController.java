package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.ShopInformationRequest;
import com.example.demo.entity.Shop;
import com.example.demo.service.ShopInformationService;

/**
 * 店舗情報 Controller
 */
@Controller
public class ShopInformationController {
	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	ShopInformationService shopInformationService;

	/**
	 * 店舗情報検索画面を表示
	 * @param model Model
	 * @return 店舗情報一覧画面
	 */
	@GetMapping(value = "/car/shop")
	public String handleShopSearch(Model model) {
		model.addAttribute("shopInformationRequest", new ShopInformationRequest());
		return "/car/shop";
	}

	/**
	 * 店舗情報検索
	 * @param condition リクエストデータ
	 * @param model Model
	 * @return 店舗情報一覧画面
	 * @throws Exception
	 */
	@RequestMapping(value = "/shop/id_search", method = RequestMethod.POST)
	public String search(@ModelAttribute ShopInformationRequest condition, Model model) throws Exception {
		List<Shop> shops = shopInformationService.searchShopInformation(condition);
		model.addAttribute("shopinfo", shops);
		return "/car/shop";
	}
	/**
	 * 店舗追加画面を表示
	 * @param model Model
	 * @return 店舗追加処理画面
	 */
	@GetMapping(value = "/shop/addition")
	public String handleShopAddition(Model model) {
		model.addAttribute("shopAdditionRequest", new ShopInformationRequest());
		return "shop/addition";
	}

	/**
	 * 店舗情報追加
	 * @param form リクエストデータ
	 * @param model Model
	 * @return 店舗情報一覧画面
	 */
	@RequestMapping(value = "/shop/id_addition", method = RequestMethod.POST)
	public String addition(@ModelAttribute ShopInformationRequest form, Model model) {
		shopInformationService.processShopAddition(form);
		model.addAttribute("message", "店舗情報を追加しました。");
		return "shop/addition";
	}
	/**
	 * 店舗編集画面を表示
	 * @param model Model
	 * @return 店舗編集処理画面
	 */
	@GetMapping(value = "/shop/edit")
	public String handleShopEdit(Model model) {
		model.addAttribute("shopEditRequest", new ShopInformationRequest());
		return "shop/edit";
	}

	/**
	 * 店舗情報編集
	 * @param form リクエストデータ
	 * @param model Model
	 * @return 店舗情報一覧画面
	 */
	@RequestMapping(value = "/shop/id_edit", method = RequestMethod.POST)
	public String edit(@ModelAttribute ShopInformationRequest form, Model model) {
		shopInformationService.processShopEdit(form);
		model.addAttribute("message", "店舗情報を編集しました。");
		return "shop/edit";
	}
	/**
	 * 店舗削除画面を表示
	 * @param model Model
	 * @return 店舗削除処理画面
	 */
	@GetMapping(value = "/shop/delete")
	public String handleShopDelete(Model model) {
		model.addAttribute("shopDeleteRequest", new ShopInformationRequest());
		return "shop/delete";
	}

	/**
	 * 店舗情報削除
	 * @param form リクエストデータ
	 * @param model Model
	 * @return 店舗情報一覧画面
	 */
	@RequestMapping(value = "/shop/id_delete", method = RequestMethod.POST)
	public String delete(@ModelAttribute ShopInformationRequest form, Model model) {
		shopInformationService.processShopDelete(form);
		model.addAttribute("message", "店舗情報を削除しました。");
		return "shop/delete";
	}
}