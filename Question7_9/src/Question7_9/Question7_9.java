package Question7_9;
import java.util.Scanner;
/*
 * クラス名            :Question7_9
 * 概要                :正の整数値を表示してキーボードから読み取りその値を返却する
 * 作成者              :玉澤一輝
 * 作成日              :2026.4.22
 */
public class Question7_9 {
	/*
	 * 関数名           :readPlusInt
	 * メソッドの説明   :整数値を読み込んで、0以下なら再度読み込んで返却する
	 * パラメータの説明 :なし
	 * 返り値           :読み込んだ整数値
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	static int readPlusInt() {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//変数inputNumberの初期化
		int inputNumber = 0;
		//入力した値が0以下なら繰り返す
		while(inputNumber <= 0) {
			//"正の整数値"を表示する
			System.out.print("正の整数値：");
			//inputNumberに入力した値を代入する
			inputNumber = standardInput.nextInt();
		}
		//入力した値を返却する
		return inputNumber;
	}
	/*
	 * 関数名           :main
	 * メソッドの説明   :0-99のランダムな数を出力しrandomメソッドの結果を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.22
	 */
	public static void main(String[] args) {
		//返却値を表示する
		readPlusInt();
	}
}
