package Question3_17;
import java.util.Random;
public class Question3_17 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int r = rand.nextInt(3);
		
		System.out.println(r);
		
		switch(r) {
		case 0:System.out.println("グー"); break;
		case 1:System.out.println("チョキ"); break;
		case 2:System.out.println("パー"); break;
		}

	}

}
