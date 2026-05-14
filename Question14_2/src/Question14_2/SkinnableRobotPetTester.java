package Question14_2;

/**
 * クラス名     : SkinnableRobotPetTester
 * 概要			: 着せかえ可能なロボット型ペットクラスの動作を検証するプログラム
 * @author 		: 玉澤 一輝
 * 作成日		: 2026.05.14
 */
public class SkinnableRobotPetTester {

	/**
	 * 関数名           : main
	 * メソッドの説明	: ロボットペットの生成、自己紹介、仕事の実行、スキンの変更と表示を順に行う
	 * @param 			: なし
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.14
	 */
	public static void main(String[] args) {
		//myRobotインスタンスの生成をする
		SkinnableRobotPet myRobot = new SkinnableRobotPet("CDA", "ロズ");
		//"--- ロボットペットの動作確認 ---"と表示して改行する
		System.out.println("--- ロボットペットの動作確認 ---");

		//継承したメソッドintroduceを呼び出す
		myRobot.introduce();
		//改行する
		System.out.println();

		//継承したメソッドworkを呼び出す（0:掃除します）
		myRobot.work(0); 
		//継承したメソッドworkを呼び出す（1:洗濯します）
		myRobot.work(1);
		//改行する
		System.out.println();
		//"スキンを変更します。"と表示して改行する
		System.out.println("スキンを変更します。");
		//スキンをLEOPARD（豹柄）に設定
		myRobot.changeSkin(Skinnable.LEOPARD);
		//変更したスキンの表示を行う
		myRobot.printSkin();
		//区切り
		System.out.println("--------------------------------");
		//変数Skinnableにインスタンスを代入
		Skinnable skinChange = myRobot;
		//スキンを青に変更する
		skinChange.changeSkin(Skinnable.BLUE);
		//変更したスキンの表示を行う
		myRobot.printSkin();
	}
}
