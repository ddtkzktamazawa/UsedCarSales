package Question7_14;
import java.util.Scanner;
/*
 * クラス名            :Question7_14
 * 概要                :指定したビットから指定の個数1、0、反転させた値を表示する
 * 作成者              :玉澤一輝
 * 作成日              :2026.4.23
 */
public class Question7_14 {
	/**
	 * 関数名           :printBits
	 * メソッドの説明   :整数のビット構成（32ビット）を表示する
	 * パラメータの説明 :整数
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	public static void printBits(int inputNumber) {
		//変数iが31から始めて1ずつ減らしていきiが0まで繰り返す
		for(int i = 31; i >= 0; i--)
			//"iビット目が1なら'1'を0なら'0'"を表示する
			System.out.print(((inputNumber >>> i & 1) == 1)? '1' : '0');
	}
	/**
	 * 関数名           :set
	 * メソッドの説明   :整数xのposビット目を1にした値を返却する
	 * パラメータの説明 :元の整数、操作するビット位置
	 * 返り値           :posビット目を1にした値
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	public static int set(int originalNumber, int pos) {
		//整数とposビット目だけが1の論理和をとって指定位置を1にする
		return originalNumber | (1 << pos);
	}
	/**
	 * 関数名           :reset
	 * メソッドの説明   :整数xのposビット目を0にした値を返却する
	 * パラメータの説明 :元の整数、操作するビット位置
	 * 返り値           :posビット目を0にした値
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	public static int reset(int originalNumber, int pos) {
		//整数と、1をposビット左シフトして反転させたもの(指定位置だけ0)の論理積をとる
		return originalNumber & ~(1 << pos);
	}
	/**
	 * 関数名           :inverse
	 * メソッドの説明   :整数xのposビット目を反転する（1なら0、0なら1）
	 * パラメータの説明 :元の整数、操作するビット位置
	 * 返り値           :posビット目を反転した値
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	public static int inverse(int originalNumber, int pos) {
		// 整数と、posビット目だけが1の排他的論理和をとって指定位置を反転させる
		return originalNumber ^ (1 << pos);
	}
	/**
	 * 関数名           :setN
	 * メソッドの説明   :整数のposビット目から指定した個数連続したビットを1にする
	 * パラメータの説明 :元の整数、開始位置、個数
	 * 返り値           :操作後の整数
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	public static int setN(int originalNumber, int pos, int consecutiveNumbers) {
		//変数iが0から始めて1ずつ増やしていき連続して並ぶ回数繰り返す
		for(int i =0; i < consecutiveNumbers; i++) {
			// 操作後の値をoriginalNumberに代入する
			originalNumber = set(originalNumber, pos + i);
		}
		// すべての処理が終わった値を返却する
		return originalNumber;
	}
	/**
	 * 関数名           :resetN
	 * メソッドの説明   :整数のposビット目から指定した個数連続したビットを0にする
	 * パラメータの説明 :元の整数、開始位置、個数
	 * 返り値           :操作後の整数
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	public static int resetN(int originalNumber, int pos, int consecutiveNumbers) {
		//変数iが0から始めて1ずつ増やしていき連続して並ぶ回数繰り返す
		for(int i =0; i < consecutiveNumbers; i++) {
			// 操作後の値をoriginalNumberに代入する
			originalNumber = reset(originalNumber, pos + i);
		}
		// すべての処理が終わった値を返却する
		return originalNumber;
	}
	/**
	 * 関数名           :inverseN
	 * メソッドの説明   :整数のposビット目から指定した個数連続したビットを反転する
	 * パラメータの説明 :元の整数、開始位置、個数
	 * 返り値           :操作後の整数
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.23
	 */
	public static int inverseN(int originalNumber, int pos, int consecutiveNumbers) {
		//変数iが0から始めて1ずつ増やしていき連続して並ぶ回数繰り返す
		for(int i =0; i < consecutiveNumbers; i++) {
			// 操作後の値をoriginalNumberに代入する
			originalNumber = inverse(originalNumber, pos + i);
		}
		// すべての処理が終わった値を返却する
		return originalNumber;
	}
	/**
	 * 関数名           :main
	 * メソッドの説明   :整数と位置を入力しセット・リセット・反転の結果をビット表示する
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
		//"位置pos："を表示する
		System.out.print("位置pos：");
		//変数positionNumberに入力した値を代入する
		int positionNumber = standardInput.nextInt();
		//"個数n："を表示する
		System.out.print("個数n：");
		//変数quantityNumberに入力した値を代入する
		int quantityNumber = standardInput.nextInt();
		//"元のビット数　　 ："を表示する
		System.out.print("元のビット数　　　　　：");
		//入力された整数のビット構成を表示する
		printBits(integerNumber);
		//改行する
		System.out.println();
		//"(positionNumber+1)番目からquantityNumber個1にした値："を表示する
		System.out.print(positionNumber +1 +"番目から" + quantityNumber + "個1にした値 ：");
		//指定位置から指定個数1にセットした結果を表示
		printBits(setN(integerNumber, positionNumber, quantityNumber));
		//改行する
		System.out.println();
		//"(positionNumber+1)番目からquantityNumber個0にした値："を表示する
		System.out.print(positionNumber+1 +"番目から" + quantityNumber + "個0にした値 ：");
		//指定位置から指定個数0にリセットした結果を表示
		printBits(resetN(integerNumber, positionNumber, quantityNumber));
		//改行する
		System.out.println();
		//"(positionNumber+1)番目からquantityNumber個反転した値："を表示する
		System.out.print(positionNumber+1 +"番目から" + quantityNumber + "個反転した値：");
		//指定位置から指定個数反転した結果を表示
		printBits(inverseN(integerNumber, positionNumber, quantityNumber));
		//改行する
		System.out.println();
	}
}
