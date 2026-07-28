package Question15_5;
import java.util.Random;

/**
 * クラス名          : ComputerPlayer2
 * 概要              : コンピュータプレーヤを表すクラス
 * @author     	     : 玉澤一輝
 * 作成日            : 2026.05.15
 */
public class ComputerPlayer2 extends Player2 {
	//乱数ジェネレータの生成値を入れる変数を作る
	private static Random rand = new Random();
	/**
	 * メソッド名       : nextHand
	 * メソッドの説明   : 乱数を用いてじゃんけんの手（0, 1, 2）をランダムに決定し返却する
	 * @param       	: なし
	 * @return         	: 生成された手（0:グー、1:チョキ、2:パー）
	 * @author         : 玉澤一輝
	 * 作成日           : 2026.05.15
	 */
	@Override
	public int nextHand() {
		//0〜2の乱数を返却する
		return rand.nextInt(3);
	}
}
