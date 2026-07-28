package Question7_2;
import java.util.Scanner;
/*
 * クラス名:Question7_2
 * 概要    :三つのint型引数の最小値を求める
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.21
 */
public class Question7_2 {
	/**
	 * 関数名           :minNumber
	 * メソッドの説明   :三つのint型引数の最小値を求める
	 * 					 1未満の整数も比較対象
	 * パラメータの説明 :入力値1～3
	 * 返り値           :最小値
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.21
	 */
	static int minNumber(int inputFirst, int inputSecond, int inputThird ) {
		//変数minNumberの初期化
		int minNumber = inputFirst;
		//minNumberが入力値2より大きい場合
		if (minNumber > inputSecond) {
			//minNumberに入力値2を代入する
			minNumber = inputSecond;
		}
		//minNumberが入力値3より大きい場合
		if(minNumber > inputThird) {
			//minNumberに入力値3を代入する
			minNumber = inputThird;
		}
		//返却する
		return minNumber;
	}
	/*
	 * 関数名           :main
	 * メソッドの説明   :メイン処理
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.21
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//"inputFirstの値："を表示する
		System.out.print("inputFirstの値：");
		//入力値1の値を入力
		int inputFirst = standardInput.nextInt();
		//"inputSecondの値："を表示する
		System.out.print("inputSecondの値：");
		//入力値2の値を入力
		int inputSecond = standardInput.nextInt();
		//"inputThirdの値："を表示する
		System.out.print("inputThirdの値：");
		//入力値3の値を入力
		int inputThird = standardInput.nextInt();
		//最小値はminNumber(inputFirst,inputSecond,inputThird"表示して改行する
		System.out.println("最小値は" + minNumber(inputFirst, inputSecond, inputThird ) + "です。");
	}

}
