package Question7_30;
import java.util.Scanner;

/*
 * クラス名          : Question7_30
 * 概要              : 2つの数、3つの数、および配列の要素の最小値を求めるメソッドの多重定義
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.27
 */
public class Question7_30 {
	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);

	/**
	 * 関数名           : min
	 * メソッドの説明   : 二つの整数の最小値を返却する
	 * パラメータの説明 : 探索対象の整数
	 * 返り値           : 最小値（配列が空の場合は0を返す）
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static int min(int compareValue1, int compareValue2) {
		// 比較する二値の小さい方の値を返却する
		return compareValue1 < compareValue2 ? compareValue1 : compareValue2;
	}

	/**
	 * 関数名           : min
	 * メソッドの説明   : 三つの整数の最小値を返却する
	 * パラメータの説明 : 探索対象の整数
	 * 返り値           : 最小値（配列が空の場合は0を返す）
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static int min(int compareValue1, int compareValue2, int compareValue3) {
		//変数minimunNumberにcompareValue1を代入する
		int minimunNumber = compareValue1;
		//もしcompareValue2がminimunNumberより小さい場合
		if (compareValue2 < minimunNumber) 
			//minimunNumberにcompareValue2を代入する
			minimunNumber = compareValue2;
		//もしcompareValue3がminimunNumberより小さい場合
		if (compareValue3 < minimunNumber) 
			//minimunNumberにcompareValue3を代入する
			minimunNumber = compareValue3;
		//minimunNumberを返却する
		return minimunNumber;
	}

	/**
	 * 関数名           : min
	 * メソッドの説明   : 配列の全要素の中の最小値を返却する
	 * パラメータの説明 : 探索対象の配列
	 * 返り値           : 最小値（配列が空の場合は0を返す）
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static int min(final int[] arrayNumber) {
		//もしarrayNumberとnullが一致、またはarrayNumberが0と一致する場合
		if (arrayNumber == null || arrayNumber.length == 0) {
			//返却する
			return 0;
		}
		//変数minimunNumberにarrayNumber[0]を代入する
		int minimunNumber = arrayNumber[0];
		//変数iが1から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 1; i < arrayNumber.length; i++) {
			//もしarrayNumber[i]がminimunNumberより小さい場合
			if (arrayNumber[i] < minimunNumber) {
				//minimunNumberにarrayNumberを代入する
				minimunNumber = arrayNumber[i];
			}
		}
		//minimunNumberを返却する
		return minimunNumber;
	}

	/**
	 * 関数名           : main
	 * メソッドの説明   : 二数、三数、および配列の各要素を入力し
	 * 					　多重定義されたそれぞれのminメソッドの動作を確認する。
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static void main(String[] args) {
		//"整数a："を表示する
		System.out.print("整数a："); 
		//変数にfirstNumber入力した値を代入する
		int firstNumber = STANDARD_INPUT.nextInt();
		//"整数b："を表示する
		System.out.print("整数b："); 
		//変数にsecondNumber入力した値を代入する
		int secondNumber = STANDARD_INPUT.nextInt();
		//"整数c："を表示する
		System.out.print("整数c："); 
		//変数にthirdNumber入力した値を代入する
		int thirdNumber = STANDARD_INPUT.nextInt();

		System.out.println("a, bの最小値は " + min(firstNumber, secondNumber) + " です。");
		//"a, b,cの最小値はmin(firstNumber, secondNumber, thirdNumber)です。"と表示して改行する
		System.out.println("a, b, cの最小値は " + min(firstNumber, secondNumber, thirdNumber) + " です。");
		//"配列の要素数："を表示する
		System.out.print("配列の要素数：");
		//変数elementNumberに入力した値を代入する
		int elementNumber = STANDARD_INPUT.nextInt();

		// もし配列数が0以下の場合
		if (elementNumber <= 0) {
			// プログラムを終了して不正な配列作成をしない
			System.out.println("エラー：1以上を指定してください。");
			//返却する
			return;
		}
		//指定された要素数で配列を作成する
		int[] arrayNumber = new int[elementNumber];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementNumber; i++) {
			//"arrayNumber[i]："を表示する
			System.out.print("arrayNumber[" + i + "]：");
			//arrayNumber[i]に入力した値を代入する
			arrayNumber[i] = STANDARD_INPUT.nextInt();
		}
		//"配列aの最小値はmin(arrayNumber)です。"と表示して改行する
		System.out.println("配列aの最小値は " + min(arrayNumber) + " です。");
	}
}