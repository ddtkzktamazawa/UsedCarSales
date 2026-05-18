package Question15_6;
/**
 * クラス名     : circleCircumferenceAndArea
 * 概要			: コマンドライン引数で与えられた半径を持つ円周の長さと面積を求めて表示する
 * @author 		: 玉澤 一輝
 * 作成日		: 2026.05.15
 */
public class circleCircumferenceAndArea {
	/**
	 * 関数名			: main
	 * メソッドの説明	: コマンドライン引数で与えられた半径を持つ円周の長さと面積を計算して表示する
	 * @param       	: args(コマンドライン引数、円の半径を文字列として受け取る）
	 * @return         	: なし
	 * @author         : 玉澤一輝
	 * 作成日           : 2026.05.15
	 */
	public static void main(String[] args) {
		//もしargs.length（要素数）が0と一致する場合
		if (args.length == 0) {
			//"エラー：円の半径をコマンドライン引数に指定してください。"と表示して改行する
			System.out.println("エラー：円の半径をコマンドライン引数に指定してください。");
			//返却する
			return;
		}
		//double型変数PIValue（円周率）をfinal変数で定義する
		final double PIValue = 3.1416;
		//double型変数inputValueの初期化
		double inputValue = 0.0;
		//変数iが0から始めて1ずつ増やしていきargs.lengthまで繰り返す
		for(int i = 0; i < args.length; i++)
			//変数inputValueにコマンドライン引数として受け取った文字列をdouble型に変換して代入する
			inputValue = Double.parseDouble(args[i]);
		//"円の円周の長さは inputValue * 2 * PIValueです。"と表示して改行する
		System.out.println("円の円周の長さは " + inputValue * 2 * PIValue + " です。");
		//"円の面積は inputValue * inputValue * PIValue です。"と表示して改行する
		System.out.println("円の面積は " + inputValue * inputValue * PIValue + " です。");
	}
}
