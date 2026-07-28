package Question4_12;
import java.util.Scanner;
/*
 * クラス名:Question4_12
 * 概要    :0から正の整数値までカウントアップ
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.9
 */
public class Question4_12 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :0から正の整数値までカウントアップ
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.9
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//"カウントアップします。と表示して改行する
		System.out.println("カウントアップします。");
		//変数countUpの初期化
		int countUp = 0;
		//実行する
		do {
			//"正の整数値"と表示する
			System.out.print("正の整数値：");
			//countUpに数を読み込む
			countUp = standardInput.nextInt();
			//countUpが0以下ならばdo文を再実行する
		}while(countUp <= 0);
		//変数incrementValueに0を代入してcountUpを1つずつ減らしながらcountUp回繰り返す
		for(int incrementValue = 0; incrementValue <= countUp; incrementValue++)
			//"incrementValue"を表示して改行する
			System.out.println(incrementValue);

	}

}
