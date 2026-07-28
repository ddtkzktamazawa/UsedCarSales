package Question4_7;
import java.util.Scanner;
/*
 * クラス名:Question4_7
 * 概要    :読み込んだ個数だけ記号文字を表示（*と+を交互に表示）
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.8
 */
public class Question4_7 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :読み込んだ個数だけ記号文字を表示（*と+を交互に表示）
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.8
	 */
	public static void main(String[] args) {
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//"何個表示しますか"と表示する
		System.out.print("何個表示しますか：");
		//inputNumberに入力した数を読み込み
		int inputNumber = standardInput.nextInt();
		//incrementValueに0を代入する
		int incrementValue = 0;
		//loopCountにinputNumber/2を代入する(*と+を1つのまとまりとして見る)
		int loopCount = inputNumber / 2;
		//もしinputNumberを2で割った剰余が1の場合
		if(inputNumber % 2 == 1) {
			//"*"を表示する
			System.out.print('*');
		}
		//incrementValueがloopCount未満であれば
		while(incrementValue < loopCount) {
			//もしinputNumberを2で割った剰余が0の場合
			if(inputNumber % 2 == 0) {
				//"*+"を表示する
				System.out.print("*+");
				//その他の場合
			}else {
				//"+*"を表示する
				System.out.print("+*");
				//incrementValueをインクリメントする
			}
			incrementValue++;
		}
	
	}

}
