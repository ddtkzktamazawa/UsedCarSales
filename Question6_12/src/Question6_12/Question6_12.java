package Question6_12;
import java.util.Random;
import java.util.Scanner;
/*
 * クラス名:Question6_12
 * 概要    :要素数を読み込んでint型の配列の全要素を1～10の乱数で表示する
 * （同じ値を出さない）、その後シャッフルする
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.20
 */
public class Question6_12 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :要素数を読み込んでint型の配列の全要素を1～10の乱数で表示する
	 * （同じ値を出さない）、その後シャッフルする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.20
	 */
	public static void main(String[] args) {
		//乱数ジェネレータの生成
		Random allNumber = new Random();
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//変数elementValueの初期化
		int elementValue = 0;
		//実行する
		do {
			//"要素数："と表示する
			System.out.print("要素数：");	
			//変数elementValueに入力した数を読み込む
			elementValue = standardInput.nextInt();
			//elementValueが0以下ならdo文を再実行する
		}while (elementValue <= 0 || elementValue > 10);
		//int型を構成要素とする配列を作成する
		int []someElement = new int[elementValue];
		//変数iを0から始め1ずつ増やし、elementValueの値より大きくなるまで繰り返す
		for(int j = 0; j < elementValue; j++)
			//変数someElement[i]に乱数（1～10）を代入する
			someElement[j] = allNumber.nextInt(10) + 1;
		//改行後に"{"を表示する
		System.out.print("{");
		//変数jを0から始めて1ずつ増やし入力した値よりも大きくなるまで繰り返す
		for(int j = 0; j < elementValue; j++) 
			//変数jが0の場合
			if(j == 0) {
				//"someElement[j]"を表示する
				System.out.print(someElement[j]);
				//その他の場合
			}else {
				//変数iを0から始めて1ずつ増やし入力した値よりも大きくなるまで繰り返す
				for(int i = 0; i < j; i++) {
					//もしsomeElement[i]とsomeElement[j]が同じ場合
					if(someElement[i] == someElement[j]) {
						//変数someElement[j]に乱数（1～10）を代入する
						someElement[j] = allNumber.nextInt(10) + 1;
						//iに-1を代入する（インクリメントするため、-1とする）
						i = -1;
					}
				}
				//", someElement[j]+ "を表示する
				System.out.print(", "+ someElement[j]);
			}
		//"}"を表示して改行する
		System.out.println("}");
		//変数iを0から始めて1ずつ増やし入力した値の半分よりも大きくなるまで繰り返す
		for(int i = 0; i < elementValue / 2; i++) {
			//変数tにsomeElement[i]を代入する
			int t = someElement[i];
			//変数qに要素数の中からランダムなものを代入する
			int q = allNumber.nextInt(elementValue);
			//変数pに要素数の中からランダムなものを代入する
			int p = allNumber.nextInt(elementValue);
			//変数tにsomeElement[q]を代入する
			t = someElement[q];
			//someElement[q]にsomeElement[p]を代入する
			someElement[q] = someElement[p];
			//someElement[p]にtを代入する
			someElement[p] = t;
		}
		//"並びをシャッフルしました。"と表示して改行する
		System.out.println("並びをシャッフルしました。");
		//改行後に"{"を表示する
		System.out.print("{");
		//変数iを0から始めて1ずつ増やし入力した値よりも大きくなるまで繰り返す
		for(int i = 0; i < elementValue; i++) {
			//変数iが0の場合
			if(i == 0) {
				//"someElement[i]"を表示する
				System.out.print(someElement[i]);
				//その他の場合
			}else {
				//", someElement[i]+ "を表示する
				System.out.print(", "+ someElement[i]);
			}
		}
		//"}"を表示して改行する
		System.out.println("}");
	}
}
