package Question7_27;
import java.util.Scanner;

/*
 * クラス名          : Question7_27
 * 概要              : 二つの行列x, yのサイズを個別に読み込み一致する場合のみ和をzに格納する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.27
 */
public class Question7_27 {

	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);

	/**
	 * 関数名           : addMatrix
	 * メソッドの説明   : 三つの行列x, y, zの行数・列数が同一であることを確認し
	 * 					　同一であればxとyの和をzに格納する
	 * パラメータの説明 : 加算元、格納先
	 * 返り値           : サイズが同一で加算に成功すればtrue、そうでなければfalse
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static boolean addMatrix(final int[][] arrayNumber1, final int[][] arrayNumber2, final int[][] arrayNumber3) {
		//もしarrayNumber1がnullと一致、またはarrayNumber2がnullと一致、またはarrayNumber3がnullと一致する場合
		if (arrayNumber1 == null || arrayNumber2 == null || arrayNumber3 == null) {
			//返却する
			return false;
		}

		//もしarrayNumber1とarrayNumber2が等しくない、またはarrayNumber2とarrayNumber3が等しくない場合
		if (arrayNumber1.length != arrayNumber2.length || arrayNumber2.length != arrayNumber3.length) {
			//返却する
			return false;
		}
		//変数iが0から始めて1ずつ増やしていき要素1の数繰り返す
		for (int i = 0; i < arrayNumber1.length; i++) {
			//列のnullチェックをする
			if (arrayNumber1[i] == null || arrayNumber2[i] == null || arrayNumber3[i] == null) {
				//返却する
				return false;
			}
			// 列数の比較をする
			if (arrayNumber1[i].length != arrayNumber2[i].length || arrayNumber2[i].length != arrayNumber3[i].length) {
				//返却する
				return false;
			}
		}
		//変数iが0から始めて1ずつ増やしていき要素（arrayNumber1）の数繰り返す
		for (int i = 0; i < arrayNumber1.length; i++) {
			//変数jが0から始めて1ずつ増やしていき要素（arrayNumber1）の数繰り返す
			for (int j = 0; j < arrayNumber1[i].length; j++) {
				//arrayNumber3[i][j]にarrayNumber1[i][j]+arrayNumber2[i][j]を代入する
				arrayNumber3[i][j] = arrayNumber1[i][j] + arrayNumber2[i][j];
			}
		}
		//返却する
		return true;
	}

	/**
	 * 関数名           : main
	 * メソッドの説明   : 行列x, yのサイズと値を個別に入力しサイズが一致すれば
	 * 					　行列zに和を求めて表示し一致しなければエラーを表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static void main(String[] args) {

		//"行列xのサイズを入力してください。"を表示する
		System.out.println("行列xのサイズを入力してください。");
		//"行数"を表示する
		System.out.print("行数：");
		//変数rowNumberXに入力した値を代入する
		int rowNumberX = STANDARD_INPUT.nextInt();
		//"列数"を表示する
		System.out.print("列数：");
		//変数columnNumberXに入力した値を代入する
		int columnNumberX = STANDARD_INPUT.nextInt();
		// もし配列数が0以下の場合
		if (rowNumberX <= 0 || columnNumberX <= 0) {
			// プログラムを終了して不正な配列作成をしない
			System.out.println("エラー：1以上を指定してください。");
			// 返却する
			return;
		}
		//指定された要素数で配列を作成する
		int[][] matrixNumberX = new int[rowNumberX][columnNumberX];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < rowNumberX; i++) {
			//変数jが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int j = 0; j < columnNumberX; j++) {
				//"x[i][j]："を表示する
				System.out.print("x[" + i + "][" + j + "]：");
				//matrixNumberX[i][j]に入力した値を代入する
				matrixNumberX[i][j] = STANDARD_INPUT.nextInt();
			}
		}

		//"行列yのサイズを入力してください。"を表示する
		System.out.println("行列yのサイズを入力してください。");
		//"行数"を表示する
		System.out.print("行数：");
		//変数rowNumberYに入力した値を代入する
		int rowNumberY = STANDARD_INPUT.nextInt();
		//"列数"を表示する
		System.out.print("列数：");
		//変数columnNumberYに入力した値を代入する
		int columnNumberY = STANDARD_INPUT.nextInt();

		// もし配列数が0以下の場合
		if (rowNumberY <= 0 || columnNumberY <= 0) {
			// プログラムを終了して不正な配列作成をしない
			System.out.println("エラー：1以上を指定してください。");
			// 返却する
			return;
		}
		//指定された要素数で配列を作成する
		int[][] matrixNumberY = new int[rowNumberY][columnNumberY];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < rowNumberY; i++) {
			//変数jが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int j = 0; j < columnNumberY; j++) {
				//"y[i][j]："を表示する
				System.out.print("y[" + i + "][" + j + "]：");
				//matrixNumberY[i][j]に入力した値を代入する
				matrixNumberY[i][j] = STANDARD_INPUT.nextInt();
			}
		}

		//指定された要素数で配列を作成する
		int[][] matrixNumberZ = new int[rowNumberX][columnNumberX];
		//"行列の加算を試行します。"を表示して改行する
		System.out.println("行列の加算を試行します。");
		// メソッドaddMatrixを呼び出す
		boolean addSuccess = addMatrix(matrixNumberX, matrixNumberY, matrixNumberZ);
		//もしaddSuccessの場合
		if (addSuccess) {
			//"加算に成功しました。結果（行列z）を表示します。"を表示して改行する
			System.out.println("加算に成功しました。結果（行列z）を表示します。");
			//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int i = 0; i < matrixNumberZ.length; i++) {
				//変数jが0から始めて1ずつ増やしていき要素の数繰り返す
				for (int j = 0; j < matrixNumberZ[i].length; j++) {
					//"matrixNumberZ[i][j]："を表示する
					System.out.printf("%4d", matrixNumberZ[i][j]);
				}
				//改行する
				System.out.println();
			}
			//"結果：true"を表示して改行する
			System.out.println("結果：true");
			//その他の場合
		} else {
			//"行列のサイズが一致しないため、加算できませんでした。"を表示して改行する
			System.out.println("行列のサイズが一致しないため、加算できませんでした。");
			//"結果：false"を表示して改行する
			System.out.println("結果：false");
		}
	}
}