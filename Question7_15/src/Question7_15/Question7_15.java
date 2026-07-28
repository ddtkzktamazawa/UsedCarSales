package Question7_15;
import java.util.Scanner;
/*
 * クラス名            :Question7_15
 * 概要                :配列の全要素の合計を求める
 * 作成者              :玉澤一輝
 * 作成日              :2026.4.23
 */
public class Question7_15 {
	/**
	 * 関数名           :sumOf
	 * メソッドの説明   :配列の全要素の合計を求めて返却する
	 * パラメータの説明 :合計を求める配列
	 * 返り値           :全要素の合計値
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	static int sumOf(int[] arrayName) {
		//配列数がnullの場合
		if (arrayName == null) {
			//0を返却
			return 0;
		}
		//変数sumValueの初期化
		int sumValue = 0;
		//変数iが0から始めて1ずつ増やしていき配列の回数繰り返す
		for (int i = 0; i < arrayName.length; i++) {
			//要素の値をsumValueに加算する
			sumValue += arrayName[i];
		}
		//合計値を返却する
		return sumValue;
	}
	/**
	 * 関数名           :main
	 * メソッドの説明   :配列の要素数を入力し要素に値を代入して合計を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		final Scanner STANDARD_INPUT = new Scanner(System.in);
		//"要素数："を表示する
		System.out.print("要素数：");
		//変数elementNumberに入力した値を代入する
		int elementNumber = STANDARD_INPUT.nextInt();
		//もし要素数が0以下の場合
		if (elementNumber <= 0) {
			//プログラムを終了して不正な配列作成をしない
			System.out.println("エラー：要素数は1以上で指定してください。");
			//返却する
			return;
		}
		// 指定された要素数で配列を作成する
		int []arrayNumber = new int[elementNumber];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementNumber; i++) {
			//"arrayNumber[i]：""を表示する
			System.out.print("arrayNumber[" + i + "]：");
			//arrayNumber[i]に入力した値を代入する
			arrayNumber[i] = STANDARD_INPUT.nextInt();
		}
		//"全要素の合計はsumOf(arrayNumber)です。"を表示して改行する
		System.out.println("全要素の合計は" + sumOf(arrayNumber) + "です。");
	}
}
