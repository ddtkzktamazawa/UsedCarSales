package Question14_2;
/**
 * クラス名     : Pet
 * 概要			: ペットの名前と飼い主の名前を管理するすべてのペットクラスの基本のクラス
 * @author 		: 玉澤 一輝
 * 作成日		: 2026.05.14
 */
public class Pet {
	//ペットの名前を格納するフィールド
	private String name;
	//飼い主の名前を格納するフィールド
	private String masterName;
	/**
	 * 関数名           : Pet
	 * メソッドの説明	: ペットの名前と飼い主の名前を指定してインスタンスを初期化する
	 * @param 			: name（ペットの名前）、masterName(飼い主の名前)
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.14
	 */
	public Pet(String name, String masterName) {
		//インスタンスの変数に代入する
		this.name = name;
		//インスタンスの変数に代入する
		this.masterName = masterName;
	}
	/**
	 * 関数名           : getName
	 * メソッドの説明	: ペットの名前を取得する
	 * @param 			: なし
	 * @return 			: ペットの名前
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.14
	 */
	public String getName() {
		//ペットの名前を返却する
		return name;
	}
	/**
	 * 関数名           : getMasterName
	 * メソッドの説明	: 飼い主の名前を取得する
	 * @param 			: なし
	 * @return 			: 飼い主の名前
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.14
	 */
	public String getMasterName() {
		//飼い主の名前を返却する
		return masterName;
	}
	/**
	 * 関数名           : introduce
	 * メソッドの説明	: ペットの名前と飼い主の名前を標準出力に表示して自己紹介を行う。
	 * @param 			: なし
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.14
	 */
	public void introduce() {
		//"■僕の名前は name です！"と表示して改行する
		System.out.println("■僕の名前は" + name + "です！");
		//"■僕のご主人様は masterName です！"と表示して改行する
		System.out.println("■僕のご主人様は" + masterName + "です！");
	}
}
