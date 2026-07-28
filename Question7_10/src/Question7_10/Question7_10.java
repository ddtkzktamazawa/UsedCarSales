package Question7_10;
import java.util.Random;
import java.util.Scanner;
/*
 * クラス名            :Question7_10
 * 概要                :四つの問題からランダムに出題する暗算ゲームの作成
 * 作成者              :玉澤一輝
 * 作成日              :2026.4.22
 */
public class Question7_10 {
	//キーボードで入力した値を入れる変数を作る
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);
	/*
	 * 関数名           :confirmRetry
	 * メソッドの説明   :もう一度行うか0,1を入力しtrue,falseを返却する
	 * パラメータの説明 :なし
	 * 返り値           :true,false
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.22
	 */
	static boolean confirmRetry() {
		//変数continueNumberの初期化
		int continueNumber = 0;
		//実行する
		do {
			//"もう一度？＜Yes…1/No…0＞："と表示する
			System.out.print("もう一度？＜Yes…1/No…0＞：");
			//continueNumberに入力した値を代入する
			continueNumber = STANDARD_INPUT.nextInt();
			//0と1以外の場合繰り返す
		}while(continueNumber != 0 && continueNumber != 1);
		//1であればtrue、0であればfalseを返却する
		return continueNumber == 1;
	}
	/**
	 * 関数名           :mentalArithmetic
	 * メソッドの説明   :暗算ゲームを出題し正解するまで入力を繰り返す
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	public static void mentalArithmetic() {
		//ランダムな数を入れる変数を作成
		Random randomNumber = new Random();
		//firstNumberに三桁の値を代入
		int firstNumber = randomNumber.nextInt(900) + 100;
		//secondNumberに三桁の値を代入
		int secondNumber = randomNumber.nextInt(900) + 100;
		//thirdNumberに三桁の値を代入
		int thirdNumber = randomNumber.nextInt(900) + 100;
		//0-3のランダムな値を代入
		int questionStatement = randomNumber.nextInt(4);
		//true以外の場合繰り返す
		while(true) {
			//もしquestionStatementが0の場合
			if(questionStatement == 0) {
				//"firstNumber + secondNumber + thirdNumber ="と表示する
				System.out.print(firstNumber + "+" + secondNumber + "+" + thirdNumber + "=");
				//sumNumberに入力した値を代入する
				int sumNumber = STANDARD_INPUT.nextInt();
				//もしsumNumberとfirstNumber + secondNumber + thirdNumberが一致した場合
				if(sumNumber == firstNumber + secondNumber + thirdNumber) {
					//"正解です。"と表示して改行する
					System.out.println("正解です。");
					//飛び出す
					break;
				}
			}
			//もしquestionStatementが1の場合
			else if(questionStatement == 1) {
				//"firstNumber + secondNumber - thirdNumber ="と表示する
				System.out.print(firstNumber + "+" + secondNumber + "-" + thirdNumber + "=");
				//sumNumberに入力した値を代入する
				int sumNumber = STANDARD_INPUT.nextInt();
				//もしsumNumberとfirstNumber + secondNumber - thirdNumberが一致した場合
				if(sumNumber == firstNumber + secondNumber - thirdNumber) {
					//"正解です。"と表示して改行する
					System.out.println("正解です。");
					//飛び出す
					break;
				}
			}
			//もしquestionStatementが2の場合
			else if(questionStatement == 2) {
				//"firstNumber - secondNumber + thirdNumber ="と表示する
				System.out.print(firstNumber + "-" + secondNumber + "+" + thirdNumber + "=");
				//sumNumberに入力した値を代入する
				int sumNumber = STANDARD_INPUT.nextInt();
				//もしsumNumberとfirstNumber - secondNumber + thirdNumberが一致した場合
				if(sumNumber == firstNumber - secondNumber + thirdNumber) {
					//"正解です。"と表示して改行する
					System.out.println("正解です。");
					//飛び出す
					break;
				}
			}
			//それ以外の場合
			else{
				//"firstNumber - secondNumber - thirdNumber ="と表示する
				System.out.print(firstNumber + "-" + secondNumber + "-" + thirdNumber + "=");
				//sumNumberに入力した値を代入する
				int sumNumber = STANDARD_INPUT.nextInt();
				//もしsumNumberとfirstNumber - secondNumber - thirdNumberが一致した場合
				if(sumNumber == firstNumber - secondNumber - thirdNumber) {
					//"正解です。"と表示して改行する
					System.out.println("正解です。");
					//飛び出す
					break;
				}
			}
			//"違いますよ!!"と表示して改行する
			System.out.println("違いますよ!!");
		}
	}
	/**
	 * 関数名           :main
	 * メソッドの説明   :暗算力トレーニングの開始、ユーザーが続けるまでゲームを繰り返す
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	public static void main(String[] args) {
		System.out.println("暗算力トレーニング!!");
		do {
			// 分離した出題メソッドを呼び出す
			mentalArithmetic();
			//trueの場合繰り返す
		}while(confirmRetry());
	}
}
