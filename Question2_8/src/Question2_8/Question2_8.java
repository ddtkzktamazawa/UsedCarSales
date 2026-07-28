package Question2_8;
import java.util.Random;
import java.util.Scanner;
public class Question2_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int a = stdIn.nextInt();
		
		Random rand = new Random();
		
		int lucky = rand.nextInt(11);
		
		System.out.println("その値の±5の乱数を生成しました。それは"+(a+lucky-6)+"です。");
	}

}
