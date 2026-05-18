package Question16_3;

/**
 * クラス名         : InvalidInputException
 * 概要				: 数値以外の不正な入力が行われたことを表す自作例外クラス
 * @author 			: 玉澤 一輝
 * 作成日			: 2026.05.18
 */
public class InvalidInputException extends Exception {
	/**
	 * コンストラクタ 		: InvalidInputException
	 * コンストラクタの説明 : エラーメッセージを受け取り親クラス（Throwable）にそのまま渡す
	 * @param  				: message(エラーの詳細メッセージ)
	 * @return 				: 変換後の整数値
	 * @author				: 玉澤一輝
	 * 作成日 				: 2026.5.18
	 */
	public InvalidInputException(String message) {
		//親クラスのコンストラクタを呼び出す
		super(message);
	}
}
