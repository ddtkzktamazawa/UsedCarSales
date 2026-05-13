package Question14_1;

/**
 * クラス名          : Rectangle2
 * 概要              : 長方形を表すクラス
 * 					   Shapeを継承し指定された幅と高さに基づいた描画を行う
 * @author          : 玉澤一輝
 * 作成日            : 2026.05.13
 */
public class Rectangle2 extends Shape3 implements Plane2D{
	//長方形の幅を格納するフィールド
	private int width;
	//長方形の高さを格納するフィールド
	private int heigth;
	/**
	 * コンストラクタ   : Rectangle
	 * メソッドの説明   : 指定された幅と高さで長方形のインスタンスを初期化する
	 * @param        	: width（幅）, height（高さ）
	 * @return         	: なし
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	public Rectangle2(int width, int heigth) {
		//引数で受け取った「幅（width）」をクラスのフィールド変数に代入
		this.width = width;
		//引数で受け取った「高さ（height）」をクラスのフィールド変数に代入
		this.heigth = heigth;
	}
	/**
	 * メソッド名       : toString
	 * メソッドの説明   : 長方形の情報を表す文字列を返却する
	 * @param       	: なし
	 * @return         	: クラス名と幅、高さを格納した文字列
	 * @author         	: 玉澤一輝
	 * 作成日          	: 2026.05.13
	 */
	@Override
	public String toString() {
		//幅と高さの情報を文字列に組み込んで返却する
		return "長方形(幅:" + width + ",高さ:" + heigth + ")";
	}
	/**
	 * メソッド名       : draw
	 * メソッドの説明   : アスタリスク記号 '*' を用いて長方形を描画する
	 * @param        	: なし
	 * @return         	: なし
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	@Override
	public void draw() {
		//変数iが1から始めて1ずつ増やしていきheightまで繰り返す
		for(int i = 1; i <= heigth; i++) {
			//変数jが1から始めて1ずつ増やしていきwidthまで繰り返す
			for(int j = 1; j <= width; j++)
				//'*'を表示して改行する
				System.out.print('*');
			//改行する
			System.out.println();
		}
	}
	/**
	 * コンストラクタ名 	: getArea
	 * コンストラクタの説明	: 平行四辺形の面積を算出して返却する
	 * @param 				: なし
	 * @return         		: 長方形の面積（幅×高さ）
	 * @author         		: 玉澤一輝
	 * 作成日          		: 2026.05.13
	 */
	public int getArea() {
		//面積の値を返却する
		return width * heigth; 
	}
}
