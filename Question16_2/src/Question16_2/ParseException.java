package Question16_2;

/**
 * クラス名         : ParseException
 * 概要				: 文字列から整数への変換に失敗したことを表す自作例外クラス
 * @author 			: 玉澤 一輝
 * 作成日			: 2026.05.18
 */
public class ParseException extends Throwable {

	/**
	 * コンストラクタ 		: ParseException
	 * コンストラクタの説明 : エラーメッセージを受け取り、親クラス（Throwable）にそのまま渡す
	 * @param  				: message(エラーの詳細メッセージ)
	 * @return 				: 変換後の整数値
	 * @author				: 玉澤一輝
	 * 作成日 				: 2026.5.18
	 */
	public ParseException(String message) {
		//親クラスのコンストラクタを呼び出す
		super(message);
	}
}
