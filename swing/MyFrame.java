package swing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame {

	public static void main(String[] args) {
		//public JFrame(String title)
		//create an object of JFrame with title
		JFrame frame = new JFrame();
		//setSize(width, height)
		//just......set size
		frame.setSize(800, 600);
		//setDefaultCloseOperation(int operation)
		
		//JFrame.DO_NOTHING_ON_CLOSE
		//just do nothing
		
		//JFrame.HIDE_ON_CLOSE
		//hide the frame after invoking any registered 
		//WindowListener objects
		
		//JFrame.DISPOSE_ON_CLOSE
		//hide and dispose
		
		//JFrame.EXIT_ON_CLOSE
		//exit the app
		
		//default: JFrame.HIDE_ON_CLOSE
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//methods
		
		//setTitle(String Title)
		//just...set the title for frame
		
		//add(Component componentAdd)
		//add a component to the JFrame
		
		//setLayout(LayoutManager manager)
		//sets the layout manager
		
		//setJMenuBar(JmenuBar menubar)
		//set the menu bar for the calling frame
		
		//dispose()
		//eliminates the calling frame and all its subcomponents
		
		
		JButton btn = new JButton("click me!");
		MyButtonListener mblistener = new MyButtonListener();
		btn.addActionListener(mblistener);
		
		//layout manager
		
		//FlowLayout
		//display component from left to right
		
		//BorderLayout
		//display component in five areas: north, south, 
		//east, west, and center	
		
		//GridLayout
		//each component stretched to fill its box in the grid
		
		/*
		 * frame.setLayout(new BorderLayout());
		 * frame.add(btn, BorderLayout.NORTH);
		 * it will add the button to the top border
		 */
		
		/* No Layout */
		//set position
		btn.setLocation(250, 100);
		//set size
		btn.setSize(200, 50);
		frame.add(btn);
		
		
		//JLabel
		//create a label and set its contain
		JLabel lb = new JLabel("Welcome~");
		//set position
		lb.setLocation(100,100);
		//set size
		lb.setSize(200, 50);
		frame.add(lb);
		
		//change background color
		frame.getContentPane().setBackground(Color.PINK);
		
		//set layout null
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
