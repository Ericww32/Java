import java.awt.EventQueue;

import javax.swing.*;

public class part5 {

	private JFrame frame;
	private JTextField txtTextHere;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					part5 window = new part5();
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
	public part5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 6, 141, 114);
		frame.getContentPane().add(scrollPane);
		String[] colors = { "Blue", "red", "green" };
		JList list = new JList(colors);
		scrollPane.setViewportView(list);
		list.setVisibleRowCount(colors.length);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane.setRowHeaderView(tabbedPane);

		JButton btnButton = new JButton("Button");
		btnButton.setBounds(260, 228, 117, 29);
		frame.getContentPane().add(btnButton);

		txtTextHere = new JTextField();
		txtTextHere.setText("Text here");
		txtTextHere.setBounds(286, 6, 134, 28);
		frame.getContentPane().add(txtTextHere);
		txtTextHere.setColumns(10);

		JComboBox comboBox = new JComboBox(colors);
		comboBox.setBounds(260, 198, 89, 27);
		frame.getContentPane().add(comboBox);

		JCheckBox chckbxCheckbox = new JCheckBox("CheckBox");
		chckbxCheckbox.setBounds(260, 163, 128, 23);
		frame.getContentPane().add(chckbxCheckbox);

		JRadioButton rdbtnRadioButton = new JRadioButton("Radio Button");
		rdbtnRadioButton.setBounds(286, 62, 141, 23);
		frame.getContentPane().add(rdbtnRadioButton);

		JRadioButton rdbtnRadioButtonGroup = new JRadioButton("Radio button 2");
		rdbtnRadioButtonGroup.setBounds(286, 97, 134, 23);
		frame.getContentPane().add(rdbtnRadioButtonGroup);

		String[] col = { "Name", "DOB", "Hieght" };
		Object[][] row = { { "eric", "12/22/89", "6'1\"" }, { "ryan", "1/23/95", "6'1\"" },
				{ "josh", "8/21/94", "5'4\"" } };
		table = new JTable(row, col);
		table.setBounds(16, 188, 232, 69);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		frame.getContentPane().add(table);

	}
}
