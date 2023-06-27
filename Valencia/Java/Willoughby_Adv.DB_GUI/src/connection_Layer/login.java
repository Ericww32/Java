package connection_Layer;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.Font;

public class login {

	private JFrame frame;
	private JTextField txtUserName;
	private JTextField txtConnectionAddressDetails;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Best DB Ever LOGIN SCREEN!");
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtUserName = new JTextField();
		txtUserName.setBackground(Color.BLACK);
		txtUserName.setForeground(Color.LIGHT_GRAY);
		txtUserName.setText("User Name");
		txtUserName.setBounds(143, 33, 134, 28);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		txtConnectionAddressDetails = new JTextField();
		txtConnectionAddressDetails.setForeground(Color.LIGHT_GRAY);
		txtConnectionAddressDetails.setBackground(Color.BLACK);
		txtConnectionAddressDetails.setText("Connection Address Details");
		txtConnectionAddressDetails.setBounds(99, 143, 239, 28);
		frame.getContentPane().add(txtConnectionAddressDetails);
		txtConnectionAddressDetails.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setForeground(Color.LIGHT_GRAY);
		pwdPassword.setBackground(Color.BLACK);
		pwdPassword.setText("Password");
		pwdPassword.setBounds(143, 87, 134, 28);
		frame.getContentPane().add(pwdPassword);
		
		Button btnConnect = new Button("Connect");
		btnConnect.setActionCommand("btnConnect");
		btnConnect.setBackground(Color.DARK_GRAY);
		btnConnect.setForeground(Color.LIGHT_GRAY);
		btnConnect.setBounds(305, 225, 117, 29);
		frame.getContentPane().add(btnConnect);
		
		JLabel lblOracle = new JLabel("Ex:      thin:@localhost:1521:xe");
		lblOracle.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblOracle.setForeground(Color.WHITE);
		lblOracle.setBounds(109, 183, 213, 16);
		frame.getContentPane().add(lblOracle);
	}
}
