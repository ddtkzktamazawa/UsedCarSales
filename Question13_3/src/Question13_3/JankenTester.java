package Question13_3;

/**
 * クラス名          : JankenTester
 * 概要              : じゃんけんの対戦を管理するクラス
 * 					   決着がつくまでループを継続する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.13
 */
public class JankenTester {
	/**
	 * メソッド名       : main
	 * メソッドの説明   : じゃんけんゲームのメインループを制御する
	 *                    人間とコンピュータの手を取得し勝敗がつくまで対戦を繰り返す
	 * パラメータ       : なし
	 * 戻り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	public static void main(String[] args) {
		//人間プレーヤの生成をする
		Player human = new HumanPlayer();
		//コンピュータプレーヤの作成をする
		Player computer = new ComputerPlayer();
		//手の名称を管理する配列（グー, チョキ, パー）
		String[] hands = {"グー", "チョキ", "パー"};
		//"■ じゃんけん開始 ■"と表示して改行する
		System.out.println("■ じゃんけん開始 ■");
		//繰り返す
		while (true) {
			//人間プレーヤの手を決める
			int humanHand = human.nextHand();
			//コンピュータプレーヤの手を決める
			int computerHand = computer.nextHand();
			//"あなた：hands[humanHand]vsコンピュータ：hands[computerHand]と表示して改行する
			System.out.println("あなた：" + hands[humanHand] + " vs コンピュータ：" + hands[computerHand]);
			//もしhumanHandがcomputerHand一致する場合
			if (humanHand == computerHand) {
				//"→ あいこです。もう一度"と表示して改行する
				System.out.println("→ あいこです。もう一度\n");
				//その他の場合
			} else {
				//変数judgeNumberに(humanHand - computerHand + 3)の剰余を代入する
				int judgeNumber = (humanHand - computerHand + 3) % 3;
				//もしjudgeNumberが2の場合
				if (judgeNumber == 2) {
					//"→ あなたの勝ちです！"と表示して改行する
					System.out.println("→ あなたの勝ちです！");
					//その他の場合
				} else {
					//"→ コンピュータの勝ちです！"と表示して改行する
					System.out.println("→ コンピュータの勝ちです！");
				}
				//抜ける
				break;
			}
		}
	}
}
