package Question6_15;
/*
 * クラス名:Question6_15
 * 概要    :曜日を表示して、その英語表現を入力する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.20
 */
import java.util.Random;
import java.util.Scanner;
public class Question6_15 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :曜日を表示して、その英語表現を入力する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.20
	 */
	public static void main(String[] args) {
		//乱数ジェネレータの生成
		Random randomNumber = new Random();
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//String型を構成要素とする配列要素数の作成
		final String[] weekDay = {
				//各曜日の英語名
				"monday", "tuesday", "wednesday",
				"thursday", "friday","saturday", "sunday"
		};
		//String型を構成要素とする配列要素数の作成
		final String[]japaneseDay = { 
				//各曜日の日本語頭文字
				"月","火","水","木","金","土","日" 
		};
		//"英語の曜日名を小文字で入力してください。"と表示して改行する
		System.out.println("英語の曜日名を小文字で入力してください。");
		//変数daySpellの初期化
		int daySpell = 0;
		//繰り返す
		while(true) {
			//変数randomDayに乱数（0～6）を代入する
			int randomDay = randomNumber.nextInt(7);
			//もしdaySpellとrandomDayが同じ場合
			if(daySpell == randomDay) {
				//続ける
				continue;
			}
			//"japaneseDay[randomDay]曜日:"と表示する
			System.out.print(japaneseDay[randomDay] + "曜日:");
			//String型を構成要素とする配列要素数の作成
			String inputDay = standardInput.next();
			//問題の曜日と入力した英語のスペルが同じ場合
			if (weekDay[randomDay].equals(inputDay)) {
				//"正解です。もう一度？ 1…Yes/0…No："を表示する
				System.out.print("正解です。もう一度？1...Yes/0...No：");
				//変数onceAgainに入力した数を読み込む
				int onceAgain = standardInput.nextInt();
				//もし入力した数が1の場合
				if(onceAgain == 1) {
					//daySpellにrandomDayを代入する
					daySpell = randomDay ;
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
