package Question9_2;
/*
 * クラス名          : Question9_2
 * 概要              : Dayクラス（第3版）の動作確認を行うメインクラス5種類のコンストラクタによる
 * 					　 初期化とそれに対応する曜日計算・文字列表現の出力を検証する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.04.29
 */
public class Question9_2 {
	/**
	 * 関数名           : main
	 * メソッドの説明   : Dayクラスの異なるコンストラクタ（デフォルト、年指定、年月指定、年月日指定、
	 * 					　コピーコンストラクタ）を順に呼び出し生成されたインスタンスの情報を表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.04.29
	 */
	public static void main(String[] args) {
		//変数dayNumber1にインスタンスを生成して代入
		Day dayNumber1 = new Day();
		//"d1(引数なし):dayNumber1"を表示して改行する
		System.out.println("d1 (引数なし)      : " + dayNumber1);
		//変数dayNumber2にインスタンスを生成して代入
		Day dayNumber2 = new Day(2026);
		//"d2(2026年のみ):dayNumber2"を表示して改行する
		System.out.println("d2 (2026年のみ)    : " + dayNumber2);
		//変数dayNumber3にインスタンスを生成して代入
		Day dayNumber3 = new Day(2026, 4);
		//"d3(2026年4月):dayNumber3"を表示して改行する
		System.out.println("d3 (2026年4月)     : " + dayNumber3);
		//変数dayNumber4にインスタンスを生成して代入
		Day dayNumber4 = new Day(2026, 4, 29);
		//"d4(2026年4月29日):dayNumber4"を表示して改行する
		System.out.println("d4 (2026年4月29日) : " + dayNumber4);
		//変数dayNumber5にインスタンスを生成して代入
		Day dayNumber5 = new Day(dayNumber4);
		//"d5(d4をコピー):dayNumber5"を表示して改行する
		System.out.println("d5 (d4をコピー)    : " + dayNumber5);
	}
}