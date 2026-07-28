package Question4_3;
import java.util.Scanner;
/*
 * クラス名:Question4_3
 * 概要    :二つの整数値を読み込んで小さいほうの数大きいほうの数以上の全整数を昇順に表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.7
 */
public class Question4_3 {
	 /**
     * 関数名           :main
     * メソッドの説明   :二つの整数値を読み込んで小さいほうの数大きいほうの数以上の全整数を昇順に表示する
     * パラメータの説明 :なし
     * 返り値           :なし
     * 作成者           :玉澤一輝
     * 作成日           :2026.4.7
     */
	public static void main(String[] args) {
		//キーボードからの読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//整数値Aの入力
		System.out.print("整数A：");
		//firstNumberに整数値Aを読み込み
		int firstNumber = standardInput.nextInt();
		//整数値Bを入力
		System.out.print("整数B：");
		//seconfNumberに整数値Bを読み込む
		int secondNumber = standardInput.nextInt();
		//もしfirstNumber＞secondNumberの場合
		if(firstNumber > secondNumber) {
			//tとfirstNumberの値を交換する
			int t = firstNumber;
			//firstNumberとsecondNumberの値を交換する
			firstNumber = secondNumber;
			//secondNumbeとtの値を交換する
			secondNumber = t;
		}
		//"firstNumber "を表示する
		System.out.print(firstNumber+" ");
		//plusNumberにfirstNumber+1を読み込む
		int plusNumber = firstNumber +1;
		//実行する
		do {
			//もしplusNumber＜secondNumberの場合
			if(plusNumber < secondNumber)
				//"plusNumber "を表示する
				System.out.print(plusNumber+" ");
			//plusNumberにplusNumber+1を読み込む
			plusNumber = plusNumber +1;
			//plusNumberとsecondNumberが等しくなければdo文を再実行する
		}while(plusNumber != secondNumber);
		//"secondNumber "を表示する
		System.out.print(secondNumber);

	}

}
