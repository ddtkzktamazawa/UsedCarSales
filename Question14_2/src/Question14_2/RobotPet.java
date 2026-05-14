package Question14_2;
/**
 * クラス名    	: RobotPet
 * 概要			: Petクラスを継承し、独自の自己紹介と家事（仕事）機能を持つロボット型ペットクラス。
 * @author 		: 玉澤 一輝
 * 作成日		: 2026.05.14
 */
public class RobotPet extends Pet{
	/**
	 * 関数名           : RobotPet
	 * メソッドの説明	: 名前と飼い主名を指定して、スーパークラス（Pet）のコンストラクタを呼び出し初期化する。
	 * @param 			: name（ペットの名前）、masterName（飼い主の名前）
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.14
	 */
	public RobotPet(String name, String masterName) {
		//スーパークラスのコンストラクタを呼び出し名前と飼い主名を初期化する
		super(name, masterName);
	}
	/**
	 * 関数名           : introduce
	 * メソッドの説明	: ロボット特有の口調で名前と飼い主の名前を表示する（オーバーライド）。
	 * @param 			: なし
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.14
	 */
	public void introduce() {
		//"◇私はロボット。名前はgetName。"と表示して改行する
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		//"◇私はロボット。ご主人様はgetMasterName。"と表示して改行する
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}
	/**
	 * 関数名           : work
	 * メソッドの説明	: 引数で与えられたスイッチの値に応じて、掃除・洗濯・炊事のいずれかの仕事を行う。
	 * @param 			: sw（仕事の種類、0:掃除、1:洗濯、2:炊事）
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.14
	 */
	public void work(int sw) {
		switch(sw) {
		//ケース0のとき、"掃除します。"と表示して改行する
		case 0: System.out.println("掃除します。");
		//抜ける
		break;
		//ケース1のとき、"洗濯します。"と表示して改行する
		case 1: System.out.println("洗濯します。");
		//抜ける
		break;
		//ケース2のとき、"炊事します。"と表示して改行する
		case 2: System.out.println("炊事します。");
		//抜ける
		break;
		}
	}
}
