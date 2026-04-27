package Question7_25;
import java.util.Scanner;

/*
 * クラス名 : Question7_25
 * 概要 : 配列から指定された範囲の要素を削除した新しい配列を作成する
 * 作成者 : 玉澤一輝
 * 作成日 : 2026.4.26
 */
public class Question7_25 {
	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);

	/**
	 * 関数名 : arrayRmvOfN
	 * メソッドの説明 : 配列aからa[idx]を先頭とするn個の要素を削除した新しい配列を返す
	 * パラメータの説明 : 元の配列、削除開始位置、削除する個数
	 * 返り値 : 削除後の新しい配列
	 * 作成者 : 玉澤一輝
	 * 作成日 : 2026.4.26
	 */
	public static int[] arrayRmvOfN(final int[] arrayNumber, final int idxNumber, int certainElements) {
		//もし各配列数がnullの場合
		if (arrayNumber == null) {
			//返却する
			return null;
		}
		//もしcertainElementsが0以下、またはidxNumberが0より小さい、またはidxNumberがarrayNumber以上の場合
		if (certainElements <= 0 || idxNumber < 0 || idxNumber >= arrayNumber.length) {
			//指定された要素数で配列を作成する
			int[] cloneArray = new int[arrayNumber.length];
			//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int i = 0; i < arrayNumber.length; i++) {
				//cloneArray[i]にarrayNumber[i]を代入する
				cloneArray[i] = arrayNumber[i];
				//cloneArrayを返却する
			}
			return cloneArray;
		}
		//もしidxNumber+certainElementsがarrayNumberより大きい場合
		if (idxNumber + certainElements > arrayNumber.length) {
			//certainElementsにarrayNumber-idxNumberを代入する
			certainElements = arrayNumber.length - idxNumber;
		}
		//指定された要素数で配列を作成する
		int[] resultValue = new int[arrayNumber.length - certainElements];
		//変数certainValueを初期化する
		int certainValue = 0;
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < arrayNumber.length; i++) {
			//もしiがidxNumberより小さい、またはiがidxNumber+certainElements以上の場合
			if (i < idxNumber || i >= idxNumber + certainElements) {
				//result[certainValue++]にarrayNumber[i]を代入する
				resultValue[certainValue++] = arrayNumber[i];
			}
		}
		//resultValueを返却する
		return resultValue;
	}

	/**
	 * 関数名 : main
	 * メソッドの説明 : 要素数、各要素の値、削除範囲を入力し
	 * arrayRmvOfNメソッドを呼び出して結果を表示する
	 * パラメータの説明 : なし
	 * 返り値 : なし
	 * 作成者 : 玉澤一輝
	 * 作成日 : 2026.4.26
	 */
	public static void main(String[] args) {
		//"要素数："を表示する
		System.out.print("要素数：");
		//変数elementNumberに入力した値を代入する
		int elementNumber = STANDARD_INPUT.nextInt();
		// もし配列数が0以下の場合
		if (elementNumber <= 0) {
			// プログラムを終了して不正な配列作成をしない
			System.out.println("エラー：1以上を指定してください。");
			// 返却する
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
		//"削除するインデックス："を表示する
		System.out.print("削除開始インデックス：");
		//idxNumberに入力した値を代入する
		int idxNumber = STANDARD_INPUT.nextInt();
		//"削除する個数："を表示する
		System.out.print("削除する個数：");
		//certainElementsに入力した値を代入する
		int certainElements = STANDARD_INPUT.nextInt();
		// メソッドarrayRmvOfNを呼び出す
		int[] resultNumber = arrayRmvOfN(arrayNumber, idxNumber, certainElements);
		//変数iが0から始めて1ずつ増やしていきresultNumberの数繰り返す
		for (int i = 0; i < resultNumber.length; i++) {
			//"resultNumberのインデックス番号とその要素の値"を表示して改行する
			System.out.println("resultNumber[" + i + "] = " + resultNumber[i]);
		}
	}
}