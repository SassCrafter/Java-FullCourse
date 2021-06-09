import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int rows;
		int cols;
		String symbol = "";
		
		
		System.out.println("Enter number of rows: ");
		rows = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter number of cols: ");
		cols = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter character to use: ");
		symbol = scanner.nextLine();
		
		scanner.close();
		
		
		for (int i = 0; i < rows; i++) {
			System.out.println();
			for (int j = 0; j < cols; j++) {
				System.out.print(symbol);
			}
		}
	}

}
