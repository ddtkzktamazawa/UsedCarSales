package Question15_2;
import java.util.Scanner;
/**
 * クラス名     : characterEncoding
 * 概要			: 入力した文字列を読み込んで文字コードを表示する
 * @author 		: 玉澤 一輝
 * 作成日		: 2026.05.14
 */
public class characterEncoding {

	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner STANDARD_INPUT = new Scanner(System.in);
		//"文字列s："と表示する
		System.out.print("文字列s：");
		//変数inputCharacterに入力した値を代入する
		String inputCharacter = STANDARD_INPUT.next();
		//変数iが0から始めて1ずつ増やしていき要素の数まで繰り返す
		for(int i = 0; i < inputCharacter.length(); i++) {
			//指定した位置の文字を取り出す
			char specifiedCharacter = inputCharacter.charAt(i);
			//文字をint型に変換して文字コードを取得する
			int characterCode = (int) specifiedCharacter;
			//「s[i] = 文字 (文字コード)」の形式で表示する
			System.out.printf("s[%d]=%c(%04X)\n",i,specifiedCharacter,characterCode,characterCode);
		}
	}
}
