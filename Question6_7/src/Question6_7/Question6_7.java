package Question6_7;
import java.util.Random;
import java.util.Scanner;
/*
 * クラス名:Question6_7
 * 概要    :捜索するキー値と同じ値を末尾側から見つける
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.17
 */
public class Question6_7 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :捜索するキー値と同じ値を末尾側から見つける
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.17
	 */
	public static void main(String[] args) {
		//乱数ジェネレータの生成
		Random allNumber = new Random();
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//要素数ELEMENT_VALUEを12個に設定する
		final int ELEMENT_VALUE = 12;
		//int型を構成要素とする配列を作成する
		int []someElement = new int[ELEMENT_VALUE];
		////変数iを0から始め1ずつ増やし、ELEMENT_VALUEの値より大きくなるまで繰り返す
		for(int j = 0; j < ELEMENT_VALUE; j++) {
			//変数someElement[i]に入力した数を代入する
			someElement[j] = allNumber.nextInt(10);
			/*"配列someElementの全要素の値"を表示して改行
			 * 改行後に"{ "を表示する
			 */
		}
		System.out.print("配列someElementの全要素の値\n{ ");
		//変数jを0から始め1ずつ減らし入力した値よりも小さくなるまで繰り返す
		for(int j = 0; j < ELEMENT_VALUE; j++) {
			//"someElement[j]+ "を表示する
			System.out.print(someElement[j] + " ");
		}
		//"}"を表示して改行する
		System.out.println("}");
		//"探す数値："を表示する
		System.out.print("探す数値：");
		//変数keyNumberに入力した数を読み込む
		int keyNumber = standardInput.nextInt();
		//変数iの初期化
		int i = 0;
		//変数iをELEMENT_VALUE-1から始め1ずつ減らし0まで繰り返す
		for(i = ELEMENT_VALUE - 1; i >= 0; i--) {
			//もしsomeElement[i]がkeyNumberと同じ場合
			if(someElement[i] == keyNumber){
				//for文から抜ける
				break;
			}
		}
		//もしiが0以上の場合
		if(i >= 0) {
			//"それはsomeElement[i]にあります。"と表示して改行する
			System.out.println("それはsomeElement[" + i + "]にあります。");
			//その他の場合
		}else {
			//"それはありません。"と表示して改行する
			System.out.println("それはありません。");
		}
	}
}
