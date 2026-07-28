package Question4_16;
import java.util.Scanner;
/*
 * クラス名:Question4_16
 * 概要    :読み込んだ個数だけ*を表示（5個表示ごとに改行する）
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.13
 */
public class Question4_16 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :読み込んだ個数だけ*を表示（5個表示ごとに改行する）
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.13
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//変数inputNumberの初期化
		int inputNumber = 0;
		//実行する
		do {
			//"何個*を表示しますか："と表示する
			System.out.print("何個*を表示しますか：");
			//inputNumberに数を読み込む
			inputNumber = standardInput.nextInt();
			//入力した数が0以下ならばdo文を再実行する
		}while(inputNumber <= 0);
		//変数iを1から始めて1つずつ増やしながら入力した数の回数ループ本体を繰り返す
		for(int i = 1; i <= inputNumber; i++) {
			//'*'を表示する
			System.out.print('*');
			//もしiを5で割った剰余が0の場合
			if(i % 5 == 0) {
				//改行する
				System.out.println();
			}
		}
	}
}
