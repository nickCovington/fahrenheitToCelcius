import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FahrenheitPanel extends JPanel{
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fahrenheit;
	
	public FahrenheitPanel() {
		
		inputLabel = new JLabel("Enter Degrees Fahrenheit:");
		outputLabel = new JLabel("Degrees Celcius: ");
		resultLabel = new JLabel("---");
		
		fahrenheit = new JTextField(5);
		fahrenheit.addActionListener(new TempListener());
		
		add(inputLabel);
		add(fahrenheit);
		add(outputLabel);
		add(resultLabel);
		
		setPreferredSize(new Dimension(300, 100));
		setBackground(Color.LIGHT_GRAY);
	}
	
	private class TempListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			int fahrenheitTemp, celciusTemp;
			
			String text = fahrenheit.getText();
			
			fahrenheitTemp = Integer.parseInt(text);
			celciusTemp = (fahrenheitTemp - 32) * 5/9;
			
			resultLabel.setText(Integer.toString(celciusTemp));
		}
	}

}
