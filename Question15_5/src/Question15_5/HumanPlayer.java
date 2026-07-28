package Question15_5;
import java.util.Scanner;

/**
 * クラス名          : HumanPlayer2
 * 概要              : 人間プレーヤを表すクラス
 * @author     	     : 玉澤一輝
 * 作成日            : 2026.05.15
 */
public class HumanPlayer extends Player2 {
	//キーボードで入力した値を入れる変数を作る
	private static Scanner STANDARD_INPUT = new Scanner(System.in);
	/**
	 * メソッド名       : nextHand
	 * メソッドの説明   : キーボードからじゃんけんの手を読み込み返却する
	 *                    0,1,2以外の値が入力された場合は正しい値が入力されるまで再試行する
	 * @param       	: なし
	 * @return         	: 選択された手（0:グー、1:チョキ、2:パー）
	 * @author     	    : 玉澤一輝
	 * 作成日           : 2026.05.15
	 */
	@Override
	public int nextHand() {
		//変数chooseHandの初期化
		int chooseHand;
		//実行する
		do {
			//"じゃんけんポン（0…グー／1…チョキ／2…パー）："と表示する
			System.out.print("じゃんけんポン (0:グー/1:チョキ/2:パー)：");
			//変数chooseHandに入力した値を代入する
			chooseHand = STANDARD_INPUT.nextInt();
			//chooseHandが0より小さい場合、またはchooseHandが2より大きい場合は
		} while (chooseHand < 0 || chooseHand > 2);
		//selecteHandを返却する
		return chooseHand;
	}
}