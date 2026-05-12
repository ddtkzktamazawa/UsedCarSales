package Question12_2;

/**
 * クラス名          : AccountTester
 * 概要              : 口座残高を比較するメソッドの検証用クラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.12
 */
public class AccountTester {

	/**
	 * メソッド名       : compBalance
	 * メソッドの説明   : 二つの口座の合計残高を比較する
	 * 					  TimeAccount型であれば定期預金も含めた合計で比較し
	 * 					  Account型であれば普通預金のみで比較する
	 * パラメータ       : totalAmountal、totalAmountb
	 * 戻り値           : aが多いなら1, 等しいなら0, bが多いなら-1
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	static int compBalance(Account a, Account b) {
		// aの合計金額を算出する
		long totalAmountA = a.getBalance();
		//もしaが定期預金付き口座の場合
		if (a instanceof TimeAccount) {
			//totalAmountAに定期分を加算する
			totalAmountA += ((TimeAccount)a).getTimeBalance();
		}

		//bの合計金額を算出する
		long totalAmountB = b.getBalance();
		//もしbが定期預金付き口座の場合
		if (b instanceof TimeAccount) {
			//totalAmountBに定期分を加算する
			totalAmountB += ((TimeAccount)b).getTimeBalance();
		}

		//もしtotalAmountAがtotalAmountBより大きい場合
		if (totalAmountA > totalAmountB) {
			//1を返却する
			return 1;	
		}
		//もしtotalAmountAがtotalAmountBより小さい場合
		else if (totalAmountA < totalAmountB) {
			//-1を返却する
			return -1;
		}
		//0を返却する
		return 0;
	}
	/**
	 * メソッド名       : main
	 * メソッドの説明   : AccountクラスとTimeAccountクラスのインスタンスを生成し
	 * 					  compBalanceメソッドを用いて両者の合計残高を比較するテストを行う
	 * 					  異なる型（Account型とTimeAccount型）のインスタンスを生成
	 * 					  各口座の残高を表示
	 * 					  比較メソッドを呼び出しその返り値に基づいた判定結果を出力
	 * パラメータ       : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	public static void main(String[] args) {
		// 普通口座の作成
		Account adachi = new Account("足立", "123456", 1000);
		// 定期預金付き口座の作成
		TimeAccount nakata = new TimeAccount("中田", "654321", 500, 800); // 合計1300
		//"足立様の残高：adachi.getBalance()compBalance"を代入する
		System.out.println("足立様の残高：" + adachi.getBalance());
		//"中田様の合計残高：(nakata.getBalance() + nakata.getTimeBalance())"を代入する
		System.out.println("中田様の合計残高：" + (nakata.getBalance() + nakata.getTimeBalance()));

		//変数returnValueにcompBalanceメソッドを呼び出して代入する
		int returnValue = compBalance(adachi, nakata);
		//"--- 比較結果 ---"と表示して改行する
		System.out.println("--- 比較結果 ---");
		//もし返却値が1の場合
		if (returnValue == 1) {
			//"足立様の方が多いです。"と表示して改行する
			System.out.println("足立様の方が多いです。");
			//もし返却値が-1の場合
		} else if (returnValue == -1) {
			//"中田様の方が多いです。"と表示して改行する
			System.out.println("中田様の方が多いです。");
			//その他の場合
		} else {
			//"二人の残高は等しいです。"と表示して改行する
			System.out.println("二人の残高は等しいです。");
		}
	}
}