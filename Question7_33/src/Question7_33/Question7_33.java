package Question7_33;
import java.util.Scanner;
/*
 * クラス名          : Question7_33
 * 概要              : 多重定義を用いて1次元配列および行ごとに列数が異なる2次元配列を表示する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.27
 */
public class Question7_33 {
	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);
	/**
	 * 関数名           : printArray
	 * メソッドの説明   : 1次元配列の全要素を要素間に1文字分のスペースを空けて表示する
	 * パラメータの説明 : 表示対象の1次元配列
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static void printArray(final int[] arrayNumber) {
		//もしarryaNumberとnullが一致する場合
		if (arrayNumber == null) {
			//返却する
			return;
		}
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < arrayNumber.length; i++) {
			//要素の間に1文字分のスペースを空けて出力する
			System.out.print(arrayNumber[i] + (i < arrayNumber.length - 1 ? " " : ""));
		}
		//改行する
		System.out.println();
	}
	/**
	 * 関数名           : printArray
	 * メソッドの説明   : 2次元配列の全要素を各列の先頭（左端）が揃うように整形して表示する
	 * 					　行ごとに列数が異なる配列にも対応
	 * パラメータの説明 : 表示対象の2次元配列
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static void printArray(final int[][] arrayNumber) {
		//もしarrayNumberとnullが一致する場合
		if (arrayNumber == null) {
			//返却する
			return;
		}
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < arrayNumber.length; i++) {
			//もしarrayNumber[i]がnullと一致する場合
			if (arrayNumber[i] == null) {
				//"null"と表示して改行する
				System.out.println("null");
				//スキップする
				continue;
			}
			//変数jが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int j = 0; j < arrayNumber[i].length; j++) {
				//左詰めで11桁分の幅を確保してarrayNumber[i][j]を表示する（数字の先頭を縦に揃える）
				System.out.printf("%-11d", arrayNumber[i][j]);
			}
			//改行する
			System.out.println();
		}
	}
	/**
	 * 関数名           : main
	 * メソッドの説明   : 1次元配列および行ごとに列数が異なる2次元配列を作成し
	 * 					　多重定義された表示メソッドの動作を検証する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static void main(String[] args) {
		//"1次元配列の表示"と表示する
		System.out.println("1次元配列の表示");
		//"要素数："と表示する
		System.out.print("要素数：");
		//変数elementNumberに入力した値を代入する
		int elementNumber = STANDARD_INPUT.nextInt();
		//もしelementNumberが0より大きい場合
		if (elementNumber > 0) {
			//指定された要素数で配列を作成する
			int[] arrayNumber= new int[elementNumber];
			//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int i = 0; i < elementNumber; i++) {
				//"arrayNumber[i]："を表示する
				System.out.print("arrayNumber[" + i + "]：");
				//arrayNumber[i]に入力した値を代入する
				arrayNumber[i] = STANDARD_INPUT.nextInt();
			}
			//"表示結果"と表示して改行する
			System.out.println("表示結果：");
			//メソッドprintArrayを呼び出す
			printArray(arrayNumber);
		}
		//改行する
		System.out.println();
		//"2次元配列の表示"と表示する
		System.out.println("2次元配列の表示");
		//"行数："と表示する
		System.out.print("行数：");
		//変数rowCountに入力した値を代入する
		int rowCount = STANDARD_INPUT.nextInt();
		//もしrowCountが0以下の場合
		if (rowCount <= 0) {
			// プログラムを終了して不正な配列作成をしない
			System.out.println("エラー：1以上を指定してください。");
			//返却する
			return;
		}
		//指定された要素数で配列を作成する
		int[][] twodArray = new int[rowCount][];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < rowCount; i++) {
			//"i+1行目の列数："と表示する
			System.out.print(i+1 + "行目の列数：");
			//変数columnCountに入力した値を代入する
			int columnCount = STANDARD_INPUT.nextInt();
			//もしcolumnCountが0より小さい場合
			if (columnCount > 0) {
				//指定された要素数で配列を作成する
				twodArray[i] = new int[columnCount];
				//変数jが0から始めて1ずつ増やしていき要素の数繰り返す
				for (int j = 0; j < columnCount; j++) {
					//"twodArray[i][j]："を表示する
					System.out.print("[" + i + "][" + j + "]：");
					//twodArray[i][j]に入力した値を代入する
					twodArray[i][j] = STANDARD_INPUT.nextInt();
				}
			}
		}
		//"表示結果（各行の先頭を揃えて表示）："を表示して改行する
		System.out.println("表示結果（各列の先頭を揃えて表示）：");
		//メソッドprintArrayを呼び出す
		printArray(twodArray);
	}
}