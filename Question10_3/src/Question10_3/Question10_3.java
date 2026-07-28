package Question10_3;
import java.util.Scanner;
/*
 * クラス名          : Question10_3
 * 概要              : MinMaxクラスのクラスメソッドを呼び出し2値・3値・配列の
 * 					   最小値および最大値を求めて表示する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.04.30
 */
public class Question10_3 {

	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);
	/**
	 * 関数名           : main
	 * メソッドの説明   : ユーザーから入力された数値および配列データを元に
	 * 					  MinMaxクラスの各メソッドを使用して計算結果を出力する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.04.30
	 */
	public static void main(String[] args) {
		//"firstNumberの値："を表示する
		System.out.print("firstNumberの値：");
		//firstNumberに入力した値を代入する
		int firstNumber = STANDARD_INPUT.nextInt();
		//"secondNumberの値："を表示する
		System.out.print("secondNumberの値：");
		//secondNumberに入力した値を代入する
		int secondNumber = STANDARD_INPUT.nextInt();
		//"thirdNumberの値："を表示する
		System.out.print("thirdNumberの値：");
		//thirdNumberに入力した値を代入する
		int thirdNumber = STANDARD_INPUT.nextInt();
		//"配列の要素数："を表示する
		System.out.print("配列の要素数：");
		//arrayNumberに入力した値を代入する
		int arrayNumber = STANDARD_INPUT.nextInt();
		//指定した要素数で配列を作成する
		int []arrayValue = new int[arrayNumber];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < arrayNumber; i++) {
			//"arrayValue[i]："を表示する
			System.out.print("arrayValue[" + i + "]：");
			//arrayValue[i]に入力した値を代入する
			arrayValue[i] = STANDARD_INPUT.nextInt();
		}
		//"二値の最小値：MinMax.min(firstNumber, secondNumber)"を表示して改行する
		System.out.println("二値の最小値：" + MinMax.min(firstNumber, secondNumber));
		//"三値の最小値："MinMax.min(firstNumber, secondNumber, thirdNumber)"を表示して改行する
		System.out.println("三値の最小値：" + MinMax.min(firstNumber, secondNumber, thirdNumber));
		//"配列の最小値：MinMax.min(arrayValue)"を表示して改行する
		System.out.println("配列の最小値：" + MinMax.min(arrayValue));
		//"二値の最大値：MinMax.max(firstNumber, secondNumber)"を表示して改行する
		System.out.println("二値の最大値：" + MinMax.max(firstNumber, secondNumber));
		//"三値の最大値："MinMax.max(firstNumber, secondNumber, thirdNumber)"を表示して改行する
		System.out.println("三値の最大値：" + MinMax.max(firstNumber, secondNumber, thirdNumber));
		//"配列の最大値：MinMax.max(arrayValue)"を表示して改行する
		System.out.println("配列の最大値：" + MinMax.max(arrayValue));
	}
}
