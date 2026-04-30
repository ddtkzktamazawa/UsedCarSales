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
			//"---(i+1)件目の期間---"と表示して改行する
			System.out.println("\n--- " + (i + 1) + "件目の期間 ---");
			//"[開始日]"と表示して改行する
			System.out.println("[開始日]");
			//開始日の入力を受け取りインスタンスを生成する
			Day4 startDay = inputDay();

			//"[終了日]"と表示して改行する
			System.out.println("[終了日]");
			//終了日の入力を受け取りインスタンスを生成する
			Day4 endDay = inputDay();

			//periodインスタンスを生成して配列に格納
			periodArray[i] = new period(startDay, endDay);
		}

		//"===== 登録された期間一覧 ====="と表示して改行する
		System.out.println("\n===== 登録された期間一覧 =====");
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < periodArray.length; i++) {
			//"(i+1)件目：periodArray[i].getFrom()～periodArray[i].getTo()"を表示して改行する
			System.out.println((i + 1) + "件目：" + periodArray[i].getFrom() + " ～ " + periodArray[i].getTo());
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
		//" 年："と表示する
		System.out.print("年：");
		//変数yearNumberに入力した値を代入する
		int yearNumber = STANDARD_INPUT.nextInt();
		//" 月："と表示する
		System.out.print("月：");
		//変数monthNumberに入力した値を代入する
		int monthNumber = STANDARD_INPUT.nextInt();
		//" 日："と表示する
		System.out.print("日：");
		//変数dateNumberに入力した値を代入する
		int dateNumber = STANDARD_INPUT.nextInt();
		//フィールドの値をコピーしたDay4インスタンスを生成して返却
		return new Day4(yearNumber, monthNumber, dateNumber);
	}
}