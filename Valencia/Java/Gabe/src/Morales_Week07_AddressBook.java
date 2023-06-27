import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.List.*;
import java.io.Serializable;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import javax.swing.RowFilter;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Morales_Week07_AddressBook implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JFrame mainFrame;
	private JTextField searchBar;
	private JTable contactTable;
	private JTextField firstNameText;
	private JTextField emailText;
	private JTextField phoneAreaText;
	private JTextField phoneExchangeText;
	private JTextField phoneLocalNumber;
	private JTextField groupText;
	private JTextField cityText;
	private JTextField lastNameText;
	private JTextField birthdayText;
	private JTextField addrText;
	int indexRow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Morales_Week07_AddressBook window = new Morales_Week07_AddressBook();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Morales_Week07_AddressBook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		mainFrame = new JFrame("Black Book Contacts");
		mainFrame.setBounds(100, 100, 1000, 500);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contactPanel = new JPanel();

		// Panel to display details
		JPanel detailPanel = new JPanel();
		detailPanel.setVisible(false);
		GroupLayout groupLayout = new GroupLayout(mainFrame.getContentPane());
		groupLayout
				.setHorizontalGroup(
						groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addContainerGap()
										.addComponent(contactPanel, GroupLayout.PREFERRED_SIZE, 450,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(detailPanel, GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
										.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(detailPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 439,
										Short.MAX_VALUE)
								.addComponent(contactPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 439,
										Short.MAX_VALUE))
						.addContainerGap()));

		JLabel lblFirstName = new JLabel("First Name");

		JLabel lblLastName = new JLabel("Last Name");

		JLabel lblGroup = new JLabel("Group");

		JLabel lblPhone = new JLabel("Phone");

		JLabel lblEmail = new JLabel("Email");

		JLabel lblBirthday = new JLabel("Birthday");

		JLabel lblAddress = new JLabel("Address");

		JLabel lblCity = new JLabel("City");

		firstNameText = new JTextField();
		firstNameText.setColumns(10);
		firstNameText.setText(Person.firstName);

		emailText = new JTextField();
		emailText.setColumns(10);
		emailText.setText(Person.email);

		phoneAreaText = new JTextField();
		phoneAreaText.setColumns(10);
		phoneAreaText.setText(Person.areaCode);
		
		phoneExchangeText = new JTextField();
		phoneExchangeText.setColumns(10);
		phoneExchangeText.setText(Person.exchangeNumber);
		
		phoneLocalNumber = new JTextField();
		phoneLocalNumber.setColumns(10);
		phoneLocalNumber.setText(Person.localNumber);
		
		groupText = new JTextField();
		groupText.setColumns(10);
		groupText.setText(Person.group);

		cityText = new JTextField();
		cityText.setColumns(10);
		cityText.setText(Person.city);

		lastNameText = new JTextField();
		lastNameText.setColumns(10);
		lastNameText.setText(Person.lastName);

		birthdayText = new JTextField();
		birthdayText.setColumns(10);
		birthdayText.setText(Person.birthday);

		addrText = new JTextField();
		addrText.setColumns(10);
		addrText.setText(Person.address);

		JButton addDetailButton = new JButton("Add");
		addDetailButton.setVisible(false);
		addDetailButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detailPanel.setVisible(false);
				DefaultTableModel tableModel = (DefaultTableModel) contactTable.getModel();
				tableModel.addRow(new Object[] { firstNameText.getText(), lastNameText.getText(), Person.phoneNumber,
						cityText.getText() });
				firstNameText.setText("");
				lastNameText.setText("");
				groupText.setText("");
				phoneAreaText.setText("");
				emailText.setText("");
				birthdayText.setText("");
				addrText.setText("");
				cityText.setText("");
			}
		});

		JButton exitDetailButton = new JButton("Exit");
		exitDetailButton.setVisible(false);
		exitDetailButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent hideDetails) {
				detailPanel.setVisible(false);
			}
		});
		


		GroupLayout gl_detailPanel = new GroupLayout(detailPanel);
		gl_detailPanel.setHorizontalGroup(
			gl_detailPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_detailPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_detailPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFirstName)
						.addComponent(lblEmail)
						.addComponent(lblPhone)
						.addComponent(lblGroup)
						.addComponent(lblCity)
						.addComponent(lblBirthday)
						.addComponent(lblAddress)
						.addComponent(lblLastName))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_detailPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_detailPanel.createSequentialGroup()
							.addComponent(addDetailButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(exitDetailButton)
							.addContainerGap())
						.addGroup(gl_detailPanel.createSequentialGroup()
							.addGroup(gl_detailPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lastNameText, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
								.addComponent(birthdayText, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
								.addComponent(firstNameText, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
								.addComponent(groupText, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
								.addComponent(emailText, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
								.addComponent(addrText, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
								.addComponent(cityText, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
								.addGroup(gl_detailPanel.createSequentialGroup()
									.addComponent(phoneAreaText, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(phoneExchangeText, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(phoneLocalNumber, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))
							.addGap(257))))
		);
		gl_detailPanel.setVerticalGroup(
			gl_detailPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_detailPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_detailPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFirstName)
						.addComponent(firstNameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_detailPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLastName)
						.addComponent(lastNameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_detailPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGroup)
						.addComponent(groupText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_detailPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPhone)
						.addComponent(phoneAreaText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(phoneExchangeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(phoneLocalNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_detailPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(emailText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_detailPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBirthday)
						.addComponent(birthdayText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_detailPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddress)
						.addComponent(addrText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_detailPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCity)
						.addComponent(cityText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_detailPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(addDetailButton)
						.addComponent(exitDetailButton))
					.addContainerGap(197, Short.MAX_VALUE))
		);
		detailPanel.setLayout(gl_detailPanel);

		// searchBar = new JTextField();
		// searchBar.setColumns(10);

		searchBar = new JTextField();

		/*
		 * searchBar.addFocusListener(new FocusListener() {
		 * 
		 * @Override public void focusLost(FocusEvent e) { String focusText =
		 * "Search"; }
		 * 
		 * @Override public void focusGained(FocusEvent e) {
		 * 
		 * } });
		 */

		JButton displayAllButton = new JButton("Display All");
		displayAllButton.setVisible(false);
		displayAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchBar.setText("");
				displayAllButton.setVisible(false);
				TableRowSorter<TableModel> rowSorter = new TableRowSorter<TableModel>(contactTable.getModel());

				contactTable.setRowSorter(rowSorter);

				String textInput = searchBar.getText();

				if (textInput.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				} else {
					displayAllButton.setVisible(true);

					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + textInput));
				}
			}
		});

		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent search) {
				TableRowSorter<TableModel> rowSorter = new TableRowSorter<TableModel>(contactTable.getModel());

				contactTable.setRowSorter(rowSorter);

				String textInput = searchBar.getText();

				if (textInput.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				} else {
					displayAllButton.setVisible(true);

					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + textInput));
				}
			}
		});

		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent addPerson) {
				detailPanel.setVisible(true);
				addDetailButton.setVisible(true);
				exitDetailButton.setVisible(false);
			}
		});

		JButton detailButton = new JButton("Details");
		detailButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent viewDetails) {
				detailPanel.setVisible(true);
				exitDetailButton.setVisible(true);
				addDetailButton.setVisible(false);

				// tableModel.removeRow();
			}

		});

		JButton deleteButton = new JButton("Delete");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent deletePerson) {
				JFrame confirmDelete = new JFrame("Confirm Delete");
				confirmDelete.setVisible(true);
				confirmDelete.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				confirmDelete.setSize(400, 250);

				JButton confirm = new JButton();
				confirm.setText("Yes");
				confirm.setSize(100, 50);
				confirm.setHorizontalAlignment(JButton.CENTER);
				confirm.setVerticalAlignment(JButton.CENTER);
				confirm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						confirmDelete.dispose();

						indexRow = contactTable.getSelectedRows().length;
						for (int i = 0; i < indexRow; i++) {
							((DefaultTableModel) contactTable.getModel()).removeRow(contactTable.getSelectedRow());
						}

					}
				});

				JButton cancel = new JButton();
				cancel.setText("No");
				cancel.setSize(100, 50);
				cancel.setHorizontalAlignment(JButton.CENTER);
				cancel.setVerticalAlignment(JButton.CENTER);
				cancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						confirmDelete.dispose();
					}
				});

				JLabel deleteNotice = new JLabel();
				deleteNotice.setText("Are you sure you want to delete this contact?");
				deleteNotice.setVisible(true);
				deleteNotice.setHorizontalAlignment(JLabel.CENTER);
				deleteNotice.setVerticalAlignment(JLabel.CENTER);

				JPanel confirmDeletePanel = new JPanel();
				confirmDeletePanel.add(confirm);
				confirmDeletePanel.add(cancel);

				confirmDelete.getContentPane().add(deleteNotice, BorderLayout.CENTER);
				confirmDelete.getContentPane().add(confirmDeletePanel, BorderLayout.SOUTH);
			}
		});

		JScrollPane scrollPane = new JScrollPane();

		// List<Person> listPersons = new createListPersons();
		// ContactTableModel tableModel = new ContactTableModel(listPersons);

		contactTable = new JTable(/* tableModel */
				new DefaultTableModel(new Object[][] { { "Oliver", "Queen", "1114321", "Star City" },
						{ "Batman", null, "555227524", "Gotham" }, { "John", "Smith", "1234567890", "Orlando" },
						{ "Jake", "Jones", "2412309594", "New York" }, { "Sally", "Jones", "9043529947", "Denver" },
						{ "Jessica", "Jones", "8371034927", "Houston" },
						{ "Ryan", "Reynolds", "555-123-4241", "Malibu" }, { "Robert", "Frank", "", "" },
						{ "Richard", "", "3524039581", "Miami" }, { "Cosmo", "Kramer", "2135553546", "New York" } },
						new String[] { "First Name", "Last Name", "Phone", "City" })

		);
		contactTable.setAutoCreateRowSorter(true);
		// contactTable.setColumnSelectionAllowed(true);
		scrollPane.setViewportView(contactTable);

		GroupLayout gl_contactPanel = new GroupLayout(contactPanel);
		gl_contactPanel
				.setHorizontalGroup(
						gl_contactPanel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contactPanel.createSequentialGroup().addContainerGap()
										.addGroup(
												gl_contactPanel.createParallelGroup(Alignment.TRAILING)
														.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE,
																430, Short.MAX_VALUE)
														.addGroup(Alignment.LEADING,
																gl_contactPanel.createSequentialGroup()
																		.addComponent(addButton)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(detailButton)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(deleteButton)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(displayAllButton))
														.addGroup(gl_contactPanel.createSequentialGroup()
																.addComponent(searchBar, GroupLayout.DEFAULT_SIZE, 359,
																		Short.MAX_VALUE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(searchButton)))
										.addContainerGap()));
		gl_contactPanel.setVerticalGroup(gl_contactPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contactPanel.createSequentialGroup().addGap(5)
						.addGroup(gl_contactPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(searchBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(searchButton))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contactPanel.createParallelGroup(Alignment.BASELINE).addComponent(addButton)
								.addComponent(detailButton).addComponent(deleteButton)
								.addComponent(displayAllButton))));
		contactPanel.setLayout(gl_contactPanel);
		mainFrame.getContentPane().setLayout(groupLayout);
	}
}