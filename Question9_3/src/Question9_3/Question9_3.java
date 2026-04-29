package Question9_3;
/*
 * クラス名          : Question9_3
 * 概要              : Accountクラスのインスタンスを生成し
 * 					   預け入れ・おろしなどの操作および口座情報の表示を行う
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.04.29
 */
public class Question9_3 {
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
		//変数birthDay1にインスタンスを生成して代入
		Day2 birthDay1 = new Day2(2026, 4, 29);
		//変数birthDay2にインスタンスを生成して代入
		Day2 birthDay2 = new Day2(2026, 4, 22);
		//変数mrAdachiにインスタンスを生成して代入
		Account mrAdachi = new Account("足立幸一", "123456", 1000, birthDay1);
		//変数mrNakataにインスタンスを生成して代入
		Account mrNakata = new Account("中田真二", "654321", 200, birthDay2);
		//足立君の口座から200円おろす
		mrAdachi.withdraw(200);
		//中田君の口座に100円預ける
		mrNakata.deposit(100);

		//"■足立君の口座"を表示して改行する
		System.out.println("■足立君の口座");
		//"口座名義：mrAdachi.getName"を表示して改行する
		System.out.println("口座名義　：" + mrAdachi.getName());
		//"口座番号：mrAdachi.getNo"を表示して改行する
		System.out.println("口座番号　：" + mrAdachi.getNo());
		//"預金残高：mrAdachi.getBalance"を表示して改行する
		System.out.println("預金残高　：" + mrAdachi.getBalance());
		//"口座開設日：mrAdachi.getOpenDate"を表示して改行する
		System.out.println("口座開設日：" + mrAdachi.getopenDate());

		//改行する
		System.out.println();

		//"■中田君の口座"を表示して改行する
		System.out.println("■中田君の口座");
		//"口座名義：mrNakata.getName"を表示して改行する
		System.out.println("口座名義　：" + mrNakata.getName());
		//"口座番号：mrNakata.getNo"を表示して改行する
		System.out.println("口座番号　：" + mrNakata.getNo());
		//"預金残高：mrNakata.getBalance"を表示して改行する
		System.out.println("預金残高　：" + mrNakata.getBalance());
		//"口座開設日：mrNakata.getOpenDate"を表示して改行する
		System.out.println("口座開設日：" + mrNakata.getopenDate());
	}
}
