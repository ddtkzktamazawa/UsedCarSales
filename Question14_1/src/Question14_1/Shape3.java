package Question14_1;
/**
 * クラス名          : Shape2
 * 概要              : すべての図形の根幹となる抽象クラス
 * 					   表示や描画の枠組みを定義し具体的な実装は下位の派生クラスに委ねる
 * @author            : 玉澤一輝
 * 作成日            : 2026.05.13
 */
public abstract class Shape3{
	/**
	 * メソッド名       : toString
	 * メソッドの説明   : 図形の情報を表す文字列を返却する抽象メソッド
	 * @param       	: なし
	 * @return         : 図形の情報を表す文字列
	 * @author         : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	public abstract String toString();
	/**
	 * メソッド名       : draw
	 * メソッドの説明   : 図形を画面に描画する抽象メソッド
	 * 					  具体的な描画アルゴリズムは子クラスで実装する
	 * @param       	: なし
	 * @return         : なし
	 * @author         : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	public abstract void draw();
	/**
	 * メソッド名       : print
	 * メソッドの説明   : 図形情報の表示と実際の描画を連続して実行する非抽象メソッド
	 * @param       	: なし
	 * @return         : なし
	 * @author         : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	public void print() {
		//toString()を表示して改行する
		System.out.println(toString());
		//図形を描画する
		draw();
	}

}
