package Question3_4;
import java.util.Scanner;
public class Question3_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("aの値：");
		int a = stdIn.nextInt();
		
		System.out.print("bの値：");
		int b = stdIn.nextInt();
		
		if(a > b)
			System.out.println("aのほうが大きいです。");
		else if(a < b)
			System.out.println("bのほうが大きいです。");
		else
			System.out.println("aとbは同じ値です。");

	}

}
