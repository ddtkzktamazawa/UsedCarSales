package Question14_3;

/**
 * クラス名     : DVDPlayerTester
 * 概要			: DVDPlayerクラスのインスタンスを生成し、各操作メソッドの動作を確認する。
 * @author 		: 玉澤 一輝
 * 作成日		: 2026.05.14
 */
public class DVDPlayerTester {

	/**
	 * 関数名           : main
	 * メソッドの説明	: DVDPlayerのインスタンスを操作し、再生・スロー再生・停止の一連の動きを表示する。
	 * @param 			: なし
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.14
	 */
	public static void main(String[] args) {
		//DVDPlayerのインスタンスを生成する
		DVDPlayer myDVD = new DVDPlayer();
		//"--- DVDプレーヤーの操作を開始します ---"と表示して改行する
		System.out.println("--- DVDプレーヤーの操作を開始します ---");
		//Playerから継承したメソッドplayを呼び出す
		myDVD.play();
		//ExPlayerで追加されたメソッドslowを呼び出す
		myDVD.slow();
		//Playerから継承したメソッドstopを呼び出す
		myDVD.stop();
		//区切り
		System.out.println("------------------------------");
		//インタフェース型の変数に代入する
		ExPlayer exPlay = myDVD;
		//"インタフェース型の変数から操作"と表示して改行する
		System.out.println("インタフェース型の変数から操作");
		//インタフェース型の変数exPlayからDVDの再生を開始する
		exPlay.play();
		//インタフェース型の変数exPlayからDVDの再生を終了する
		exPlay.stop();
	}
}