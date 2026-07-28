package Question7_31;
import java.util.Scanner;

/*
 * クラス名          : Question7_31
 * 概要              : 多重定義を用いてint,long,float,doubleの各型の絶対値を求める
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.27
 */
public class Question7_31 {
	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);

	/**
	 * 関数名           : absolute
	 * メソッドの説明   : int型整数の絶対値を求めその値を返却する
	 * パラメータの説明 : 絶対値を求める対象のint型整数
	 * 返り値           : 引数xの絶対値
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static int absolute(int integerNumber) {
		// 正の数ならそのまま負の数なら符号を反転させて返却する
		return integerNumber >= 0 ? integerNumber : -integerNumber;
	}

	/**
	 * 関数名           : absolute
	 * メソッドの説明   : long型整数の絶対値を求めその値を返却する
	 * パラメータの説明 : 絶対値を求める対象のlong型整数
	 * 返り値           : 引数xの絶対値
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static long absolute(long integerNumber) {
		// 正の数ならそのまま負の数なら符号を反転させて返却する
		return integerNumber >= 0 ? integerNumber : -integerNumber;
	}

	/**
	 * 関数名           : absolute
	 * メソッドの説明   : float型実数の絶対値を求めその値を返却する
	 * パラメータの説明 : 絶対値を求める対象のfloat型実数
	 * 返り値           : 引数xの絶対値
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static float absolute(float integerNumber) {
		// 正の数ならそのまま負の数なら符号を反転させて返却する
		return integerNumber >= 0 ? integerNumber : -integerNumber;
	}

	/**
	 * 関数名           : absolute
	 * メソッドの説明   : double型実数の絶対値を求めその値を返却する
	 * パラメータの説明 : 絶対値を求める対象のdouble型実数
	 * 返り値           : 引数xの絶対値
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static double absolute(double integerNumber) {
		// 正の数ならそのまま負の数なら符号を反転させて返却する
		return integerNumber >= 0 ? integerNumber : -integerNumber;
	}

	/**
	 * 関数名           : main
	 * メソッドの説明   : int,long,float,doubleの各型の数値を入力し
	 * 					　多重定義されたabsoluteメソッドが正しく動作することを確認する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static void main(String[] args) {
		// "整数を入力："を表示する
		System.out.print("整数を入力：");
		//変数にintegerNumberに入力した値を代入する
		int integerNumber = STANDARD_INPUT.nextInt();

		//変数にintegerIntに入力した値を代入する
		int integerInt = integerNumber;
		//変数にintegerLongに入力した値を代入する
		long integerLong = (long) integerNumber;
		//変数にintegerFloatに入力した値を代入する
		float integerFloat = (float) integerNumber;
		//変数にintegerDoubleに入力した値を代入する
		double integerDouble = (double) integerNumber;

		//"int型の絶対値はabsolute(integerInt)です。"を表示して改行する
		System.out.println("int型の絶対値は " + absolute(integerInt) + " です。");
		//"Long型の絶対値はabsolute(integerInt)です。"を表示して改行する
		System.out.println("long型の絶対値は " + absolute(integerLong) + " です。");
		//"float型の絶対値はabsolute(integerInt)です。"を表示して改行する
		System.out.println("float型の絶対値は " + absolute(integerFloat) + " です。");
		//"double型の絶対値はabsolute(integerInt)です。"を表示して改行する
		System.out.println("double型の絶対値は " + absolute(integerDouble) + " です。");
	}
}
