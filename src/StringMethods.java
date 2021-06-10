
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "         Dima             ";
		
//		boolean isNameEquals = name.equalsIgnoreCase("dima"); // Case insensetive returns boolean;
//		int nameLength = name.length();
//		char nameChar = name.charAt(2);
//		int result = name.indexOf("d"); // return -1 if not found;
//		boolean result = name.isEmpty();
//		String result = name.toUpperCase();
//		String result = name.trim();
		String result = name.replace('i', 'o');
		
		
		System.out.println(result);
	}

}
