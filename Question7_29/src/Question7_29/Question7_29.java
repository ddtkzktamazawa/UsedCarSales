package Question7_29;
import java.util.Scanner;

/*
 * クラス名          : Question7_29
 * 概要              : 2次元配列の複製を作成する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.27
 */
public class Question7_29 {

	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);

	/**
	 * 関数名           : aryClone2
	 * メソッドの説明   : 引数で受け取った2次元配列aと同じ構成・値を持つ
	 * 					　新しい2次元配列を生成して返却する
	 * パラメータの説明 : コピー元の2次元配列
	 * 返り値           : 生成したコピー配列（aがnullの場合はnullを返す）
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static int[][] aryClone2(final int[][] arrayNumber) {
		//もし各配列数がnullの場合
		if (arrayNumber == null) {
			//返却する
			return null;
		}
		//指定された要素数で配列を作成する
		int[][] cloneMatrix = new int[arrayNumber.length][];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < arrayNumber.length; i++) {
			//もしarrayNumber[i]とnullが一致しない場合
			if (arrayNumber[i] != null) {
				//指定された要素数で配列を作成する
				cloneMatrix[i] = new int[arrayNumber[i].length];
				//変数jが0から始めて1ずつ増やしていき要素の数繰り返す
				for (int j = 0; j < arrayNumber[i].length; j++) {
					//cloneMatrix[i][j]にarrayNumber[i][j]を代入する
					cloneMatrix[i][j] = arrayNumber[i][j];
				}
				//その他の場合
			} else {
				//cloneMatrix[i]にnullを代入する
				cloneMatrix[i] = null;
			}
		}
		////cloneMatrixを返却する
		return cloneMatrix;
	}

	/**
	 * 関数名           : main
	 * メソッドの説明   : 2次元配列の行数・列数と値を入力しaryClone2メソッドで
	 * 					　複製した配列が元の配列と同一の内容であることを表示して確認する
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
		int[][] originalNumber = new int[rowCount][columnCount];
		//"配列の値を入力してください。"を表示して改行する
		System.out.println("配列の値を入力してください。");
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < rowCount; i++) {
			//変数jが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int j = 0; j < columnCount; j++) {
				//"originalNumber[i][j]："を表示する
				System.out.print("originalNumber[" + i + "][" + j + "]：");
				//originalNumber[i][j]に入力した値を代入する
				originalNumber[i][j] = STANDARD_INPUT.nextInt();
			}
		}

		//メソッドaryClone2を呼び出す
		int[][] copiedNumber = aryClone2(originalNumber);

		// もしcopiedNumberとnullが一致しない場合
		if (copiedNumber != null) {
			//"2次元配列を複製しました。"を表示して改行する
			System.out.println("2次元配列を複製しました。");
			//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int i = 0; i < copiedNumber.length; i++) {
				//変数jが0から始めて1ずつ増やしていき要素の数繰り返す
				for (int j = 0; j < copiedNumber[i].length; j++) {
					//"copiedNumber[i][j]："を表示する
					System.out.printf("%4d", copiedNumber[i][j]);
				}
				//改行する
				System.out.println();
			}
			//その他の場合
		} else {
			//"配列の複製に失敗しました。"を表示して改行する
			System.out.println("配列の複製に失敗しました。");
		}
	}
}