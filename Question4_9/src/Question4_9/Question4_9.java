package Question4_9;
import java.util.Scanner;
/*
 * クラス名:Question4_9
 * 概要    :正の整数値を読み込んで1からその値までの積を求める
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.9
 */
public class Question4_9 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :正の整数値を読み込んで1からその値までの積を求める
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.9
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//変数choiceNumber
		int choiceNumber = 0;
		//実行する
		do {
			//"nの値："と表示する
			System.out.print("nの値：");
			//choiceNumberに数を読み込む
			choiceNumber = standardInput.nextInt();
			//choiceNumberが0以下ならばdo文を再実行する
		}while(choiceNumber <= 0);
		//productTotalに1を代入する
		int productTotal = 1;
		//incrementValueに1を代入する
		int incrementValue =1;
		//incrementValueがchoiceNumber以下であれば
		while(incrementValue <= choiceNumber) {
			//productTotalにincrementValueをかける
			productTotal *= incrementValue;
			//incrementValueの値をインクリメントする
			incrementValue++; 
		}
		//"1からchoiceNumberまでの積はproductTotalです。"と表示する
		System.out.print("1から"+choiceNumber+"までの積は"+productTotal+"です。");
	}

}
