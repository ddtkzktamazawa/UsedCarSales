package Question7_18;
import java.util.Scanner;
/*
 * クラス名          : Question7_18
 * 概要              : 配列から指定したインデックスの要素を削除する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.24
 */
public class Question7_18 {
	//インデックス調整用の定数OFFSET（1）
	private static final int OFFSET = 1;
	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);
	/**
	 * 関数名           : aryRmv
	 * メソッドの説明   : 配列の要素[idx]を削除しそれ以降の要素を前にずらす
	 * パラメータの説明 : 対象の配列、削除する要素のインデックス
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
	 */
	public static void aryRmv(int[] arrayNumber, int indexNumber) {
		//もし配列数がnullの場合
		if (arrayNumber == null) {
			//返却する
			return;
		}
		//もしインデックス0以上、要素数より少ない場合
		if (indexNumber >= 0 && indexNumber < arrayNumber.length) {
			//変数iがindexNumberから始めて1ずつ増やしていき要素数-1回繰り返す
			for (int i = indexNumber; i < arrayNumber.length - OFFSET; i++) {
				//arrayNumber[i+1]をarrayNumber[i]に代入して1つずつ前にずれる	
				arrayNumber[i] = arrayNumber[i + OFFSET];
			}
		}
	}
	/**
	 * 関数名           : main
	 * メソッドの説明   : 配列の入力を受け取り指定位置の要素を削除した結果を表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
	 */
	public static void main(String[] args) {
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
		//指定された要素数で配列を作成する
		int[] arrayNumber = new int[elementNumber];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementNumber; i++) {
			//"arrayNumber[i]：""を表示する
			System.out.print("arrayNumber[" + i + "]：");
			//arrayNumber[i]に入力した値を代入する
			arrayNumber[i] = STANDARD_INPUT.nextInt();
		}
		//"削除するインデックス："を表示する
		System.out.print("削除するインデックス：");
		//変数indexNumberに入力した値を代入する
		int indexNumber = STANDARD_INPUT.nextInt();
		//メソッドaryRmvを呼び出し配列からindexNumber番目の要素を取り除く
		aryRmv(arrayNumber, indexNumber);
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementNumber; i++) {
			//"indexNumber番目の要素を取り除いた後それ以降の要素を前にずらした配列"を表示する
			System.out.println("arrayNumber[" + i + "] = " + arrayNumber[i]);
		}
	}
}