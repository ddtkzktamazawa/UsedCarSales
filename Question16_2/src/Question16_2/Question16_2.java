package Question16_2;
/**
 * クラス名         : Question16_2
 * 概要				: プログラムの実行
 * 					  ParseConverterを呼び出しthrowされた独自のThrowableクラスをキャッチして画面に表示する
 * @author 			: 玉澤 一輝
 * 作成日			: 2026.05.18
 */
public class Question16_2 {
	/**
	 * 関数名           : main
	 * メソッドの説明 	: tryParseIntメソッドを呼び出しthrowされたParseExceptionを
	 * 					  キャッチしてエラーメッセージを表示する
	 * @param 			: なし
	 * @return 			: なし
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.18
	 */
	public static void main(String[] args) {
		//final変数dataConverterに変換ロジッククラスのインスタンスを生成し代入する
		final ParseConverter dataConverter = new ParseConverter();
		//"演習16-2 テスト"を表示して改行する
		System.out.println("演習16-2 テスト");
		//テスト①：正しい数字の文字列を渡す場合
		System.out.println("【テスト①: '123' を変換】");
		//tryブロックの実行
		try {
			//final変数successResultに文字列"123"を整数に変換するメソッドtryParseIntを呼び出し代入する
			final int successResult = dataConverter.tryParseInt("123");
			//"返却された値: successResult"を表示して改行する
			System.out.println("返却された値: " + successResult);
			//捕捉するParseException型と与える仮引数eの宣言
		} catch (ParseException e) {
			//キャッチした例外インスタンスeからエラーメッセージを取得し画面に表示して改行する
			System.err.println(e.getMessage());
			//スタックトレースを表示
			e.printStackTrace();
		}
		//区切り
		System.out.println("-------------------------");
		// テスト②：数字以外の文字混じりの文字列を渡す場合
		System.out.println("【テスト②: 'abc' を変換】");
		//tryブロックの実行
		try {
			//final変数failResultに文字列"abc"を整数に変換するメソッドtryParseIntを呼び出し代入する
			final int failResult = dataConverter.tryParseInt("abc");
			//"返却された値: failResult"を表示して改行する
			System.out.println("返却された値: " + failResult);
			//捕捉するParseException型と与える仮引数eの宣言
		} catch (ParseException e) {
			//キャッチした例外インスタンスeからエラーメッセージを取得し画面に表示して改行する
			System.err.println(e.getMessage());
			//スタックトレースを表示
			e.printStackTrace();
		}
	}
}
