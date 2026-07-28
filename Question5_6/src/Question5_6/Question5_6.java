package Question5_6;
/*
 * クラス名:Question5_6
 * 概要    :インクリメントするfloat型の変数の値とint型の変数の値を表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.16
 */
public class Question5_6 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :インクリメントするfloat型の変数の値とint型の変数の値を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.16
	 */
	public static void main(String[] args) {
		//()内の文字を表示して改行する
		System.out.println("  float       int   ");
		//()内の文字を表示して改行する
		System.out.println("--------------------");
		//変数jの初期化
		int j = 0;
		//変数iを0.0から1.0まで0.001ずつ増やしていく
		//変数jを0から1000まで1ずつ増やしていく
		for(float i = 0.0F; i <= 1.0F && j<= 1000; i += 0.001F, j++) {
			//小数点以下7桁の変数iと変数jを1000で割った値を表示する
			System.out.printf("%8.7f  %8.7f\n", i, (float)j / 1000.0);
		}
	}
}
