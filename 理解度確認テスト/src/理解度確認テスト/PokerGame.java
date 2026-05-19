package 理解度確認テスト;
import java.util.Scanner;
/**
 * クラス名     : PokerGameMain
 * 概要 		: ポーカーゲームを実行するメインコントロールクラス
 * @author 		: 玉澤 一輝
 * 作成日 		: 2026.05.19
 */
public class PokerGame {
	/**
	 * 関数名 			: main
	 * メソッドの説明 	: ポーカーのゲームフローを制御する
	 * @param  			: なし
	 * @return 			: なし
	 * @author 			: 玉澤一輝
	 * 作成日 			: 2026.05.19
	 */
	public static void main(String[] args) {
		//final変数scannerNumberに入力した値を代入する
		final Scanner scannerNumber = new Scanner(System.in);
		//トランプの山札・手札の管理やシャッフルをするfinal変数pokerCardsを生成する
		final CardsClass pokerCards = new CardsClass();
		//ユーザーからのキーボード入力を読み取るfinal変数inputReaderを生成する
		final PokerInputReader inputReader = new PokerInputReader();
		//"初回カードを表示します"を表示して改行する
		System.out.println("初回カードを表示します");
		//整形された手札の文字列を取得し画面に出力して改行する
		System.out.println(pokerCards.getHandString());
		//変数iが0から始めて1ずつ増やしていき最大カード数(5)まで繰り返す
		for(int i = 0; i < pokerCards.DRAW_CARD_NUMBER; i++) {
			//"i+1番目[pokerCards.getCard(i)]交換する？"を表示して改行する
			System.out.println((i + 1) + "番目[" + pokerCards.getCard(i) + "]交換する？");
			//final変数userChoiceに入力した値を代入する
			final int userChoice = inputReader.readChoice(scannerNumber);
			//もし入力した値が1の場合
			if(userChoice == 1) {
				//replaceCardメソッドを呼び出す
				pokerCards.replaceCard(i);
			}
		}
		//"引き直しました"を表示して改行する
		System.out.println("引き直しました");
		//整形された手札の文字列を取得し画面に出力して改行する
		System.out.println(pokerCards.getHandString());
	}
}
