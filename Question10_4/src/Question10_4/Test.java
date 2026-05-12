package Question10_4;
import java.util.Scanner;
/*
 * クラス名  	: Test
 * 概要      	: Day5クラスの全メソッドの動作を検証するためのテスト用クラス
 * 			 	  日付の生成、年内の日数計算、日付の比較、
 * 			 	  1日単位・n日単位の日付操作（進める・戻す）の実行結果を表示する
 * 作成者    	: 玉澤一輝
 * 作成日    	: 2026.5.11
 */
public class Test {
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner STANDARD_INPUT = new Scanner(System.in);
		//"--- Day5クラス 全メソッド動作確認 ---"と表示して改行する
		System.out.println("--- Day5クラス 全メソッド動作確認 ---");
		//自身のコピーを作成し新しいインスタンスを生成する
		Day5 TodaysDate = new Day5();
		//2026年2月28日の日付を持つDay5クラスのインスタンスを新しく生成する
		Day5 dayFirst = new Day5(2026, 2, 28);
		//2024年2月31日の日付を持つDay5クラスのインスタンスを新しく生成する
		Day5 daySecond = new Day5(2024, 2, 31);
		//"今日の日付:TodaysDate"と表示して改行する
		System.out.println("今日の日付: " + TodaysDate);
		//"設定日付1:dayFirst"と表示して改行する
		System.out.println("設定日付1: " + dayFirst);
		//"設定日付2（2/31を指定）:daySecond"と表示して改行する
		System.out.println("設定日付2（2/31を指定）: " + daySecond);
		//"--- 年内の日数計算 ---"と表示して改行する
		System.out.println("\n--- 年内の日数計算 ---");
		//"TodaysDate.getYear()年の経過日数:TodaysDate.elapseDayOfYear()"と表示して改行する
		System.out.println(TodaysDate.getYear() + "年の経過日数: " + TodaysDate.elapseDayOfYear());
		//"TodaysDate.getYear()年の残り日数:TodaysDate.leftDayOfYear()"と表示して改行する
		System.out.println(TodaysDate.getYear() + "年の残り日数: " + TodaysDate.leftDayOfYear());
		//"--- 比較メソッド ---"と表示して改行する
		System.out.println("\n--- 比較メソッド ---");
		//"dayFirstとdaySecondを比較(インスタンス):dayFirst.compareTo(daySecond)"と表示して改行する
		System.out.println("dayFirst と daySecond を比較(インスタンス): " + dayFirst.compareTo(daySecond));
		//"dayFirstとdaySecondを比較(クラス):Day5.compare(dayFirst, daySecond)"と表示して改行する
		System.out.println("dayFirst と daySecond を比較(クラス): " + Day5.compare(dayFirst, daySecond));
		//"--- 日付の操作（1日単位） ---"と表示して改行する
		System.out.println("\n--- 日付の操作（1日単位） ---");
		//"dayFirstの前日:dayFirst.precedeDay()"と表示して改行する
		System.out.println("dayFirstの前日: " + dayFirst.precedeDay());
		//"dayFirstの翌日:dayFirst.nextDay"と表示して改行する
		System.out.println("dayFirstの翌日: " + dayFirst.nextDay());
		//"dayFirst自体を1日進めます..."と表示して改行する
		System.out.print("dayFirst自体を1日進めます...");
		//インスタンス（dayFirst）の日付を1日分進める
		dayFirst.advanceDate();
		//"結果:dayFirst"と表示して改行する
		System.out.println("結果: " + dayFirst);
		//"--- 日付の操作（n日単位） ---"と表示して改行する
		System.out.println("\n--- 日付の操作（n日単位） ---");
		//"何日進めますか（負の数は戻る）: "と表示して改行する
		System.out.print("何日進めますか（負の数は戻る）: ");
		//変数afterNDaysに入力した値を代入する
		int afterNDays = STANDARD_INPUT.nextInt();
		//"afterNDays日後の日付(返却):TodaysDate.afterDayN(afterNDays)"と表示して改行する
		System.out.println(afterNDays + "日後の日付(返却): " + TodaysDate.afterDayN(afterNDays));
		//"afterNDays日前の日付(返却):TodaysDate.beforeDayN(afterNDays)"と表示して改行する
		System.out.println(afterNDays + "日前の日付(返却): " + TodaysDate.beforeDayN(afterNDays));
		//"dayFirst自体をafterNDays日進めます..."と表示して改行する
		System.out.print("dayFirst自体を " + afterNDays + " 日進めます...");
		//インスタンス（dayFirst）の日付をn日分進める
		dayFirst.advanceDateN(afterNDays);
		//"結果:dayFirst"と表示して改行する
		System.out.println("結果: " + dayFirst);
		//"dayFirst自体をafterNDays日戻します..."と表示して改行する
		System.out.print("dayFirst自体を " + afterNDays + " 日戻します...");
		//インスタンス（dayFirst）の日付を指定された日数分だけ過去に戻す
		dayFirst.retreatDayN(afterNDays);
		//"結果:dayFirst"と表示して改行する
		System.out.println("結果: " + dayFirst);
		//"日付を入力してください。"と表示して改行する
		System.out.println("\n日付を入力してください。");
		//"年："と表示する
		System.out.print("年："); 
		//変数yearNumberに入力した値を代入する
		int yearNumber = STANDARD_INPUT.nextInt();
		//"月："と表示する
		System.out.print("月："); 
		//変数monthNumberに入力した値を代入する
		int monthNumber = STANDARD_INPUT.nextInt();
		//"日："と表示する
		System.out.print("日："); 
		//変数dateNumberに入力した値を代入する
		int dateNumber = STANDARD_INPUT.nextInt();
		//入力された年月日を基に比較対象となるDay5インスタンス（userDay）を生成する
		Day5 userDay = new Day5(yearNumber, monthNumber, dateNumber);
		//ンストラクタを呼び出し現在の日付（実行当日）を持つインスタンスを生成する
		Day5 today = new Day5();
		//"入力された日付:userDay"と表示して改行する
		System.out.println("入力された日付: " + userDay);
		//"今日の日付：today"と表示して改行する
		System.out.println("今日の日付     : " + today);
		//compareToメソッドにより入力された日付と今日の日付の前後関係を判定・表示する
		userDay.compareTo(today);
		//nextDayメソッドで生成された「翌日のインスタンス」を変数nextDayObjectに保持する
		Day5 nextDayObject = userDay.nextDay(); 
		//"翌日の日付:nextDayObject"と表示して改行する
		System.out.println("翌日の日付: " + nextDayObject);
	}
}
