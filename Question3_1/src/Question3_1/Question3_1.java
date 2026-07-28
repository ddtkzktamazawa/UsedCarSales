package Question3_1;
import java.util.Scanner;
public class Question3_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int n = stdIn.nextInt();
		
		if(n > -1)
			System.out.println("その絶対値は"+n+"です。");
		else
			System.out.println("その絶対値は"+(-n)+"です。");

	}

}
