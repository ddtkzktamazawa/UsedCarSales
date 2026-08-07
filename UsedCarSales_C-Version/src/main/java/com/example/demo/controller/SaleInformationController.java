package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.UsedCarPrice;
import com.example.demo.repository.BranchRepository;
import com.example.demo.repository.CarModelRepository;
import com.example.demo.repository.CarTypeRepository;
import com.example.demo.repository.MakerRepository;
import com.example.demo.repository.PrefectureRepository;
import com.example.demo.service.SaleInformationService;

@Controller
@RequestMapping("/sales-information")
public class SaleInformationController {

	@Autowired
	private SaleInformationService saleInformationService;

	@Autowired
	private PrefectureRepository prefectureRepository;

	// ▼ コメントアウトを外して有効化する
	@Autowired
	private BranchRepository branchRepository;
	@Autowired
	private MakerRepository makerRepository;
	@Autowired
	private CarTypeRepository carTypeRepository;
	@Autowired
	private CarModelRepository carModelRepository;

	/**
	 * プルダウン用の各種マスタリストをModelに一括設定するヘルパーメソッド
	 */
	private void addDropdownListsToModel(Model model) {
		model.addAttribute("prefectureList", prefectureRepository.findAllPrefectureNames());

		// ▼ こちらもコメントアウトを外して有効化する
		model.addAttribute("branchList", branchRepository.findAllBranchNames());
		model.addAttribute("makerList", makerRepository.findAllMakerNames());
		model.addAttribute("typeNameList", carTypeRepository.findAllTypeNames());
		model.addAttribute("carModelList", carModelRepository.findAllModelNames());
	}

	// 1. 初期表示(0件) ＆ 検索実行
	@GetMapping("/list")
	public String listSalesInformation(
			@RequestParam(name = "action", required = false) String action,
			@RequestParam(required = false) String prefectureName,
			@RequestParam(required = false) String branchName,
			@RequestParam(required = false) String makerName,
			@RequestParam(required = false) String typeName,
			@RequestParam(required = false) String carModelName,
			Model model) {

		boolean isSearched = "search".equals(action);

		try {
			List<UsedCarPrice> carList = saleInformationService.searchSalesInformation(
					isSearched, prefectureName, branchName, makerName, typeName, carModelName);
			model.addAttribute("carList", carList);
		} catch (IllegalArgumentException e) {
			model.addAttribute("errorMessage", e.getMessage());
		}

		// プルダウン用リストをセット
		addDropdownListsToModel(model);

		return "sale-information/list";
	}

	// 2. 新規追加画面表示
	@GetMapping("/add")
	public String showAddForm(Model model) {
		model.addAttribute("usedCarPrice", new UsedCarPrice());
		addDropdownListsToModel(model);
		return "sale-information/form";
	}

	// 3. 編集画面表示
	@GetMapping("/edit/{id}")
	public String showEditForm(@PathVariable Long id, Model model) {
		try {
			UsedCarPrice car = saleInformationService.getById(id);
			model.addAttribute("usedCarPrice", car);
			addDropdownListsToModel(model);
			return "sale-information/form";
		} catch (IllegalArgumentException e) {
			model.addAttribute("errorMessage", e.getMessage());
			return "forward:/sales-information/list";
		}
	}

	// 4. 保存実行 (追加・編集の登録ボタン押下時)
	@PostMapping("/save")
	public String save(@ModelAttribute UsedCarPrice car, Model model) {
		try {
			saleInformationService.save(car);
			return "redirect:/sales-information/list";
		} catch (IllegalArgumentException e) {
			model.addAttribute("errorMessage", e.getMessage());
			model.addAttribute("usedCarPrice", car);
			addDropdownListsToModel(model);
			return "sale-information/form";
		}
	}

	// 5. 販売・削除実行
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		try {
			saleInformationService.delete(id);
		} catch (IllegalArgumentException e) {
			model.addAttribute("errorMessage", e.getMessage());
		}
		return "redirect:/sales-information/list";
	}
}