package Question7_17;
import java.util.Scanner;

/*
 * クラス名          : Question7_17
 * 概要              : 配列から指定された値を末尾側から探索する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.24
 */
public class Question7_17 {
	//インデックス調整用の定数OFFSET（1）
	private static final int OFFSET = 1;
	//インデックス調整用の定数NOT_FOUND（-1）
	private static final int NOT_FOUND = -1;
	/**
	 * 関数名           : linearSearchR
	 * メソッドの説明   : 配列の末尾側からキーと同じ値の要素を探索する
	 * パラメータの説明 : 探索対象の配列、探す値
	 * 返り値           : 見つかった要素のインデックス、見つからない場合は-1
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
	 */
	static int linearSearchR(int[] arrayNumber, int keyNumber) {
		//もし配列数がnullの場合
		if (arrayNumber == null) {
			//0を返す
			return 0;
		}
		//変数iが要素数-1から始めて1ずつ減らしていきiが0になるまでの回数繰り返す
		for (int i = arrayNumber.length - OFFSET; i >= 0; i--) {
			//もしキーと一致する要素が見つかった場合
			if (arrayNumber[i] == keyNumber) {
				//そのインデックスを返却する
				return i;
			}
		}
		//見つからなかった場合は-1を返却する
		return NOT_FOUND;
	}
	/**
	 * 関数名           : main
	 * メソッドの説明   : 配列の入力を受け取り末尾からキーを探索した結果を表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
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
		//指定された要素数で配列を作成する
		int[] arrayNumber = new int[elementNumber];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementNumber; i++) {
			//"arrayNumber[i]：""を表示する
			System.out.print("arrayNumber[" + i + "]：");
			//arrayNumber[i]に入力した値を代入する
			arrayNumber[i] = STANDARD_INPUT.nextInt();
		}
		//"探す値："を表示する
		System.out.print("探す値：");
		//変数keyNumberに入力した値を代入する
		int keyNumber = STANDARD_INPUT.nextInt();
		//linearSearchRメソッドを呼び出し変数resultIndexに末尾からキーを探索した結果を代入する
		int resultIndex = linearSearchR(arrayNumber, keyNumber);
		//もしresultIndexが-1の場合
		if (resultIndex == -1) {
			//"その値の要素は存在しません。"を表示する
			System.out.println("その値の要素は存在しません。");
			//その他の場合
		} else {
			//"それはarrayNumber[resultIndex]にあります。"を表示する
			System.out.println("それはarrayNumber[" + resultIndex + "]にあります。");
		}
	}
}