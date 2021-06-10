
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Bro";
		int age = 21;
		hello(name, age);
		System.out.println(add(1,2));
	}
	
	static void hello(String name, int age) {
		System.out.println("Hello " + name + ", you're " + age + " years old");
	}
	
	static int add(int num1, int num2) {
		return num1 + num2;
	}

}
