package Question5_4;
import java.util.Scanner;
/*
 * クラス名:Question5_4
 * 概要    :3つの整数値を読み込んでその合計と平均値を表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.15
 */
public class Question5_4 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :3つの整数値を読み込んでその合計と平均値を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.15
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//"1つ目の整数値 :"を表示する
		System.out.print("1つ目の整数値 :");
		//firstNumberに数を読み込む
		int firstValue = standardInput.nextInt();
		//"2つ目の整数値 :"を表示する
		System.out.print("2つ目の整数値 :");
		//secondValueに数を読み込む
		int secondValue = standardInput.nextInt();
		//"3つ目の整数値 :"を表示する
		System.out.print("3つ目の整数値 :");
		//thirdValueに数を読み込む
		int thirdValue = standardInput.nextInt();
		//sumValueに1つ目の入力値と2つ目の入力値3つ目の入力値を足した値を代入する
		int sumValue = firstValue + secondValue + thirdValue;
		//"合計は+sumValue+平均はsumValue/3.0"を表示して改行する
		System.out.println("合計は" + sumValue + "平均は" + sumValue / 3.0);
	}
}
