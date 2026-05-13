package Question13_2;

/**
 * クラス名          : TriangleRU
 * 概要              : 右上が直角の二等辺三角形
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.13
 */
public class TriangleRU extends AbstTriangle {
	/**
	 * コンストラクタ   : TriangleRU
	 * メソッドの説明   : 指定された長さで右上が直角の二等辺三角形のインスタンスを生成する
	 * パラメータ       : length（三角形の底辺および高さの長さ）
	 * 戻り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	public TriangleRU(int length) { super(length); }
	/**
	 * メソッド名       : draw
	 * メソッドの説明   : 右上が直角の二等辺三角形をアスタリスク（*）を用いて標準出力に描画する
	 * パラメータ       : なし
	 * 戻り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	@Override
	public void draw() {
		//変数iがgetLength()から始めて1ずつ減らしていき1まで繰り返す
		for (int i = getLength(); i >= 1; i--) {
			//変数jが1から始めて1ずつ増やしていきgetLength()-iまで繰り返す
			for (int j = 1; j <= getLength() - i; j++) 
				//スペースを表示する
				System.out.print(' ');
			//変数jが1から始めて1ずつ増やしていきiまで繰り返す
			for (int j = 1; j <= i; j++) 
				//'*'を表示して改行する
				System.out.print('*');
			//改行する
			System.out.println();
		}
	}
}