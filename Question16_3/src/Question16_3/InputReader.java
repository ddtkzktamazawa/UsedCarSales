package Question16_3;
import java.util.Scanner;

/**
 * クラス名         : InputReader
 * 概要				: Scannerの例外を検知し、安全な入力を行うためのクラス
 * @author 			: 玉澤 一輝
 * 作成日			: 2026.05.18
 */
public class InputReader {

	/**
	 * 関数名           : readDouble
	 * メソッドの説明 	: キーボードから実数を1つ読み込む。文字が入力された場合は
	 * 					  Scannerのエラーをキャッチして自作例外を投げ直す。
	 * @param   		: scanner(利用するScannerオブジェクト)、label(画面に表示する文言)
	 * @return 			: 入力された実数
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.18
	 */
	public double readDouble(Scanner scanner, String label) throws InvalidInputException {
		//labelの表示をする
		System.out.print(label);
		//tryブロックの実行
		try {
			//入力されたものを返却する
			return scanner.nextDouble();
			//捕捉するException型と与える仮引数eの宣言
		} catch (Exception e) {
			//Scannerの入力に残った不正な文字列を読み飛ばして消去する
			scanner.next(); 
			//例外が発生したら、"エラー：数値以外の値が入力されました。再入力してください。"を表示して呼び出し元へ投げる
			throw new InvalidInputException("エラー：数値以外の値が入力されました。再入力してください。");
		}
	}
}