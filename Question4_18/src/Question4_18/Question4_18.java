package Question4_18;
/*
 * クラス名:Question4_18
 * 概要    :1から読み込んだ整数値までの2乗値を表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.13
 */
import java.util.Scanner;
public class Question4_18 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :1から読み込んだ整数値までの2乗値を表示する
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
		//変数iを1から始めて1つずつ増やしながら入力した数の回数ループ本体を繰り返す
		for(int i = 1; i <= inputNumber; i++) {
			//"iの2乗はi*i"と表示して改行する
			System.out.println(i+"の2乗は"+i*i);
		}
	}
}
