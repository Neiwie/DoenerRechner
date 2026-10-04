import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class DoenerRechner {
	Scanner scan = new Scanner(System.in);
	static double jahr = 8.5;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Döner-Währungsrechner");
		frame.setSize(420, 600);
		frame.setLocation(100, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		
		
		JLabel text = new JLabel("Betrag der in Döner umgerechnet werden soll:");
		text.setBounds(75, 150, 300, 30);
		JLabel text2 = new JLabel("(In Euro)");
		text2.setBounds(175, 165, 300, 30);
		
		JTextField textField = new JTextField();
		textField.setBounds(100, 200, 200, 30);
		
		JButton button = new JButton("Umrechnen");
		button.setBounds(50, 250, 300, 30);
		
		JTextField textField2 = new JTextField();
		textField2.setBounds(100, 300, 200, 30);
		textField2.setText("Ergebnis in Döner:");
		
		
		
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textFromTextfield = textField.getText();
				double zahl = Double.parseDouble(textFromTextfield);
				double ergebnis = zahl / jahr;
				
				textField2.setText(ergebnis +" Döner");
			}
			
		});
		
		
		
			
		frame.add(text);
		frame.add(text2);
		frame.add(textField);
		frame.add(textField2);
		frame.add(button);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		
		
	}

}
