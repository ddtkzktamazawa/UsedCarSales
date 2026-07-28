package Question15_8;
import java.util.GregorianCalendar;
/*
 * クラス名 	: Day8
 * 概要 		: 日付情報を管理し曜日計算や文字列表現の提供を行うクラス
 * 				  5種類のコンストラクタによる初期化とカプセル化（ゲッタ・セッタ）を
 * 				  実装している
 * @author 		: 玉澤一輝
 * 作成日 		: 2026.5.15
 */
public class Day8 {
	//年の初期化
	private int yearNumber;
	//月の初期化
	private int monthNumber;
	//日付の初期化
	private int dateNumber;

	/**
	 * コンストラクタ 		: Day8
	 * コンストラクタの説明 : 指定された年月日、または他のDayインスタンスを基に初期化を行う
	 * 						  年が0の場合は1年として処理する
	 * @param 				: 年、年月、年月日、Dayインスタンス
	 * @return 				: なし
	 * @author				: 玉澤一輝
	 * 作成日 				: 2026.5.15
	 */
	public Day8() {
		//GregorianCalendarクラスを用いて現在の日時情報を取得する
		GregorianCalendar todayDate = new GregorianCalendar();
		//実行時の「年」を取得してフィールドに代入
		this.yearNumber = todayDate.get(java.util.Calendar.YEAR);
		//実行時の「月」を取得してフィールドに代入
		this.monthNumber = todayDate.get(java.util.Calendar.MONTH) + 1;
		//実行時の「日」を取得してフィールドに代入
		this.dateNumber = todayDate.get(java.util.Calendar.DATE);
	}
	/**
	 * コンストラクタ 		: Day8
	 * コンストラクタの説明 : 引数で受け取った年、およびデフォルトの月日（1月1日）で初期化を行う
	 * @param 				: 年（year）
	 * @return 				: なし
	 * @author				: 玉澤一輝
	 * 作成日 				: 2026.5.15
	 */
	public Day8(int year) {
		//月と日は1とする
		this(year, 1, 1);
	}
	/**
	 * コンストラクタ 		: Day8
	 * コンストラクタの説明 : 引数で受け取った年・月、およびデフォルトの日（1日）で初期化を行う
	 * @param 				: 年、月(year,month)
	 * @return 				: なし
	 * @author				: 玉澤一輝
	 * 作成日 				: 2026.5.15
	 */
	public Day8(int year, int month) {
		//日は1とする
		this(year, month, 1);
	}
	/**
	 * コンストラクタ 		: Day8
	 * コンストラクタの説明 : 引数で受け取った年・月・日の値を用いて初期化を行う
	 * @param 				: 年、月、日(year,month,date)
	 * @return 				: なし
	 * @author				: 玉澤一輝
	 * 作成日 				: 2026.5.15
	 */
	public Day8(int year, int month, int date) {
		//指定された引数（年・月・日）をセットし、範囲外の場合は適切な値に補正する
		set(year, month, date);
	}
	/**
	 * コンストラクタ 		: Day8
	 * コンストラクタの説明 : 既存のDay8インスタンスの内容をコピーして新しいインスタンスを生成する
	 * @param 				: コピー元のインスタンス（d）
	 * @return 				: なし
	 * @author				: 玉澤一輝
	 * 作成日 				: 2026.5.15
	 */
	public Day8(Day8 d) {
		//引数として受け取ったDay8インスタンスの年月日を自身のコンストラクタに渡して初期化
		this(d.yearNumber, d.monthNumber, d.dateNumber);
	}
	/**
	 * 関数名 			: getYear
	 * メソッドの説明 	: 年のフィールド値を返却する
	 * @param 			: なし
	 * @return 			: 年
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.15
	 */
	public int getYear() {
		//年を返却
		return yearNumber;
	}
	/**
	 * 関数名			: getMonth
	 * メソッドの説明 	: 月のフィールド値を返却する
	 * @param 			: なし
	 * @return 			: 月
	 * @author 			: 玉澤一輝
	 * 作成日 			: 2026.5.15
	 */
	public int getMonth() {
		//月を返却
		return monthNumber;
	}
	/**
	 * 関数名			: getDate
	 * メソッドの説明 	: 日にちのフィールド値を返却する
	 * @param 			: なし
	 * @return 			: 日にち
	 * @author 			: 玉澤一輝
	 * 作成日 			: 2026.5.15
	 */
	public int getDate() {
		//日にちを返却
		return dateNumber;
	}	

