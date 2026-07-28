package Question7_12;
import java.util.Scanner;
/*
 * クラス名            :Question7_12
 * 概要                :整数を回転させた値を表示する
 * 作成者              :玉澤一輝
 * 作成日              :2026.4.23
 */
public class Question7_12 {
	/*
	 * 関数名           :printBits
	 * メソッドの説明   :整数のビット構成（32ビット）を表示する
	 * パラメータの説明 :整数
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	static void printBits(int inputNumber) {
		//変数iが31から始めて1ずつ減らしていきiが0まで繰り返す
		for(int i = 31; i >= 0; i--) {
			//"iビット目が1なら'1'を0なら'0'"を表示する
			System.out.print(((inputNumber >>> i & 1) == 1)? '1' : '0');
		}
	}
	/*
	 * 関数名           :rRotate
	 * メソッドの説明   :整数を右に回転した値を返却する
	 * パラメータの説明 :回転前の整数、回転数
	 * 返り値           :右にビット回転した値
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	public static int rRotate(int originalNumber, int shiftNumber) {
		//もしshiftNumberが0より小さい場合
		if(shiftNumber < 0) {
			//-shiftNumber（逆回転、左）にして返却する
			return lRotate(originalNumber, -shiftNumber);
		}
		/*元の整数をshiftNumberビット右シフトして0を詰めた値と、
		 *元の整数を32-shiftNumberビット左シフトして0を詰めた値の論理和を返却する
		 */
		return (originalNumber >>> shiftNumber) | (originalNumber << (32 - shiftNumber));
	}
	/*
	 * 関数名           :lRotate
	 * メソッドの説明   :整数を左に回転した値を返却する
	 * パラメータの説明 :回転前の整数、回転数
	 * 返り値           :左にビット回転した値
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	public static int lRotate(int originalNumber, int shiftNumber) {
		//もしshiftNumberが0より小さい場合
		if (shiftNumber < 0) {
			//-shiftNumber（逆回転、右）にして返却する
			return rRotate(originalNumber, -shiftNumber);
		}
		/*元の整数をshiftNumberビット左シフトして0を詰めた値と、
		 *元の整数を32-shiftNumberビット右シフトして0を詰めた値の論理和を返却する
		 */
		return (originalNumber << shiftNumber) | (originalNumber >>> (32 - shiftNumber));
	}
	/*
	 * 関数名           :main
	 * メソッドの説明   :値を入力し左右に回転させた結果をビット表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//"整数x"を表示する
		System.out.print("整数x：");
		//変数integerNumberに入力した値を代入する
		int integerNumber = standardInput.nextInt();
		//"回転数n"を表示する
		System.out.print("回転数n：");
		//変数rotationNumberに入力した値を代入する
		int rotationNumber = standardInput.nextInt();
		//"元のビット数　 ："を表示する
		System.out.print("元のビット数　 ：");
		//入力された整数のビット構成を表示する
		printBits(integerNumber);
		//改行する
		System.out.println();
		//"右にnビット回転："を表示する
		System.out.print("右にnビット回転：");
		//整数を回転数nだけ右シフトした結果のビット構成を表示する
		printBits(rRotate(integerNumber, rotationNumber));
		//改行する
		System.out.println();
		//"左にnビット回転："を表示する
		System.out.print("左にnビット回転：");
		//整数を回転数nだけ左シフトした結果のビット構成を表示する
		printBits(lRotate(integerNumber, rotationNumber));
		//改行する
		System.out.println();
	}
}
