package Question13_1;
/**
 * クラス名          : Rectangle
 * 概要              : 長方形を表すクラス
 * 					   Shapeを継承し指定された幅と高さに基づいた描画を行う
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.12
 */
public class Rectangle extends Shape{
	//長方形の幅を格納するフィールド
	private int width;
	//長方形の高さを格納するフィールド
	private int heigth;
	/**
	 * コンストラクタ   : Rectangle
	 * メソッドの説明   : 指定された幅と高さで長方形のインスタンスを初期化する
	 * パラメータ       : width（幅）, height（高さ）
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	public Rectangle(int width, int heigth) {
		//引数で受け取った「幅（width）」をクラスのフィールド変数に代入
		this.width = width;
		//引数で受け取った「高さ（height）」をクラスのフィールド変数に代入
		this.heigth = heigth;
	}
	/**
	 * メソッド名       : toString
	 * メソッドの説明   : 長方形の情報を表す文字列を返却する
	 * パラメータ       : なし
	 * 返り値           : 長方形の情報（例："Rectangle(width:5, height:3)"）
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	@Override
	public String toString() {
		//幅と高さの情報を文字列に組み込んで返却する
		return "Retangle(width:" + width + ",heigth:" + heigth + ")";
	}
	/**
	 * メソッド名       : draw
	 * メソッドの説明   : アスタリスク記号 '*' を用いて長方形を描画する
	 * パラメータ       : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	@Override
	public void draw() {
		//変数iが1から始めて1ずつ増やしていき要素の数繰り返す
		for(int i = 1; i <= heigth; i++) {
			//変数jが1から始めて1ずつ増やしていき要素の数繰り返す
			for(int j = 1; j <= width; j++)
				//'*'を表示して改行する
				System.out.print('*');
			//改行する
			System.out.println();
		}
	}
}
