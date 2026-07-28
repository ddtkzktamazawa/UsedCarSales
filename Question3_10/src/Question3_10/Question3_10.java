package Question3_10;
import java.util.Scanner;
public class Question3_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a："); int a = stdIn.nextInt();
		System.out.print("整数b："); int b = stdIn.nextInt();
		
		int dif;
		if(a>b)
			dif = a-b;
		else
			dif = b-a;
		
		System.out.println("それらの差の値は"+dif+"です。");

	}

}
