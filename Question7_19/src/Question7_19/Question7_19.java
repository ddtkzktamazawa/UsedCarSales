package Question7_19;
import java.util.Scanner;
/*
 * クラス名          : Question7_19
 * 概要              : 配列から指定したインデックスを先頭に指定個数要素を削除する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.24
 */
public class Question7_19 {
	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);
	/**
	 * 関数名           : aryRmvN
	 * メソッドの説明   : 配列の要素[idx]から指定個数を削除しそれ以降の要素を前にずらす
	 * パラメータの説明 : 対象の配列、削除開始位置、削除する個数
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.24
	 */
	public static void aryRmvN(int[] arrayNumber, int indexNumber, int deleteNumber) {
		//もし配列数がnullの場合
		if (arrayNumber == null) {
			//返却する
			return;
		}
		//削除する個数が0以下、または開始位置が範囲外の場合
		if (deleteNumber <= 0 || indexNumber < 0 || indexNumber >= arrayNumber.length) {
			//そのまま返却する
			return;
		}
		//削除する範囲が配列の末尾を超える場合
		if (indexNumber + deleteNumber > arrayNumber.length) {
			//末尾までに制限する
			deleteNumber = arrayNumber.length - indexNumber;
		}
		//変数iがindexNumberから始めて1ずつ増やしていき要素数-deleteNumber回繰り返す
		for (int i = indexNumber; i < arrayNumber.length - deleteNumber; i++) {
			//arrayNumber[i+1]をarrayNumber[i]に代入してdeleteNumber個前にずれる
			arrayNumber[i] = arrayNumber[i + deleteNumber];
		}
	}
	/**
	 * 関数名           : main
	 * メソッドの説明   : 配列の入力を受け取り指定された削除処理の結果を表示する
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
		System.out.print("削除を開始するインデックス：");
		//変数indexNumberに入力した値を代入する
		int indexNumber = STANDARD_INPUT.nextInt();
		//"削除する個数："を表示する
		System.out.print("削除する個数：");
		//変数deleteNumberに入力した値を代入する
		int deleteNumber = STANDARD_INPUT.nextInt();
		//メソッドaryRmvNを呼び出し指定位置から指定個数の要素を削除して前方に詰める
		aryRmvN(arrayNumber, indexNumber, deleteNumber);
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < elementNumber; i++) {
			/*"indexNumber番目からdeleteNumber個分の要素を取り除いた後
			 * それ以降の要素を前にずらした配列"を表示する
			 */
			System.out.println("arrayNumber[" + i + "] = " + arrayNumber[i]);
		}
	}
}