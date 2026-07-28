package Question3_16;
import java.util.Scanner;
public class Question3_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		
		System.out.print("整数c：");
		int c = stdIn.nextInt();
		
		if(a > b) {
			int t = a;
			a = b;
			b = t;
		}
		if(a > c) {
			int u = a;
			a = c;
			c = u;
		}
		if(b > c) {
			int v = b;
			b = c;
			c = v;
		}
		System.out.println("a≦b≦cとなるようにソートしました。");
		System.out.println("整数aは"+a+"です。");
		System.out.println("整数bは"+b+"です。");
		System.out.println("整数bは"+c+"です。");

	}

}
