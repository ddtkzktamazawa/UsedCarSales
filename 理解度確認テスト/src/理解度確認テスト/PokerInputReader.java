package 理解度確認テスト;
import java.util.Scanner;
/**
 * クラス名     : PokerInputReader
 * 概要 		: ポーカーの交換・保持の選択入力を読み取るクラス
 * @author 		: 玉澤 一輝
 * 作成日 		: 2026.05.19
 */
public class PokerInputReader {
	/**
	 * 関数名           : readChoice
	 * メソッドの説明 	: ユーザーから交換または保持の入力を取得する
	 * 					  不正な文字や範囲外の数値はtry-catchを用いて再入力させる
	 * @param   		: scanner(利用するScannerオブジェクト)
	 * @return 			: 正しい選択値（0または1）
	 * @author			: 玉澤一輝
	 * 作成日 			: 2026.5.19
	 */
	public int readChoice(Scanner scanner) {
		//繰り返す
		while(true) {
			//"交換:1 保持:0 >"を表示する
			System.out.print("交換:1 保持:0 >");
			//tryブロックの実行
			try {
				//final変数choiceNumberに入力した値を代入する
				final int choiceNumber = scanner.nextInt();
				//もし入力した値が0または1の場合
				if(choiceNumber  == 0 || choiceNumber == 1) {
					//choiceNumberを返却する
					return choiceNumber;
				}
				//例外が発生したら、呼び出し元へ投げる
				throw new IllegalArgumentException();
				//捕捉するIllegalArgumentException型と与える仮引数eの宣言
			}catch(IllegalArgumentException e){
				//"エラー：0か1を入力してください。"を表示して改行する
				System.out.println("エラー：0か1を入力してください。");
				//捕捉するException型と与える仮引数eの宣言
			}catch(Exception e) {
				//"エラー：0か1を入力してください。"を表示して改行する
				System.out.println("エラー：0か1を入力してください。");
				//入力した値を代入する
				scanner.next();
			}
		}
	}
}
