import id.DateId;
/*
 * クラス名          : DateIdTester
 * 概要              : DateIdクラスの動作を確認するためのテスト用クラス
 * 					   パッケージidに所属するDateIdクラスのインスタンスを生成し
 * 					   付与された識別番号が正しく表示されるかを検証する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.11
 */
public class DateIdTester {
	/**
	 * 関数名           : main
	 * メソッドの説明   : DateIdクラスのインスタンスを複数生成しそれぞれの識別番号を表示する
	 * パラメータ       : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.11
	 */
	public static void main(String[] args) {
		//DateIdクラスのインスタンスを生成する
		DateId identificationNumber1 = new DateId();
		//DateIdクラスのインスタンスを生成する
		DateId identificationNumber2 = new DateId();
		//DateIdクラスのインスタンスを生成する
		DateId identificationNumber3 = new DateId();
		//"aの識別番号 :identificationNumber1.getId()"と表示して改行する
		System.out.println("aの識別番号 : " + identificationNumber1.getId());
		//"bの識別番号 :identificationNumber2.getId()"と表示して改行する
		System.out.println("bの識別番号 : " + identificationNumber2.getId());
		//"cの識別番号 :identificationNumber3.getId()"と表示して改行する
		System.out.println("cの識別番号 : " + identificationNumber3.getId());
	}
}