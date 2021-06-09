import javax.swing.JOptionPane;

public class GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Enter your name: ");
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		
		JOptionPane.showMessageDialog(null, "Hello " + name + ", you are " + age + " years old.");
	}

}
