package Question13_1;
/**
 * クラス名          : Point
 * 概要              : 点を表すクラス
 * 					   抽象クラスShapeを継承し点に特化した表示と描画を行う
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.12
 */
public class Point extends Shape {
	/**
	 * コンストラクタ   	 : Point
	 * コンストラクタの説明  : 点のインスタンスを初期化する
	 * パラメータ       	 : なし
	 * 返り値           	 : なし
	 * 作成者           	 : 玉澤一輝
	 * 作成日           	 : 2026.05.12
	 */
	public Point() {
	}
	/**
	 * メソッド名       : toString
	 * メソッドの説明   : クラス名「Point」を文字列として返却する
	 * 戻り値           : クラス名（Point）
	 * パラメータ       : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	@Override
	public String toString() {
		//Pointを返却する
		return "Point";
	}
	/**
	 * メソッド名       : draw
	 * メソッドの説明   : 点を表現する記号 + を出力して描画する
	 * パラメータ       : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	@Override
	public void draw() {
		//'+'を表示して改行する
		System.out.println('+');
	}
}
