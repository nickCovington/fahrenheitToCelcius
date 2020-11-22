import javax.swing.JFrame;

public class Client {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Celcius Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FahrenheitPanel panel = new FahrenheitPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}

}
