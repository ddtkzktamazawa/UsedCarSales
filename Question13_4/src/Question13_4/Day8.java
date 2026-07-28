package Question13_4;


/*
 * クラス名          : Day
 * 概要              : 日付情報を管理し曜日計算や文字列表現の提供を行うクラス
 * 					　 5種類のコンストラクタによる初期化とカプセル化（ゲッタ・セッタ）を
 * 					　 実装している
 * @author           : 玉澤一輝
 * 作成日            : 2026.5.13
 */
public class Day8 {
	//年の初期化
	private int yearNumber = 1;
	//月の初期化
	private int monthNumber = 1;
	//日付の初期化
	private int dateNumber = 1;

	/**
	 * コンストラクタ   : Day
	 * コンストラクタの説明   : 指定された年月日、または他のDayインスタンスを基に初期化を行う
	 * 							年が0の場合は1年として処理する
	 * @param				  : 年、年月、年月日、Dayインスタンス
	 * @return               : なし
	 * @author               : 玉澤一輝
	 * 作成日                 : 2026.5.13
	 */
	//フィールドの初期値でインスタンスを生成する
	public Day8() {}
	//年を指定してを受け取って初期化
	public Day8(int year) {
		//もし指定された年が0の場合、1年とする
		if(year == 0)year =1; this.yearNumber = year;
	}
	//年と月を指定する
	public Day8(int year, int month) {
		//年指定のコンストラクタを呼び出して処理
		this(year); this.monthNumber = month;
	}
	//年と月と日を指定する
	public Day8(int year, int month, int date) {
		//年月指定のコンストラクタを呼び出して処理
		this(year, month); this.dateNumber = date;
	}
	//別のインスタンスを受け取って自身の値としてコピー
	public Day8(Day8 d) {
		//年月日指定のコンストラクタを呼び出して複製
		this(d.yearNumber, d.monthNumber, d.dateNumber);
	}
	/**
	 * 関数名           : getYear
	 * メソッドの説明   : 年のフィールド値を返却する
	 * @param			: なし
	 * @return         	: 年
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13
	 */
	public int getYear() {
		//年を返却
		return yearNumber;
	}
	/**
	 * 関数名           : getMonth
	 * メソッドの説明   : 月のフィールド値を返却する
	 * @param			: なし
	 * @return         	: 月
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13
	 */
	public int getMonth() {
		//月を返却
		return monthNumber;
	}
	/**
	 * 関数名           : getDate
	 * メソッドの説明   : 日にちのフィールド値を返却する
	 * @param			: なし
	 * @return         	: 日にち
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13
	 */
	public int getDate() {
		//日にちを返却
		return dateNumber;
	}	
	/**
	 * 関数名           : setYear
	 * メソッドの説明   : 年の値を更新する
	 * @param			: 年
	 * @return         	: なし
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13
	 */
	public void setYear(int year) {
		//yearNumberに引数の値を代入する
		this.yearNumber = year;
	}
	/**
	 * 関数名           : setMonth
	 * メソッドの説明   : 月の値を更新する
	 * @param			: 月
	 * @return         	: なし
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13
	 */
	public void setMonth(int month) {
		//monthNumberに引数の値を代入する
		this.monthNumber = month;
	}
	/**
	 * 関数名           : setDate
	 * メソッドの説明   : 日付の値を更新する
	 * @param			: 日付
	 * @return         	: なし
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13
	 */
	public void setdate(int date) {
		//setDateに引数の値を代入する
		this.dateNumber = date;
	}
	/**
	 * 関数名           : set
	 * メソッドの説明   : 年月日をまとめて更新する
	 * @param		 	: 年、月、日
	 * @return         	: なし
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13
	 */
	public void set(int year, int month, int date) {
		//yearNumberに引数の値を代入する
		this.yearNumber = year;
		//monthNumberに引数の値を代入する
		this.monthNumber = month;
		//dateNumberに引数の値を代入する
		this.dateNumber = date;
	}
	/**
	 * 関数名           : dayOfWeek
	 * メソッドの説明   : 曜日を算出する
	 * @param 			: なし
	 * @return         	: 0(日曜日)～6(土曜日)の整数値
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13
	 */
	public int dayOfWeek() {
		//フィールドの値をコピー
		int yearValue = yearNumber;
		//フィールドの値をコピー
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
	 * 関数名           : equalTo
	 * メソッドの説明   : 他のDayインスタンスと日付が一致するか判定する
	 * @param       	: 比較対象のDayインスタンスd
	 * @return         	: 一致すればtrue、しなければfalse
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13 
	 */
	public boolean equalTo(Day8 d) {
		//年、月、日がすべて等しいか判定した結果を返す
		return yearNumber == d.yearNumber && monthNumber == d.monthNumber && dateNumber == d.dateNumber;
	}
	/**
	 * 関数名           : toString
	 * メソッドの説明   : 現在の日付情報の文字列表現を返却する
	 * @param       	: なし
	 * @return         	:「yyyy年mm月dd日（曜）」形式の文字列
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13 
	 */
	public String toString() {
		//曜日を表示するための文字配列
		String[] weekDay = {"日","月","火","水","木","金","土"};
		//4桁・2桁・2桁で整形しdayOfWeekの結果を曜日に入れる
		return String.format("%04d年%02d月%02d日（%s）", yearNumber, monthNumber, dateNumber, weekDay[dayOfWeek()]);
	}
}
