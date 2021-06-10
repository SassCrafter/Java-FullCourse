
public class PrintF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printf() a method to control, format, display text to console
//		two arguments = format string, (object, variable, value)
//		% [flags] [precision] [width] [conversion character]
		
//		System.out.printf("This is %d a format string", 123); // %d to just display a value;
		
		
		boolean myBool = true;
		int myInt = 50;
		char myChar = '@';
		String myString = "Bro";
		double myDouble = 1000;
		
		
//		System.out.printf("%b\n", myBool);
//		System.out.printf("%c\n", myChar);
//		System.out.printf("%s\n", myString);
//		System.out.printf("%f\n", myDouble);
//		System.out.printf("%d\n", myInt);
		
	    // [Width]
		// minimum number of characters to be written as output;
//		System.out.printf("%10s", myString);
//		System.out.printf("%-10s", myString); // All space comes after the string
		
		
		// [Precision]
		// sets number of digits of precision when outputting an floating point number;
		System.out.printf("%.2f", myDouble);
	}

}
