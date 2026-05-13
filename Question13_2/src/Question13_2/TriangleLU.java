package Question13_2;

/**
 * クラス名          : TriangleLU
 * 概要              : 左上が直角の二等辺三角形
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.13
 */
public class TriangleLU extends AbstTriangle {
	/**
	 * コンストラクタ   : TriangleLU
	 * メソッドの説明   : 指定された長さで左上が直角の二等辺三角形のインスタンスを生成する
	 * パラメータ       : length（三角形の底辺および高さの長さ）
	 * 戻り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	public TriangleLU(int length) { super(length); }
	/**
	 * メソッド名       : draw
	 * メソッドの説明   : 左上が直角の二等辺三角形をアスタリスク（*）を用いて標準出力に描画する
	 * パラメータ       : なし
	 * 戻り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	@Override
	public void draw() {
		//変数iがgetLength()から始めて1ずつ減らしていき1まで繰り返す
		for (int i = getLength(); i >= 1; i--) {
			//変数jが1から始めて1ずつ増やしていきiまで繰り返す
			for (int j = 1; j <= i; j++) {
				//'*'を表示して改行する
				System.out.print('*');
			}
			//改行する
			System.out.println();
		}
	}
}