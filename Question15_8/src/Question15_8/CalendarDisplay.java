package Question15_8;

/**
 * クラス名         : CalendarDisplay
 * 概要             : 1ヶ月分または1年分のカレンダーを表示するクラス
 * 					  Day8クラスを利用して各月の曜日や日数を取得する
 * @author         	: 玉澤一輝
 * 作成日           : 2026.05.17
 */
public class CalendarDisplay {

	/**
	 * 関数名           : printMonth
	 * メソッドの説明   : 指定された年・月の1ヶ月分のカレンダーを表示する
	 * @param      		: year(表示対象の年)、month(表示対象の月)
	 * @return         	: なし
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.17
	 */
	public void printMonth(int year, int month) {
		//変数firstDayに指定された年の月の1日のオブジェクトを生成する
		Day8 firstDay = new Day8(year, month, 1);
		//変数lastDayにその月の最終日を取得する
		final int lastDay = Day8.lastDayOfMonth(year, month);
		// 1日の曜日（0:日～6:土）を取得
		final int startIndex = firstDay.dayOfWeek();
		//" --- %d年  %2d月 ---の中身を整形して表示する
		System.out.printf(" --- %d年  %2d月 ---\n", year, month);
		//" 日 月 火 水 木 金 土"と表示して改行する
		System.out.println(" 日 月 火 水 木 金 土");
		//変数iが0から始めて1ずつ増やしていきstartIndexまで繰り返す
		for (int i = 0; i < startIndex; i++) {
			//1日の曜日が来るところまで空白を空ける
			System.out.print("   ");
		}
		//変数beginningDayが1から始めて1ずつ増やしていきbeginningDayとlastDayが一致するまで繰り返す
		for (int beginningDay = 1; beginningDay <= lastDay; beginningDay++) {
			//日付を整形して表示する
			System.out.printf("%3d", beginningDay);

			//もし(startIndex + beginningDay - 1)を7で割った剰余が6の場合
			if ((startIndex + beginningDay - 1) % 7 == 6) {
				//改行する
				System.out.println();
			}
		}
		//もし(startIndex + beginningDay - 1)を7で割った剰余が6でない場合
		if ((startIndex + lastDay - 1) % 7 != 6) {
			//改行する
			System.out.println();
		}
		//改行する(月ごとの区切り)
		System.out.println();
	}

	/**
	 * 関数名           : printYear
	 * メソッドの説明   : 指定された年の1月から12月までのカレンダーを順番に表示する
	 * @param 	     	: year(表示対象の年)
	 * @return         	: なし
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.17
	 */
	public void printYear(int year) {
		//"-----------------------"を表示して改行する
		System.out.println("-----------------------");
		//年の中身を整形して"【 %d年 カレンダー 】"と表示する
		System.out.printf("【 %d年 カレンダー 】\n", year);
		//"-----------------------"を表示して改行する
		System.out.println("-----------------------");
		//配列EACH_MONTHSから月を順番に取り出し定数monthNumberに格納するのを繰り返す
		for (final int monthNumber : EACH_MONTHS) {
			//指定された年と処理中の月を使って1ヶ月分のカレンダーを表示する
			printMonth(year, monthNumber);
		}
	}

	/**
	 * フィールド名     : EACH_MONTHS
	 * フィールドの説明 : 1年間の月のリスト（1月〜12月）
	 * @param 	     	: なし
	 * @return         	: なし
	 * @author 			: 玉澤一輝
	 * 作成日 			: 2026.5.17
	 */
	private static final int[] EACH_MONTHS = 
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
}