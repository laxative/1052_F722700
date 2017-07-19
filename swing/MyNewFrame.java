package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyNewFrame extends JFrame implements ActionListener{
	public static void main(String[] args) {
		MyNewFrame frame = new MyNewFrame();
		frame.setVisible(true);
	}
	
	public MyNewFrame() {
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		//for JTextField
		//JTextField(NUMBER_OF_CHAR)
		//at least NUMBER_OF_CHAR char can be visible
		JTextField input = new JTextField(50);
		
		input.setLocation(100, 100);
		input.setSize(input.getPreferredSize());
		//setText use to display new text string in a text field
		input.setText("<input your name here>");
		
		//can use getText() to get the text in text field	
		
		add(input);
		
		
		//for JTextArea
		//JTextArea(NUMBER_OF_LINE, NUMBER_OF_CHAR)
		//NUMBER_OF_LINE set the minimum number of lines
		//NUMBER_OF_CHAR set the minimum number of char per lines
		//are guaranteed to be visible
		JTextArea line = new JTextArea(10, 50);
		line.setLocation(100, 200);
		line.setSize(line.getPreferredSize());
		//setLineWrap(boolean)
		//if argument is true, any additional char at the end of
		//line will appear on the following line of the text area
		
		//if the argument is false, the extra char would be invisible
		line.setLineWrap(true);
		line.setText("<input your message here>");
		add(line);
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
}
