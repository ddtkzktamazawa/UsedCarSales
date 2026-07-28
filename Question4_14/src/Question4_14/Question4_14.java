package Question4_14;
import java.util.Scanner;
/*
 * クラス名:Question4_14
 * 概要    :正の整数値を読み込んで1からその値までの和を出す式を書く
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.10
 */
public class Question4_14 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :正の整数値を読み込んで1からその値までの和を出す式を書く
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.10
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//"1からnまでの和を求めます。"と表示して改行する
		System.out.println("1からnまでの和を求めます。");
		//変数choiceNUmberの初期化
		int choiceNumber = 0;
		//実行する
		do {
			//"nの値："と表示する
			System.out.print("nの値：");
			//choiceNumberに数を読み込む
			choiceNumber = standardInput.nextInt();
			//choiceNumberが0以下ならばdo文を再実行する
		}while(choiceNumber <= 0);
		//変数sumValueの初期化
		int sumValue = 0;
		//変数incrementValueを1から始めて1ずつ増やしながらchoiceNumber-1回ループ本体を繰り返す
		for(int incrementValue = 1; incrementValue <= choiceNumber; incrementValue++) {
			//sumValueにincrementValueを加える
			sumValue += incrementValue;
		//変数incrementValueを1から始めて1ずつ増やしながらchoiceNumber-1回ループ本体を繰り返す
		}for(int incrementValue = 1; incrementValue <= choiceNumber; incrementValue++) {
			//もしincrementValueがchoiceNuber未満の場合
			if(incrementValue < choiceNumber) {
				//"incremntValue + "と表示する
				System.out.print(incrementValue+" + ");
		//その他の場合
			}else {
				//"incremntValue"と表示する
				System.out.print(incrementValue);
			}
			}
		//" = sumValue"と表示する
		System.out.print(" = "+sumValue);
		

	}

}
