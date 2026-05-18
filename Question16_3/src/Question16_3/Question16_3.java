package Question16_3;
import java.util.Scanner;

/**
 * クラス名         : Question16_3
 * 概要				: 2つの数値を入力し、合計と平均を表示するクラス（3クラス構成版）
 * @author 			: 玉澤 一輝
 * 作成日			: 2026.05.18
 */
public class Question16_3 {

	/**
	 * 関数名           : main
	 * メソッドの説明 	: 入力クラスを利用して2つの数値を確実に取得し計算結果を表示する
	 * @param 	 		: なし
	 * @return 			: なし
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.18
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner STANDARD_INPUT = new Scanner(System.in);
		//final変数inputReaderに入力した値を代入する
		final InputReader inputReader = new InputReader();
		//double型変数firstInputの初期化
		double firstInput = 0.0;
		//double型変数secondInputの初期化
		double secondInput = 0.0;
		//繰り返す
		while (true) {
			//tryブロックの実行
			try {
				//入力クラスのメソッドを呼び出しユーザーが入力した正しい実数をfirstInputに代入する
				firstInput = inputReader.readDouble(STANDARD_INPUT, "xの値：");
				//抜ける
				break;
				//捕捉するInvalidInputException型と与える仮引数eの宣言
			} catch (InvalidInputException e) {
				//キャッチした例外インスタンスeからエラーメッセージを取得し画面に表示して改行する
				System.out.println(e.getMessage());
			}
		}
		//繰り返す
		while (true) {
			//tryブロックの実行
			try {
				//入力クラスのメソッドを呼び出しユーザーが入力した正しい実数をsecondInputに代入する
				secondInput = inputReader.readDouble(STANDARD_INPUT, "yの値：");
				//抜ける
				break;
				//捕捉するInvalidInputException型と与える仮引数eの宣言
			} catch (InvalidInputException e) {
				//キャッチした例外インスタンスeからエラーメッセージを取得し画面に表示して改行する
				System.out.println(e.getMessage());
			}
		}
		//合計の計算と表示をして改行する
		System.out.println("合計は" + (firstInput + secondInput) + "です。");
		//平均の計算と表示をして改行する
		System.out.println("平均は" + (firstInput + secondInput) / 2 + "です。");
	}
}