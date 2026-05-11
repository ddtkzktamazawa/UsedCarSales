package Question10_5;

/*
 * クラス名          : Account2
 * 概要              : 銀行口座情報を管理するクラス
 * 					   インスタンス初期化子でメッセージ表示と識別番号の付与を行う
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.11
 */
public class Account2 {
	//何番まで識別番号を与えたか
	private static int counter = 0;
	//識別番号の初期化
	private int idNumber;
	//口座名義の初期化
	private String nameInformation;
	//口座番号の初期化
	private String noInformation;
	//預金残高の初期化
	private long balanceInformation;
	//口座開設日の初期化
	private Day6 openDate;
	{
		// 識別番号をインクリメントして割り当てる
		idNumber= ++counter;
		//"「明解銀行での口座開設ありがとうございます。」"と表示して改行する
		System.out.println("「明解銀行での口座開設ありがとうございます。」");
	}

	/**
	 * コンストラクタ  		  : Account2
	 * コンストラクタの説明   : 口座情報を初期化する
	 * パラメータの説明  	  : 名義、番号、残高、開設日
	 * 返り値                 : なし
	 * 作成者                 : 玉澤一輝
	 * 作成日                 : 2026.4.29
	 */
	public Account2(String nameInformation, String noInformation, long balanceInformation, Day6 openDate) {
		//インスタンスの変数に代入する
		this.nameInformation = nameInformation;
		//インスタンスの変数に代入する
		this.noInformation = noInformation;
		//インスタンスの変数に代入する
		this.balanceInformation = balanceInformation;
		//インスタンスの変数に代入する
		this.openDate = new Day6(openDate);
	}

	/**
	 * 関数名           : getId
	 * メソッドの説明   : 識別番号のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 識別番号
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public int getId() {
		//識別番号を返却する
		return idNumber;
	}
	/**
	 * 関数名           : getName
	 * メソッドの説明   : 口座名義のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 口座名義
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public String getName() { 
		//口座名義を返却する
		return nameInformation; 
	}
	/**
	 * 関数名           : getNo
	 * メソッドの説明   : 口座番号のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 口座番号
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public String getNo() { 
		//口座番号を返却する
		return noInformation; 
	}
	/**
	 * 関数名           : getBalance
	 * メソッドの説明   : 預金残高のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 預金残高
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public long getBalance() { 
		//預金残高を返却する
		return balanceInformation;
	}
	/**
	 * 関数名           : getOpenDate
	 * メソッドの説明   : 口座開設日のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 口座開設日
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public Day6 getOpenDate() {
		//口座開設日を返却する
		return new Day6(openDate);
	}
	/**
	 * 関数名           : deposit
	 * メソッドの説明   : 預ける額のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 預ける額
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public void deposit(long depositAmount) {
		//預金残高に預ける額を加える
		balanceInformation += depositAmount;
	}
	/**
	 * 関数名           : withdraw
	 * メソッドの説明   : おろす額のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : おろす額
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public void withdraw(long withdrawAmount) {
		//預金残高からおろす額を引く
		balanceInformation -= withdrawAmount;
	}

	/**
	 * 関数名           : toString
	 * メソッドの説明   : 口座情報の文字列表現を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 口座情報の詳細文字列
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public String toString() {
		//口座名義、口座番号、預金残高、口座開設日を整形して返却する
		return String.format("【口座名義：%s / 口座番号：%s / 預金残高：%d円 / 開設日：%s】",
				nameInformation, noInformation, balanceInformation, openDate);
	}
}