package Question10_2;
/*
 * クラス名          : ExId
 * 概要              : 増分値識別番号を管理するクラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.04.30
 */
public class ExId {
	//何番までの識別番号を与えたかを記録する
	static int counterValue = 0;
	//増分値の初期値を1に設定する
	private static int specifiedIncrement = 1;
	//個々のインスタンスが持つ識別番号
	private int idNumber;
	/**
	 * コンストラクタ   　　　: ExId
	 * コンストラクタの説明   : インスタンス生成時に現在の増分値だけカウンターを増やし
	 * 					　　　　それを識別番号として自身に割り当てる
	 * パラメータの説明　　　 : なし
	 * 返り値           　　　: なし
	 * 作成者           　　　: 玉澤一輝
	 * 作成日           　　　: 2026.4.30
	 */
	public ExId() {
		//idNumberにcounterValueを代入してインクリメント
		counterValue += specifiedIncrement;
		//idNumberにcounterValueを代入する
		idNumber = counterValue;
	}
	/**
	 * 関数名           : getId
	 * メソッドの説明   : インスタンスの識別番号を取得する
	 * パラメータの説明 : なし
	 * 返り値           : 識別番号
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.30
	 */
	public int getId() {
		//識別番号を返却
		return idNumber;
	}
	/**
	 * 関数名           : getspecifiedIncrement
	 * メソッドの説明   : 現在のの増分値を取得する
	 * パラメータの説明 : なし
	 * 返り値           : 増分値
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.30
	 */
	public static int getspecifiedIncrement() {
		//増分値を返却
		return specifiedIncrement;
	}
	/**
	 * 関数名           : setspecifiedIncrement
	 * メソッドの説明   : 識別番号の増分値を更新する
	 * パラメータの説明 : 新しい増分値
	 * 返り値           : 更新後の増分値
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.30
	 */
	public static int setspecifiedIncrement(int increment) {
		//specifiedIncrementにincrementを代入する
		specifiedIncrement = increment;
		//specifiedIncrement返却
		return specifiedIncrement;
	}
	/**
	 * 関数名           : getMaxId
	 * メソッドの説明   : 最後に与えた識別番号（現在のカウンター最大値）を返却する
	 * 					　クラス全体に関わる情報のためクラスメソッドとして定義
	 * パラメータ       : なし
	 * 返り値           : 最後に与えた識別番号
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.30
	 */
	public static int getMaxId() {
		//最後に与えた識別番号を返却
		return counterValue;
	}
}

