package Question3_9;
import java.util.Scanner;
public class Question3_9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a："); int a = stdIn.nextInt();
		System.out.print("整数b："); int b = stdIn.nextInt();
		
		int max;
		if(a>b)
			max = a;
		else
			max = b;
		
		System.out.println("大きいほうの値は"+max+"です。");

	}

}
