package Question7_24;
import java.util.Scanner;

/*
 * クラス名          : Question7_24
 * 概要              : 指定した要素を削除した新しい配列を作成する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.26
 */
public class Question7_24 {
	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);
	// インデックス調整用の定数OFFSET（1）
	private static final int OFFSET = 1;

	/**
	 * 関数名           : arrayRmvOf
	 * メソッドの説明   : 配列からa[idx]を除去した新しい配列を生成して返却する
	 * パラメータの説明 : 元の配列、削除する位置
	 * 返り値           : 削除後の新しい配列
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.26
	 */
	public static int[] arrayRmvOf(final int[] arrayNumber1, final int idxNumber) {
		//もし各配列数がnullの場合
		if (arrayNumber1 == null) {
			//返却する
			return null;
		}
		//もしidxNumberが0より小さい、またはidxNumberがarrayNumber1以上の場合
		if (idxNumber < 0 || idxNumber >= arrayNumber1.length) {
			//指定された要素数で配列を作成する
			int[] cloneArray = new int[arrayNumber1.length];
			//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int i = 0; i < arrayNumber1.length; i++) {
				//cloneArray[i]にarrayNumber1[i]を代入する
				cloneArray[i] = arrayNumber1[i];
			}
			//cloneArrayを返却する
			return cloneArray;
		}

		//指定された要素数で配列を作成する
		int[] resultValue = new int[arrayNumber1.length - OFFSET];
		//変数certainValueを初期化する
		int certainValue = 0;
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < arrayNumber1.length; i++) {
			//もしiとidxNumberが一致する場合
			if (i == idxNumber) {
				//スキップする
				continue;
			}
			//result[certainValue++]にarrayNumber1[i]を代入する
			resultValue[certainValue++] = arrayNumber1[i];
		}
		//resultValueを返却する
		return resultValue;
	}
	/**
	 * 関数名           : main
	 * メソッドの説明   : 要素数、各要素の値、削除したいインデックスを入力し、
	 * 					　arrayRmvOfメソッドを呼び出して削除後の新しい配列を表示する
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
		int[] arrayNumber1 = new int[elementNumber];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementNumber; i++) {
			//"arrayNumber1[i]："を表示する
			System.out.print("arrayNumber1[" + i + "]：");
			//arrayNumber1[i]に入力した値を代入する
			arrayNumber1[i] = STANDARD_INPUT.nextInt();
		}
		//"削除するインデックス："を表示する
		System.out.print("削除するインデックス：");
		//idxNumberに入力した値を代入する
		int idxNumber = STANDARD_INPUT.nextInt();
		// メソッドarrayRmvOfを呼び出す
		int[] arrayNumber2 = arrayRmvOf(arrayNumber1, idxNumber);
		//変数iが0から始めて1ずつ増やしていきarrayNumber2の数繰り返す
		for (int i = 0; i < arrayNumber2.length; i++) {
			//"arrayNumber2のインデックス番号とその要素の値"を表示して改行する
			System.out.println("arrayNumber2[" + i + "] = " + arrayNumber2[i]);
		}
	}
}