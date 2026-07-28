package 理解度確認テスト;
import java.util.Random;
/**
 * クラス名			: CardsClass
 * 概要    			:トランプの各種カードを制御するクラス
 * @author 			: 玉澤 一輝
 * 作成日  			: 2026.05.19
 */
public class CardsClass {
	//トランプの山札
	private String[][] deck;
	//引くことのできる最大カード数
	public final int DRAW_CARD_NUMBER = 5;
	//スート(絵柄)数
	private final int SUITS_NUMBER = 4;
	//カードの数字数
	private final int CARD_NUMBER = 13;
	//現在のプレイヤーの手札
	private String[] handCards;
	//シャッフル用山札配列
	private String[] deckArrangement;
	//山札から次に引くカードのインデックス
	private int deckIndex;
	//乱数ジェネレータの生成値を入れる変数randomCardを作る
	final Random randomCard = new Random();
	/**
	 * 関数名           	    : CardsClass
	 * コンストラクタの説明     : トランプの山札を初期化しシャッフルして最初の手札を5枚引く
	 * @param   				: なし
	 * @return 					: なし
	 * @author					: 玉澤一輝
	 * 作成日           		: 2026.05.19
	 */
	public CardsClass() {
		//一時的な山札を作成する
		String[][] tempDeck = {
				{ "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "S11", "S12", "S13" },
				{ "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "C11", "C12", "C13" },
				{ "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "D11", "D12", "D13" },
				{ "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "H11", "H12", "H13" }
		};
		//メンバ変数に作成した山札を設定する
		this.deck = tempDeck;
		//52枚のカードを配列にまとめる
		this.deckArrangement = new String[SUITS_NUMBER * CARD_NUMBER];
		//変数countNumberを初期化
		int countNumber = 0;
		//変数iが0から始めて1ずつ増やしていきSUITS_NUMBERの値まで繰り返す
		for(int i = 0; i < SUITS_NUMBER; i++) {
			//変数jが0から始めて1ずつ増やしていきCARD_NUMBERの値まで繰り返す
			for(int j = 0; j < CARD_NUMBER; j++) {
				//
				this.deckArrangement[countNumber] = this.deck[i][j];
				//countNumberをインクリメントする
				countNumber++;
			}
		}
		//手札配列の初期化
		this.handCards = new String[DRAW_CARD_NUMBER];
		//引き出し位置を先頭にリセット
		this.deckIndex = 0;
		//山札をシャッフル
		shuffleDeck();
		//手札を5枚分配
		initialCard();
	}
	/**
	 * 関数名           : shuffleDeck
	 * メソッドの説明 	: 山札(flatDeck)をランダムにシャッフルする
	 * @param   		: なし
	 * @return 			: なし
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.19
	 */
	private void shuffleDeck() {
		//変数iが山札配列数-1から始めて1ずつ減らしていき0まで繰り返す
		for(int i = deckArrangement.length - 1; i > 0; i--) {
			//final変数indexCardに乱数を代入する（i+1）
			final int indexCard = randomCard.nextInt(i + 1);
			//ランダムに選ばれた位置のカードを一時変数に退避させる
			final String templateCard = this.deckArrangement[indexCard];
			//現在処理している位置（i）のカードを空いた位置に上書きする
			this.deckArrangement[indexCard] = this.deckArrangement[i];
			//一時変数に退避させておいたカードを位置（i）に上書きして入れ替えを完了する
			this.deckArrangement[i] = templateCard;
		}
	}
	/**
	 * 関数名           : initialCard
	 * メソッドの説明 	: シャッフルされた山札の上から順に5枚を手札に設定する
	 * @param   		: なし
	 * @return 			: なし
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.19
	 */
	private void initialCard() {
		//変数iが0から始めて1ずつ増やしていき最大カード数(5)まで繰り返す
		for(int i = 0; i < DRAW_CARD_NUMBER; i++) {
			//山札の現在位置からカードを1枚引き手札のi番目に割り当てる
			this.handCards[i] = this.deckArrangement[this.deckIndex];
			//山札から次に引くカードのインデックスをインクリメントする
			this.deckIndex++;
		}
	}
	/**
	 * 関数名           : getHandString
	 * メソッドの説明 	: 現在の手札を文字列形式に整形して返却する
	 * @param   		: なし
	 * @return 			: 整形された手札文字列
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.19
	 */
	public String getHandString() {
		//String型変数resultCardに"{"を代入する
		String resultCard = "{";
		//変数iが0から始めて1ずつ増やしていき最大カード数(5)まで繰り返す
		for(int i = 0; i < DRAW_CARD_NUMBER; i++) {
			//現在の文字列の後ろに手札のi番目のカード名を繋げる
			resultCard += this.handCards[i];
			//もしiが最大カード数-1より小さい場合
			if (i < DRAW_CARD_NUMBER - 1) {
				//resultCardに","を加える
				resultCard += ",";
			}
		}
		//resultCardに"}"を代入する
		resultCard += "}";
		//resultCardを返却する
		return resultCard;
	}
	/**
	 * 関数名           : getCard
	 * メソッドの説明 	: 指定されたインデックス（0～4）の手札のカード名を取得する
	 * @param   		: indexCard（手札の位置）
	 * @return 			: カードの文字列
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.19
	 */
	public String getCard(int indexCard) {
		//指定された位置の手札のカード名を呼び出し元へ返却する
		return this.handCards[indexCard];
	}
	/**
	 * 関数名           : replaceCard
	 * メソッドの説明 	: 指定されたインデックスの手札を山札から新しく1枚引いて交換する
	 * @param   		: indexCard(交換する手札の位置（0～4）)
	 * @return 			: なし
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.19
	 */
	public void replaceCard(int indexCard) {
		//指定された手札の位置に山札の現在位置の新しいカードを上書きする
		this.handCards[indexCard] = this.deckArrangement[this.deckIndex];
		//山札から次に引くカードのインデックスをインクリメントする
		this.deckIndex++;
	}
}
