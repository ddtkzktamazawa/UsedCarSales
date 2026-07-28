package Question6_5;
import java.util.Scanner;
/*
 * クラス名:Question6_5
 * 概要    :配列の要素数と個々の要素を読み込んで各要素の値を表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.17
 */
public class Question6_5 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :配列の要素数と個々の要素を読み込んで各要素の値を表示する
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
		//変数inputNumberに入力した数を読み込む
		int inputNumber = standardInput.nextInt();
		//int型を構成要素とする配列を作成する
		int[] someElement = new int[inputNumber];
		//変数iを0から始め1ずつ増やし、入力した値より大きくなるまで繰り返す
		for(int i = 0; i < inputNumber; i++) {
			//"someElement[i]="と表示する
			System.out.print("someElement" + "[" + i + "]" + "=");
			//変数someElement[i]に入力した数を代入する
			someElement[i] = standardInput.nextInt();
		}
		//()の文字を表示する
		System.out.print("a = {");
		//変数iを0から始め1ずつ増やし入力した値より大きくなるまで繰り返す
		for(int i = 0; i < inputNumber; i++) {
			//変数iが1の場合
			if(i == 1) {
				//()の文字を表示する
				System.out.print(someElement[i - 1]);
			}
			//その他の場合
			else{
				//()の文字を表示する
				System.out.print(", " + someElement[i - 1]);
			}
		}
		//()の文字を表示して改行する
		System.out.println("}");
	}
}
