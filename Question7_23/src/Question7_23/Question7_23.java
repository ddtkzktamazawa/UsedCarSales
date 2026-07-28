package Question7_23;
import java.util.Scanner;
/*
 * クラス名          : Question7_23
 * 概要              : 特定の値を持つ要素のインデックスを抽出する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.26
 */
public class Question7_23 {
	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);
	/**
	 * 関数名           : arraySrchIdx
	 * メソッドの説明   : 配列aの中で値がxである全要素のインデックスを格納した配列を返す
	 * パラメータの説明 : 探索対象、探す値
	 * 返り値           : 見つかったインデックスを格納した配列
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
	 */
	public static int[] arraySrchIdx(final int[] arrayNumber, final int findValue) {
		//もし各配列数がnullの場合
		if (arrayNumber == null) {
			//返却する
			return null;
		}
		//変数countNumberを初期化する
		int countNumber = 0;
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < arrayNumber.length; i++) {
			//もしarrayNumber[i]とfindValueが一致する場合
			if (arrayNumber[i] == findValue) {
				//countNumberをインクリメントする
				countNumber++;
			}
		}
		//指定された要素数で配列を作成する
		int[] indexArray = new int[countNumber];
		//変数certainValueを初期化する
		int certainValue = 0;
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < arrayNumber.length; i++) {
			//もしarrayNumber[i]とfindValueが一致する場合
			if (arrayNumber[i] == findValue) {
				//indexArray[certainValue]をインクリメントする
				indexArray[certainValue++] = i;
			}
		}
		//indexArrayを返却する
		return indexArray;
	}
	/**
	 * 関数名           : main
	 * メソッドの説明   : 要素数、各要素の値、探索する値を入力し、
	 * 					　arraySrchIdxメソッドを呼び出して一致するインデックス一覧を表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.26
	 */
	public static void main(String[] args) {
		//"要素数："を表示する
		System.out.print("要素数：");
		//変数elementNumberに入力した値を代入する
		int elementNumber = STANDARD_INPUT.nextInt();
		//もし配列数が0以下の場合
		if (elementNumber <= 0) {
			//プログラムを終了して不正な配列作成をしない
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
		//"探す値x："を表示する
		System.out.print("探す値x：");
		//変数searchValueに入力した値を代入する
		int searchValue = STANDARD_INPUT.nextInt();
		// メソッドarraySrchIdxを呼び出す
		int[] resultValue = arraySrchIdx(arrayNumber, searchValue);
		//もしresultValue.lengthが0と一致する場合
		if (resultValue.length == 0) {
			//"該当する要素はありません。"を表示して改行する
			System.out.println("該当する要素はありません。");
			//その他の場合
		} else {
			//"一致する要素のインデックス一覧："を表示して改行する
			System.out.println("一致する要素のインデックスの配列：");
			//変数iが0から始めて1ずつ増やしていきresultValueの数繰り返す
			for (int i = 0; i < resultValue.length; i++) {
				//"resultValue[i]"を表示して改行する
				System.out.println(resultValue[i]);
			}
		}
	}
}