import java.util.Scanner;

public class MathClass {
	public static void main (String[] args) {
//		double x = 3.14;
//		double y = 10;
//		
//		double z = Math.max(x, y);
//		System.out.println(Math.abs(a));
//		System.out.println(Math.sqrt(25));
//		
//		System.out.println(z);
		
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x * x) + (y * y));
		
		System.out.println(z);
		
		scanner.close();
		
	}
}
