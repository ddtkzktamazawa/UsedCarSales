package Question5_3;
/*
 * クラス名:Question5_3
 * 概要    :論理型の変数にtrue、falseを代入してその値を表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.15
 */
public class Question5_3 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :論理型の変数にtrue、falseを代入してその値を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.15
	 */
	public static void main(String[] args) {
		//論理値にtrueを代入する
		boolean logicalValue = true;
		//"logicalValue=true+logicalValue"と論理値に代入された値を表示して改行
		System.out.println("logicalValue = true" + logicalValue );
		//論理値にfalseを代入する
		logicalValue = false;
		//"logicalValue=false+logicalValue"と論理値に代入された値を表示して改行
		System.out.print("logicalValue = false" + logicalValue);
	}
}