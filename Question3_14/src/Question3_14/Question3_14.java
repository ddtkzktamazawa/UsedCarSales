package Question3_14;
import java.util.Scanner;
public class Question3_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		
		if(a > b) {
			int t = a;
			a = b;
			b = t;
		}
		if(b-a<1)
			System.out.println("二つの値は同じです。");
		else
			{
			System.out.println("小さいほうの値は"+a+"です。");
			System.out.println("大きいほうの値は"+b+"です。");
			}

	}

}
