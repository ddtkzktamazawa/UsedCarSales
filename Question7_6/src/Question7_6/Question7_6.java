package Question7_6;
import java.util.Scanner;
/*
 * クラス名:Question7_6
 * 概要    :指定された月の季節を表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.21
 */
public class Question7_6 {
	/*
	 * 関数名           :printSeason
	 * メソッドの説明   :指定された月の季節を表示する
	 * パラメータの説明 :月の数字
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.21
	 */
	static void printSeason(int choiceMonth) {
		//choiceMonthが3,4,5のどれかの場合
		if(choiceMonth == 3 || choiceMonth == 4 || choiceMonth == 5){
			//"春"を表示して改行する
			System.out.println("春");
		}
		//choiceMonthが6,7,8のどれかの場合
		else if(choiceMonth == 6 || choiceMonth == 7 || choiceMonth == 8){
			//"夏"を表示して改行する
			System.out.println("夏");
		}
		//choiceMonthが9,10,11のどれかの場合
		else if(choiceMonth == 9 || choiceMonth == 10 || choiceMonth == 11){
			//"秋"を表示して改行する
			System.out.println("秋");
		}
		//choiceMonthが12,1,2のどれかの時
		else if(choiceMonth == 12 || choiceMonth == 1 || choiceMonth == 2){
			//"冬"を表示して改行する
			System.out.println("冬");
		}
		//その他の場合
		else {
			//改行する
			System.out.println();
		}
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
		//"何月："を表示する
		System.out.print("何月？：");
		//whatMonthに入力した値を代入する
		int whatMonth = standardInput.nextInt();
		//printSeasonメソッドの呼び出し
		printSeason(whatMonth);
	}
}
