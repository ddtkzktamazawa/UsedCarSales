package Question7_3;
import java.util.Scanner;
/*
 * クラス名:Question7_3
 * 概要    :三つのint型引数の中央値を求める
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.21
 */
public class Question7_3 {
	/**
	 * 関数名           :medianNumber
	 * メソッドの説明   :三つのint型引数の中央値を求める
	 * 					 1未満の整数も比較対象
	 * パラメータの説明 :入力値1～3
	 * 返り値           :中央値
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.21
	 */
	static int medianNumber(int firstValue, int secondValue, int thirdValue ) {
		//変数medianNumberの初期化
		int medianNumber = 0;
		/*firstValueがsecondValueよりも大きくthirdValueよりも小さいとき
		 *またはfirstValueがthirdValueよりも大きくsecondValueよりも小さい場合
		 */
		if ((firstValue >= secondValue && thirdValue >= firstValue)
				||(firstValue <= secondValue && thirdValue <= firstValue)) {
			//medianNumberに1つ目の入力値を代入
			medianNumber = firstValue;
		}
		/*secondValueがfirstValueよりも大きくthirdValueよりも小さいとき
		 *またはsecondValueがthirdValueよりも大きくfirstValueよりも小さい場合
		 */
		else if ((firstValue <= secondValue && thirdValue >= secondValue)
				||(firstValue >= secondValue && thirdValue <= secondValue)) {
			//medianNumberに2つ目の入力値を代入
			medianNumber = secondValue;
		}
		//その他の場合
		else { 
			//medianNumberに3つ目の入力値を代入
			medianNumber = thirdValue;
		}
		//返却する
		return medianNumber;
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
		//"firstValueの値："を表示する
		System.out.print("firstValueの値：");
		//1つ目の入力値を入力
		int firstValue = standardInput.nextInt();
		//"secondValueの値："を表示する
		System.out.print("secondValueの値：");
		//2つ目の入力値を入力
		int secondValue = standardInput.nextInt();
		//"thirdValue"を表示する
		System.out.print("thirdValueの値：");
		//3つ目の入力値を入力
		int thirdValue = standardInput.nextInt();
		//""の中の文字と返却値を表示して改行
		System.out.println("中央値は" + medianNumber(firstValue, secondValue, thirdValue ) + "です。");
	}
}
