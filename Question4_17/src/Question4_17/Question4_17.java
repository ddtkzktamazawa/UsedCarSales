package Question4_17;
/*
 * クラス名:Question4_17
 * 概要    :読み込んだ整数値のすべての約数とその個数を表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.13
 */
import java.util.Scanner;
public class Question4_17 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :読み込んだ整数値のすべての約数とその個数を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.13
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//変数inputNumberの初期化
		int inputNumber = 0;
		//実行する
		do {
			//"整数値："と表示する
			System.out.print("整数値：");
			//inputNumberに数を読み込む
			inputNumber = standardInput.nextInt();
			//入力した数が0以下ならばdo文を再実行する
		}while(inputNumber <= 0);
		//変数divisorTimesの初期化
		int divisorTimes = 0;
		//変数iを1から始めて1つずつ増やしながら入力した数の回数ループ本体を繰り返す
		for(int i = 1; i <= inputNumber; i++) {
			//もし入力した数をiで割った剰余が0の場合
			if(inputNumber % i == 0) {
				//iの値を表示する
				System.out.println(i);
				//divisorTimesを1ずつ増やす
				divisorTimes++;
			}}
		//"約数はdivisorTimes+個です。"と表示して改行する
		System.out.println("約数は"+divisorTimes+"個です。");
	}
}
