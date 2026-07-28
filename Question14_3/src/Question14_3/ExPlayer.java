package Question14_3;

/**
 * インタフェース名 : ExPlayer
 * 概要				: Playerインタフェースを拡張し、スロー再生機能を追加したインタフェース
 * @author 			: 玉澤 一輝
 * 作成日			: 2026.05.14
 */
public interface ExPlayer extends Player {
	/**
	 * 関数名           : slow
	 * メソッドの説明	: スロー再生を開始する
	 * @param 			: なし
	 * @return 			: なし
	 * 作成日			: 2026.05.14
	 */
	void slow();
}
