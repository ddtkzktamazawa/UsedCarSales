package Question7_21;
import java.util.Scanner;
/*
 * クラス名          : Question7_21
 * 概要              : 二つの配列の中身をすべて交換する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.24
 */
public class Question7_21 {
	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);
	/**
	 * 関数名           : aryExchng
	 * メソッドの説明   : 2つの配列の全要素を交換する、要素数が異なる場合は小さい方の要素数に合わせて交換
	 * パラメータの説明 : 交換対象となる二つの配列
	 *					 （引数がnullの場合は処理を行わず終了する）
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
	 */
	public static void aryExchng(final int[] firstArray, final int[] secondArray) {
		//もし各配列数がnullの場合
		if (firstArray == null || secondArray == null) {
			//返却する
			return;
		}
		//小さい方の要素数を出す
		int minimumLength = (firstArray.length < secondArray.length) ? firstArray.length : secondArray.length;
		//変数iが0から始めて1ずつ増やしていき小さいほうの要素の数繰り返す
		for (int i = 0; i < minimumLength; i++) {
			//変数tに1つ目の配列のi番目の要素を代入する
			int t = firstArray[i];
			//1つ目の配列のi番目の要素に2つ目の配列のi番目の要素を代入する
			firstArray[i] = secondArray[i];
			//2つ目の配列のi番目の要素にtを代入する
			secondArray[i] = t;
		}
	}

	/**
	 * 関数名           : main
	 * メソッドの説明   : 二つの配列の要素数と値をそれぞれ入力し交換後の結果を表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
	 */
	public static void main(String[] args) {
		//"配列firstArrayの要素数："を表示する
		System.out.print("配列firstArrayの要素数：");
		//変数elementCountAに入力した値を代入する
		int elementCountA = STANDARD_INPUT.nextInt();
		//もし1つ目の配列数が0以下の場合
		if (elementCountA <= 0) {
			//プログラムを終了して不正な配列作成をしない
			System.out.println("エラー：要素数は1以上で指定してください。");
			//返却する
			return;
		}
		//指定された要素数で配列を作成する
		int[] firstArray = new int[elementCountA];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementCountA; i++) {
			//"firstArray[i]：""を表示する
			System.out.print("firstArray[" + i + "]：");
			//firstArray[i]に入力した値を代入する
			firstArray[i] = STANDARD_INPUT.nextInt();
		}
		//"配列secondArrayの要素数："を表示する
		System.out.print("配列secondArrayの要素数：");
		//変数elementCountBに入力した値を代入する
		int elementCountB = STANDARD_INPUT.nextInt();
		//もし1つ目の配列数が0以下の場合
		if (elementCountB <= 0) {
			//プログラムを終了して不正な配列作成をしない
			System.out.println("エラー：要素数は1以上で指定してください。");
			//返却する
			return;
		}
		//指定された要素数で配列を作成する
		int[] secondArray = new int[elementCountB];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementCountB; i++) {
			//"secondArray[i]：""を表示する
			System.out.print("secondArray[" + i + "]：");
			//secondArray[i]に入力した値を代入する
			secondArray[i] = STANDARD_INPUT.nextInt();
		}
		//メソッドaryRmvを呼び出す
		aryExchng(firstArray, secondArray);
		//"配列firstArrayとsecondArrayの全要素を交換しました。"を表示して改行する
		System.out.println("配列firstArrayとsecondArrayの全要素を交換しました。");
		//変数iが0から始めて1ずつ増やしていきelementCountAの数繰り返す
		for (int i = 0; i < elementCountA; i++) {
			//"firstArrayのインデックス番号とその要素の値"を表示する
			System.out.println("firstArray[" + i + "] = " + firstArray[i]);
		}
		//改行する
		System.out.println();
		//変数iが0から始めて1ずつ増やしていきelementCountBの数繰り返す
		for (int i = 0; i < elementCountB; i++) {
			//"secondArrayのインデックス番号とその要素の値"を表示する
			System.out.println("secondArray[" + i + "] = " + secondArray[i]);
		}
	}
}