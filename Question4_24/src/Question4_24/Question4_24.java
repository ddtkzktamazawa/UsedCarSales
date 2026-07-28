package Question4_24;
import java.util.Scanner;
/*
 * クラス名:Question4_24
 * 概要    :正の整数値を読み込んで素数であるかどうか判断する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.14
 */
public class Question4_24 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :正の整数値を読み込んで素数であるかどうか判断する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.14
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//変数inputNumberの初期化
		int inputNumber = 0;
		//実行する
		do {
			//"正の整数値："と表示する
			System.out.print("正の整数値："	);
			//inputNumberに数を読み込む
			inputNumber = standardInput.nextInt();
			//入力した数が0以下ならばdo文を再実行する
		}while(inputNumber <= 0);
		//変数notPrimeの初期化（素数である場合は0をとる）
		int notPrime = 0;
		//変数iを2から始めて1つずつ増やしながら入力した数までループ本体を繰り返す
		for(int i = 2; i < inputNumber; i++) {
			//もし入力した数をiで割った時の余剰が0の場合
			if(inputNumber % i == 0) {
				//変数notPrimeに1を代入する（素数でない場合は1をとる）
				notPrime = 1;
				//for文から抜ける
				break;
			}
		}
		//もしnotPrimeが1の場合または入力した数が1の場合
		if(notPrime == 1 || inputNumber == 1) {
			//"素数ではありません。"と表示する
			System.out.print("素数ではありません。");
		//その他の場合
		}else {
			//"素数です。"と表示する
			System.out.print("素数です。");
		}
	}
}