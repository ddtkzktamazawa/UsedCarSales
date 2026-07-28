package Question3_15;

import java.util.Scanner;

public class Question3_15 {

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
			System.out.println("a≧bとなるようにソートしました。");
			System.out.println("整数aは"+b+"です。");
			System.out.println("整数bは"+a+"です。");
			

	}

}
