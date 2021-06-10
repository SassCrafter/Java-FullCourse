import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] cars = {"Camaro", "BMV", "Tesla"};
//		System.out.println(cars[0]);
		
//		String[] names = new String[2];
//		names[0] = "Dima";
//		names[1] = "Jake";
//		
//		System.out.println(Arrays.toString(names));
	
//		String[][] cars = new String[3][3];
//		
//		cars[0][0] = "Camaro";
//		cars[0][1] = "BMV";
//		cars[0][2] = "Audi";
//		cars[1][0] = "Chevrolet";
//		cars[1][1] = "Mustang";
//		cars[1][2] = "Tesla";
//		cars[2][0] = "Lambo";
//		cars[2][1] = "Ferrari";
//		cars[2][2] = "F-150";
//		
//		System.out.println(Arrays.deepToString(cars));
		
		
		String[][] cars = {
				{"Camaro", "BMV", "Audi"},
				{"Chevrolet", "Mustang", "Tesla"},
				{"Lambo", "Ferrari", "F-150"}
		};
		
		
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println();
			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
			}
		}
	}

}
