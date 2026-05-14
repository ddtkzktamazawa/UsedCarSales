package Question14_2;
/**
 * クラス名     : SkinnableRobotPet
 * 概要			: RobotPetを拡張しSkinnableインタフェースを実装した着せかえロボット型ペットクラス
 * @author 		: 玉澤 一輝
 * 作成日		: 2026.05.14
 */
public class SkinnableRobotPet extends RobotPet implements Skinnable {
	//現在のスキンの状態を管理する
	private int skin = BLACK;

	/**
	 * 関数名           : SkinnableRobotPet
	 * メソッドの説明	: 名前と飼い主名を指定してインスタンスを初期化する
	 * @param 			: name(ペットの名前)、masterName(飼い主の名前)
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.14
	 */
	public SkinnableRobotPet(String name, String masterName) {
		//スーパークラスのコンストラクタを呼び出し名前と飼い主名を初期化する
		super(name, masterName);
	}

	/**
	 * 関数名           : changeSkin
	 * メソッドの説明	: 引数で指定された定数に基づいてペットのスキン（外見）を更新する
	 * @param 			: skin（スキンを表す定数、BLACK, RED等）
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.14
	 */
	@Override
	public void changeSkin(int skin) {
		//インスタンスの変数に代入する
		this.skin = skin;
	}

	/**
	 * 関数名           : printSkin
	 * メソッドの説明	: 現在のスキン情報を日本語で表示する
	 * @param 			: なし
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.14
	 */
	public void printSkin() {
		//"スキンを"と表示する
		System.out.print("スキンを");
		//フィールドskinの値に応じて表示する文字列を分岐させる
		switch (skin) {
		//黒色のとき、"「漆黒」"と表示する
		case BLACK:   System.out.print("「漆黒」");
		//抜ける
		break;
		//赤色のとき、"「深紅」"と表示する
		case RED:     System.out.print("「深紅」");
		//抜ける
		break;
		//緑色のとき、"「柳葉」"と表示する
		case GREEN:   System.out.print("「柳葉」");
		//抜ける
		break;
		//青色のとき、"「露草」"と表示する
		case BLUE:    System.out.print("「露草」");
		//抜ける
		break;
		//豹柄のとき、"「豹柄」"と表示する
		case LEOPARD: System.out.print("「豹柄」");
		//抜ける
		break;
		//変更がなければ"「無地」"と表示する
		default:      System.out.print("「無地」");
		//抜ける
		break;
		}
		//"に変更しました。"して改行する
		System.out.println("に変更しました。");
	}
}