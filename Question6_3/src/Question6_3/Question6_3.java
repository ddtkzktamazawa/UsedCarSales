package Question6_3;
/*
 * クラス名:Question6_3
 * 概要    :int型で要素数が5の配列を作り、先頭から順に1.1から5.5を代入して表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.16
 */
public class Question6_3 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :int型で要素数が5の配列を作り、先頭から順に1.1から5.5を代入して表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.16
	 */
	public static void main(String[] args) {
		//double型を構成要素とする配列を作成する
		double [] someElement = new double[5];
		//変数jの初期化
		int j = 0;
		//変数iを1.1から始めて1ずつ増やして値が5.5以上になるまで繰り返し、変数jを1ずつ増やす
		for(double i = 1.1; i <= 5.5; i += 1.1, j++){
			//変数someElement[j]にiの値を代入する
			someElement[j] = i ;
			//全要素の値を表示する
			System.out.println("someElement[" + j + "] = " + someElement[j]);
		}
	}
}
