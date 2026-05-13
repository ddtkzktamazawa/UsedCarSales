package Question13_3;
import java.util.Random;

/**
 * クラス名          : ComputerPlayer
 * 概要              : コンピュータプレーヤを表すクラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.13
 */
public class ComputerPlayer extends Player {
	//乱数ジェネレータの生成値を入れる変数を作る
	private static Random rand = new Random();
	/**
	 * メソッド名       : nextHand
	 * メソッドの説明   : 乱数を用いてじゃんけんの手（0, 1, 2）をランダムに決定し返却する
	 * パラメータ       : なし
	 * 戻り値           : 生成された手（0:グー、1:チョキ、2:パー）
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	@Override
	public int nextHand() {
		//0〜2の乱数を返却する
		return rand.nextInt(3);
	}
}
