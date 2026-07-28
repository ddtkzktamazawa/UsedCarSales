package Question3_7;
import java.util.Scanner;
public class Question3_7 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int n = stdIn.nextInt();
		
		if(n > 0)
			if(n % 3 == 0)
				System.out.println("その値は3の倍数です。");
			else if(n % 3 == 1)
				System.out.println("その値を3で割った余りは1です。");
			else
				System.out.println("その値を3で割った余りは2です。");
		else
			System.out.println("正ではない値が入力されました。");

	}

}
