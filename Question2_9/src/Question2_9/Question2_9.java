package Question2_9;
import java.util.Random;
public class Question2_9 {

	public static void main(String[] args) {
Random rand = new Random();
		
		double lucky1 = rand.nextDouble();
		
		System.out.println(lucky1);
		
		double lucky2 = rand.nextDouble(10);
		
		System.out.println(lucky2);
		
		double lucky3 = rand.nextDouble(2);
		
		System.out.println(lucky3-1);

	}

}
