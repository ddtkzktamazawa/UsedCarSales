package Question16_1;

/**
 * クラス名         : ParseExceptionResult
 * 概要				: 文字列を整数に変換する際の例外処理を扱うクラス
 * @author 			: 玉澤 一輝
 * 作成日			: 2026.05.18
 */
public class Question16_1 {

	/**
	 * 関数名           : tryParseInt
	 * メソッドの説明 	: 引数で受け取った文字列を整数値に変換して返却する。
	 * 					  変換できない文字列の場合はtry-catchで例外を捕捉しエラーメッセージを表示する
	 * @param  			: value(変換対象の文字列)
	 * @return 			: 変換後の整数値
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.18
	 */
	public static int tryParseInt(String value) {
		//変数resultValueの初期化
		int resultValue = 0;
		//tryブロックの実行
		try {
			//引数resultValueの文字列を整数に変換する
			resultValue = Integer.parseInt(value);
			//捕捉するNumberFormatException型と与える仮引数eの宣言
		} catch (NumberFormatException e) {
			//"エラー：数値に変換できない値（" + value + "）が指定されました。"を表示して改行する
			System.out.println("エラー：数値に変換できない値（" + value + "）が指定されました。");
		}
		//resultValueを返却する
		return resultValue;
	}

	/**
	 * 関数名           : main
	 * メソッドの説明 	: tryParseIntメソッドに正常な文字列と不正な文字列を渡し動作を確認する
	 * @param    		: なし
	 * @return 			: なし
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.18
	 */
	public static void main(String[] args) {
		//"演習16-1 テスト"を表示して改行する
		System.out.println("演習16-1 テスト");
		// テスト①：正しい数字の文字列を渡す場合
		System.out.println("【テスト①: '123' を変換】");
		//final変数successResultに文字列"123"を整数に変換するメソッドtryParseIntを呼び出し代入する
		final int successResult = tryParseInt("123");
		//"返却された値: successResult"を表示して改行する
		System.out.println("返却された値: " + successResult);
		//区切り
		System.out.println("-------------------------");
		// テスト②：数字以外の文字列を渡す場合
		System.out.println("【テスト②: 'abc' を変換】");
		//final変数failResultに文字列"abc"を整数に変換するメソッドtryParseIntを呼び出し代入する
		final int failResult = tryParseInt("abc");
		//"返却された値: failResult"を表示して改行する
		System.out.println("返却された値: " + failResult);
	}
}