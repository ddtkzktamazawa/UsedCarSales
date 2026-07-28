package Question7_1;
import java.util.Scanner;
/*
 * クラス名:Question7_1
 * 概要    :受け取ったint型引数の値が正なら1、0なら0、負なら-1を返却する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.21
 */
public class Question7_1 {
	/**
	 * 関数名           :signOf
	 * メソッドの説明   :sumOfの値が正か負か0かを確かめる
	 * パラメータの説明 :入力した値
	 * 返り値           :引数が正だったら1、0だったら0、負だったら-1を返す
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.22
	 */
	public static int signOf(int inputNumber) {
		//変数signOfの初期化
		int signOf = 0;
		//入力値が正の場合
		if(inputNumber > 0) {
			//1を代入する
			signOf = 1;
		}
		//入力値が0の場合
		else if(inputNumber == 0) {
			//0を代入する
			signOf = 0;
		}
		//その他の場合
		else {
			//-1を代入する
			signOf = -1;
		}
		//返却する
		return signOf;
	}
	/**
	 * 関数名           :main
	 * メソッドの説明   :値の入力とその値に応じたsumOfメソッドの結果を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.22
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in); 
		//"整数 :"を表示する
		System.out.print("整数：");
		//変数inputNumberに入力した値を代入する
		int inputNumber = standardInput.nextInt();
		//"返却値はsignOf(inputNumber)です。"と表示して改行する
		System.out.println("返却値は" + signOf(inputNumber) + "です。");
	}
}
