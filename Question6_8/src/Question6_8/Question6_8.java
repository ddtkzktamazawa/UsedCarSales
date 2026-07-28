package Question6_8;
import java.util.Scanner;
/*
 * クラス名:Question6_8
 * 概要    :double型の配列の全要素を読み込んで合計値と平均値を表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.17
 */
public class Question6_8 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :double型の配列の全要素を読み込んで合計値と平均値を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.17
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//"要素数："と表示する
		System.out.print("要素数：");	
		//変数elementValueに入力した数を読み込む
		int  elementValue = standardInput.nextInt();
		//double型を構成要素とする配列を作成する
		double [] elementNumber = new double[elementValue];
		//変数iを0から始め1ずつ増やし、入力した値より大きくなるまで繰り返す
		for(int i = 0; i < elementValue; i++) {
			//"elementNumber[i]="と表示する
			System.out.print("elementNumber" + "[" + i + "]" + " = ");
			//変数elementNumber[i]に入力した数を代入する
			elementNumber[i] = standardInput.nextDouble();
		}
		//変数sumValueの初期化
		double sumValue = 0;
		//配列を先頭から末尾まで1つ走査する
		for(double i : elementNumber)
			//合計値に入力した要素値を足す
			sumValue += i;
		//"全要素の合計値はsumValueです。"を表示して改行する
		System.out.println("全要素の合計値は" + sumValue + "です。");
		//"全要素の平均値は（合計値/要素数）"を表示して改行する
		System.out.println("全要素の平均値は" + sumValue / elementValue + "です。");
	}
}
