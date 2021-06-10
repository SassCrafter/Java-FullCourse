import java.util.ArrayList;

public interface ArrayListss {
	public static void main(String[] args) {
//		ArrayList is a resizable array.
//		Elements can be added or removed after compilation phase.
//		Only stores referenced types
//		name.size() instead of name.length
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		System.out.println(food.toString());
		System.out.println(food.get(1));
		
		food.set(0, "sushi");
		food.clear();
		System.out.println(food.toString());
		
	}
}
