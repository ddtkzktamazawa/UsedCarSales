package Question4_23;
import java.util.Scanner;
/*
 * クラス名:Question4_23
 * 概要    :読み込んだ数の段の数字ピラミッドを表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.14
 */
public class Question4_23 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :読み込んだ数の段の数字ピラミッドを表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.14
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//変数stageNumberの初期化
		int stageNumber = 0;
		//実行する
		do {
			//"整数値："と表示する
			System.out.print("整数値：");
			//stageNumberに数を読み込む
			stageNumber = standardInput.nextInt();
			//入力した数が0以下ならばdo文を再実行する
		}while(stageNumber <= 0);
		//変数iを1から始めて1つずつ増やしながら入力した数の回数ループ本体を繰り返す
		for(int i = 1; i <= stageNumber; i++) {
			/*半角スペースを1から始めて半角スペースを1ずつ増やしていき
			 * （ピラミッドの段数-i）回繰り返す
			 */
			for(int blankSpace = 1; blankSpace <= stageNumber -i; blankSpace++) {
				//" "と表示する
				System.out.print(" ");
				/*変数jを1から始めて変数jを1ずつ増やしていき
				変数jが段数に2をかけて-1した値より大きくなるまで繰り返す
				 */
			}
			for(int j = 1; j <= 2 * i - 1; j++) {
				//"（i/10）の余剰"を表示する
				System.out.print(i % 10);
			}
			//改行する
			System.out.println();
		}
	}
}