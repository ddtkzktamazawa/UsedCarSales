package Question12_1;

/*
 * クラス名          : ExCarTester
 * 概要              : ExCarクラスの動作を確認するためのテスト用クラス
 * 					   継承したフィールドと独自に追加したフィールドが正しく扱えるかを検証する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.11
 */
public class ExCarTester {
	/**
	 * メソッド名       : main
	 * メソッドの説明   : ExCarクラスの機能を検証するためのメインプログラム
	 * 					  インスタンスの生成（継承した情報の初期化）
	 * 					  スペックおよび購入日の表示
	 * 					  総走行距離の初期状態の確認
	 * 					  moveメソッドによる走行距離加算の検証
	 * パラメータ       : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.11
	 */
	public static void main(String[] args) {
		//購入日のインスタンスを作成
		Day7 myPurchaseDay = new Day7(2026, 5, 11);
		//変数myCarに入力したデータを読み込む
		ExCar myCar = new ExCar("1号", 1800, 1500, 4500, 50.0, myPurchaseDay);
		//"--- 車のスペックを表示します ---"と表示して改行する
		System.out.println("--- 車のスペックを表示します ---");
		//メソッドprintSpecを呼び出す
		myCar.printSpec();
		//"購入日：myCar.getpurchaseDay()"と表示して改行する
		System.out.println("購入日：" + myCar.getpurchaseDay());
		//"燃料：myCar.getFuel()L"と表示して改行する
		System.out.println("燃料　：" + myCar.getFuel() + "L");

		//"--- 走行距離の確認 ---"と表示して改行する
		System.out.println("--- 走行距離の確認 ---");
		//"現在の総走行距離：myCar.getTotalMileage()km"と表示して改行する
		System.out.println("現在の総走行距離　：" + myCar.getTotalMileage() + "km");
		//double型の変数dxに30.0を代入する
		double dx = 30.0;
		//double型の変数dyに40.0を代入する
		double dy = 40.0;
		//"x方向にdx km、y方向にdy km移動します。"と表示して改行する
		System.out.println("x方向に" + dx + "km、y方向に" + dy + "km 移動します。");
		//moveメソッドを呼び出し移動に成功したかどうかを判定する
		if (myCar.move(dx, dy)) {
			//"移動に成功しました。"と表示して改行する
			System.out.println("移動に成功しました。");
			//"現在の総走行距離：myCar.getTotalMileage()km"と表示して改行する
			System.out.println("現在の総走行距離　：" + myCar.getTotalMileage() + "km");
			//その他の場合
		} else {
			//"燃料不足で移動できませんでした。"と表示して改行する
			System.out.println("燃料不足で移動できませんでした。");
		}
	}
}