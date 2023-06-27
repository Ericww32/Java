package GUI_Layer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Processing_Layer.RaceBikes_proc;
//import Processing_Layer.Person;

/**
 * 
 * @author Eric Willoughby
 *
 */

public class User_Interface {

	private JFrame frmJusticeLeagueDatabase;
	private JTextField txtAge;
	private JTextField txtLastName;
	private JTextField txtFirstName;
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_Interface window = new User_Interface();
					window.frmJusticeLeagueDatabase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public User_Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJusticeLeagueDatabase = new JFrame();
		frmJusticeLeagueDatabase.getContentPane().setBackground(Color.DARK_GRAY);
		frmJusticeLeagueDatabase.setTitle("Justice League Database");
		frmJusticeLeagueDatabase.setBounds(100, 100, 600, 500);
		frmJusticeLeagueDatabase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJusticeLeagueDatabase.getContentPane().setLayout(null);
		
		JButton btnInsertPerson = new JButton("Insert Person");
		btnInsertPerson.setForeground(Color.BLACK);
		btnInsertPerson.setBackground(Color.DARK_GRAY);
		btnInsertPerson.setBounds(5, 6, 140, 30);
		frmJusticeLeagueDatabase.getContentPane().add(btnInsertPerson);
		
		JButton btnDeletePerson = new JButton("Delete Person");
		btnDeletePerson.setBackground(Color.DARK_GRAY);
		btnDeletePerson.setBounds(5, 130, 140, 30);
		frmJusticeLeagueDatabase.getContentPane().add(btnDeletePerson);
		
		JButton btnSeeAllPersons = new JButton("See All Persons");
		btnSeeAllPersons.setBackground(Color.DARK_GRAY);
		btnSeeAllPersons.setBounds(5, 174, 140, 30);
		frmJusticeLeagueDatabase.getContentPane().add(btnSeeAllPersons);
		
		
		JTextArea txtrAllPeople = new JTextArea();
		txtrAllPeople.setText("All People");
		txtrAllPeople.setBackground(Color.LIGHT_GRAY);
		txtrAllPeople.setBounds(160, 180, 420, 250);
		frmJusticeLeagueDatabase.getContentPane().add(txtrAllPeople);
		
		txtAge = new JTextField();
		txtAge.setText("Age");
		txtAge.setBackground(Color.LIGHT_GRAY);
		txtAge.setBounds(157, 90, 134, 28);
		frmJusticeLeagueDatabase.getContentPane().add(txtAge);
		txtAge.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setBackground(Color.LIGHT_GRAY);
		txtLastName.setText("Last Name");
		txtLastName.setBounds(157, 48, 420, 28);
		frmJusticeLeagueDatabase.getContentPane().add(txtLastName);
		txtLastName.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setBackground(Color.LIGHT_GRAY);
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(157, 6, 420, 28);
		frmJusticeLeagueDatabase.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtId = new JTextField();
		txtId.setBackground(Color.LIGHT_GRAY);
		txtId.setText("ID #");
		txtId.setBounds(157, 130, 134, 28);
		frmJusticeLeagueDatabase.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		JButton btnSelectPerson_1 = new JButton("Select Person");
		btnSelectPerson_1.setBounds(5, 216, 140, 30);
		frmJusticeLeagueDatabase.getContentPane().add(btnSelectPerson_1);
		
		
		btnInsertPerson.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("I hear the insert button!!!!!");
				
				String lastName = txtLastName.getText();
				String firstName = txtFirstName.getText();
				int age = Integer.parseInt(txtAge.getText());

				Test.insertPerson(new Person(firstName, lastName, 
						age, Test.randomNumber(), Test.randomNumber()));
			}

		});
		
		
		btnDeletePerson.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("I hear the delete button!!!!!");
				
				int id = Integer.parseInt(txtId.getText());

				Test.deletePerson(id);
			}

		});
		
		btnSelectPerson_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("I hear the selection button!!!!!");
				
				int id = Integer.parseInt(txtId.getText());

				txtrAllPeople.setText(Test.selectPerson(id).toString());
			}

		});
		
	
		btnSeeAllPersons.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("I hear the see all people button!!!!!");
				txtrAllPeople.setText("");
				
				String data = null;

				for (Person i : Test.findAllPeople()) {
					data = i.toString();
					txtrAllPeople.append(data);
				}
				
			}

		});
		
		
		
	}
}