	/**
	 * 関数名 			: set
	 * メソッドの説明 	: 年月日をまとめて更新する
	 * @param 			: 年、月、日(year,month,date)の設定
	 * 					  範囲外は適切な値に調節する
	 * @return 			: なし
	 * @author 			: 玉澤一輝
	 * 作成日 			: 2026.5.15
	 */
	public void set(int year, int month, int date) {
		//年が1未満の場合は1年に補正する
		this.yearNumber = (year < 1) ? 1 : year;
		//月が1〜12の範囲に収まるよう調整する
		this.monthNumber = (month < 1) ? 1 : (month > 12) ? 12 : month;
		//決定した年・月から、その月の最終日（28〜31日）を取得する
		int lastDay = lastDayOfMonth(this.yearNumber, this.monthNumber);
		//日が1〜最終日の範囲に収まるよう調整する
		this.dateNumber = (date < 1) ? 1 : (date > lastDay) ? lastDay : date;
	}
	/**
	 * 関数名 			: dayOfWeek
	 * メソッドの説明 	: 曜日を算出する
	 * @param 			: なし
	 * @return 			: 0(日曜日)～6(土曜日)の整数値
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.15
	 */
	public int dayOfWeek() {
		//フィールドの値をコピーする
		int yearValue = yearNumber;
		//フィールドの値をコピーする
		int monthValue = monthNumber;
		//もし月が1月または2月の場合
		if(monthValue == 1 || monthValue == 2) {
			//yearValueをデクリメント
			yearValue--;
			//monthValueに12を加える
			monthValue += 12;
		}
		//曜日計算結果を返却
		return(yearValue + yearValue / 4 - yearValue / 100 + yearValue / 400 + (13 * monthValue + 8) / 5 + dateNumber) % 7;
	}

	/**
	 * 関数名 			: toString
	 * メソッドの説明 	: 現在の日付情報の文字列表現を返却する
	 * @param 			: なし
	 * @return 			:「yyyy年mm月dd日（曜）」形式の文字列
	 * @author 			: 玉澤一輝
	 * 作成日 			: 2026.5.15 
	 */
	public String toString() {
		//曜日を表示するための文字配列
		String[] weekDay = {"日","月","火","水","木","金","土"};
		//4桁・2桁・2桁で整形しdayOfWeekの結果を曜日に入れる
		return String.format("%04d年%02d月%02d日（%s）", yearNumber, monthNumber, dateNumber, weekDay[dayOfWeek()]);
	}
	/**
	 * フィールド名 	: eachMonthDays
	 * フィールドの説明 : 各月の日数を格納する配列（1月〜12月）
	 * @author 			: 玉澤一輝
	 * 作成日 			: 2026.5.15
	 */
	private static final int[]EACH_MONTH_DAYS = 
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	/**
	 * 関数名 			: isLeap
	 * メソッドの説明	: 引数で受け取った年がうるう年かどうかを判定する
	 * @param 			: なし
	 * @return 			: うるう年ならtrue、うるう年でなければfalse
	 * @author 			: 玉澤一輝
	 * 作成日 			: 2026.5.15
	 */
	public static boolean isLeap(int y) {
		/*西暦yearが「4で割り切れるかつ100で割り切れない」または「400で割り切れる」
		 *という条件を満たせば、うるう年であると判定してtrueを返す
		 */
		return (y % 4 == 0 && y % 100 != 0 || y % 400 == 0);
	}

	/**
	 * 関数名 			: lastDayOfMonth
	 * メソッドの説明 	: 指定された年月が何日まであるかを返却する
	 * @param 			: なし
	 * @return 			: 指定された年月におけるその月の最終日の日付（28〜31）
	 * @author 			: 玉澤一輝
	 * 作成日 			: 2026.5.15
	 */
	public static int lastDayOfMonth(int year, int month) {
		//もしmonthが1より小さい、monrhが12より大きい場合
		if (month < 1 || month > 12) {
			//31を返却
			return 31;
		}
		//もしmonthが2と一致、かつisLeap(year)の場合
		if (month == 2 && isLeap(year)) {
			//29を返却
			return 29;
		}
		//eachMonthDays[month-1]を返却
		return EACH_MONTH_DAYS[month - 1];
	}
}
