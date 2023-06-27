import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainSwing extends JFrame {

	public static void main(String[] args) {

		JFrame myMain = new MainSwing();
		myMain.setTitle("Hey I am the newest Title!!");
		myMain.setSize(400, 300);
		myMain.setLocation(100, 100);
		myMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myMain.setVisible(true);

		JButton myButton = new JButton("Click here!");
		myMain.setLayout(new FlowLayout());
		myMain.add(myButton);

		MyButtonHandler mbh = new MyButtonHandler();
		myButton.addActionListener(mbh);

		JButton otherButton = new JButton("other Button");
		myMain.add(otherButton);

		otherButton.addActionListener(

				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("I here the other button!!!");
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