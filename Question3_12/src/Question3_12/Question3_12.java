package Question3_12;
import java.util.Scanner;
public class Question3_12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a："); int a = stdIn.nextInt();
		System.out.print("整数b："); int b = stdIn.nextInt();
		System.out.print("整数c："); int c = stdIn.nextInt();
		
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		
		System.out.println("最小値は"+ min +"です。");

	}

}
