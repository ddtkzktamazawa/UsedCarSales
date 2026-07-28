package Question4_10;
import java.util.Scanner;
/*
 * クラス名:Question4_10
 * 概要    :読み込んだ個数だけ*を表示
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.9
 */
public class Question4_10 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :読み込んだ個数だけ*を表示
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.9
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//"何個*を表示しますか："と表示する
		System.out.print("何個*表示しますか：");
		//selectNumberに入力した数を読み込み
		int selectNumber = standardInput.nextInt();
		//変数incrementValueを0から始めて1つずつ増やしながらselectNumber回ループ本体を繰り返す
		for(int incrementValue = 0; incrementValue < selectNumber; incrementValue++)
			//'*'を表示する
			System.out.print('*');
		//もしnumberOfが0以下の場合
		if(selectNumber <= 0) {
			//""を表示する
			System.out.print("");
			//その他の場合
		}else {
			//""を表示して改行する
			System.out.println("");
		}

	}

}
