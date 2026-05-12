package Question13_1;
/**
 * クラス名          : AbstLine
 * 概要              : 直線を表す抽象クラス
 * 					   図形の長さ（length）を管理する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.12
 */
public abstract class AbstLine extends Shape{
	//直線の長さを格納するフィールドを生成する
	private int length;
	/**
	 * コンストラクタ   : AbstLine
	 * メソッドの説明   : 指定された長さで直線を初期化する。
	 * パラメータ       : length - 直線の長さ
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	public AbstLine(int length) {
		//setLengthを呼び出す
		setLength(length);
	}
	/**
	 * メソッド名       : getLength
	 * メソッドの説明   : 直線の長さを取得する。
	 * パラメータ       : なし
	 * 返り値           : 直線の長さ
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	public int getLength() {
		//lengthを返却する
		return length;
	}
	/**
	 * メソッド名       : setLength
	 * メソッドの説明   : 直線の長さを設定する
	 * パラメータ       : length（設定する直線の長さ）
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	public void setLength(int length) {
		//引数で受け取った長さの値をクラスのフィールド変数に代入する
		this.length = length;
	}
	/**
	 * メソッド名       : toString
	 * メソッドの説明   : 直線の情報を表す文字列を返却する
	 * パラメータ       : なし
	 * 戻り値           : 直線の情報（例："AbstLine(length:5)"）
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	@Override
	public String toString() {
		//インスタンスが持つ「長さ（length）」を文字列に組み込んで返却する
		return "AbstLine(length:" + length + ")";
	}
}
