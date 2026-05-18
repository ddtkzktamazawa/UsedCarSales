package Question15_8;

/**
 * クラス名         : CalendarContents
 * 概要             : コマンドライン引数に応じて、対応するカレンダーを表示する起動クラス
 * 					  引数の数（年のみ、年と月、未指定）によって処理を自動分岐する
 * @author         	: 玉澤一輝
 * 作成日          	: 2026.05.17
 */
public class CalendarContents {

	/**
	 * 関数名           : main
	 * メソッドの説明   : コマンドライン引数を解析し適切なカレンダー表示メソッドを呼び出す
	 * 					  引数が直接数値に変換可能かチェックし分岐させる
	 * @param 		   	: コマンドライン引数（[0]:年、[1]:月）
	 * @return         	: なし
	 * @author         	: 玉澤一輝
	 * 作成日          	: 2026.05.17
	 */
	public static void main(String[] args) {
		//final変数calendarSpecifyにカレンダー表示機能を制御するクラスのインスタンスを生成して代入する
		final CalendarDisplay calendarSpecify = new CalendarDisplay();
		//引数の個数分のパターンに分岐する
		switch (args.length) {
		// パターン1:引数なし（未指定、現在の年・月の1ヶ月を表示）
		case 0:
			//現在の日付情報を持ったDay8インスタンスを生成する
			final Day8 todaysDate = new Day8();
			//生成したインスタンスから現在の「年」と「月」を取得しその月のカレンダーを表示する
			calendarSpecify.printMonth(todaysDate.getYear(), todaysDate.getMonth());
			//抜ける
			break;
			// パターン2：引数1個（指定された年の1〜12月を表示）
		case 1:
			//final変数yearOnlyにコマンドラインの第1引数を整数に変換し代入する
			final int yearOnly = Integer.parseInt(args[0]);
			//もし入力された年が1より小さい（存在しない年）場合
			if (yearOnly < 1) {
				//"エラー：年は1以上を指定してください。"と表示して改行する
				System.out.println("エラー：年は1以上を指定してください。");
				//返却する
				return;
			}
			//生成したインスタンスから現在の「年」を取得しその月のカレンダーを表示する
			calendarSpecify.printYear(yearOnly);
			//抜ける
			break;
			// パターン3：引数2個（指定された年・月の1ヶ月分を表示）
		default:
			//final変数inputYearにコマンドラインの第1引数を整数に変換し代入する
			final int inputYear = Integer.parseInt(args[0]);
			//final変数inputMonthにコマンドラインの第2引数を整数に変換し代入する
			final int inputMonth = Integer.parseInt(args[1]);
			//もし入力された年が1より小さい（存在しない年）場合
			if (inputYear < 1) {
				//"エラー：年は1以上を指定してください。"と表示して改行する
				System.out.println("エラー：年は1以上を指定してください。");
				//返却する
				return;
			}
			//もし入力された月が1より小さく12より大きい（存在しない月）場合
			if (inputMonth < 1 || inputMonth > 12) {
				//"エラー：月は1〜12の範囲で指定してください。"と表示して改行する
				System.out.println("エラー：月は1〜12の範囲で指定してください。");
				//返却する
				return;
			}
			//変数inputYearとinputMonthを渡し該当する年、月のカレンダーを画面に表示する
			calendarSpecify.printMonth(inputYear, inputMonth);
			//抜ける
			break;
		}
	}
}
