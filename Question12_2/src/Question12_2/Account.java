package Question12_2;

/**
 * クラス名          : Account
 * 概要              : 銀行口座の基本情報を管理するクラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.12
 */
public class Account {
	//口座名義の初期化
	private String nameInformation = null;
	//口座番号の初期化
	private String noInformation = null;
	//預金残高の初期化
	private long balanceInformation = 0;

	/**
	 * コンストラクタ   : Account
	 * メソッドの説明   : 口座名義、口座番号、預金残高を受け取り
	 * 					  インスタンスの各フィールドを初期化する
	 * パラメータ       : nameInformation、noInformation、balanceInformation
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	public Account(String nameInformation, String noInformation, long balanceInformation) {
		//インスタンスの変数に代入する
		this.nameInformation = nameInformation;
		//インスタンスの変数に代入する
		this.noInformation = noInformation;
		//インスタンスの変数に代入する
		this.balanceInformation = balanceInformation;
	}

	/**
	 * メソッド名       : getBalance
	 * メソッドの説明   : 現在の普通預金残高を取得する
	 * パラメータ       : なし
	 * 返り値           : balanceInformation
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	public long getBalance() {
		//預金残高を返却する
		return balanceInformation;
	}
}