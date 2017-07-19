package swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelTest {
	public static void main(String[] args) {
		JFrame jframe = new JFrame("Panel Test");
		jframe.setSize(800, 600);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1 = new JButton("click me");
		JButton btn2 = new JButton("click me");
		
		//For panel
		//create a new panel
		JPanel panel = new JPanel();
		panel.setSize(200, 200);
		panel.setLayout(new GridLayout());
		panel.add(btn1);
		panel.add(btn2);
		
		
		jframe.setLayout(null);
		jframe.add(panel);
		
		jframe.setVisible(true);
		
		for(int i=0; i<300; ++i) {
			panel.setLocation(i, i);
			try{
				Thread.sleep(100);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
