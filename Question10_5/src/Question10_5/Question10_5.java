package Question10_5;

/*
 * クラス名          : Question10_5
 * 概要              : Account2クラスのインスタンスを生成し
 * 					   預け入れ・おろしなどの操作および口座情報の表示を行う
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.04.29
 */
public class Question10_5 {
	/**
	 * 関数名           : main
	 * メソッドの説明   : 二人の銀行口座インスタンスを生成し残高の更新操作を行った後
	 * 					　それぞれの口座情報を詳細に表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.04.29
	 */
	public static void main(String[] args) {
		//変数openDay1にインスタンスを生成して代入
		Day6 openDay1 = new Day6(2026, 5, 11);
		//変数openDay2にインスタンスを生成して代入
		Day6 openDay2 = new Day6(2026, 5, 2);
		//"■足立君の口座"を表示して改行する
		System.out.println("■足立君の口座");
		//変数mrAdachiにインスタンスを生成して代入
		Account2 mrAdachi = new Account2("足立幸一", "123456", 1000, openDay1);
		//足立君の口座から200円おろす
		mrAdachi.withdraw(200);
		//"口座名義：mrAdachi.getName"を表示して改行する
		System.out.println("口座名義　：" + mrAdachi.getName());
		//"口座番号：mrAdachi.getNo"を表示して改行する
		System.out.println("口座番号　：" + mrAdachi.getNo());
		//"預金残高：mrAdachi.getBalance"を表示して改行する
		System.out.println("預金残高　：" + mrAdachi.getBalance());
		//"口座開設日：mrAdachi.getOpenDate"を表示して改行する
		System.out.println("口座開設日：" + mrAdachi.getOpenDate());

		//改行する
		System.out.println();

		//"■中田君の口座"を表示して改行する
		System.out.println("■中田君の口座");
		//変数mrNakataにインスタンスを生成して代入
		Account2 mrNakata = new Account2("中田真二", "654321", 200, openDay2);
		//中田君の口座に100円預ける
		mrNakata.deposit(100);
		//"口座名義：mrNakata.getName"を表示して改行する
		System.out.println("口座名義　：" + mrNakata.getName());
		//"口座番号：mrNakata.getNo"を表示して改行する
		System.out.println("口座番号　：" + mrNakata.getNo());
		//"預金残高：mrNakata.getBalance"を表示して改行する
		System.out.println("預金残高　：" + mrNakata.getBalance());
		//"口座開設日：mrNakata.getOpenDate"を表示して改行する
		System.out.println("口座開設日：" + mrNakata.getOpenDate());
	}
}
