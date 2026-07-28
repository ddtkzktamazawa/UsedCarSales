package Question7_26;
import java.util.Scanner;

/*
 * クラス名 : Question7_26
 * 概要 : 配列の指定位置に新しい値を挿入した新しい配列を作成する
 * 作成者 : 玉澤一輝
 * 作成日 : 2026.4.26
 */
public class Question7_26 {

	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);
	// インデックス調整用の定数OFFSET（1）
	private static final int OFFSET = 1;

	/**
	 * 関数名 : arrayInsOf
	 * メソッドの説明 : 配列aの要素a[idx]にxを挿入した新しい配列を返却する
	 * パラメータの説明 : 元の配列、挿入する位置、挿入する値
	 * 返り値 : 挿入後の新しい配列（idxが範囲外の場合はコピーを返す）
	 * 作成者 : 玉澤一輝
	 * 作成日 : 2026.4.26
	 */
	public static int[] arrayInsOf(final int[] arrayNumber, final int idxNumber, final int insertValue) {
		//もし各配列数がnullの場合
		if (arrayNumber == null) {
			//返却する
			return null;
		}

		//もしidxNumberが0より小さい、またはidxNumberがarrayNumberより大きい場合
		if (idxNumber < 0 || idxNumber > arrayNumber.length) {
			//指定された要素数で配列を作成する
			int[] cloneArray = new int[arrayNumber.length];
			//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int i = 0; i < arrayNumber.length; i++) {
				//cloneArray[i]にarrayNumber[i]を代入する
				cloneArray[i] = arrayNumber[i];
			}
			//cloneArrayを返却する
			return cloneArray;
		}
		//指定された要素数で配列を作成する
		int[] resultNumber = new int[arrayNumber.length + OFFSET];
		//変数i,certainValueが0から始めてiを1ずつ増やしていき要素の数繰り返す
		for (int i = 0, certainValue = 0; i < resultNumber.length; i++) {
			//もしiがidxNumberと一致する場合
			if (i == idxNumber) {
				//result[certainValue]にinsertValueを代入する
				resultNumber[i] = insertValue;
				//その他の場合
			} else {
				//resultNumber[i]にarrayNumber[certainValue++]を代入する
				resultNumber[i] = arrayNumber[certainValue++];
			}
		}
		//resultValueを返却する
		return resultNumber;
	}

	/**
	 * 関数名 : main
	 * メソッドの説明 : 要素数、各要素の値、挿入位置と値を入力し、
	 * arrayInsOfメソッドを呼び出して結果を表示する
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
		//"挿入する位置："を表示する
		System.out.print("挿入する位置：");
		//idxNumberに入力した値を代入する
		int idxNumber = STANDARD_INPUT.nextInt();
		//"挿入する値："を表示する
		System.out.print("挿入する値：");
		//insertValueに入力した値を代入する
		int insertValue = STANDARD_INPUT.nextInt();
		// メソッドarrayInsOfを呼び出す
		int[] resultNumber = arrayInsOf(arrayNumber, idxNumber, insertValue);
		//"値を挿入した新しい配列を作成しました。"を表示して改行する
		System.out.println("値を挿入した新しい配列を作成しました。");
		//変数iが0から始めて1ずつ増やしていきresultNumberの数繰り返す
		for (int i = 0; i < resultNumber.length; i++) {
			//"resultNumberのインデックス番号とその要素の値"を表示して改行する
			System.out.println("resultNumber[" + i + "] = " + resultNumber[i]);
		}
	}
}