package Question4_4;
import java.util.Scanner;
/*
 * クラス名:Question4_4
 * 概要    :正の整数値を-1までカウントダウン
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.7
 */
public class Question4_4 {
	 /**
     * 関数名           :main
     * メソッドの説明   :正の整数値を-1までカウントダウン
     * パラメータの説明 :なし
     * 返り値           :なし
     * 作成者           :玉澤一輝
     * 作成日           :2026.4.7
     */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//"カウントダウンします。と表示して改行する
		System.out.println("カウントダウンします。");
		//変数timeLeftの初期化
		int timeLeft = 0;
		//実行する
		do {
			//"正の整数値"と表示する
			System.out.print("正の整数値：");
			//timeLeftに数を読み込む
			timeLeft = standardInput.nextInt();
			//timeLeftが0以下ならばdo文を再実行する
		}while(timeLeft <= 0);
		//timeLeftが-1以上であれば
		while(timeLeft >= -1) {
		//"timeLeft"を表示して改行する
		System.out.println(timeLeft);
		//timeLeftの値をデクリメント
		timeLeft--;
		
		}

	}

}
