package Question4_25;
/*
 * クラス名:Question4_25
 * 概要    :読み込んだ整数を加算して合計と平均値を求める
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.15
 */
import java.util.Scanner;
public class Question4_25 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :読み込んだ整数を加算して合計と平均値を求める
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.15
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//List4-17の書き換え
		//"整数を加算します。"と表示して改行する
		System.out.println("整数を加算します。");
		//"何個加算しますか："と表示する
		System.out.print("何個加算しますか：");
		//inputNumberに数を読み込む
		int inputNumber = standardInput.nextInt();
		//合計値を求める変数の初期化
		int sumValue = 0;
		//合計値を求める変数の初期化
		int averageValue = 0;
		//変数iを1から始めて1つずつ増やしながら入力した数の回数ループ本体を繰り返す
		for(int i = 1; i <= inputNumber; i++) {
			//"整数（0で終了）："と表示する
			System.out.print("整数（0で終了）：");
			//plusNumberに数を読み込む
			int plusNumber = standardInput.nextInt();
			//もし加算をする変数が0の場合、for文から抜ける
			if(plusNumber == 0) {
				break;
			}
			//合計値を求める変数に加算をする変数の値を加算する
			sumValue += plusNumber;
			//合計値を求める変数に合計値を求める変数をiで割った値を代入
			averageValue = sumValue / i;
		}
		//"合計はsumValueです。"と表示して改行する
		System.out.println("合計は"+sumValue+"です。");
		//"平均はaverageValueです。"と表示して改行する
		System.out.println("平均値は"+averageValue+"です。");
		//
		//List4-18の書き換え
		//"整数を加算します。"と表示して改行する
		System.out.println("整数を加算します。");
		//"何個加算しますか："と表示する
		System.out.print("何個加算しますか：");
		//inputNumberに数を読み込む
		inputNumber = standardInput.nextInt();
		//合計値を求める変数に0を代入
		sumValue = 0;
		//合計値を求める変数に0を代入
		averageValue = 0;
		//変数iを1から始めて1つずつ増やしながら入力した数の回数ループ本体を繰り返す
		for(int i = 1; i <= inputNumber; i++) {
			//"整数："と表示する
			System.out.print("整数：");
			//plusNumberに数を読み込む
			int plusNumber = standardInput.nextInt();
			//もし合計値を求める変数に加算をする変数を加えた値が1000以上の場合
			if(sumValue + plusNumber > 1000) {
				//"合計が1,000を超えました。"と表示して改行する
				System.out.println("合計が1,000を超えました。");
				//"最後の数値は無視します。"と表示して改行する
				System.out.println("最後の数値は無視します。");
				//for文から抜ける
				break;
			}
			//合計値を求める変数に加算をする変数の値を加算する
			sumValue += plusNumber;
			//合計値を求める変数に合計値を求める変数をiで割った値を代入
			averageValue = sumValue / i;
		}
		//"合計はsumValueです。"と表示して改行する
		System.out.println("合計は"+sumValue+"です。");
		//"平均はaverageValueです。"と表示して改行する
		System.out.println("平均値は"+averageValue+"です。");

	}
}
