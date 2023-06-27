import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class mouseWorks  extends JFrame implements MouseMotionListener {
	private JFrame mainFrame;
	private JLabel clicked;
	private JLabel pressed;
	private JLabel released;
	private JPanel controlPanel;
	private JLabel mousePosition;

	public mouseWorks() {
		window();
	}

	public static void main(String[] args) {
		mouseWorks listener = new mouseWorks();
		listener.listenerMethod();
	}

	private void window() {
		mainFrame = new JFrame("Hover Mouse To Get Coordinates");
		mainFrame.setSize(500, 500);
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		clicked = new JLabel("", JLabel.CENTER);
		pressed = new JLabel("", JLabel.CENTER);
		released = new JLabel("", JLabel.CENTER);
		
		mousePosition = new JLabel("NO DATA", JLabel.CENTER);
		mainFrame.add(mousePosition);

		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(controlPanel);
		mainFrame.add(clicked);
		mainFrame.add(pressed);
		mainFrame.add(released);
		mainFrame.addMouseMotionListener(this);
		mainFrame.setVisible(true);
	}

	private void listenerMethod() {

		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		panel.setBorder(border);
		panel.setPreferredSize(new Dimension(400, 300));

		panel.setLayout(new FlowLayout());
		panel.addMouseListener(new CustomMouseListener());

		JLabel msglabel = new JLabel("click in the Aqua box.", JLabel.CENTER);
		panel.add(msglabel);

		msglabel.addMouseListener(new CustomMouseListener());
		panel.add(msglabel);

		controlPanel.add(panel);
		mainFrame.setVisible(true);
	}

	class CustomMouseListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			clicked.setText("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")");
		}

		public void mousePressed(MouseEvent e) {
			pressed.setText("Mouse Pressed: (" + e.getX() + ", " + e.getY() + ")");

		}

		public void mouseReleased(MouseEvent e) {
			released.setText("Mouse Released: (" + e.getX() + ", " + e.getY() + ")");

		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}
	}

	public void mouseMoved(MouseEvent e) {

		mousePosition.setText("X:" + e.getX() + " | Y:" + e.getY());
	}

	public void mouseDragged(MouseEvent e) {
	}
}