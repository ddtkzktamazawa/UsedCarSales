package Question13_1;
import java.util.Scanner;

/**
 * クラス名          : ShapeTester
 * 概要              : ユーザー入力に基づいて図形を生成し、表示する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026/05/11
 */
public class ShapeTester {
	/**
	 * メソッド名       : main
	 * メソッドの説明   : プログラムの実行、ユーザー入力を受け取り
	 * 					  指定された個数・種類の図形インスタンスを生成・管理し
	 * 					  それらの一括描画を行う
	 * パラメータ       : なし
	 * 返り値           : なし
	 */
	public static void main(String[] args) {
		//キーボードで入力した値を入れる変数を作る
		Scanner STANDARD_INPUT = new Scanner(System.in);
		//"図形は何個："と表示する
		System.out.print("図形は何個：");
		//変数numberValueに入力した値を代入する
		int numberValue = STANDARD_INPUT.nextInt();
		//抽象クラスShape型の配列を生成する
		Shape[] p = new Shape[numberValue];
		//変数iが1から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < numberValue; i++) {
			//"(i + 1)番の図形の種類（1…点／2…水平直線／3…垂直直線／4…長方形）："を表示する
			System.out.print((i + 1) + "番の図形の種類（1…点／2…水平直線／3…垂直直線／4…長方形）：");
			//変数typeNumberに入力した値を代入する
			int typeNumber = STANDARD_INPUT.nextInt();
			// 入力された番号に応じて生成する図形の種類を分岐させる
			switch (typeNumber) {
			//点の生成をする
			case 1: p[i] = new Point(); 
			//抜ける
			break;
			//水平直線の生成
			case 2:
				//垂直直線の生成
			case 3:
				//"長さ："と表示する
				System.out.print("長さ：");
				//変数lengthValueに入力した値を代入する
				int lengthValue = STANDARD_INPUT.nextInt();
				// 三項演算子を用いてタイプに応じた直線のインスタンスを生成する
				p[i] = (typeNumber == 2) ? new HorzLine(lengthValue) : new VirtLine(lengthValue);
				//抜ける
				break;
				//長方形の生成
			case 4:
				//"幅  ："と表示する
				System.out.print("幅  ：");
				//変数widthValueに入力した値を代入する
				int widthValue = STANDARD_INPUT.nextInt();
				//"高さ ："と表示する
				System.out.print("高さ：");
				//変数heigthValueに入力した値を代入する
				int heigthValue = STANDARD_INPUT.nextInt();
				//入力された幅と高さを用いてRectangle（長方形）のインスタンスを生成する
				p[i] = new Rectangle(widthValue, heigthValue);
				//抜ける
				break;
			}
		}
		//拡張for文を用いて配列内の図形を順番に取り出して描画を実行する
		for (Shape s : p) {
			//もし配列の要素がnullでない場合
			if (s != null) {
				//sが指す具体的なインスタンスのdraw/toStringが呼ばれる
				s.print();
				//改行する
				System.out.println();
			}
		}
	}
}