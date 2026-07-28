package Question6_19;
import java.util.Scanner;
/*
 * クラス名:Question6_19
 * 概要    :クラス数と各クラスの人数・点数を読み込んで合計点・平均点を表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.21
 */
public class Question6_19 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :クラス数と各クラスの人数・点数を読み込んで合計点・平均点を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.21
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner standardInput = new Scanner(System.in);
		//"クラス数："と表示する
		System.out.print("クラス数：");
		//変数classValueに入力した数を代入する
		int classValue = standardInput.nextInt();
		//int型を構成要素型とする配列を構成要素型とする配列の宣言
		int[][] arrayNumber = new int[classValue][];
		//変数iを0から始め1ずつ増やし、クラス数まで繰り返す
		for(int i = 0; i < classValue; i++) {
			//"(i+1)組の人数："と表示する
			System.out.print((i + 1) + "組の人数：");
			//変数classPeopleに入力した数を代入する
			int classPeople = standardInput.nextInt();
			//int型を構成要素型とする配列を構成要素型とする配列の宣言
			arrayNumber[i] = new int[classPeople];
			//変数jを0から始め1ずつ増やし、クラス人数まで繰り返す
			for(int j = 0; j < classPeople; j++) {
				//"(i+1)組(j+1)番の点数："と表示する
				System.out.print((i + 1) + "組" + (j + 1) + "番の点数：");
				//変数arrayNumber[i][j]に入力した数を代入する
				arrayNumber[i][j] = standardInput.nextInt();
			}
			//改行する
			System.out.println();
		}
		//""の文字を表示して改行する
		System.out.println("  組 |		合計	平均");
		//""の文字を表示して改行する
		System.out.println("-----+-------------------");
		//変数allPeopleの初期化
		int allPeople = 0;
		//変数sumNumber1の初期化
		int sumNumber1 = 0;
		//変数sumNumber2の初期化
		int sumNumber2 = 0;
		//変数iを0から始め1ずつ増やし、要素数まで繰り返す
		for(int i = 0; i < arrayNumber.length; i++) {
			//sumNumber1に0を代入する
			sumNumber1 = 0;
			//変数jを0から始め1ずつ増やし、要素数まで繰り返す
			for(int j = 0; j < arrayNumber[i].length; j++) {
				//allPeopleをインクリメントする
				allPeople++;
				//sumNumber1にarrayNumber[i][j]を加える
				sumNumber1 += arrayNumber[i][j];
				//sumNumber2にarrayNumber[i][j]を加える
				sumNumber2 += arrayNumber[i][j];
			}

			System.out.printf("%d 組 |		%d		%.1f\n",(i + 1), sumNumber1, (double)sumNumber1 / arrayNumber[i].length);
		}
		//""の文字を表示して改行する
		System.out.println("-----+-------------------");
		//""の文字を表示する
		System.out.printf("  計 |		%d		%.1f\n",sumNumber2, (double)sumNumber2 / allPeople);

	}

}
