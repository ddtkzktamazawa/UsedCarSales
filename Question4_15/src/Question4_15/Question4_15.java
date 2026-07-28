package Question4_15;
import java.util.Scanner;
/*
 * クラス名:Question4_15
 * 概要    :入力した身長の範囲とその標準体重の対応表を表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.10
 */
public class Question4_15 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :入力した身長の範囲とその標準体重の対応表を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.10
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//変数firstHeightの初期化
		int firstHeight = 0;
		//変数secondHeightの初期化
		int secondHeight = 0;
		//変数heightDefferencの初期化
		int heightDifference = 0;
		//実行する
		do {
			//"何cmから："と表示する
			System.out.print("何cmから：");
			//firstHeightに数を読み込む
			firstHeight = standardInput.nextInt();
			//1つ目の身長が0以下ならばdo文を再実行する
		}while(firstHeight <= 0);
		//実行する
		do {
			//"何cmまで："と表示する
			System.out.print("何cmまで：");
			//secondHeightに数を読み込む
			secondHeight = standardInput.nextInt();
			//2つ目の身長が0以下ならばdo文を再実行する
		}while(secondHeight <= 0);
		//実行する
		do {
			//"何cmごと："と表示する
			System.out.print("何cmごと：");
			//heightDifferenceに数を読み込む
			heightDifference = standardInput.nextInt();
			//身長の増分が0以下ならばdo文を再実行する
		}while(heightDifference <= 0);
		//"身長　標準体重"と表示して改行する
		System.out.println("身長　標準体重");
		/*
		 * 変数incrementValueを1つ目の身長から始めて身長の増分ずつ増やしながら
		 * ｛（2つ目の身長-1つ目の身長）/身長の増分｝回ループ本体を繰り返す
		 */
		for(int incrementValue = firstHeight; incrementValue <= secondHeight; incrementValue += heightDifference)
			//"incrementValue+　+(incrementValue-100) * 0.9"と表示して改行する
			System.out.println(incrementValue +"　"+ (incrementValue-100) * 0.9);

	}

}
