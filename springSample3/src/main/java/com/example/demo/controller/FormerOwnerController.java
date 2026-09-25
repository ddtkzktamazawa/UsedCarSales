package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.FormerOwnerRequest;
import com.example.demo.entity.FormerOwner;
import com.example.demo.service.FormerOwnerService;

/**
 * 元所有者情報 Controller
 */
@Controller
public class FormerOwnerController {
	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	FormerOwnerService formerOwnerService;

	/**
	 * 元所有者情報検索画面を表示
	 * @param model Model
	 * @return 元所有者情報一覧画面
	 */
	@GetMapping(value = "/car/owner")
	public String handleOwnerSearch(Model model) {
		model.addAttribute("formerOwnerRequest", new FormerOwnerRequest());
		return "car/owner";
	}

	/**
	 * 元所有者情報検索
	 * @param condition リクエストデータ
	 * @param model Model
	 * @return 元所有者情報一覧画面
	 * @throws Exception
	 */
	@RequestMapping(value = "/car/id_owner", method = RequestMethod.POST)
	public String search(@ModelAttribute FormerOwnerRequest condition, Model model) throws Exception {
		List<FormerOwner> owners = formerOwnerService.searchOwnerInformation(condition);
		model.addAttribute("ownerinfo", owners);
		return "car/owner";
	}
	/**
	 * 元所有者追加画面を表示
	 * @param model Model
	 * @return 元所有者追加処理画面
	 */
	@GetMapping(value = "/car/addition")
	public String handleOwnerAddition(Model model) {
		model.addAttribute("ownerAdditionRequest", new FormerOwnerRequest());
		return "car/addition";
	}

	/**
	 * 元所有者情報追加
	 * @param form リクエストデータ
	 * @param model Model
	 * @return 元所有者情報一覧画面
	 */
	@RequestMapping(value = "/car/id_addition", method = RequestMethod.POST)
	public String addition(@ModelAttribute FormerOwnerRequest form, Model model) {
		formerOwnerService.processOwnerAddition(form);
		model.addAttribute("message", "元所有者情報を追加しました。");
		return "car/addition";
	}
	/**
	 * 元所有者編集画面を表示
	 * @param model Model
	 * @return 元所有者編集処理画面
	 */
	@GetMapping(value = "/car/edit")
	public String handleOwnerEdit(Model model) {
		model.addAttribute("ownerEditRequest", new FormerOwnerRequest());
		return "car/edit";
	}

	/**
	 * 元所有者情報編集
	 * @param form リクエストデータ
	 * @param model Model
	 * @return 元所有者情報一覧画面
	 */
	@RequestMapping(value = "/car/id_edit", method = RequestMethod.POST)
	public String edit(@ModelAttribute FormerOwnerRequest form, Model model) {
		formerOwnerService.processOwnerEdit(form);
		model.addAttribute("message", "元所有者情報を編集しました。");
		return "car/edit";
	}
	/**
	 * 元所有者削除画面を表示
	 * @param model Model
	 * @return 元所有者削除処理画面
	 */
	@GetMapping(value = "/car/delete")
	public String handleOwnerDelete(Model model) {
		model.addAttribute("ownerDeleteRequest", new FormerOwnerRequest());
		return "car/delete";
	}

	/**
	 * 元所有者情報削除
	 * @param form リクエストデータ
	 * @param model Model
	 * @return 元所有者情報一覧画面
	 */
	@RequestMapping(value = "/car/id_delete", method = RequestMethod.POST)
	public String delete(@ModelAttribute FormerOwnerRequest form, Model model) {
		formerOwnerService.processOwnerDelete(form);
		model.addAttribute("message", "元所有者情報を削除しました。");
		return "car/delete";
	}
}