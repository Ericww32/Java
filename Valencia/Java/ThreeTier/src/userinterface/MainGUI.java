package userinterface;
 
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import businesslayer.AppData;
import businesslayer.Person;

public class MainGUI extends JFrame {

	public static void main(String[] args) {

		JFrame myMainFrame = new MainGUI();

		myMainFrame.setTitle("Hey I'm the Title");
		myMainFrame.setSize(400, 300);
		myMainFrame.setLocation(100, 100);
		myMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myMainFrame.setVisible(true);

		JButton myButton = new JButton("Click Here");

		myMainFrame.setLayout(new FlowLayout());
		myMainFrame.add(myButton);

		MyButtonHandler mbh = new MyButtonHandler();
		myButton.addActionListener(mbh);

		JButton otherButton = new JButton("Other Button");
		myMainFrame.add(otherButton);

		otherButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("I hear the other button!!!!!");
				
				// maybe it's time to add to the application's data
				
				AppData.getAppData().addPerson( new Person("Bob") );
				
				
			}

		});

	}

	static class MyButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("I hear the button!");
			System.out.println(e);
		}

	}

}
