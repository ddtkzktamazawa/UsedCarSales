package Question9_5;

/*
 * クラス名          : Day4
 * 概要              : 日付情報を管理し曜日計算や文字列表現の提供を行うクラス
 * 					　 5種類のコンストラクタによる初期化とカプセル化（ゲッタ・セッタ）を
 * 					　 実装している
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.04.29
 */
public class Day4 {
	// インデックス調整用の定数OFFSET（1）
	private static final int OFFSET = 1;

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
	 * パラメータの説明       : 年、年月、年月日、Dayインスタンス
	 * 返り値                 : なし
	 * 作成者                 : 玉澤一輝
	 * 作成日                 : 2026.4.29
	 */
	//フィールドの初期値でインスタンスを生成する
	public Day4() {}
	//年を指定してを受け取って初期化
	public Day4(int year) {
		//もし指定された年が0の場合、1年とする
		if(year == 0)year =1; this.yearNumber = year;
	}
	//年と月を指定する
	public Day4(int year, int month) {
		//年指定のコンストラクタを呼び出して処理
		this(year); this.monthNumber = month;
	}
	//年と月と日を指定する
	public Day4(int year, int month, int date) {
		//年月指定のコンストラクタを呼び出して処理
		this(year, month); this.dateNumber = date;
	}
	/**
	 * コンストラクタ         : Day4
	 * コンストラクタの説明   : 他のDay4インスタンスを基に複製を作成する
	 * パラメータ             : d
	 * 返り値                 : なし
	 * 作成者                 : 玉澤一輝
	 * 作成日                 : 2026.5.1
	 */
	public Day4(Day4 d) {
		this(d.yearNumber, d.monthNumber, d.dateNumber);
	}
	/**
	 * 関数名           : getYear
	 * メソッドの説明   : 年のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 年
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public int getYear() {
		//年を返却
		return yearNumber;
	}
	/**
	 * 関数名           : getMonth
	 * メソッドの説明   : 月のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 月
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public int getMonth() {
		//月を返却
		return monthNumber;
	}
	/**
	 * 関数名           : getDate
	 * メソッドの説明   : 日にちのフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 日にち
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public int getDate() {
		//日にちを返却
		return dateNumber;
	}	
	/**
	 * 関数名           : setYear
	 * メソッドの説明   : 年の値を更新する
	 * パラメータの説明 : 年
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public void setYear(int year) {
		//yearNumberに引数の値を代入する
		this.yearNumber = year;
	}
	/**
	 * 関数名           : setMonth
	 * メソッドの説明   : 月の値を更新する
	 * パラメータの説明 : 月
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public void setMonth(int month) {
		//monthNumberに引数の値を代入する
		this.monthNumber = month;
	}
	/**
	 * 関数名           : setDate
	 * メソッドの説明   : 日付の値を更新する
	 * パラメータの説明 : 日付
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public void setdate(int date) {
		//setDateに引数の値を代入する
		this.dateNumber = date;
	}
	/**
	 * 関数名           : set
	 * メソッドの説明   : 年月日をまとめて更新する
	 * パラメータの説明 : 年、月、日
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
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
	 * パラメータの説明 : なし
	 * 返り値           : 0(日曜日)～6(土曜日)の整数値
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
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
	 * パラメータ       : 比較対象のDayインスタンスd
	 * 返り値           : 一致すればtrue、しなければfalse
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29 
	 */
	public boolean equalTo(Day4 d) {
		//年、月、日がすべて等しいか判定した結果を返す
		return yearNumber == d.yearNumber && monthNumber == d.monthNumber && dateNumber == d.dateNumber;
	}
	/**
	 * 関数名           : compareTo
	 * メソッドの説明   : 他の日付との前後関係を判定する
	 * パラメータ       : 比較対象の日付
	 * 返り値           : 前なら-1、同じなら0、後なら1
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.5.1
	 */
	public int compareTo(Day4 oneDay) {
		//yearNumberがoneDay.yearNumberより小さい場合
		if (yearNumber < oneDay.yearNumber) {
			//-1を返却
			return -1;
			//yearNumberがoneDay.yearNumberより大きい場合
		}else if (yearNumber > oneDay.yearNumber) { 
			//1を返却
			return 1;
		}
		//monthNumberがoneDay.monthNumberより小さい場合
		if (monthNumber < oneDay.monthNumber) {
			//-1を返却
			return -1;
			//monthNumberがoneDay.monthNumberより大きい場合
		}else if (monthNumber > oneDay.monthNumber) { 
			//1を返却
			return 1;
		}
		//dateNumberがoneDay.dateNumberより小さい場合
		if (dateNumber < oneDay.dateNumber) { 
			//-1を返却
			return -1;
			//dateNumberがoneDay.dateNumberより大きい場合
		}else if (dateNumber > oneDay.dateNumber) {
			//1を返却
			return 1;
		}
		//0を返却
		return 0;
	}
	/**
	 * 関数名           : compare
	 * メソッドの説明   : 二つの日付の前後関係を判定する
	 * パラメータ       : oneDay1, oneDay2
	 * 返り値           : oneDay1がoneDay2より前なら-1、同じなら0、後なら1
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.5.1
	 */
	public static int compare(Day4 oneDay1, Day4 oneDay2) {
		//compareToメソッドを呼び出して二つの日付を比較した結果を返す
		return oneDay1.compareTo(oneDay2);
	}
	/**
	 * 関数名           : lastDayOfMonth
	 * メソッドの説明   : 指定された年月が何日まであるかを返却する
	 * パラメータ       : year（年）、month（月）
	 * 返り値           : その月の日数（28〜31）
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.5.1
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
		//dummyDays[month-1]を返却
		return dummyDays[month - OFFSET];
	}
	/**
	 * フィールド名     : dummyDays
	 * フィールドの説明 : 各月の日数を格納する配列（1月〜12月）
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.5.1
	 */
	private static int[] dummyDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	/**
	 * 関数名           : isLeap
	 * メソッドの説明   : 引数で受け取った年がうるう年かどうかを判定する（クラスメソッド）
	 * パラメータ       : year
	 * 返り値           : うるう年ならtrue、うるう年でなければfalse
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.5.1
	 */
	public static boolean isLeap(int year) {
		/*西暦yearが「4で割り切れるかつ100で割り切れない」または「400で割り切れる」
		 *という条件を満たせば、うるう年であると判定してtrueを返す
		 */
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}
	/**
	 * 関数名           : isValid
	 * メソッドの説明   : 指定された年月日が実在するか判定する
	 * パラメータ       : year, month, date
	 * 返り値           : 正しければtrue、不正ならfalse
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.5.1
	 */
	public static boolean isValid(int year, int month, int date) {
		//もしyearが1より小さい場合
		if (year < 1) {
			//falseを返却
			return false;
		}
		//もしmonthが1より小さいまたはmonthが12より大きい場合
		if (month < 1 || month > 12) {
			//falseを返却
			return false;
		}
		//インスタンスの変数lastDayに代入する
		int lastDay = lastDayOfMonth(year, month);
		//もしdateが1より小さいまたはdateがlastDayより大きい場合
		if (date < 1 || date > lastDay) {
			//falseを返却
			return false;
		}
		//trueを返却
		return true;
	}
	/**
	 * 関数名           : toString
	 * メソッドの説明   : 現在の日付情報の文字列表現を返却する
	 * パラメータ       : なし
	 * 返り値           :「yyyy年mm月dd日（曜）」形式の文字列
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29 
	 */
	public String toString() {
		//曜日を表示するための文字配列
		String[] weekDay = {"日","月","火","水","木","金","土"};
		//4桁・2桁・2桁で整形しdayOfWeekの結果を曜日に入れる
		return String.format("%04d年%02d月%02d日（%s）", yearNumber, monthNumber, dateNumber, weekDay[dayOfWeek()]);
	}
}
