package Question10_3;
/*
 * クラス名          : MinMax
 * 概要              : 最小値や最大値を求めるためのユーティリティクラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.04.30
 */
public class MinMax{
	/**
	 * 関数名           : min
	 * メソッドの説明   : 2つの整数値の小さい方の値を返却する
	 * パラメータの説明 : 比較する整数
	 * 返り値           : 引数の最小の値
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.04.30
	 */
	public static int min(int firstNumber, int secondNumber) {
		//最小値を返す
		return firstNumber < secondNumber ? firstNumber : secondNumber;
	}
	/**
	 * 関数名           : min
	 * メソッドの説明   : 3つの整数値のうち最も小さい値を返却する
	 * パラメータの説明 : 比較する整数
	 * 返り値           : 引数の中で最小の値
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.04.30
	 */
	public static int min(int firstNumber, int secondNumber, int thirdNumber) {
		//変数minimumNumberにfirstNumberを代入する
		int minimumNumber = firstNumber;
		//secondNumberがminimumNumberより小さい場合
		if(secondNumber < minimumNumber) {
			//minimumNumberにsecondNumberを代入する
			minimumNumber = secondNumber;
		}
		//thirdNumberがminimumNumberより小さい場合
		if(thirdNumber < minimumNumber) {
			//minimumNumberにthirdNumberを代入する
			minimumNumber = thirdNumber;
		}
		//最小値を返す
		return minimumNumber;
	}
	/**
	 * 関数名           : min
	 * メソッドの説明   : 配列の全要素の中の最小値を返却する
	 * パラメータの説明 : 最小値を探索する対象の配列
	 * 返り値           : 配列内における最小の値
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.04.30
	 */
	public static int min(int[] arrayNumber){
		//変数minimumNumberにarrayNumber[0]を代入する
		int minimumNumber = arrayNumber[0];
		//変数iが1から始めて1ずつ増やしていき要素の数繰り返す
		for(int i = 1; i < arrayNumber.length; i++) {
			//もしarrayNumber[i]がminimumNumberより小さい場合
			if(arrayNumber[i] < minimumNumber)
				//minimumNumberにarrayNumber[i]を代入する
				minimumNumber = arrayNumber[i];
		}
		//最小値を返す
		return minimumNumber;
	}
	/**
	 * 関数名           : max
	 * メソッドの説明   : 2つの整数値の大きい方の値を返却する
	 * パラメータの説明 : 比較する整数
	 * 返り値           : 引数の最大の値
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.04.30
	 */
	public static int max(int firstNumber, int secondNumber) {
		//最大値を返す
		return firstNumber > secondNumber ? firstNumber : secondNumber;
	}
	/**
	 * 関数名           : max
	 * メソッドの説明   : 3つの整数値のうち最も大さい値を返却する
	 * パラメータの説明 : 比較する整数
	 * 返り値           : 引数の中で最大の値
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.04.30
	 */
	public static int max(int firstNumber, int secondNumber, int thirdNumber) {
		//変数maxNumberにfirstNumberを代入する
		int maxNumber = firstNumber;
		//もしsecondNumberがmaxNumberより大きい場合
		if(secondNumber > maxNumber) {
			//maxNumberにsecondNumberを代入する
			maxNumber = secondNumber;
		}
		//もしthirdNumberがmaxNumberより大きい場合
		if(thirdNumber > maxNumber) {
			//maxNumberにthirdNumberを代入する
			maxNumber = thirdNumber;
		}
		//最大値を返す
		return maxNumber;
	}
	/**
	 * 関数名           : max
	 * メソッドの説明   : 配列の全要素の中の最大値を返却する
	 * パラメータの説明 : 最大値を探索する対象の配列
	 * 返り値           : 配列内における最大の値
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.04.30
	 */
	public static int max(int[] arrayNumber) {
		//変数maxNumberにarrayNumber[0]を代入する
		int maxNumber = arrayNumber[0];
		//変数iが1から始めて1ずつ増やしていき要素の数繰り返す
		for(int i = 1; i < arrayNumber.length; i++) {
			//もしarrayNumber[i]がminimumNumberより大きい場合
			if(arrayNumber[i] > maxNumber)
				//maxNumberにarrayNumber[i]を代入する
				maxNumber = arrayNumber[i];
		}
		//最大値を返す
		return maxNumber;
	}

}
