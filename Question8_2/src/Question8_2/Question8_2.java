package Question8_2;
import java.util.Scanner;
/*
 * クラス名          : Question8_2
 * 概要              : Carクラスのインスタンスを生成しユーザー入力に応じて
 * 					   車の移動シミュレーションを行う
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.04.28
 */
public class Question8_2 {
	//キーボードで入力した値を入れる変数を作る（プログラム全体で使用し外部から書き換えられない）
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);
	/**
	 * 関数名           : main
	 * メソッドの説明   : Carクラスのインスタンスを生成しユーザーからの
	 * 					　移動距離入力に基づいて移動シミュレーションを繰り返す
	 * 					　燃料不足時はメッセージを表示し、プログラムを終了する。
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.04.28
	 */
	public static void main(String[] args) {
		//変数porscheCarに入力したデータを読み込む
		Car porscheCar = new Car("ポルシェ", 1900, 1300, 4500, 0, 0, 64, 1234);
		//変数benzCarに入力したデータを読み込む
		Car benzCar = new Car("ベンツ", 1800, 1550, 4400, 50, 50, 50, 9876);
		//メソッドprintSpecを呼び出す
		porscheCar.printSpec();
		//改行する
		System.out.println();
		//メソッドprintSpecを呼び出す
		benzCar.printSpec();
		//繰り返す
		while (true) {
			//改行する
			System.out.println();
			//"ポルシェの移動"と表示して改行する
			System.out.println("【" + porscheCar.getName() + "の移動】");
			//"現在地(0.0, 0.0)・残り燃料64.0"と表示して改行する
			System.out.println("現在地("+ porscheCar.getX() + ", " + porscheCar.getY() + ")・残り燃料" + porscheCar.getFuel());
			//"移動しますか[0…No/1…Yes]："と表示して改行する
			System.out.print("移動しますか[0…No/1…Yes]：");
			//もし入力した数値が0の場合
			if (STANDARD_INPUT.nextInt() == 0) 
				//抜ける
				break;
			//"x方向の移動距離："と表示する
			System.out.print("x方向の移動距離：");
			//変数dxに数値を代入する
			double dx = STANDARD_INPUT.nextDouble();
			//"y方向の移動距離："と表示する
			System.out.print("y方向の移動距離：");
			//変数dyに数値を代入する
			double dy = STANDARD_INPUT.nextDouble();
			//指定された距離(dx, dy)の移動ができない場合
			if (!porscheCar.move(dx, dy)) {
				//"燃料が足りません。ドライブを終了します。"と表示するして改行する
				System.out.println("燃料が足りません。ドライブを終了します。");
				//抜ける
				break;
			}
		}
	}
}