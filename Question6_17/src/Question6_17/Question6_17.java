package Question6_17;
import java.util.Scanner;
/*
 * クラス名:Question6_17
 * 概要    :6人2教科の科目ごとの平均点と学生ごとの平均点を求める
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.21
 */
public class Question6_17 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :6人2教科の科目ごとの平均点と学生ごとの平均点を求める
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.21
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//int型を構成要素型とする配列を構成要素型とする配列（2行6列の行列）の宣言
		final int [][] RESULT_MATRIX = new int[2][6];
		//String型を構成要素型とする配列の宣言
		final String[] SUBJECT_SCORE = {"国語","数学"};
		//変数iを0から始め1ずつ増やし、2まで繰り返す
		for(int i = 0; i < RESULT_MATRIX.length; i++) {
			//変数jを0から始め1ずつ増やし、6まで繰り返す
			for(int j = 0; j < RESULT_MATRIX[i].length; j++) {
				//"(j+1)人目の点数：（教科）RESULT_MATRIX[i][j]"と表示する
				System.out.print(j + 1 +"人目の点数："+ SUBJECT_SCORE[i] + "RESULT_MATRIX["+ i +"]"+"["+ j +"] = " );
				//変数firstMatrix[i][j]に入力した数を代入する
				RESULT_MATRIX[i][j] = standardInput.nextInt();
			}
		}
		//改行する
		System.out.println();
		//変数iを0から始め1ずつ増やし、2まで繰り返す
		for(int i = 0; i < RESULT_MATRIX.length; i++) {
			//変数totalPointの初期化
			int totalPoint = 0;
			//変数jを0から始め1ずつ増やし、6まで繰り返す
			for(int j = 0; j < RESULT_MATRIX[i].length; j++) {
				//科目ごとの全員の合計を計算
				totalPoint += RESULT_MATRIX[i][j];
			}
			//"(SUBJECT_SCORE[i]の平均点はtotalPoint/6 点"と表示して改行する
			System.out.println(SUBJECT_SCORE[i] + "の平均点は" + (double)totalPoint / 6 + "点");
		}
		//変数iを0から始め1ずつ増やし、1まで繰り返す
		for(int i = 0; i < 1; i++) {
			//変数jを0から始め1ずつ増やし、6まで繰り返す
			for(int j = 0; j < RESULT_MATRIX[i].length; j++) {
				//"(j+1)人目の平均点はRESULT_MATRIX[i][j]+RESULT_MATRIX[i+1][j])/2 点"と表示して改行する
				System.out.println(j + 1 + "人目の平均点は" + (double)(RESULT_MATRIX[i][j] + RESULT_MATRIX[i + 1][j]) / 2 + "点");
			}
		}
	}
}
