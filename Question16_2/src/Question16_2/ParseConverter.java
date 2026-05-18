package Question16_2;

/**
 * クラス名         : ParseConverter
 * 概要				: 文字列の変換処理（ロジック）をするクラス
 * @author 			: 玉澤 一輝
 * 作成日			: 2026.05.18
 */
public class ParseConverter {

	/**
	 * 関数名           : tryParseInt
	 * メソッドの説明 	: 引数で受け取った文字列を整数値に変換して返却する
	 * 					  変換できない場合はThrowableの下位クラスであるParseExceptionを発生させてthrowする
	 * @param  			: val(変換対象の文字列)
	 * @return 			: 変換後の整数値
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.18
	 */
	public int tryParseInt(String val) throws ParseException {
		//tryブロックの実行
		try {
			// 引数の文字列を整数に変換して直接返却する
			return Integer.parseInt(val);
			//捕捉するNumberFormatException型と与える仮引数eの宣言
		} catch (NumberFormatException e) {
			//例外が発生したら、"エラー：数値に変換できない値（" + val + "）が指定されました。"を表示して呼び出し元へ投げる
			throw new ParseException("エラー：数値に変換できない値（" + val + "）が指定されました。");
		}
	}
}
