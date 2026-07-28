package Question4_1;
import java.util.Scanner;
/*
 * クラス名:Question4_1
 * 概要    :読み込んだ整数値の符号（正/負/0）を判定して表示、以降好きなだけ何度でも繰り返し入力・表示可能なもの
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.6
 */
public class Question4_1 {
	 /**
     * 関数名           :main
     * メソッドの説明   :読み込んだ整数値の符号（正/負/0）を判定して表示、以降好きなだけ何度でも繰り返し入力・表示可能なもの
     * パラメータの説明 :なし
     * 返り値           :なし
     * 作成者           :玉澤一輝
     * 作成日           :2026.4.6
     */
	public static void main(String[] args) {
		//キーボードからの読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//変数retryNumber
		int retryNumber = 0;
		//実行する
		do{
			//整数値の入力を促す
			System.out.print("整数値：");
		//integerValueに整数値を読み込む
		int integerValue = standardInput.nextInt();
		//もしintegerValue＞0の場合
		if(integerValue > 0)
			//"その値は正です。"と表示して改行する
			System.out.println("その値は正です。");
		//もしintegerValue＜0の場合
		else if(integerValue < 0)
			//"その値は負です。"と表示して改行する
			System.out.println("その値は負です。");
		//その他の場合
		else
			//"その値は0です。"と表示して改行する
			System.out.println("その値は0です。");
		//もう一度行うか促す
		System.out.print("もう一度？ 1…Yes/0…No：");
		//retryNumberに数字を読み込ませる
		retryNumber = standardInput.nextInt();
		//retryNumberが1の場合、do文を再実行する
		}while(retryNumber == 1);

	}

}
