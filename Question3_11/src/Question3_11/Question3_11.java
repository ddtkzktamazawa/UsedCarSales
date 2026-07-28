package Question3_11;

import java.util.Scanner;

public class Question3_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A："); int a = stdIn.nextInt();
		System.out.print("整数B："); int b = stdIn.nextInt();
		
		int dif;
		if(a>b)
			if(a-b <= 10)
				System.out.println("それらの差は10以下です。");
			else
				System.out.println("それらの差は11以上です。");
		else
			if(b-a <= 10)
				System.out.println("それらの差は10以下です。");
			else
				System.out.println("それらの差は11以上です。");
		

	}

}
