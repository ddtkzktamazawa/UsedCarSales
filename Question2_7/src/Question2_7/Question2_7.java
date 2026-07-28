package Question2_7;
import java.util.Random;
public class Question2_7 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int lucky1 = rand.nextInt(8);
		
		System.out.println(lucky1+1);
		System.out.println(lucky1-9);
		
		int lucky2 = rand.nextInt(90);
		
		System.out.println(lucky2+10);
		
	}

}
