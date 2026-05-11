package Question10_4;
import java.util.GregorianCalendar;
/*
 * クラス名 	:Day5
 * 概要 		:日付情報を管理し曜日計算や文字列表現の提供を行うクラス
 * 				 5種類のコンストラクタによる初期化とカプセル化（ゲッタ・セッタ）を
 * 				 実装している
 * 作成者 		: 玉澤一輝
 * 作成日 		: 2026.5.1
 */
public class Day5 {
	//年の初期化
	private int yearNumber = 1;
	//月の初期化
	private int monthNumber = 1;
	//日付の初期化
	private int dateNumber = 1;

	/**
	 * コンストラクタ 		: Day5
	 * コンストラクタの説明 : 指定された年月日、または他のDayインスタンスを基に初期化を行う
	 * 						  年が0の場合は1年として処理する
	 * パラメータの説明 	: 年、年月、年月日、Dayインスタンス
	 * 返り値 				: なし
	 * 作成者				: 玉澤一輝
	 * 作成日 				: 2026.5.1
	 */
	public Day5() {
		//GregorianCalendarクラスを用いて現在の日時情報を取得する
		GregorianCalendar todayDate = new GregorianCalendar();
		//実行時の「年」を取得してフィールドに代入
		this.yearNumber = todayDate.get(java.util.Calendar.YEAR);
		//実行時の「月」を取得してフィールドに代入
		this.monthNumber = todayDate.get(java.util.Calendar.MONTH) + 1;
		//実行時の「日」を取得してフィールドに代入
		this.dateNumber = todayDate.get(java.util.Calendar.DATE);
	}
	//年を指定してを受け取って初期化
	public Day5(int year) {
		//月と日は1とする
		this(year, 1, 1);
	}
	//年と月を指定する
	public Day5(int year, int month) {
		//日は1とする
		this(year, month, 1);
	}
	//年と月と日を指定する
	public Day5(int year, int month, int date) {
		//年が1より小さい場合は1にする
		this.yearNumber = (year < 1) ? 1 : year;
		//もし月が1より小さい場合
		if (month < 1) {
			//1月とする
			this.monthNumber = 1;
		}
		//月が12より大きい場合
		else if (month > 12) {
			//12とする
			this.monthNumber = 12;
		}
		//その他の場合
		else {
			//そのままの月にする
			this.monthNumber = month;
		}
		//インスタンスの変数lastDateに代入する
		int lastDate = lastDayOfMonth(this.yearNumber, this.monthNumber);
		//もし日が1より小さい場合
		if (date < 1) {
			//日を1とする
			this.dateNumber = 1;
		}
		//もし日がその月の最終日より大きい場合
		else if (date > lastDate) {
			//日を最終日と同じにする
			this.dateNumber = lastDate;
		}
		//その他の場合
		else {
			//そのまま日とする
			this.dateNumber = date;
		}
	}

