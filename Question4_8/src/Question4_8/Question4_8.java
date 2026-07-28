package Question4_8;
import java.util.Scanner;
/*
 * クラス名:Question4_8
 * 概要    :正の整数値を読み込んでその桁数を出力する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.8
 */
public class Question4_8 {
	/**
     * 関数名           :main
     * メソッドの説明   :正の整数値を読み込んでその桁数を出力する
     * パラメータの説明 :なし
     * 返り値           :なし
     * 作成者           :玉澤一輝
     * 作成日           :2026.4.8
     */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//変数choiceNumber
		int choiceNumber;
		//実行する
		do {
			//"整数値："と表示する
			System.out.print("整数値：");
			//choiceNumberに数を読み込む
			choiceNumber = standardInput.nextInt();
			//choiceNumberが0以下ならばdo文を再実行する
		}while(choiceNumber <=0 );
		//diviedNumberにchoiceNumberを代入する
		int diviedNumber = choiceNumber;
		//divisionNumberに0を代入する
		int divisionNumber = 0;
		//"その値は"と表示する
		System.out.print("その値は");
		//diviedNumberが0より大きければ
		while(diviedNumber > 0) {
			//diviedNumberにchhoiceNumber/10を代入する
			diviedNumber = choiceNumber/=10;
			//divisionNumberの値をインクリメントする
			divisionNumber++;
		}
		//"divisionNumber桁です。"と表示して改行する
		System.out.println(divisionNumber+"桁です。");

	}

}
