package Question13_2;

/**
 * クラス名          : AbstTriangle
 * 概要              : 直角二等辺三角形を表す抽象クラス
 * 					   底辺と高さが等しい性質を持ちその長さを管理する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.13
 */
public abstract class AbstTriangle extends Shape2 {
	//底辺および高さの長さを格納するフィールド
	private int length;

	/**
	 * コンストラクタ   : AbstTrianglea
	 * メソッドの説明   : 指定された長さで三角形を初期化する
	 * パラメータ       : length(底辺の長さ)
	 * 戻り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	public AbstTriangle(int length) {
		//setLengthを呼び出す
		setLength(length);
	}

	/**
	 * メソッド名       : getLength
	 * メソッドの説明   : 長さを取得する
	 * パラメータ       : なし
	 * 戻り値           : 長さ
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	public int getLength() {
		//lengthを返却する
		return length;
	}

	/**
	 * メソッド名       : setLength
	 * メソッドの説明   : 長さを設定する
	 * パラメータ       : length(設定する長さ)
	 * 戻り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	public void setLength(int length) {
		//引数で受け取った長さの値をクラスのフィールド変数に代入する
		this.length = length;
	}

	/**
	 * メソッド名       : toString
	 * メソッドの説明   : 三角形の情報を表す文字列を返却する
	 * パラメータ       : なし
	 * 戻り値           : 三角形の情報
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	@Override
	public String toString() {
		//書式に合わせた文字列を生成し、実行中のインスタンスのクラス名を直接取得する
		return String.format("%s(length:%d)", this.getClass().getSimpleName(), length);
	}
}
