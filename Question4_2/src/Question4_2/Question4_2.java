package Question4_2;
import java.util.Random;
import java.util.Scanner;
/*
 * クラス名:Question4_2
 * 概要    :2桁の整数値を当てる数当てゲーム
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.6
 */
public class Question4_2 {
	 /**
     * 関数名           :main
     * メソッドの説明   :2桁の整数値を当てる数当てゲーム
     * パラメータの説明 :なし
     * 返り値           :なし
     * 作成者           :玉澤一輝
     * 作成日           :2026.4.6
     */
	public static void main(String[] args) {
		//乱数ジェネレータの生成
		Random guessNumber = new Random();
		//キーボードからの読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//当てる数：10～99の乱数として生成
		int randomNumber = guessNumber.nextInt(90)+10;
		//"数当てゲーム開始"と表示して改行する
		System.out.println("数当てゲーム開始");
		//"10から99までの数を当ててください。"と表示して改行する
		System.out.println("10から99までの数を当ててください。");
		//choiceNumberの初期値を0に設定
		int choiceNumber = 0;
		//実行する
		do {
			//"いくつかな："と表示して改行する
			System.out.print("いくつかな：");
			//choiceNumberに数を読み込む
			choiceNumber = standardInput.nextInt();
			//生成した数が入力した数より小さい場合
			if(choiceNumber > randomNumber)
				//"もっと小さな数だよ。"と表示して改行する
				System.out.println("もっと小さな数だよ。");
			//生成した数が入力した数より大きい場合
			else if(choiceNumber < randomNumber)
				//"もっと大きな数だよ。"と表示して改行する
				System.out.println("もっと大きな数だよ。");
			//生成した数と入力した数が等しくなければdo文を再実行する
		} while(choiceNumber != randomNumber);
		//"正解です。"と表示して改行する
		System.out.println("正解です。");
		

	}

}
