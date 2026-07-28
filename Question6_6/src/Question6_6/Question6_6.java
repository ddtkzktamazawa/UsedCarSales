package Question6_6;
import java.util.Scanner;
/*
 * クラス名:Question6_6
 * 概要    :テストの人数と点数を読み込んで合計点・平均点・最高点・最低点を表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.17
 */
public class Question6_6 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :テストの人数と点数を読み込んで合計点・平均点・最高点・最低点を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.17
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//変数sumValueの初期化
		int sumValue = 0;
		//変数peopleNumberの初期化
		int peopleNumber = 0;
		//実行する
		do {
			//"人数："と表示する
			System.out.print("人数：");
			//変数peopleNumberに入力した数を読み込む
			peopleNumber = standardInput.nextInt();
		}while(peopleNumber <= 0);
		//int型を構成要素とする配列を作成する
		int[] peoplePoint = new int[peopleNumber];
		//()の文字を表示して改行する
		System.out.println(peopleNumber + "人の点数を入力せよ。");
		//変数iを0から始め1ずつ増やし入力した値よりも大きくなるまで繰り返す
		for(int i = 0; i < peopleNumber; i++) {
			//()の文字を表示する
			System.out.print((i + 1) + "番の点数：");
			//変数peoplePoint[i]に入力した数を代入する
			peoplePoint[i] = standardInput.nextInt();
			//変数sumValueに入力した点数を加える
			sumValue += peoplePoint[i];
		}
		//変数maxPointにpeoplePoint[0]の値を代入する
		int maxPoint = peoplePoint[0];
		//変数minPointにpeoplePoint[0]の値を代入する
		int minPoint = peoplePoint[0];
		//変数iを1から始め1ずつ増やし入力した値よりも大きくなるまで繰り返す
		for(int i = 1; i < peoplePoint.length; i++) {
			//もしpeoplePoint[i]がmaxPointよりも大きい場合
			if(peoplePoint[i] > maxPoint) {
				//maxPointにpeoplePoint[i]の値を代入する
				maxPoint = peoplePoint[i];
			}
			//もしpeoplePoint[i]がminPointよりも小さい場合
			if(peoplePoint[i] < minPoint) {
				//minPointにpeoplePoint[i]の値を代入する
				minPoint = peoplePoint[i];
			}
		}
		//"合計点はsumValue点です。"を表示して改行する
		System.out.println("合計点は" + sumValue + "点です。");
		//"平均点は（合計点/人数）点です。"を表示して改行する
		System.out.println("平均点は" + (double) sumValue / peopleNumber + "点です。");
		//"最高点はmaxPoint点です。"を表示して改行する
		System.out.println("最高点は" + maxPoint + "点です。");
		//"最低点はminPoint点です。"を表示して改行する
		System.out.println("最低点は" + minPoint + "点です。");

	}

}
