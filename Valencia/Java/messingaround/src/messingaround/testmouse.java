package messingaround;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class testmouse extends JFrame implements MouseMotionListener {

	private JLabel mousePosition;

	public static void main(String args[]) {
		new testmouse();
	}

	testmouse() {
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hover Mouse To Get Coordinates");

		mousePosition = new JLabel("NO DATA", JLabel.CENTER);
		add(mousePosition);
		

		addMouseMotionListener(this);
		setVisible(true);
	}

	public void mouseMoved(MouseEvent e) {
		
		mousePosition.setText("X:" + e.getX() + " | Y:" + e.getY() + e.getClickCount());
	}

	public void mouseDragged(MouseEvent e) {
	}
}
