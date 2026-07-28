package Question6_16;
import java.util.Scanner;
/*
 * クラス名:Question6_16
 * 概要    :4行3列の行列と3行4列の行列の積を求める
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.21
 */
public class Question6_16 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :4行3列の行列と3行4列の行列の積を求める
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.21
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//int型を構成要素型とする配列を構成要素型とする配列（4行3列の行列）の宣言
		int [][] firstMatrix = new int[4][3];
		//int型を構成要素型とする配列を構成要素型とする配列（3行4列の行列）の宣言
		int [][] secondMatrix = new int[3][4];
		//int型を構成要素型とする配列を構成要素型とする配列（4行4列の行列）の宣言
		int [][] resultMatrix = new int[4][4];
		//変数iを0から始め1ずつ増やし、4まで繰り返す
		for(int i = 0; i < 4; i++) {
			//変数jを0から始め1ずつ増やし、3まで繰り返す
			for(int j = 0; j < 3; j++) {
				//"firstMatrix[i][j]="と表示する
				System.out.print("firstMatrix[" + i + "]"+"[" + j + "] =" );
				//変数firstMatrix[i][j]に入力した数を代入する
				firstMatrix[i][j] = standardInput.nextInt();
			}
		}
		//改行する
		System.out.println();
		//変数iを0から始め1ずつ増やし、3まで繰り返す
		for(int i = 0; i < 3; i++) {
			//変数jを0から始め1ずつ増やし、4まで繰り返す
			for(int j = 0; j < 4; j++) {
				//"secondMatrix[i][j]="と表示する
				System.out.print("secondMatrix[" + i + "]"+"[" + j + "] =" );
				//変数secondMatrix[i][j]に入力した数を代入する
				secondMatrix[i][j] = standardInput.nextInt();
			}
		}
		//変数iを0から始め1ずつ増やし、4まで繰り返す
		for(int i = 0; i < 4; i++) {
			//変数jを0から始め1ずつ増やし、4まで繰り返す
			for(int j = 0; j < 4; j++) {
				/*resultMatrix[i][j]に行列の1つ目の[i][0]*2つ目の[0][j]、1つ目の[i][1]*2つ目の[1][j]、
				1つ目の[i][2]*2つ目の[2][j]を加えたものを代入
				 */
				resultMatrix[i][j] = (firstMatrix[i][0] * secondMatrix[0][j]) + 
						(firstMatrix[i][1] * secondMatrix[1][j]) + 
						(firstMatrix[i][2] * secondMatrix[2][j]);
			}
		}
		//改行する
		System.out.println();
		//変数iを0から始め1ずつ増やし、4まで繰り返す
		for(int i = 0; i < 4; i++) {
			//変数jを0から始め1ずつ増やし、4まで繰り返す
			for(int j = 0; j < 4; j++) {
				//resultMatrix[i][j]を少なくとも三桁で表示する
				System.out.printf("%3d", resultMatrix[i][j]);
			}
			//改行する
			System.out.println();
		}
		//改行する
		System.out.println();
	}
}
