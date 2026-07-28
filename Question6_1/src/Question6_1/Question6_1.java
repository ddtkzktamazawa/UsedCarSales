package Question6_1;
/*
 * クラス名:Question6_1
 * 概要    :double型で要素数が5の配列を作り全要素の値を表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.16
 */
public class Question6_1 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :double型で要素数が5の配列を作り全要素の値を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.16
	 */
	public static void main(String[] args) {
		//double型を構成要素とする配列を作成する
		double[]someElement = new double[5];
		//someElement[0]に1.5を代入する
		someElement[0] = 1.5;
		//someElement[1]に3.5を代入する
		someElement[1] = 3.5;
		//someElement[2]に1.0を代入する
		someElement[2] = 1.0;
		//someElement[3]にsomeElement[1]の値の2倍の値を代入する
		someElement[3] = someElement[1] * 2;
		//someElement[4]に0.5;を代入する
		someElement[4] = 0.5;
		//全要素の値を表示する
		//"someElement[0] = 1.5"を表示して改行する
		System.out.println("someElement[" + 0 + "] = " + someElement[0]);
		//"someElement[1] = 3.5"を表示して改行する
		System.out.println("someElement[" + 1 + "] = " + someElement[1]);
		//"someElement[2] = 1.0"を表示して改行する
		System.out.println("someElement[" + 2 + "] = " + someElement[2]);
		//"someElement[3] = （someElement[1]を2倍した値）"を表示して改行する
		System.out.println("someElement[" + 3 + "] = " + someElement[3]);
		//"someElement[4] = 0.5"を表示して改行する
		System.out.println("someElement[" + 4 + "] = " + someElement[4]);
	}
}
