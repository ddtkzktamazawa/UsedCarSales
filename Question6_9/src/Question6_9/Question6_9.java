package Question6_9;
import java.util.Random;
import java.util.Scanner;
/*
 * クラス名:Question6_9
 * 概要    :要素数を読み込んでint型の配列の全要素を1～10の乱数で表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.17
 */
public class Question6_9 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :要素数を読み込んでint型の配列の全要素を1～10の乱数で表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.17
	 */
	public static void main(String[] args) {
		//乱数ジェネレータの生成
		Random allNumber = new Random();
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//"要素数："と表示する
		System.out.print("要素数：");	
		//変数elementValueに入力した数を読み込む
		int  elementValue = standardInput.nextInt();
		//int型を構成要素とする配列を作成する
		int []someElement = new int[elementValue];
		//"{"を表示する
		System.out.print("{");
		////変数iを0から始め1ずつ増やし、elementValueの値より大きくなるまで繰り返す
		for(int j = 0; j < elementValue; j++) {
			//変数someElement[i]に乱数（1～10）を代入する
			someElement[j] = allNumber.nextInt(10) + 1;
			//変数jが0の場合
			if(j == 0) {
				//"someElement[j]"を表示する
				System.out.print(someElement[j]);
				//その他の場合
			}else {
				//",someElement[j]"を表示する
				System.out.print(", " + someElement[j]);
			}
		}
		//"}"を表示して改行する
		System.out.println("}");
	}
}
