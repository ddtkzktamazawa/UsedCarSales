package Question7_22;
import java.util.Scanner;

/*
 * クラス名          : Question7_22
 * 概要              : 配列の複製を作成する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.26
 */
public class Question7_22 {
	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);
	/**
	 * 関数名           : arrayClone
	 * メソッドの説明   : 引数で受け取った配列と同じ内容の新しい配列を生成して返却する
	 * パラメータの説明 : コピー元の配列
	 * 返り値           : 生成したコピー配列（arrayNumberがnullの場合はnullを返す）
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
	 */
	public static int[] arrayClone(final int[] arrayNumber) {
		//もし各配列数がnullの場合
		if (arrayNumber == null) {
			//返却する
			return null;
		}
		//コピー元と同じ長さの配列を新しく作成する
		int[] cloneArray = new int[arrayNumber.length];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < arrayNumber.length; i++) {
			//cloneArray[i]にarrayNumber[i]を代入する
			cloneArray[i] = arrayNumber[i];
		}
		//cloneArrayを返却する
		return cloneArray;
	}
	/**
	 * 関数名           : main
	 * メソッドの説明   : 要素数と各要素の値を入力しarrayCloneメソッドを呼び出して
	 * 					　複製された配列の内容を表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
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
		int[] originArray = new int[elementNumber];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementNumber; i++) {
			//"originArray[i]："を表示する
			System.out.print("originArray[" + i + "]：");
			//originArray[i]に入力した値を代入する
			originArray[i] = STANDARD_INPUT.nextInt();
		}
		// メソッドarrayCloneを呼び出す
		int[] copiedArray = arrayClone(originArray);
		//"配列をコピーしました。"を表示して改行する
		System.out.println("配列をコピーしました。");
		//変数iが0から始めて1ずつ増やしていきcopiedArrayの数繰り返す
		for (int i = 0; i < copiedArray.length; i++) {
			//"copiedArrayのインデックス番号とその要素の値"を表示して改行する
			System.out.println("copiedArray[" + i + "] = " + copiedArray[i]);
		}
	}
}