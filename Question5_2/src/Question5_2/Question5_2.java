package Question5_2;
import java.util.Scanner;
/*
 * クラス名:Question5_2
 * 概要    :float型、double型の変数に値を読み込んで表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.15
 */
public class Question5_2 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :float型、double型の変数に値を読み込んで表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.15
	 */
	public static void main(String[] args) {
		//キーボードからの読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//"変数xはfloat型で、変数yはdouble型です。"を表示して改行する
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		//"x："を表示する
		System.out.print("x：");
		//firstNumberに数を読み込む
		float firstNumber = standardInput.nextFloat();
		//"y："を表示する
		System.out.print("y：");
		//secondNumberに数を読み込む
		double secondNumber = standardInput.nextDouble();
		//"x："+firstNumberを表示して改行する
		System.out.println("x："+firstNumber);
		//"x："+secondNumberを表示して改行する
		System.out.println("y："+secondNumber);
	}
}
