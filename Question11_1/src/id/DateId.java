package id;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;
/*
 * クラス名          : DateId
 * 概要              : 日付に基づいた識別番号を管理するクラス
 * 					   クラスがロードされた際の日付を元に識別番号の初期値を決定
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.11
 */
public class DateId {
	//何番まで識別番号を与えたか
	private static int counter;
	//各インスタンス固有の識別番号
	private int idNumber;
	static {
		//今日の日付の情報を持つグレゴリオ暦のインスタンスを生成する
		GregorianCalendar todaysDate = new GregorianCalendar();
		//年を取得する
		int yearNumber = todaysDate.get(YEAR);
		//月を取得する
		int monthNumber = todaysDate.get(MONTH) + 1;
		//日を取得する
		int dateNumber = todaysDate.get(DATE);
		//4桁・2桁・2桁で今日の年、月、日を表示する
		System.out.printf("今日は%04d年%02d月%02d日です。\n", yearNumber, monthNumber, dateNumber);
		//識別番号の初期値を設定
		counter = yearNumber * 1000000 + monthNumber * 10000 + dateNumber * 100;
	}

	/**
	 * コンストラクタ  		: DateId
	 * コンストラクタの説明 : 新しいインスタンスを生成し一意の識別番号を割り当てる
	 * 						  静的変数をインクリメントしその値を個々のインスタンス変数に格納する
	 * パラメータ      		: なし
	 * 返り値           	: なし
	 * 作成者          		: 玉澤一輝
	 * 作成日          		: 2026.05.11
	 */
	public DateId() {
		//カウンターを1増やしてから自分のIDとして保持する
		idNumber = ++counter;
	}

	/**
	 * メソッド名       : getId
	 * メソッドの説明   : 識別番号を返却する
	 * パラメータ       : なし
	 * 返り値           : 識別番号
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.11
	 */
	public int getId() {
		//idNumberを返却する
		return idNumber;
	}
}