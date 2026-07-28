package Question13_3;
import java.util.Scanner;

/**
 * クラス名          : HumanPlayer
 * 概要              : 人間プレーヤを表すクラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.13
 */
public class HumanPlayer extends Player {
	//キーボードで入力した値を入れる変数を作る
	private static Scanner STANDARD_INPUT = new Scanner(System.in);
	/**
	 * メソッド名       : nextHand
	 * メソッドの説明   : キーボードからじゃんけんの手を読み込み返却する
	 *                    0,1,2以外の値が入力された場合は正しい値が入力されるまで再試行する
	 * パラメータ       : なし
	 * 戻り値           : 選択された手（0:グー、1:チョキ、2:パー）
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	@Override
	public int nextHand() {
		//変数selecteHandの初期化
		int selecteHand;
		//実行する
		do {
			//"じゃんけんポン！（0…グー／1…チョキ／2…パー）："と表示する
			System.out.print("じゃんけんポン！（0…グー／1…チョキ／2…パー）：");
			//変数selecteHandに入力した値を代入する
			selecteHand = STANDARD_INPUT.nextInt();
			//selecteHandが0より小さい場合、またはselecteHandが2より大きい場合は
		} while (selecteHand < 0 || selecteHand > 2);
		//selecteHandを返却する
		return selecteHand;
	}
}