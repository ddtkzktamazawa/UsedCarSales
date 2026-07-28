package Question3_13;
import java.util.Scanner;
public class Question3_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a："); int a = stdIn.nextInt();
		System.out.print("整数b："); int b = stdIn.nextInt();
		System.out.print("整数c："); int c = stdIn.nextInt();
		
		int cen;
		
		if(a<b && a<c)
			if(b<c) cen = b;
			else cen = c;
		else if(b<a && b<c)
			if(a<c) cen = a;
			else cen = c;
		else
			if(a<b) cen =a;
			else cen = b;
		System.out.println("中央値は"+ cen +"です。");
	}

}
