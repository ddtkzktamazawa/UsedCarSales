package Question15_3;
import java.util.Scanner;
/**
 * クラス名     : SearchString
 * 概要			: 文字探索のプログラムを書き換えて、一致する部分がある場合にその部分が
 * 				  上下でそろうように表示する
 * @author 		: 玉澤 一輝
 * 作成日		: 2026.05.14
 */
public class SearchString {
	/**
	 * 関数名           : main
	 * メソッドの説明   : 文字探索のプログラムを書き換えて、一致する部分がある場合にその部分が
			  			  上下でそろうように表示する
	 * @param	    	: なし
	 * @return         	: なし
	 * @author         	: 玉澤 一輝
	 * 作成日           : 2026.05.14
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
		final Scanner STANDARD_INPUT = new Scanner(System.in);
		//"文字列s1："と表示する
		System.out.print("文字列s1：");
		//変数inputCharacter1に入力した値を代入する
		String inputCharacter1 = STANDARD_INPUT.next();
		//"文字列s2："と表示する
		System.out.print("文字列s2：");
		//変数inputCharacter2に入力した値を代入する
		String inputCharacter2 = STANDARD_INPUT.next();

		int indexNumber = inputCharacter1.indexOf(inputCharacter2);
		//もしindexNumberが-1と一致する場合
		if(indexNumber == -1) {
			//"s1中にs2は含まれません。"と表示して改行する
			System.out.println("s1中にs2は含まれません。");
			//その他の場合
		}else {
			//"s1：
			System.out.println("s1：" + inputCharacter1);
			//"s2："と表示する
			System.out.print("s2：");
			//変数iが1から始めて1ずつ増やしていきindexNumber+1まで繰り返す
			for(int i = 1; i < indexNumber + 1; i++) {
				//スペースを表示する
				System.out.print(" ");
			}
			//"inputCharacter2"と表示して改行する
			System.out.println(inputCharacter2);
		}

	}
}
