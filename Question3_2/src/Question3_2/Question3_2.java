package Question3_2;
import java.util.Scanner;
public class Question3_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A：");
		int n = stdIn.nextInt();
		
		System.out.print("整数B：");
		int m = stdIn.nextInt();
		
		if(m == 0)
			System.out.println("約分できません。");
		else if(n%m<=0)
			System.out.println("BはAの約数です。");
		else
			System.out.println("BはAの約数ではありません。");
	

	}

}
