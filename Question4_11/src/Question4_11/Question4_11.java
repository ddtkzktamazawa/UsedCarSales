package Question4_11;
import java.util.Scanner;
/*
 * クラス名:Question4_11
 * 概要    :正の整数値を0までカウントダウン
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.9
 */
public class Question4_11 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :正の整数値を0までカウントダウン
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.9
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//"カウントダウンします。と表示して改行する
		System.out.println("カウントダウンします。");
		int countDown = 0;
		//実行する
		do {
			//"整数値："と表示する
			System.out.print("正の整数値：");
			//countDownに数を読み込む
			countDown = standardInput.nextInt();
			//入力した数が0以下ならばdo文を再実行する
		}while(countDown <= 0);
		//変数pickNumberにcountDownを代入してpickNumberを1つずつ減らしながらpickNumber回繰り返す
		for(int pickNumber = countDown; pickNumber >= 0; pickNumber--)
			//"pickNumber"を表示して改行する
			System.out.println(pickNumber);
	}

}
