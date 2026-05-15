package Question15_7;

/**
 * クラス名          : sumOfArgs
 * 概要              : コマンドライン引数で受け取ったすべての数値を合計して表示する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.15
 */
public class sumOfArgs {
	/**
	 * 関数名			: main
	 * メソッドの説明	: コマンドライン引数として与えられたすべての数値を合計しその結果を表示する
	 * 					  拡張for文を用いて引数を取り出し、double型に変換して加算を行う
	 * @param         	: args(コマンドライン引数、合計対象となる数値の文字列配列)
	 * @return         	: なし
	 * @author         : 玉澤一輝
	 * 作成日           : 2026.05.15
	 */
	public static void main(String[] args) {
		//double型変数sumValueの初期化
		double sumValue = 0.0;
		//拡張for文（String型の配列）から要素を1つずつ取り出しiに格納する
		for (String stringCharacters : args) {
			//文字列stringCharactersをdouble型に変換し、合計変数sumに足していく
			sumValue += Double.parseDouble(stringCharacters);
		}
		//"合計は sumValue です。"と表示して改行する
		System.out.println("合計は" + sumValue + "です。");
	}
}
