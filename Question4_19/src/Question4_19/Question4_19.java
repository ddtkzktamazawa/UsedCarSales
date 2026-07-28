package Question4_19;
/*
 * クラス名:Question4_19
 * 概要    :入力された月の季節を表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.13
 */
import java.util.Scanner;
public class Question4_19 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :入力された月の季節を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.13
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//変数oneMoreの初期化
		int oneMore = 0;
		//変数monthNumberの初期化
		int monthNumber = 0;
		//実行する
		do {
			//実行する
			do {
				//"季節を求めます。何月ですか："と表示する
				System.out.print("季節を求めます。\n何月ですか:");
				//monthNumberに数を読み込む
				monthNumber = standardInput.nextInt();
				//入力した数が1以下12以上ならばdo文を再実行する
			}while(monthNumber < 1 && monthNumber > 12);
			//もし入力した数が3以上5以下の場合
			if(monthNumber >= 3 && monthNumber <= 5) {
				//"それは春です。"と表示して改行する
				System.out.println("それは春です。");
			}
			//もし入力した数が6以上8以下の場合
			else if(monthNumber >= 6 && monthNumber <= 8) {
				//"それは夏です。"と表示して改行する
				System.out.println("それは夏です。");
			}
			//もし入力した数が9以上11以下の場合
			else if(monthNumber >= 9 && monthNumber <= 11) {
				//"それは秋です。"と表示して改行する
				System.out.println("それは秋です。");
			}
			//もし入力した数が12または1または2の場合
			else if(monthNumber == 12 || monthNumber == 1 ||  monthNumber == 2) {
				//"それは冬です。"と表示して改行する
				System.out.println("それは冬です。");
			}
			//"もう一度？1…Yes/0…No"と表示する
			System.out.print("もう一度？1…Yes/0…No：");
			//oneMoreに入力した数を読み込む
			oneMore = standardInput.nextInt();
			//oneMoreが1ならばdo文を再実行する
		}while(oneMore == 1);
	}
}
