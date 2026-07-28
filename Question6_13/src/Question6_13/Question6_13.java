package Question6_13;
import java.util.Scanner;
/*
 * クラス名:Question6_13
 * 概要    :配列の全要素を逆順にしてコピーして表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.20
 */
public class Question6_13 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :配列の全要素を逆順にしてコピーして表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.20
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//変数elementNumberの初期化
		int elementNumber = 0;
		//実行する
		do {
			//"要素数："と表示する
			System.out.print("要素数：");
			//変数elementNumberに入力した数を読み込む
			elementNumber = standardInput.nextInt();
			//elementNumberが0以下ならdo文を再実行する
		}while(elementNumber <= 0);
		//int型を構成要素とする配列firstElementを作成する
		int[] firstElement = new int[elementNumber];
		//int型を構成要素とする配列secondElementを作成する
		int[] secondElement = new int[elementNumber];
		//変数iを0から始め1ずつ増やし、要素数の値より大きくなるまで繰り返す
		for(int i= 0; i < elementNumber; i++) {
			//"firstNumber[i]="と表示する
			System.out.print("firstElement[" + i + "] = ");
			//変数firstElement[i]に入力した数を代入する
			firstElement[i] = standardInput.nextInt();
		}
		//変数iを0から始めて1ずつ増やし、elementNumberの値より大きくなるまで繰り返す
		for(int i = 0; i < elementNumber; i++) {
			//変数firstElement[i]にfirstElement[要素数の値-1-i]を代入する
			secondElement[i] = firstElement[elementNumber - 1 - i];
		}
		//"firstElementの全要素をsecondElementに逆順にコピーしました。"を表示して改行する
		System.out.println("firstElementの全要素を\nsecondElementに逆順にコピーしました。");
		//変数iを0から始めて1ずつ増やし、要素数の値より大きくなるまで繰り返す
		for(int i = 0; i < elementNumber; i++) {
			//"secondElement[i]=（secondElement[i]）の値"を表示して改行する
			System.out.println("secondElement[" + i + "] = " + secondElement[i]);
		}
	}
}
