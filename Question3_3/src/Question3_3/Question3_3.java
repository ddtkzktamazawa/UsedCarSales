package Question3_3;
import java.util.Scanner;
public class Question3_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int n = stdIn.nextInt();
		
		if(n > 0)
			System.out.println("その数値は正です。");
		else if(n < 0)
			System.out.println("その数値は負です。");
		else if(n == 0)
			System.out.println("その値は0です。");
	}

}
