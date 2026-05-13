package Question13_2;
import java.util.Scanner;

/**
 * クラス名          : ShapeTester
 * 概要              : 各図形クラスの動作を確認するためのテスト用クラス
 *                     直角二等辺三角形の4つの向きを生成し描画を確認する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.13
 */
public class ShapeTester2 {
	/**
	 * メソッド名       : main
	 * メソッドの説明   : プログラムの実行、ユーザーから三角形の個数、種類、長さを入力し
	 *                    各三角形の情報を表示・描画する
	 * パラメータ       : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.13
	 */
	public static void main(String[] args) {
		Scanner STANDARD_INPUT = new Scanner(System.in);
		//"直角二等辺三角形を表示します。"と表示して改行する
		System.out.println("直角二等辺三角形を表示します。");
		//"三角形の個数：："と表示する
		System.out.print("三角形の個数：");
		//変数inputNumberに入力した値を代入する
		int inputNumber = STANDARD_INPUT.nextInt();
		//抽象クラスShape2型の配列shapeArrayを生成する
		Shape2[] shapeArray = new Shape2[inputNumber];
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < inputNumber; i++) {
			//"(i + 1)番の三角形の種類（1…左下 / 2…左上 / 3…右下 / 4…右上）："を表示する
			System.out.print((i + 1) + "番の三角形の種類（1…左下 / 2…左上 / 3…右下 / 4…右上）：");
			int typeNumber = STANDARD_INPUT.nextInt();
			//"長さ："と表示する
			System.out.print("長さ：");
			//変数lengthValueに入力した値を代入する
			int lengthValue = STANDARD_INPUT.nextInt();
			//入力された番号に応じて生成する三角形の向きを分岐させる
			switch (typeNumber) {
			//入力された長さを用いて左下の二等辺三角形のインスタンスを生成する
			case 1: shapeArray[i] = new TriangleLB(lengthValue); 
			//抜ける
			break;
			//入力された長さを用いて左上の二等辺三角形のインスタンスを生成する
			case 2: shapeArray[i] = new TriangleLU(lengthValue); 
			//抜ける
			break;
			//入力された長さを用いて右下の二等辺三角形のインスタンスを生成する
			case 3: shapeArray[i] = new TriangleRB(lengthValue); 
			//抜ける
			break;
			//入力された長さを用いて右上の二等辺三角形のインスタンスを生成する
			case 4: shapeArray[i] = new TriangleRU(lengthValue); 
			//抜ける
			break;
			}
		}
		//"--- 描画結果 ---"を表示して改行する
		System.out.println("\n--- 描画結果 ---");
		//配列内の図形を順番に取り出して描画を実行する
		for (Shape2 s : shapeArray) {
			//もし配列の要素がnullでない場合
			if (s != null) {
				//toString()を呼び出しクラス名と長さを表示して改行する
				System.out.println(s.toString());
				//各クラスでオーバーライドした draw() を実行する
				s.draw();
				//改行する
				System.out.println();
			}
		}
	}
}