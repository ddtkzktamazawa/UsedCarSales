package Question9_5;
/*
 * クラス名          : period
 * 概要              : 開始日と終了日からなる「期間」を管理するクラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.04.29
 */
public class period {
	// 開始日の初期化
	private Day4 fromTime;
	// 終了日の初期化
	private Day4 toTime;

	/**
	 * コンストラクタ   	: period
	 * コンストラクタの説明 : 開始日と終了日を設定する
	 * パラメータの説明     : 開始日、終了日
	 * 返り値			    : なし
	 * 作成者               : 玉澤一輝
	 * 作成日               : 2026.4.29
	 */
	public period(Day4 fromTime, Day4 toTime) {
		//インスタンスの変数に代入する
		this.fromTime = new Day4(fromTime);
		//インスタンスの変数に代入する
		this.toTime = new Day4(toTime);
	}

	/**
	 * 関数名           : getFrom
	 * メソッドの説明   : 開始日を取得する
	 * パラメータの説明 : なし
	 * 返り値           : 開始日
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public Day4 getFrom() {
		//開始日を返却する
		return new Day4(fromTime);
	}

	/**
	 * 関数名           : getTo
	 * メソッドの説明   : 終了日を取得する
	 * パラメータの説明 : なし
	 * 返り値           : 終了日
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public Day4 getTo() {
		//終了日を返却する
		return new Day4(toTime);
	}
}