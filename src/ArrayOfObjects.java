import java.util.Arrays;

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Food meat = new Food("meat");
		Food apple = new Food("apple");
		Food fish = new Food("fish");
	
		Food[] fridge = {meat, apple, fish};
		
//		Food[] fridge = new Food[3];
//		fridge[0] = meat;
//		fridge[1] = apple;
//		fridge[2] = fish;
		
		System.out.println(Arrays.deepToString(fridge));
	}

}
