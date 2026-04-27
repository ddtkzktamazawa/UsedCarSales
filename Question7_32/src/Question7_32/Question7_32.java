package Question7_32;
import java.util.Scanner;

/*
 * クラス名          : Question7_32
 * 概要              : 多重定義を用いて各整数型（byte,short,int,long）のビット構成を表示する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.27
 */
public class Question7_32 {
	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);
	/**
	 * 関数名           : printBits
	 * メソッドの説明   : byte型整数の内部ビット構成（8bit）を表示する
	 * パラメータの説明 : 表示対象のbyte型数値
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static void printBits(final byte integerNumber) {
		//変数iが7から始めて1ずつ減らしていき0まで繰り返す
		for (int i = 7; i >= 0; i--) {
			// 2進数表示用に対象桁のビットを文字として取得し表示する
			System.out.print(((integerNumber >> i) & 1) == 1 ? '1' : '0');
		}
	}

	/**
	 * 関数名           : printBits
	 * メソッドの説明   : short型整数の内部ビット構成（16bit）を表示する
	 * パラメータの説明 : 表示対象のshort型数値
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static void printBits(final short integerNumber) {
		//変数iが15から始めて1ずつ減らしていき0まで繰り返す
		for (int i = 15; i >= 0; i--) {
			// 2進数表示用に対象桁のビットを文字として取得し表示する
			System.out.print(((integerNumber >> i) & 1) == 1 ? '1' : '0');
		}
	}

	/**
	 * 関数名           : printBits
	 * メソッドの説明   : int型整数の内部ビット構成（32bit）を表示する
	 * パラメータの説明 : 表示対象のint型数値
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static void printBits(final int integerNumber) {
		//変数iが31から始めて1ずつ減らしていき0まで繰り返す
		for (int i = 31; i >= 0; i--) {
			// 2進数表示用に対象桁のビットを文字として取得し表示する
			System.out.print(((integerNumber >> i) & 1) == 1 ? '1' : '0');
		}
	}

	/**
	 * 関数名           : printBits
	 * メソッドの説明   : long型整数の内部ビット構成（64bit）を表示する
	 * パラメータの説明 : 表示対象のlong型数値
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static void printBits(final long integerNumber) {
		//変数iが63から始めて1ずつ減らしていき0まで繰り返す
		for (int i = 63; i >= 0; i--) {
			// 2進数表示用に対象桁のビットを文字として取得し表示する
			System.out.print(((integerNumber >> i) & 1) == 1 ? '1' : '0');
		}
	}

	/**
	 * 関数名           : main
	 * メソッドの説明   : 整数を入力し多重定義されたprintBitsメソッドを呼び出して
	 * 					　各型（byte,short,int,long）としてのビット構成を表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.27
	 */
	public static void main(String[] args) {
		//"整数を入力してください："を表示する
		System.out.print("整数を入力してください：");
		//変数にintegerNumberに入力した値を代入する
		long integerNumber = STANDARD_INPUT.nextLong();

		//"byte  型 ( 8bit)："と表示する
		System.out.print("byte  型 ( 8bit)：");
		//数値をbyte型に変換しそのビット列を出力する
		printBits((byte) integerNumber);
		//改行する
		System.out.println();

		//"short 型 (16bit)："と表示する
		System.out.print("short 型 (16bit)：");
		//数値をshort型に変換しそのビット列を出力する
		printBits((short) integerNumber);
		//改行する
		System.out.println();

		//"int   型 (32bit)："と表示する
		System.out.print("int   型 (32bit)：");
		//数値をint型に変換しそのビット列を出力する
		printBits((int) integerNumber);
		//改行する
		System.out.println();

		//"long  型 (64bit)："と表示する
		System.out.print("long  型 (64bit)：");
		//数値をlong型に変換しそのビット列を出力する
		printBits(integerNumber);
		//改行する
		System.out.println();

	}
}