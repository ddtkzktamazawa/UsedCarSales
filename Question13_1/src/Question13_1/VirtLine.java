package Question13_1;
/**
 * クラス名          : VertLine
 * 概要              : 垂直線を表すクラス
 * 					   AbstLineを継承し縦方向への直線描画を行う
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.12
 */
public class VirtLine extends AbstLine{
	/**
	 * コンストラクタ   : VertLine
	 * メソッドの説明   : 指定された長さの垂直線を生成する
	 * パラメータ       : length（直線の長さ）
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	public VirtLine(int length) {super(length);}
	/**
	 * メソッド名       : toString
	 * メソッドの説明   : 垂直線の情報を表す文字列を返却する
	 * パラメータ		: なし
	 * 戻り値           : 垂直線の情報（例："VertLine(length:5)"）
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	public String toString() {
		//getLengthを使用して親クラスで管理されている長さを取得する
		return "VirtLine(length:" + getLength() + ")";
	}
	/**
	 * メソッド名       : draw
	 * メソッドの説明   : 縦棒記号 '|' を縦に並べて垂直線を描画する
	 * パラメータ       : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	public void draw() {
		//変数iが1から始めて1ずつ増やしていき要素の数繰り返す
		for(int i = 1; i <= getLength(); i++)
			//'|'を表示して改行する
			System.out.println('|');

	}

}
