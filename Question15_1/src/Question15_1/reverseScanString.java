package Question15_1;
import java.util.Scanner;
/**
 * クラス名     : reverseScanString
 * 概要			: 入力した文字列を読み込んで逆順に表示する
 * @author 		: 玉澤 一輝
 * 作成日		: 2026.05.14
 */
public class reverseScanString {
	/**
	 * 関数名           : main
	 * メソッドの説明   : 入力した文字列を読み込みその各文字をインデックスとともに末尾から逆順に表示する
	 * @param	    	: なし
	 * @return         	: なし
	 * @author         	: 玉澤 一輝
	 * 作成日           : 2026.05.14
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner STANDARD_INPUT = new Scanner(System.in);
		//"文字列s："と表示する
		System.out.print("文字列s：");
		//変数inputCharacterに入力した値を代入する
		String inputCharacter = STANDARD_INPUT.next();
		//変数iが文字数から始めて1ずつ減らしていき0まで繰り返す
		for(int i = inputCharacter.length() - 1; i >= 0; i--) {
			//"s[i]=inputCharacter.charAt(i)（入力した文字列の逆順）を表示して改行する
			System.out.println("s[" + i + "]=" + inputCharacter.charAt(i));
		}
	}
}
