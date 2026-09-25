package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.CsvSaleHistoryRequest;
import com.example.demo.dto.SaleHistoryRequest;
import com.example.demo.entity.SaleHistory;
import com.example.demo.service.SaleHistoryService;

/**
 * 履歴情報 Controller
 */
@Controller
public class SaleHistoryController {
	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	SaleHistoryService saleHistoryService;

	/**
	 * 販売履歴グラフを表示
	 * @return 販売履歴グラフ画面
	 */
	@GetMapping(value = "/history/graphdisplay")
	public String displayHistoryGraph() {
		return "history/graphdisplay";
	}

	/**
	 * 販売履歴グラフ表示
	 * @param model Model
	 * @return 履歴情報一覧画面
	 */
	@RequestMapping(value = "/history/id_graphdisplay", method = RequestMethod.POST)
	public String display(Model model) {
		List<SaleHistory> saleHistory = saleHistoryService.getAllHistory();
		model.addAttribute("historygraphinfo", saleHistory);
		return "history/graphdisplay";
	}

	/**
	 * 販売履歴情報検索画面を表示
	 * @param model Model
	 * @return 販売履歴情報一覧画面
	 */
	@GetMapping(value = "/car/history")
	public String handleHistorySearch(Model model) {
		model.addAttribute("saleHistoryRequest", new SaleHistoryRequest());
		return "/car/history";
	}

	/**
	 * 販売履歴情報検索
	 * @param condition リクエストデータ
	 * @param model Model
	 * @return 販売履歴情報一覧画面
	 * @throws Exception
	 */
	@RequestMapping(value = "/history/id_search", method = RequestMethod.POST)
	public String search(@ModelAttribute SaleHistoryRequest condition, Model model) throws Exception {
		List<SaleHistory> saleHistory = saleHistoryService.searchHistoryInformation(condition);
		model.addAttribute("historyinfo", saleHistory);
		return "/car/history";
	}

	/**
	 * CSV出力を表示
	 * @param model Model
	 * @return CSV出力処理画面
	 */
	@GetMapping(value = "/history/csvexport")
	public String handleCsvExport(Model model) {
		model.addAttribute("csvSaleHistoryRequest", new CsvSaleHistoryRequest());
		return "history/csvexport";
	}

	/**
	 * 販売履歴CSV出力
	 * @param condition リクエストデータ
	 * @param model Model
	 * @return 販売履歴CSV出力画面
	 */
	@RequestMapping(value = "/history/id_csvexport", method = RequestMethod.POST)
	public String csvExport(@ModelAttribute CsvSaleHistoryRequest form, Model model) {
		saleHistoryService.processCsvExport(form);
		model.addAttribute("message", "販売履歴CSVファイルを出力しました。");
		return "history/csvexport";
	}
	/**
	 * CSV取り込みを表示
	 * @param model Model
	 * @return CSV取り込み処理画面
	 */
	@GetMapping(value = "/history/csvimport")
	public String handleCsvImport(Model model) {
		model.addAttribute("csvSaleHistoryRequest", new CsvSaleHistoryRequest());
		return "history/csvimport";
	}

	/**
	 * 販売履歴CSV取り込み
	 * @param condition リクエストデータ
	 * @param model Model
	 * @return 販売履歴CSV取り込み画面
	 */
	@RequestMapping(value = "/history/id_csvimport", method = RequestMethod.POST)
	public String csvImport(@ModelAttribute CsvSaleHistoryRequest form, Model model) throws Exception{
		saleHistoryService.processCsvImport(form);
		model.addAttribute("message", "販売履歴CSVファイルを取り込みました。");
		return "history/csvimport";
	}
}