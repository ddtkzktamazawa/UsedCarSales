package Question7_11;
import java.util.Scanner;
/*
 * クラス名            :Question7_11
 * 概要                :整数を左右にシフトした値と2のべき乗での乗算や除算と等しくなることを確認する
 * 作成者              :玉澤一輝
 * 作成日              :2026.4.22
 */
public class Question7_11 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :整数を左右にシフトした値と2のべき乗での乗算や除算と等しくなることを確認する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.22
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);

		final int baseNumber = 2;
		//"整数x"を表示する
		System.out.print("整数x：");
		//変数integerNumberに入力した値を代入する
		int integerNumber = standardInput.nextInt();
		//"シフトする数n："を表示する
		System.out.print("シフトする数n：");
		//変数shiftNumberに入力した値を代入する
		int shiftNumber = standardInput.nextInt();
		//変数powerofTwoの初期化
		int powerofTwo = 1;
		//変数iが0から始めて1ずつ増やしていきシフトの回数繰り返す
		for (int i = 0; i < shiftNumber; i++) {
			//2を1回ずつかけて2のn乗を計算する
			powerofTwo *= baseNumber;
		}
		//"左シフト：(integerNumber << shiftNumber)"と表示して改行する
		System.out.println("左シフト：" + (integerNumber << shiftNumber));
		//"2のべき乗(乗算)：(integerNumber * shiftNumber)"と表示して改行する
		System.out.println("2のべき乗(乗算)：" + (integerNumber * powerofTwo));
		//"右シフト：(integerNumber >> shiftNumber)"と表示して改行する
		System.out.println("右シフト：" + (integerNumber >> shiftNumber));
		//"2のべき乗(除算)：(integerNumber / powerofTwo)"と表示して改行する
		System.out.println("2のべき乗(除算)：" + (integerNumber / powerofTwo));
	}

}
