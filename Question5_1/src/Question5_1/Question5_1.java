package Question5_1;
import java.util.Scanner;
/*
 * クラス名:Question5_1
 * 概要    :入力した整数を8進数、16進数で表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.15
 */
public class Question5_1 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :入力した整数を8進数、16進数で表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.15
	 */
	public static void main(String[] args) {
		//キーボードからの読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//"整数： "を表示する
		System.out.print("整数:");
		//inputNumberに数を読み込む
		int inputNumber = standardInput.nextInt();
		//入力値を8進数で表示する
		System.out.printf("8進数では%oです。\n",inputNumber);
		//入力値を16進数で表示する
		System.out.printf("16進数では%xです。\n",inputNumber);
	}
}