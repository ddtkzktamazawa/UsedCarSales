package Question4_6_2;
import java.util.Scanner;
/*
 * クラス名:Question4_6_2
 * 概要    :読み込んだ個数だけ*を表示
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.8
 */
public class Question4_6_2 {
	 /**
     * 関数名           :main
     * メソッドの説明   :読み込んだ個数だけ*を表示
     * パラメータの説明 :なし
     * 返り値           :なし
     * 作成者           :玉澤一輝
     * 作成日           :2026.4.8
     */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//"何個*を表示しますか："と表示する
		System.out.print("何個*を表示しますか：");
		//numberOfに入力した数を読み込み
		int numberOf = standardInput.nextInt();
		//incrementValueに0を代入する
		int incrementValue = 1;
		//incrementValueがnumberOf未満であれば
		while(incrementValue <= numberOf) {
			//'*'を表示する
			System.out.print('*');
			//incrementValueをインクリメントする
			incrementValue++;
		}
		//もしnumberOfが0以下の場合
		if(numberOf <= 0) {
			//""を表示する
			System.out.print("");
		//その他の場合
		}else {
			//""を表示して改行する
			System.out.println("");
		}
		
	}

}
