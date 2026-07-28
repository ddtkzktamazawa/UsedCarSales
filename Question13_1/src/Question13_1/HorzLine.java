package Question13_1;
/**
 * クラス名          : HorzLine
 * 概要              : 水平直線を表すクラス
 * 					   抽象クラスShapeを継承し横方向への直線描画に特化した表示と描画を行う
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.12
 */
public class HorzLine extends AbstLine{
	/**
	 * コンストラクタ   	  : HorzLine
	 * コンストラクタの説明   : 指定された長さの水平線を生成する。
	 * パラメータ       	  : length（直線の長さ）
	 * 返り値           	 : なし
	 * 作成者           	 : 玉澤一輝
	 * 作成日           	 : 2026.05.12
	 */
	public HorzLine(int length) {super(length);}
	/**
	 * メソッド名       : toString
	 * メソッドの説明   : 水平線の情報を表す文字列を返却する
	 * パラメータ		: なし
	 * 戻り値           : 水平線の情報（例："HorzLine(length:5)"）
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	public String toString() {
		//getLengthを使用して親クラスで管理されている長さを取得する
		return "HorzLine(length:" + getLength() + ")";
	}
	/**
	 * メソッド名       : draw
	 * メソッドの説明   : マイナス記号 '-' を横に並べて水平線を描画する。
	 * パラメータ       : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	public void draw() {
		//変数iが1から始めて1ずつ増やしていき要素の数繰り返す
		for(int i = 1; i <= getLength(); i++)
			//'-'を表示して改行する
			System.out.print('-');
		//改行する
		System.out.println();
	}

}
