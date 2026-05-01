package Question9_5;
import java.util.Scanner;

/*
 * クラス名          : Question9_5
 * 概要              : periodクラスのインスタンス配列を生成・表示する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.04.30
 */
public class Question9_5 {
	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);
	// インデックス調整用の定数OFFSET（1）
	private static final int OFFSET = 1;

	/**
	 * 関数名           : main
	 * メソッドの説明   : 複数の期間（開始日・終了日）を入力させ一覧表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.30
	 */
	public static void main(String[] args) {
		//"期間データを登録します。"を表示して改行する
		System.out.println("期間データを登録します。");
		//"登録する期間の個数："を表示する
		System.out.print("登録する期間の個数：");
		//変数countPeriodに入力した値を代入する
		int countPeriod = STANDARD_INPUT.nextInt();

		//period型の配列periodArrayを生成する
		period[] periodArray = new period[countPeriod];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < countPeriod; i++) {
			//"--- 1件目の期間 ---"と表示して改行する
			System.out.println("\n--- " + (i + OFFSET) + "件目の期間 ---");
			// 開始日の変数startDayを宣言
			Day4 startDay;
			// 終了日の変数endDayを宣言
			Day4 endDay;
			//繰り返す
			while (true) {
				//"[開始日]"と表示して改行する
				System.out.println("[開始日]");
				//キーボードから開始日を入力しインスタンスを生成
				startDay = inputDay();
				//"[終了日]"と表示して改行する
				System.out.println("[終了日]");
				//キーボードから終了日を入力しインスタンスを生成
				endDay = inputDay();

				//もし開始日が終了日と同じ、または終了日より前の日付の場合
				if (startDay.compareTo(endDay) <= 0) {
					//抜ける
					break; 
				}
				//"【エラー】終了日は開始日より後の日付にしてください。"と表示して改行する
				System.out.println("\n【エラー】終了日は開始日より後の日付にしてください。");
				//"再入力をお願いします。"と表示して改行する
				System.out.println("再入力をお願いします。");
			}

			//配列periodArray[i]を生成する
			periodArray[i] = new period(startDay, endDay);
		}

		//"===== 登録された期間一覧 ====="と表示して改行する
		System.out.println("\n===== 登録された期間一覧 =====");
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < periodArray.length; i++) {
			//"(i+1)件目：periodArray[i].getFrom()～periodArray[i].getTo()"を表示して改行する
			System.out.println((i + OFFSET) + "件目：" + periodArray[i].getFrom() + " ～ " + periodArray[i].getTo());
		}
	}

	/**
	 * 関数名           : inputDay
	 * メソッドの説明   : キーボードから年月日を入力しDay4インスタンスを生成して返す
	 * パラメータの説明 : なし
	 * 返り値           : 生成したDay4インスタンス
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.30
	 */
	private static Day4 inputDay() {
		//変数yearNumber,monthNumber,dateNumberの初期化
		int yearNumber, monthNumber, dateNumber;
		//繰り返す
		while (true) {
			//"年："と表示する
			System.out.print("年：");
			//yearNumberに入力した値を代入する
			yearNumber = STANDARD_INPUT.nextInt();
			//"月："と表示する
			System.out.print("月：");
			//monthNumberに入力した値を代入する
			monthNumber = STANDARD_INPUT.nextInt();
			//"日："と表示する
			System.out.print("日：");
			//dateNumberに入力した値を代入する
			dateNumber = STANDARD_INPUT.nextInt();

			//メソッドisVakidで確認
			if (Day4.isValid(yearNumber, monthNumber, dateNumber)) {
				//抜ける
				break;
			}
			//"【エラー】存在しない日付です。正しく入力してください。"と表示して改行する
			System.out.println("【エラー】存在しない日付です。正しく入力してください。");
			//"再入力をお願いします。"と表示して改行する
			System.out.println("再入力をお願いします。");
		}
		//フィールドの値をコピーしたDay4インスタンスを生成して返却
		return new Day4(yearNumber, monthNumber, dateNumber);

	}
}