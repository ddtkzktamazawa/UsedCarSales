package Question13_3;

/**
 * クラス名          : Player
 * 概要              : じゃんけんのプレーヤを表す抽象クラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.13
 */
public abstract class Player {
	/**
	 * メソッド名       : nextHand
	 * メソッドの説明   : 次に出す手を決定する
	 * パラメータ       : なし
	 * 戻り値           : 0（グー） / 1（チョキ） / 2（パー）
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	public abstract int nextHand();
}
