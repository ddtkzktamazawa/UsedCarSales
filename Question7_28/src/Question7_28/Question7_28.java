package Question7_28;
import java.util.Scanner;

/*
 * クラス名          : Question7_28
 * 概要              : 二つの行列の和を格納した新しい行列を生成して返却する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.27
 */
public class Question7_28 {
	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);

	/**
	 * 関数名           : addMatrix
	 * メソッドの説明   : 行列xとyのサイズが同一であればその和を格納した
	 * 					　新しい2次元配列を生成して返却する
	 * パラメータの説明 : 加算する二つの行列
	 * 返り値           : 生成した和の行列（サイズ不一致またはnullの場合はnullを返す）
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static int[][] addMatrix(final int[][] matrixNumberX, final int[][] matrixNumberY) {
		//もしmatrixNumberXがnullと一致、またはmatrixNumberYがnullと一致する場合
		if (matrixNumberX == null || matrixNumberY == null) {
			//返却する
			return null;
		}
		//matrixNumberXとmatrixNumberYが等しくない場合
		if (matrixNumberX.length != matrixNumberY.length) {
			//返却する
			return null;
		}
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < matrixNumberX.length; i++) {
			/*もしmatrixNumberX[i]がnullと一致、またはmatrixNumberY[i]がnullと一致、
			/*またはmatrixNumberX[i]とmatrixNumberY[i]が一致しない場合
			 */
			if (matrixNumberX[i] == null || matrixNumberY[i] == null || matrixNumberX[i].length != matrixNumberY[i].length) {
				//返却する
				return null;
			}
		}

		// メソッド内で新しい行列を生成する
		int[][] resultMatrix = new int[matrixNumberX.length][matrixNumberX[0].length];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < matrixNumberX.length; i++) {
			//変数jが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int j = 0; j < matrixNumberX[i].length; j++) {
				//resultMatrix[i][j]にmatrixNumberX[i][j]+matrixNumberY[i][j]を代入する
				resultMatrix[i][j] = matrixNumberX[i][j] + matrixNumberY[i][j];
			}
		}
		//resultMatrixを返却する
		return resultMatrix;
	}

	/**
	 * 関数名           : main
	 * メソッドの説明   : 行数・列数を入力し行列x, yを作成する
	 * 					　addMatrixが返却する新しい行列を表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static void main(String[] args) {
		//"行数"を表示する
		System.out.print("行数：");
		//変数rowCountに入力した値を代入する
		int rowCount = STANDARD_INPUT.nextInt();
		//"列数"を表示する
		System.out.print("列数：");
		//変数columnCountに入力した値を代入する
		int columnCount = STANDARD_INPUT.nextInt();
		// もし配列数が0以下の場合
		if (rowCount <= 0 || columnCount <= 0) {
			// プログラムを終了して不正な配列作成をしない
			System.out.println("エラー：1以上を指定してください。");
			// 返却する
			return;
		}
		//指定された要素数で配列を作成する
		int[][] matrixNumberX = new int[rowCount][columnCount];
		//指定された要素数で配列を作成する
		int[][] matrixNumberY = new int[rowCount][columnCount];
		//"行列xの値を入力してください。"を表示して改行する
		System.out.println("行列xの値を入力してください。");
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < rowCount; i++) {
			//変数jが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int j = 0; j < columnCount; j++) {
				//"x[i][j]："を表示する
				System.out.print("x[" + i + "][" + j + "]：");
				//matrixNumberX[i][j]に入力した値を代入する
				matrixNumberX[i][j] = STANDARD_INPUT.nextInt();
			}
		}
		//"行列yの値を入力してください。"を表示して改行する
		System.out.println("行列yの値を入力してください。");
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < rowCount; i++) {
			//変数jが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int j = 0; j < columnCount; j++) {
				//"y[i][j]："を表示する
				System.out.print("y[" + i + "][" + j + "]：");
				//matrixNumberY[i][j]に入力した値を代入する
				matrixNumberY[i][j] = STANDARD_INPUT.nextInt();
			}
		}

		// メソッドaddMatrixを呼び出す
		int[][] resultNumber = addMatrix(matrixNumberX, matrixNumberY);
		//もしresultNumberとnullが一致でない場合
		if (resultNumber != null) {
			//"新しく生成された行列（和）を表示します。"を表示して改行する
			System.out.println("新しく生成された行列（和）を表示します。");
			//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int i = 0; i < resultNumber.length; i++) {
				//変数jが0から始めて1ずつ増やしていき要素の数繰り返す
				for (int j = 0; j < resultNumber[i].length; j++) {
					//"resultNumber[i][j]："を表示する
					System.out.printf("%4d", resultNumber[i][j]);
				}
				//改行する
				System.out.println();
			}
			//その他の場合
		} else {
			//"行列の生成に失敗しました。"を表示して改行する
			System.out.println("行列の生成に失敗しました。");
		}
	}
}