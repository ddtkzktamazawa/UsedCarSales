package Question14_2;
/**
 * クラス名     : Skinnable
 * 概要			: 着せかえ（スキン変更）機能を提供するためのクラス
 * @author 		: 玉澤 一輝
 * 作成日		: 2026.05.14
 */
public interface Skinnable {
	//黒色を表す定数
	int BLACK = 0;
	//赤色を表す定数
	int RED = 1;
	//緑色を表す定数
	int GREEN = 2;
	//青色を表す定数
	int BLUE = 3;
	//豹柄を表す定数
	int LEOPARD = 4;

	/**
	 * 関数名           : changeSkin
	 * メソッドの説明	: スキンを指定された色や柄に変更する
	 * @param 			: skin（スキンを表す定数）
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.14
	 */
	void changeSkin(int skin);
}