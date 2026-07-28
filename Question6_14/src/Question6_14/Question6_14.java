package Question6_14;
import java.util.Random;
import java.util.Scanner;
/*
 * クラス名:Question6_14
 * 概要    :月を1～12の数値として表示して、その英語表現を入力する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.20
 */
public class Question6_14 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :月を1～12の数値として表示して、その英語表現を入力する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.20
	 */
	public static void main(String[] args) {
		//乱数ジェネレータの生成
		Random randomMonth = new Random();
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//String型を構成要素とする配列要素数の作成
		final String[] MONTH_NUMBER_1 = {
				//各月の英語名
				"January","February","March","April","May","June","July",
				"August","September","October","November","December"
		};
		//"英語の月名を入力してください。なお、先頭は大文字で、2文字以降は小文字とします。"と表示して改行する
		System.out.println("英語の月名を入力してください。\nなお、先頭は大文字で、2文字以降は小文字とします。");
		//変数memoryMonthの初期化
		int memoryMonth = -1;
		//繰り返す
		while(true) {
			//変数answerMonthに乱数（0～11）を代入する
			int answerMonth = randomMonth.nextInt(MONTH_NUMBER_1.length);
			//もしmemoryMonthとanswerMonthが同じ場合
			while(memoryMonth == answerMonth) {
				//変数answerMonthに乱数（0～11）を代入する
				answerMonth = randomMonth.nextInt(MONTH_NUMBER_1.length);
			}
			//"answerMonth+1 月:"と表示する
			System.out.print(answerMonth + 1 + "月:");
			//String型を構成要素とする配列要素数の作成
			String monthNumber2 = standardInput.next();
			//問題の月と入力した英語のスペルが同じ場合
			if((MONTH_NUMBER_1[answerMonth]).equals(monthNumber2)) {
				//memoryMonthにanswerMonthを代入する
				memoryMonth = answerMonth;
				//"正解です。もう一度？ 1…Yes/0…No："を表示する
				System.out.print("正解です。もう一度？ 1…Yes/0…No：");
				//変数onceAgainに入力した数を読み込む
				int onceAgain = standardInput.nextInt();
				//もし入力した数が1の場合
				if(onceAgain == 1) {
					//続ける
					continue;
				}
				//その他の場合
				else { 
					//飛び出す
					break;
				}
			}
			//"違います。"と表示して改行する
			System.out.println("違います。");
		}
	}
}
