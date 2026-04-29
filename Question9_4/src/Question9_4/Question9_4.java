package Question9_4;

/*
 * クラス名          : Question8_1
 * 概要              : Humanクラスのインスタンスを生成し動作を確認するメインクラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.28
 */
public class Question9_4 {
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
		//変数birthDay1にインスタンスを生成して代入
		Day3 birthDay1 = new Day3(2003, 4, 7);
		//変数birthDay2にインスタンスを生成して代入
		Day3 birthDay2 = new Day3(2003, 11, 6);
		//変数birthDay3にインスタンスを生成して代入
		Day3 birthDay3 = new Day3(2003, 8, 2);
		//変数birthDay4にインスタンスを生成して代入
		Day3 birthDay4 = new Day3(2003, 1, 22);
		//変数birthDay5にインスタンスを生成して代入
		Day3 birthDay5 = new Day3(2003, 9, 10);
		//変数firstPersonに入力したデータを読み込む
		Human2 firstPerson = new Human2("佐藤", 173.5, 63.1, birthDay1);
		//変数secondPersonに入力したデータを読み込む
		Human2 secondPerson = new Human2("鈴木", 182.2, 68.5, birthDay2);
		//変数thirdPersonに入力したデータを読み込む
		Human2 thirdPerson = new Human2("高橋", 179.1, 59.8, birthDay3);
		//変数forthPersonに入力したデータを読み込む
		Human2 forthPerson = new Human2("田中", 181.1, 65.4, birthDay4);
		//変数fifthPersonに入力したデータを読み込む
		Human2 fifthPerson = new Human2("伊藤", 175.7, 57.3, birthDay5);

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