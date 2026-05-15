package Question15_5;
import java.util.Scanner;

/**
 * クラス名     : JankenThree
 * 概要			: 人間1人 vs コンピュータ2人で3人ジャンケンを行う
 * @author 		: 玉澤 一輝
 * 作成日		: 2026.05.15
 */
public class JankenThreePlayers {
	/**
	 * 関数名: main
	 * メソッドの説明: 3人のプレーヤの手を決定し勝敗判定を行う
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner STANDARD_INPUT = new Scanner(System.in);
		//プレーヤ配列を作成する
		Player2[] players = {
				//自分の作成
				new HumanPlayer(),
				//1人目のコンピュータの作成
				new ComputerPlayer2(),
				//2人目のコンピュータの作成
				new ComputerPlayer2()
		};
		//手の名称を管理する配列（グー, チョキ, パー）
		String[] handNames = {"グー", "チョキ", "パー"};
		//変数retryNumberの初期化
		int retryNumber;
		//実行する
		do {
			//プレーヤ配列の0番目（自分）に対しメソッドnextHandを呼び出す
			int playerHand = players[0].nextHand();
			//プレーヤ配列の1番目（1人目のコンピュータ）に対しメソッドnextHandを呼び出す
			int computer1Hand = players[1].nextHand();
			//プレーヤ配列の2番目（2人目のコンピュータ）に対しメソッドnextHandを呼び出す
			int computer2Hand = players[2].nextHand();
			//"あなた：handNames[playerHand]"を表示して改行する
			System.out.println("あなた：" + handNames[playerHand]);
			//"CP1：handNames[computer1Hand]"を表示して改行する
			System.out.println("CP1   ：" + handNames[computer1Hand]);
			//"CP2：handNames[computer2Hand]"を表示して改行する
			System.out.println("CP2   ：" + handNames[computer2Hand]);
			//メソッドjudgeを呼び出す
			judge(playerHand, computer1Hand, computer2Hand);
			//"もう一度？0…いいえ/1…はい："を表示する
			System.out.print("もう一度？0…いいえ/1…はい：");
			//変数retryNumberに入力した値を代入する
			retryNumber = STANDARD_INPUT.nextInt();
			//retryNumberが1のとき、do文を繰り返す
		} while (retryNumber == 1);
	}

	/**
	 * 関数名           : judge
	 * メソッドの説明	: 3人の手を受け取り、3人ジャンケンの勝敗を表示する
	 * @param 			: playerHand(自分の手)、computer1Hand(CP1の手)、computer2Hand(CP2の手)
	 * @return 			: なし
	 * @author 			: 玉澤一輝
	 * 作成日   		: 2026.05.13
	 */
	static void judge(int playerHand, int computer1Hand, int computer2Hand) {
		//配列chooseHandに全員の出した手をまとめる
		int[] chooseHand = {playerHand, computer1Hand, computer2Hand};
		//各プレーヤの表示名を配列に定義する
		String[] playerName = {"あなた", "CP1", "CP2"};
		//場に「グー」を出した人が1人でもいるかどうかを判定する
		boolean existGoo   = (playerHand == 0 || computer1Hand == 0 || computer2Hand == 0);
		//場に「チョキ」を出した人が1人でもいるかどうかを判定する
		boolean existChoki = (playerHand == 1 || computer1Hand == 1 || computer2Hand == 1);
		//場に「パー」を出した人が1人でもいるかどうかを判定する
		boolean existPaa   = (playerHand == 2 || computer1Hand == 2 || computer2Hand == 2);
		//変数typeCountの初期化
		int typeCount = 0;
		//もしグーを出した人1人でもがいる場合
		if (existGoo) {
			//typeCountをインクリメントする
			typeCount++;
		}
		//もしチョキを出した人1人でもがいる場合
		if (existChoki) {
			//typeCountをインクリメントする
			typeCount++;
		}
		//もしパーを出した人1人でもがいる場合
		if (existPaa) {
			//typeCountをインクリメントする
			typeCount++;
		}
		//もしtypeCountが1、または3の場合
		if (typeCount == 1 || typeCount == 3) {
			//"引き分け（あいこ）です。"と表示して改行する
			System.out.println("引き分け（あいこ）です。");
			//その他の場合
		} else {
			//変数winHandの初期化
			int winHand = -1;
			//もしグーとチョキのみの場合
			if (existGoo && existChoki) {
				//winHandに0を代入（グーの勝ち）
				winHand = 0;
				//もしチョキとパーのみの場合
			}else if (existChoki && existPaa) {
				//winHandに1を代入（チョキの勝ち）
				winHand = 1;
			}
			//もしパーとグーのみの場合
			else if (existPaa && existGoo) {
				//winHandに2を代入（パーの勝ち）
				winHand = 2;
			}
			//"【結果】"と表示して改行する
			System.out.println("【結果】");
			//変数iが0から始めて1ずつ増やしていき3未満まで繰り返す
			for (int i = 0; i < 3; i++) {
				//プレーヤの手が勝ちの手と一致する場合
				if (chooseHand[i] == winHand) {
					//"playerName[i]：勝ち"と表示して改行する
					System.out.println(playerName[i] + "：勝ち");
					//その他の場合
				} else {
					//"playerName[i]：負け"と表示して改行する
					System.out.println(playerName[i] + "：負け");
				}
			}
		}
	}
}