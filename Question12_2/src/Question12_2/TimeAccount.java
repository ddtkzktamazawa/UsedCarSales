package Question12_2;

/**
 * クラス名          : TimeAccount
 * 概要              : 定期預金機能を追加した銀行口座クラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.12
 */
public class TimeAccount extends Account {
	//定期預金残高の初期化
	private long timeBalance = 0;
	/**
	 * コンストラクタ   : TimeAccount
	 * コンストラクタの説明   : 普通預金の基本情報（名義、番号、残高）に加え、
	 * 							定期預金の残高を受け取ってインスタンスを初期化する
	 * 							親クラスのコンストラクタへ基本情報を渡し、自クラスのフィールドを個別に設定する
	 * パラメータ       : nameInformation、noInformation、balanceInformation、timeBalance
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	public TimeAccount(String nameInformation, String noInformation, long balanceInformation, long timeBalance) {
		//親クラスのコンストラクタを呼び出す
		super(nameInformation, noInformation, balanceInformation);
		//インスタンスの変数に代入する
		this.timeBalance = timeBalance;
	}
	/**
	 * メソッド名       : getTimeBalance
	 * メソッドの説明   : 現在の定期預金残高を取得する
	 * パラメータ       : なし
	 * 返り値           : timeBalance
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.12
	 */
	public long getTimeBalance() {
		//定期預金残高を返却する
		return timeBalance;
	}
}