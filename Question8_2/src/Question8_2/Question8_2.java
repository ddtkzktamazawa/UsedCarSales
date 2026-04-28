package Question8_2;

import java.util.Scanner;

public class Question8_2 {
	private static final Scanner STANDARD_INPUT = new Scanner(System.in);

	public static void main(String[] args) {
		// インスタンス生成（最大燃料 64.0L）
		Car porsche = new Car("ポルシェ", 1900, 1300, 4500, 0, 0, 64, 1234);
		Car benz = new Car("ベンツ", 1800, 1550, 4400, 50, 50, 50, 9876);

		porsche.printSpec();
		System.out.println();
		benz.printSpec();

		while (true) {
			System.out.println();
			System.out.println("【" + porsche.getName() + "の移動】");
			System.out.println("現在地("+ porsche.getX() + ", " + porsche.getY() + ")・残り燃料" + porsche.getFuel());

			System.out.print("移動しますか[0…No/1…Yes]：");
			if (STANDARD_INPUT.nextInt() == 0) break;

			System.out.print("x方向の移動距離：");
			double dx = STANDARD_INPUT.nextDouble();
			System.out.print("y方向の移動距離：");
			double dy = STANDARD_INPUT.nextDouble();

			if (!porsche.move(dx, dy)) {
				System.out.println("燃料が足りません。ドライブを終了します。");
				break;
			}
		}
	}
}