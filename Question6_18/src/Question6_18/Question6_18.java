package Question6_18;
import java.util.Scanner;
/*
 * クラス名:Question6_18
 * 概要    :行数、各行の列数、各要素を読み込む
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.21
 */
public class Question6_18 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :行数、各行の列数、各要素を読み込む
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.21
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//"行数："と表示する
		System.out.print("行数：");
		//変数rowCountに入力した数を代入する
		int rowCount = standardInput.nextInt();
		//int型を構成要素型とする配列を構成要素型とする配列の宣言
		int[][] arrayNumber = new int[rowCount][];
		//変数iを0から始め1ずつ増やし、要素数まで繰り返す
		for (int i = 0; i < arrayNumber.length; i++) {
			//"(i+1)行目の列数："と表示する
			System.out.print((i + 1) + "行目の列数：");
			//変数rowCountに入力した数を代入する
			int colCount = standardInput.nextInt();
			//int型を構成要素型とする配列を構成要素型とする配列の宣言
			arrayNumber[i] = new int[colCount];
		}
		//"各要素の値："を表示して改行する
		System.out.println("各要素の値：");
		//変数iを0から始め1ずつ増やし、要素数まで繰り返す
		for (int i = 0; i < arrayNumber.length; i++) {
			//変数jを0から始め1ずつ増やし、要素数まで繰り返す
			for (int j = 0; j < arrayNumber[i].length; j++) {
				//"(i+1)行(j+1)列目："と表示する
				System.out.print((i + 1) + "行" + (j + 1) + "列目：");
				//変数arrayNumber[i][j]に入力した数を代入する
				arrayNumber[i][j] = standardInput.nextInt();
			}
		}
		//改行する
		System.out.println();
		//変数iを0から始め1ずつ増やし、要素数まで繰り返す
		for (int i = 0; i < arrayNumber.length; i++) {
			//変数jを0から始め1ずつ増やし、要素数まで繰り返す
			for (int j = 0; j < arrayNumber[i].length; j++) {
				//arrayNumber[i][j]を少なくとも三桁で表示する
				System.out.printf("%3d", arrayNumber[i][j]);
			}
			//改行する
			System.out.println();
		}
	}
}
