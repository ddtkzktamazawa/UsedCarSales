package Question4_13;
import java.util.Scanner;
/*
 * クラス名:Question4_13
 * 概要    :正の整数値を読み込んで1からその値までの和を求める
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.10
 */
public class Question4_13 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :正の整数値を読み込んで1からその値までの和を求める
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
		//変数incrementValueを0から始めて1ずつ増やしながらchoiceNumber回ループ本体を繰り返す
		for(int incrementValue = 0; incrementValue <= choiceNumber; incrementValue++)
			//sumValueにincrementValueを加える
			sumValue += incrementValue;
		//"1からchoiceNumberまでの和はsumNumberです。"と表示する
		System.out.print("1から"+choiceNumber+"までの和は"+sumValue+"です。");

	}

}
