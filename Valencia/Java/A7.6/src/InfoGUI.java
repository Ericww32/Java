import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InfoGUI {

	private JFrame frame;
	private JTextField getName;
	private JTextField getEmail;
	private JTextField getPhone;
	private ArrayList<Person> infoList = new ArrayList<Person>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoGUI window = new InfoGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InfoGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton infoButton = new JButton("Enter your info");
		infoButton.setBounds(127, 6, 137, 29);
		frame.getContentPane().add(infoButton);

		infoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JLabel lblName = new JLabel("Name: ");
				lblName.setBounds(43, 46, 44, 16);
				frame.getContentPane().add(lblName);

				JLabel lblEmail = new JLabel("email: ");
				lblEmail.setBounds(43, 98, 42, 16);
				frame.getContentPane().add(lblEmail);

				JLabel lblPhone = new JLabel("Phone: ");
				lblPhone.setBounds(43, 152, 46, 16);
				frame.getContentPane().add(lblPhone);

				getName = new JTextField();
				getName.setBounds(96, 47, 134, 28);
				frame.getContentPane().add(getName);
				getName.setColumns(10);

				getEmail = new JTextField();
				getEmail.setBounds(97, 98, 134, 28);
				frame.getContentPane().add(getEmail);
				getEmail.setColumns(10);

				getPhone = new JTextField();
				getPhone.setBounds(96, 157, 134, 28);
				frame.getContentPane().add(getPhone);
				getPhone.setColumns(10);

				JButton add = new JButton("add");
				add.setBounds(300, 243, 117, 29);
				frame.getContentPane().add(add);
				add.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						infoList.add(new Person(getName.getText(), 
								getEmail.getText(), getPhone.getText()));
						
						getName.setText("");
						getEmail.setText("");
						getPhone.setText("");
					}
				});

				JButton cancel = new JButton("cancel");
				cancel.setBounds(190, 243, 117, 29);
				frame.getContentPane().add(cancel);
				cancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.dispose();
					}
				});
				
				JButton display = new JButton("Display on console");
				display.setBounds(20, 243, 180, 29);
				frame.getContentPane().add(display);
				display.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int x = 1;
						for(Object i : infoList){
							System.out.println("Guy #" + x + ": " + i);
							x++;
						}
					}
				});

			}
		});

	}
}
