package Question4_27;
/*
 * クラス名:Question4_27
 * 概要    :数当てゲーム、入力回数制限付き
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.15
 */
import java.util.Random;
import java.util.Scanner;
public class Question4_27 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :数当てゲーム、入力回数制限付き
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.15
	 */
	public static void main(String[] args) {
		//乱数ジェネレータの生成
		Random randomNumber = new Random();
		//キーボードからの読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//当てる数：0～99の乱数として生成
		int guessNumber = randomNumber.nextInt(100);
		//"数当てゲーム開始"と表示して改行する
		System.out.println("数当てゲーム開始");
		//"0から99までの数を当ててください。"と表示して改行する
		System.out.println("0～99の数を当ててください。");
		//"制限回数を決める:"と表示して
		System.out.print("制限回数を決める:");
		//変数guessTimesに数を読み込む
		int guessTimes = standardInput.nextInt();
		//変数choiceNumberを初期化
		int choiceNumber = 0;
		//変数breakNumberを初期化、breakNumberは正解の場合は1、正解していない場合は0
		int breakNumber = 0;
		//変数をiをtimeNumberから始めて変数iを1ずつ減らしていき1以下になるまで繰り返す
		for(int i = guessTimes; i >= 1; i--) {
			//"いくつかな："と表示する
			System.out.print("いくつかな:");
			//変数choiceNumberに数を読み込む
			choiceNumber = standardInput.nextInt();
			//生成した数が入力した数より小さい場合
			if(choiceNumber > guessNumber) {
				//もっと小さな数字だよ。と表示して改行する
				System.out.println("もっと小さな数字だよ。");
				//スキップする
				continue ;
				//変数answerNumberよりも変数displayNumberが大きい場合
			}else if (choiceNumber <  guessNumber) { 
				//もっと大きな数字だよ。と表示して改行する
				System.out.println("もっと大きな数字だよ。");
				//スキップする
				continue ;
				//変数answerNumber変数displayNumberが同じ値の時
			} else if (choiceNumber == guessNumber){
				//変数breakNumberに1を代入する
				breakNumber = 1;
				//飛び出す
				break;
			}
		}
		//変数breakNumberが1の場合
		if(breakNumber == 1) {
			//正解です。と表示して改行する
			System.out.println("正解です。");
		}
		//変数breakNumberが0の場合
		else if (breakNumber == 0) {
			//不正解です。と表示して改行する
			System.out.println("不正解です。");
			//答えは（displayNumberの値）です。と表示して改行する
			System.out.println("答えは"+guessNumber+"です。");
		}
	}
}
