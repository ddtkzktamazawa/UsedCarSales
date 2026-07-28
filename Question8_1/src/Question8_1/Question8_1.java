package Question8_1;

/*
 * クラス名          : Question8_1
 * 概要              : Humanクラスのインスタンスを生成し動作を確認するメインクラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.28
 */
public class Question8_1 {
	/**
	 * 関数名           : main
	 * メソッドの説明   : Humanクラスの設計図からインスタンスを生成し
	 * 					　メソッドを呼び出してデータの保持と表示を確認する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.28
	 */
	public static void main(String[] args) {
		//変数firstPersonに入力したデータを読み込む
		Human firstPerson = new Human("佐藤", 173.5, 63.1);
		//変数secondPersonに入力したデータを読み込む
		Human secondPerson = new Human("鈴木", 182.2, 68.5);
		//変数thirdPersonに入力したデータを読み込む
		Human thirdPerson = new Human("高橋", 179.1, 59.8);
		//変数forthPersonに入力したデータを読み込む
		Human forthPerson = new Human("田中", 181.1, 65.4);
		//変数fifthPersonに入力したデータを読み込む
		Human fifthPerson = new Human("伊藤", 175.7, 57.3);

		//"--- 1人目のプロフィール ---"を表示して改行する
		System.out.println("--- 1人目のプロフィール ---");
		//メソッドprintProfileを呼び出す
		firstPerson.printProfile();
		//"--- 2人目のプロフィール ---"を表示して改行する
		System.out.println("\n--- 2人目のプロフィール ---");
		//メソッドprintProfileを呼び出す
		secondPerson.printProfile();
		//"--- 3人目のプロフィール ---"を表示して改行する
		System.out.println("\n--- 3人目のプロフィール ---");
		//メソッドprintProfileを呼び出す
		thirdPerson.printProfile();
		//"--- 4人目のプロフィール ---"を表示して改行する
		System.out.println("\n--- 4人目のプロフィール ---");
		//メソッドprintProfileを呼び出す
		forthPerson.printProfile();
		//"--- 5人目のプロフィール ---"を表示して改行する
		System.out.println("\n--- 5人目のプロフィール ---");
		//メソッドprintProfileを呼び出す
		fifthPerson.printProfile();
	}
}