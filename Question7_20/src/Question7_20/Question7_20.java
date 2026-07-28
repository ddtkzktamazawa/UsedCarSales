package Question7_20;
import java.util.Scanner;
/*
 * クラス名          : Question7_20
 * 概要              : 配列の指定した位置に値を挿入する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.24
 */
public class Question7_20 {
	//ンデックス調整用の定数OFFSET（1）
	private static final int OFFSET = 1;
	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);
	/**
	 * 関数名           : aryIns
	 * メソッドの説明   : 配列の要素[idx]に値を挿入しそれ以降を後ろにずらす
	 * パラメータの説明 : 対象の配列、挿入位置、挿入する値
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
	 */
	public static void aryIns(int[] arrayNumber, int indexNumber, int insertNumber) {
		//もし配列数がnullの場合
		if (arrayNumber == null) {
			//返却する
			return;
		}
		//もしインデックス0以上、要素数より少ない場合
		if (indexNumber >= 0 && indexNumber < arrayNumber.length) {
			//"挿入エラー：インデックスが範囲外です。"を表示して改行する
			System.out.println("挿入エラー：インデックスが範囲外です。");
			//返却する
			return;
		}
		//変数iが配列の最後のインデックスから始めて1ずつ減らしていきインデックスまで繰り返す
		for (int i = arrayNumber.length - 1; i > indexNumber; i--) {
			//arrayNumber[i-1]をarrayNumber[i]に代入して1つずつ後ろにずれる
			arrayNumber[i] = arrayNumber[i - 1];
		}
		// 指定された位置に値を代入する
		arrayNumber[indexNumber] = insertNumber;
	}

	/**
	 * 関数名           : main
	 * メソッドの説明   : 配列の入力を受け取り指定位置への値の挿入を実行して表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//"要素数："を表示する
		System.out.print("要素数：");
		//変数elementNumberに入力した値を代入する
		int elementNumber = standardInput.nextInt();
		//もし要素数が0以下の場合
		if (elementNumber <= 0) {
			//プログラムを終了して不正な配列作成をしない
			System.out.println("エラー：要素数は1以上で指定してください。");
			//返却する
			return;
		}
		//指定された要素数で配列を作成する
		int[] arrayNumber = new int[elementNumber];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementNumber; i++) {
			//"arrayNumber[i]：""を表示する
			System.out.print("arrayNumber[" + i + "]：");
			//arrayNumber[i]に入力した値を代入する
			arrayNumber[i] = standardInput.nextInt();
		}
		//"挿入するインデックス："を表示する
		System.out.print("挿入するインデックス：");
		//変数indexNumberに入力した値を代入する
		int indexNumber = standardInput.nextInt();
		//"挿入する個数："を表示する
		System.out.print("挿入する値：");
		//変数insertNumberに入力した値を代入する
		int insertNumber = standardInput.nextInt();
		//メソッドaryInsを呼び出し要素を後ろにずらして新しい値を割り込ませる
		aryIns(arrayNumber, indexNumber, insertNumber);
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementNumber; i++) {
			//"挿入処理が終わった後の配列の各要素のインデックスと値"を表示する
			System.out.println("arrayNumber[" + i + "] = " + arrayNumber[i]);
		}
	}
}