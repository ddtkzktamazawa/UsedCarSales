package com.example.demo.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.CsvSaleHistoryRequest;
import com.example.demo.dto.SaleHistoryRequest;
import com.example.demo.entity.CsvSaleHistory;
import com.example.demo.entity.SaleHistory;
import com.example.demo.repository.CsvSaleHistoryRepository;
import com.example.demo.repository.SaleHistoryGraphRepository;
import com.example.demo.repository.SaleHistoryRepository;

/**
 * 履歴情報 Service
 */
@Service
public class SaleHistoryService {
	/**
	 * 履歴情報 repository
	 */
	@Autowired
	private SaleHistoryGraphRepository saleHistoryGraphRepository;
	private SaleHistoryRepository saleHistoryRepository;
	private CsvSaleHistoryRepository csvSaleHistoryRepository;

	/**
	 * 販売履歴グラフ表示
	 */ 
	public List<SaleHistory> getAllHistory() {
		return saleHistoryGraphRepository.findAll();
	}

	/**
	 * 履歴情報検索
	 * @param SaleHistoryRequest リクエストデータ
	 * @return 検索結果
	 * @throws Exception 
	 */
	public List<SaleHistory> searchHistoryInformation(SaleHistoryRequest condition) throws Exception {
		List<SaleHistory> list = saleHistoryRepository.search(condition);
		if(list.size() != 0) {
			return saleHistoryRepository.search(condition);
		}else {
			throw new Exception();
		}
	}
	/**
	 * 販売履歴CSV出力
	 * @param CsvSaleHistoryRequest リクエストデータ
	 * @return 出力結果
	 * @throws Exception
	 */
	public void processCsvExport(CsvSaleHistoryRequest form) {
		try (CSVPrinter printer = new CSVPrinter(new FileWriter("csv.txt"), CSVFormat.EXCEL)) {
			printer.printRecord("都道府県","販売店","支店名","販売日","販売額","メーカー","タイプ","車種");
			for (CsvSaleHistory history : form.getSaleHistoryList()) {
				printer.printRecord(
						history.getPrefecture(),
						history.getShopName(),
						history.getBranchName(),
						history.getSaleDate(),
						history.getSaleAmount(),
						history.getMaker(),
						history.getType(),
						history.getModel()
						);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 販売履歴CSV取り込み
	 * @param CsvSaleHistoryRequest リクエストデータ
	 * @return 取り込み結果
	 * @throws Exception
	 */ 
	@Transactional
	public void processCsvImport(CsvSaleHistoryRequest form) throws IOException {
		try (CSVParser parser = CSVFormat.DEFAULT.parse( 
				new BufferedReader(new InputStreamReader(new FileInputStream( 
						"./src/ALL.CSV"), "Windows-31J")))) {
			for (CSVRecord record : parser) {
				CsvSaleHistory history = new CsvSaleHistory();
				history.setPrefecture(record.get("都道府県"));
				history.setShopName(record.get("販売店"));
				history.setBranchName(record.get("支店名"));

				String saleDateStr = record.get("販売日");
				history.setSaleDate(LocalDate.parse(saleDateStr));

				String saleAmountStr = record.get("販売額");
				history.setSaleAmount(Integer.parseInt(saleAmountStr));

				history.setMaker(record.get("メーカー"));
				history.setType(record.get("タイプ"));
				history.setModel(record.get("車種"));

				csvSaleHistoryRepository.csvImport(history);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}