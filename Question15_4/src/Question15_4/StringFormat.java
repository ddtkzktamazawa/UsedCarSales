package Question15_4;

/**
 * クラス名         : StringFormat
 * 概要				: 浮動小数点数の表示形式を制御して表示する
 * @author 			: 玉澤 一輝
 * 作成日			: 2026.05.15
 */
public class StringFormat {

	/**
	 * 関数名           : printDouble
	 * メソッドの説明 	: 浮動小数点数floatingNumbersを、小数点以下decimalPlaces桁、
	 * 					  全体を少なくともtotalDigits桁の幅で表示する。
	 * @param 			: floatingNumbers(浮動小数点数値)、decimalPlaces(小数点以下の桁数)、
	 * 					  totalDigits(全体の最小表示幅)
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日 			: 2026.05.15
	 */
	public static void printDouble(double floatingNumbers, int decimalPlaces, int totalDigits) {
		//もしdecimalPlacesが0以下の場合
		if (decimalPlaces <= 0) {
			//decimalPlacesに1を代入する
			decimalPlaces = 1;
		}
		//もしtotalDigitsが0以下の場合
		if (totalDigits <= 0) {
			//totalDigitsに1を代入する
			totalDigits = 1;
		}
		//String.formatを用いて書式文字列を作成する
		String formatString = String.format("%%%d.%df", totalDigits, decimalPlaces);

		//作成した書式文字列を指定された形式で数値を表示する
		System.out.printf(formatString, floatingNumbers);
	}

	/**
	 * 関数名           : main
	 * メソッドの説明 	: printDoubleメソッドを呼び出し、異なる桁数指定での表示結果を確認する
	 * @param args 		: なし
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日 			: 2026.05.15
	 */
	public static void main(String[] args) {
		//double型の変数valueNumberに1234.56789を代入する
		double valueNumber = 1234.56789;
		//"元の数値:valueNumber"を表示して改行する
		System.out.println("元の数値: " + valueNumber);
		//区切る
		System.out.println("-------------------------");
		//確認①全体15, 小数4でテスト("全体15, 小数4: ["を表示する)
		System.out.print("全体15, 小数 4: [");
		//メソッドprintDoubleを呼び出して15桁小数点以下4桁で表示する
		printDouble(valueNumber, 4, 15);
		//"]"を表示して改行する
		System.out.println();
		//確認②全体10, 小数2でテスト("全体10, 小数2: ["を表示する)
		System.out.print("全体10, 小数 2: [");
		//メソッドprintDoubleを呼び出して10桁小数点以下2桁で表示する
		printDouble(valueNumber, 2, 10);
		//"]"を表示して改行する
		System.out.println("]");
		//確認③全体1, 小数5でテスト("全体1, 小数5: ["を表示する)
		System.out.print("全体 1, 小数 5: [");
		//メソッドprintDoubleを呼び出して1桁小数点以下5桁(幅の自動拡張)で表示する
		printDouble(valueNumber, 5, 1);
		//"]"を表示して改行する
		System.out.println("]");
		//確認④全体-1, 小数-1でテスト("全体1, 小数5: ["を表示する)
		System.out.print("全体-1, 小数-1: [");
		//メソッドprintDoubleを呼び出して-1桁小数点以下-1桁で表示する
		//実際は不可能なので、整数部の表示と、小数点以下を1桁表示する
		printDouble(valueNumber, -1, -1);
		//"]"を表示して改行する
		System.out.println("]");
	}
}

