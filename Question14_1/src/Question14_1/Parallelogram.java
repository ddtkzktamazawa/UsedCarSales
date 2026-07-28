package Question14_1;
/**
 * クラス名     : Parallelogram
 * 概要			: 図形クラスShape3を継承し2次元インターフェースPlane2Dを実装した平行四辺形クラス
 * @author 		: 玉澤 一輝
 * 作成日		: 2026.05.13
 */
public class Parallelogram extends Shape3 implements Plane2D{
	//平行四辺形の幅を管理するフィールド
	private int width;
	//平行四辺形の高さを管理するフィールド
	private int height;
	/**
	 * 関数名           : Parallelogram
	 * メソッドの説明	: 幅と高さを指定して平行四辺形のインスタンスを初期化する
	 * @param       	: width（平行四辺形の幅）、height（平行四辺形の高さ）
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.13
	 */
	public Parallelogram(int width, int height) {
		//引数で受け取った「幅（width）」をクラスのフィールド変数に代入
		this.width = width;
		//引数で受け取った「高さ（height）」をクラスのフィールド変数に代入
		this.height = height;
	}
	/**
	 * 関数名           : toString
	 * メソッドの説明	: 平行四辺形の情報を表す文字列を返却する
	 * @param 			; なし
	 * @return 			: クラス名と幅、高さを格納した文字列
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.13
	 */
	public String toString() {
		//幅と高さの情報を文字列に組み込んで返却する
		return "平行四辺形(幅:" + width + ",高さ:" + height + ")";
	}
	/**
	 * 関数名           : draw
	 * メソッドの説明	: 平行四辺形を「#」を用いて出力に描画する
	 * @param 			: なし
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.13
	 */
	public void draw() {
		//変数iが1から始めて1ずつ増やしていきheightまで繰り返す
		for(int i = 1; i <= height; i++) {
			//変数jが1から始めて1ずつ増やしていきheight - iまで繰り返す
			for(int j = 1; j <= height - i; j++)
				//スペースを表示する
				System.out.print(' ');
			//変数jが1から始めて1ずつ増やしていきwidthまで繰り返す
			for(int j = 1; j <= width; j++)
				//'#'を表示して改行する
				System.out.print('#');
			//改行する
			System.out.println();
		}
	}
	/**
	 * 関数名           : getArea
	 * メソッドの説明	: 平行四辺形の面積を算出して返却する
	 * @param 			: なし
	 * @return 			: 平行四辺形の面積（幅×高さ）
	 * 作成日			: 2026.05.13
	 */
	public int getArea() {
		//面積の値を返却する
		return width * height;
	}
}
