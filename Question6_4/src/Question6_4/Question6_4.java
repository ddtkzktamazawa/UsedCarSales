package Question6_4;
import java.util.Random;
import java.util.Scanner;
/*
 * クラス名:Question6_4
 * 概要    :配列の全要素に乱数を代入して縦向きの棒グラフで表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.16
 */
public class Question6_4 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :配列の全要素に乱数を代入して縦向きに棒グラフで表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.16
	 */
	public static void main(String[] args) {
		//乱数ジェネレータの生成
		Random randomNumber = new Random();
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//"要素数："と表示する
		System.out.print("要素数:");
		//変数inputNumberに入力した数を読み込む
		int inputNumber = standardInput.nextInt();
		//int型を構成要素とする配列を作成する
		int[] someElement = new int[inputNumber];
		//変数iを0から始め1ずつ増やし、入力した値より大きくなるまで繰り返す
		for(int i = 0; i < someElement.length; i++) {
			//変数someElement[i]に0～9までのランダムな値に1を足した値を代入する
			someElement[i] = 1 + randomNumber.nextInt(10);
		}
		//変数iを0から始め1ずつ増やし10よりも大きくなるまで繰り返す
		for(int i = 0; i < 10; i++) {
			//変数jを0から始め1ずつ増やし、入力した値より大きくなるまで繰り返す
			for(int j = 0; j < someElement.length; j++) {
				//10-変数iがランダムな値に1を足した数よりも大きい場合
				if(10 - i > someElement[j]) {
					//" "を表示する
					System.out.print(" ");
				}	
				//その他の場合
				else  {
					//"*"を表示する
					System.out.print("*");
				}
			}
			//改行する
			System.out.println();
		}
		//()の文字を表示して改行する
		System.out.println("--------------------");
		//変数iを0から始め1ずつ増やし入力した値よりも大きくなるまで繰り返す
		for(int i = 0; i < someElement.length; i++) {
			//変数iを10で割ったときの余剰を表示する
			System.out.print(i % 10);
		}
	}
}
