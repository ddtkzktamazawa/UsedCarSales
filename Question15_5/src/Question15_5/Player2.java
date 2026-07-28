package Question15_5;

/**
 * クラス名          : Player2
 * 概要              : じゃんけんのプレーヤを表す抽象クラス
 * @author     	     : 玉澤一輝
 * 作成日            : 2026.05.15
 */
public abstract class Player2 {
	/**
	 * メソッド名       : nextHand
	 * メソッドの説明   : 次に出す手を決定する
	 * @param       	: なし
	 * @return         	: 0（グー） / 1（チョキ） / 2（パー）
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.05.15
	 */
	public abstract int nextHand();
}
