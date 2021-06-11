import java.util.Random;

public class DiceRoller {
	
	DiceRoller() {
		Random r = new Random();
		int number = 0;
		roll(r, number);
	}
	
	void roll(Random rand, int n) {
		int result = rand.nextInt(6) + 1;
		System.out.println(result);
	}
}