	public Day5(Day5 d) {
		//引数として受け取ったDay5インスタンスの年月日を自身のコンストラクタに渡して初期化
		this(d.yearNumber, d.monthNumber, d.dateNumber);
	}
	/**
	 * 関数名 			: getYear
	 * メソッドの説明 	: 年のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値 			: 年
	 * 作成者			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public int getYear() {
		//年を返却
		return yearNumber;
	}
	/**
	 * 関数名			: getMonth
	 * メソッドの説明 	: 月のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値 			: 月
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public int getMonth() {
		//月を返却
		return monthNumber;
	}
	/**
	 * 関数名			: getDate
	 * メソッドの説明 	: 日にちのフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値 			: 日にち
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public int getDate() {
		//日にちを返却
		return dateNumber;
	}	
	/**
	 * 関数名 			: setYear
	 * メソッドの説明 	: 年の値を更新する
	 * パラメータの説明 : 年
	 * 返り値 			: なし
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public void setYear(int year) {
		//yearNumberに引数の値を代入する
		this.yearNumber = year;
	}
	/**
	 * 関数名 			: setMonth
	 * メソッドの説明 	: 月の値を更新する
	 * パラメータの説明 : 月
	 * 返り値 			: なし
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public void setMonth(int month) {
		//monthNumberに引数の値を代入する
		this.monthNumber = month;
	}
	/**
	 * 関数名 			: setDate
	 * メソッドの説明 	: 日付の値を更新する
	 * パラメータの説明 : 日付
	 * 返り値 			: なし
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public void setdate(int date) {
		//setDateに引数の値を代入する
		this.dateNumber = date;
	}
	/**
	 * 関数名 			: set
	 * メソッドの説明 	: 年月日をまとめて更新する
	 * パラメータの説明 : 年、月、日
	 * 返り値 			: なし
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
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
	 * 関数名 			: dayOfWeek
	 * メソッドの説明 	: 曜日を算出する
	 * パラメータの説明 : なし
	 * 返り値 			: 0(日曜日)～6(土曜日)の整数値
	 * 作成者			: 玉澤一輝
	 * 作成日 			: 2026.5.1
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
	 * 関数名 			: equalTo
	 * メソッドの説明 	: 他のDayインスタンスと日付が一致するか判定する
	 * パラメータ 		: 比較対象のDayインスタンスd
	 * 返り値 			: 一致すればtrue、しなければfalse
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1 
	 */
	public boolean equalTo(Day5 oneDay) {
		//年、月、日がすべて等しいか判定した結果を返す
		return yearNumber == oneDay.yearNumber && monthNumber == oneDay.monthNumber && dateNumber == oneDay.dateNumber;
	}
	/**
	 * 関数名 			: toString
	 * メソッドの説明 	: 現在の日付情報の文字列表現を返却する
	 * パラメータ 		: なし
	 * 返り値 			:「yyyy年mm月dd日（曜）」形式の文字列
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1 
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
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	private static int[]eachMonthDays = 
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	/**
	 * 関数名 			: isLeap
	 * メソッドの説明	: 引数で受け取った年がうるう年かどうかを判定する
	 * パラメータ 		: なし
	 * 返り値 			: うるう年ならtrue、うるう年でなければfalse
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
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
	 * パラメータ 		: なし
	 * 返り値 			: 指定された年月におけるその月の最終日の日付（28〜31）
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
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
		return eachMonthDays[month - 1];
	}

	/**
	 * 関数名 			: elapseDayOfYear
	 * メソッドの説明 	: 年内での経過日数（1月1日から数えて何日目か）を求める
	 * パラメータ 		: なし
	 * 返り値 			: 経過日数（1〜366）
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public int elapseDayOfYear() {
		//変数monthDaysにdateNumberを代入する
		int monthDays = dateNumber;
		//変数iが1から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 1; i < monthNumber; i++) {
			//1月から現在の月の前月まで各月の末日（日数）を順に加算していく
			monthDays += lastDayOfMonth(yearNumber, i);
		}
		//monthDays-1を返却する
		return monthDays - 1;
	}

	/**
	 * 関数名 			: leftDayOfYear
	 * メソッドの説明 	: 年内の残り日数を求める
	 * パラメータ 		: なし
	 * 返り値 			: 残り日数
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public int leftDayOfYear() {
		// その年がうるう年なら366、そうでなければ365から経過日数を引く
		return (isLeap(yearNumber) ? 366 : 365) - (elapseDayOfYear() + 1);
	}
	/**
	 * 関数名 			: compareTo
	 * メソッドの説明 	: 他の日付との前後関係を判定する
	 * パラメータ 			: 比較対象の日付
	 * 返り値 			: 前なら-1、同じなら0、後なら1
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public int compareTo(Day5 oneDay) {
		//もしyearNumberがoneDay.yearNumberより小さい場合
		if (yearNumber < oneDay.yearNumber) {
			//-1を返却する
			return -1;
			//もしyearNumberがoneDay.yearNumberより大きい場合
		}else if (yearNumber > oneDay.yearNumber) { 
			//1を返却する
			return 1;
		}
		//もしmonthNumberがoneDay.monthNumberより小さい場合
		if (monthNumber < oneDay.monthNumber) {
			//-1を返却する
			return -1;
			//もしmonthNumberがoneDay.monthNumberより大きい場合
		}else if (monthNumber > oneDay.monthNumber) { 
			//1を返却する
			return 1;
		}
		//もしdateNumberがoneDay.dateNumberより小さい場合
		if (dateNumber < oneDay.dateNumber) { 
			//-1を返却する
			return -1;
			//もしdateNumberがoneDay.dateNumberより大きい場合
		}else if (dateNumber > oneDay.dateNumber) {
			//1を返却する
			return 1;
		}
		//0を返却する
		return 0;
	}

	/**
	 * 関数名 			: compare
	 * メソッドの説明 	: 二つの日付の前後関係を判定する
	 * パラメータ 		: oneDay1, oneDay2
	 * 返り値 			: oneDay1がoneDay2より前なら-1、同じなら0、後なら1
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public static int compare(Day5 oneDay1, Day5 oneDay2) {
		/*第一引数の日付を基準として第二引数の日付との
	//前後関係を比較した結果を返却する
		 */
		return oneDay1.compareTo(oneDay2);
	}
	/**
	 * 関数名 			: advanceDate
	 * メソッドの説明 	: 日付を一つ後ろに進める
	 * パラメータ 		: なし
	 * 返り値 			: なし
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public void advanceDate() {
		//現在の日付がその月の末日（最終日）より小さい場合
		if(dateNumber < lastDayOfMonth(yearNumber, monthNumber)){
			//日の値を1つ進める
			dateNumber++; 
			//その他の場合
		}else{
			//月が12月未満（1〜11月）の場合
			if (monthNumber < 12){
				//月の値を1つ進める
				monthNumber++;
				//日に1を代入する
				dateNumber = 1;
				//その他の場合
			}else{
				//年の値を1つ進める
				yearNumber++;
				//月に1を代入する
				monthNumber = 1;
				//日に1を代入する
				dateNumber = 1;
			}
		}
	}

	/**
	 * 関数名 			: nextDay
	 * メソッドの説明 	: 翌日の日付を返却する
	 * パラメータ		: なし
	 * 返り値 			: 翌日の日付
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public Day5 nextDay() {
		//自身のコピーを作成し新しいインスタンスを生成する
		Day5 followingDay = new Day5(this); 
		//新しいインスタンスの日付を1日先に進める
		followingDay.advanceDate();
		//followingDayを返却する
		return followingDay;
	}

	/**
	 * 関数名 			: retreatDay
	 * メソッドの説明 	: 日付を一つ前に戻す
	 * パラメータ 		: なし
	 * 返り値 			: なし
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public void retreatDay() {
		//もしdateNumberが1より大きい場合
		if(dateNumber > 1){
			//dateNumberを1づつ減らしていく
			dateNumber--;
			//その他の場合
		}else{
			//もしmonthNumberが1より大きい場合
			if(monthNumber > 1){
				//monthNumberを1づつ減らしていく
				monthNumber--; 
				/*指定された年月の最終日（28～31日）を取得し
				 * dateNumberに代入して月末日に設定する
				 */
				dateNumber = lastDayOfMonth(yearNumber, monthNumber);
				//その他の場合
			}else{
				//yearNumberを1づつ減らしていく
				yearNumber--;
				//monthNumberに12を代入する
				monthNumber = 12;
				//dateNumberに31を代入する
				dateNumber = 31;
			}
		}
	}

	/**
	 * 関数名 			: precedeDay
	 * メソッドの説明 	: 前日の日付を返却する
	 * パラメータ 		: なし
	 * 返り値 			: 前日の日付
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public Day5 precedeDay() {
		//自身と同じ日付を持つ新しいインスタンスをコピーする
		Day5 precedingDay = new Day5(this);
		//新しいインスタンスの日付を1日前へ戻す
		precedingDay.retreatDay();
		//precedingDayを返却する
		return precedingDay;
	}
	/**
	 * 関数名 			: advanceDateN
	 * メソッドの説明 	: 日付をn日後ろに進める
	 * パラメータ 		: 進める
	 * 返り値 			: なし
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public void advanceDateN(int certainNumber) {
		//もしcertainNumberが0より小さい場合
		if (certainNumber < 0) {
			//正の数に変換した上でretreatDayNメソッドを呼び出す
			retreatDayN(-certainNumber); 
		}
		//その他の場合
		else 
			//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int i = 0; i < certainNumber; i++) {
				//advanceDateメソッドを呼び出す
				advanceDate();
			}
	}

	/**
	 * 関数名 			: afterDayN
	 * メソッドの説明 	: n日後の日付を返却する
	 * パラメータ 		: n日後
	 * 返り値 			: n日後の日付
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public Day5 afterDayN(int certainNumber) {
		//自身のコピーを作成し新しいインスタンスを生成する
		Day5 followingDay = new Day5(this);
		//生成したコピーに対して指定された日数分だけ日付を進める
		followingDay.advanceDateN(certainNumber);
		//followingDayを返却する
		return followingDay;
	}

	/**
	 * 関数名 			: retreatDayN
	 * メソッドの説明 	: 日付をn日前へ戻す
	 * パラメータ 		: 戻す日数
	 * 返り値 			: なし
	 * 作成者 			: 玉澤一輝
	 * 作成日 			: 2026.5.1
	 */
	public void retreatDayN(int certainNumber) {
		//certainNumberが0より小さい場合
		if (certainNumber < 0) {
			//正の数に変換した上でretreatDayNメソッドを呼び出す
			retreatDayN(-certainNumber); 
		}
		//その他の場合
		else 
			//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
			for (int i = 0; i < certainNumber; i++) {
				//retreatDayメソッドを呼び出す
				retreatDay();
			}
	}

	/**
	 * 関数名 			: beforeDayN
	 * メソッドの説明 	: n日前の日付を返却する
	 * パラメータ 		: n日前
	 * 返り値 			: n日後の日付
	 * 作成者 			: 玉澤一輝
	 * 作成日			: 2026.5.1
	 */
	public Day5 beforeDayN(int certainNumber) {
		//自身のコピーを作成し新しいインスタンスを生成する
		Day5 precedingDay = new Day5(this);
		//生成したコピーのインスタンスに対して指定された日数分だけ日付を前に戻す
		precedingDay.retreatDayN(certainNumber);
		//precedingDayを返却する
		return precedingDay;
	}
}
