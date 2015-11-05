import javax.swing.JOptionPane;

public class ShowInputMessageDialog {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("What is your name? ");
	    String message = String.format("Your name is %s.", name);
		
		JOptionPane.showMessageDialog(null, message);

	}

}
