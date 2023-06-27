package GUI_Layer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class Biker_UI extends JFrame {

	private JPanel contentPane;
	private JTextField txtCountryoforigin;
	private JTextField txtCost;
	private JTextField txtRacename;
	private JTextField txtRaceyear;
	private JTextField txtRidername;
	private JTextField txtDistance;
	private JTextField txtRacewinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Biker_UI frame = new Biker_UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Biker_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 840, 570);
		tabbedPane.setBackground(Color.BLACK);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("RaceRiders", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnRaceRidersAdd = new JButton("ADD");
		btnRaceRidersAdd.setBounds(167, 446, 117, 29);
		panel_1.add(btnRaceRidersAdd);
		
		JButton btnRaceRidersDelete = new JButton("DELETE");
		btnRaceRidersDelete.setBounds(297, 446, 117, 29);
		panel_1.add(btnRaceRidersDelete);
		
		JButton btnRaceRidersUpdate = new JButton("UPDATE");
		btnRaceRidersUpdate.setBounds(426, 446, 117, 29);
		panel_1.add(btnRaceRidersUpdate);
		
		JButton btnRaceRidersQuit = new JButton("QUIT");
		btnRaceRidersQuit.setBounds(555, 446, 117, 29);
		panel_1.add(btnRaceRidersQuit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("RaceTeams", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnRaceTeamsAdd = new JButton("ADD");
		btnRaceTeamsAdd.setBounds(167, 446, 117, 29);
		panel_2.add(btnRaceTeamsAdd);
		
		JButton btnRaceTeamsDelete = new JButton("DELETE");
		btnRaceTeamsDelete.setBounds(297, 446, 117, 29);
		panel_2.add(btnRaceTeamsDelete);
		
		JButton btnRaceTeamsUpdate = new JButton("UPDATE");
		btnRaceTeamsUpdate.setBounds(426, 446, 117, 29);
		panel_2.add(btnRaceTeamsUpdate);
		
		JButton btnRaceTeamsQuit = new JButton("QUIT");
		btnRaceTeamsQuit.setBounds(555, 446, 117, 29);
		panel_2.add(btnRaceTeamsQuit);
		
		JLabel lblTeamName = new JLabel("Team Name:");
		lblTeamName.setForeground(Color.LIGHT_GRAY);
		lblTeamName.setBounds(167, 41, 117, 16);
		panel_2.add(lblTeamName);
		
		JLabel lblBikeName_1 = new JLabel("Bike Name:");
		lblBikeName_1.setForeground(Color.LIGHT_GRAY);
		lblBikeName_1.setBounds(167, 99, 117, 16);
		panel_2.add(lblBikeName_1);
		
		JLabel lblRegisteredNation = new JLabel("Registered Nation:");
		lblRegisteredNation.setForeground(Color.LIGHT_GRAY);
		lblRegisteredNation.setBounds(167, 165, 117, 16);
		panel_2.add(lblRegisteredNation);
		
		JLabel lblNumberOfRiders = new JLabel("Riders Number:");
		lblNumberOfRiders.setForeground(Color.LIGHT_GRAY);
		lblNumberOfRiders.setBounds(167, 225, 117, 16);
		panel_2.add(lblNumberOfRiders);
		
		JLabel lblManager = new JLabel("Manager:");
		lblManager.setForeground(Color.LIGHT_GRAY);
		lblManager.setBounds(167, 290, 117, 16);
		panel_2.add(lblManager);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("RaceWinners", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnRaceWinnersAdd = new JButton("ADD");
		btnRaceWinnersAdd.setBounds(167, 446, 117, 29);
		panel_3.add(btnRaceWinnersAdd);
		
		JButton btnRaceWinnersDelete = new JButton("DELETE");
		btnRaceWinnersDelete.setBounds(297, 446, 117, 29);
		panel_3.add(btnRaceWinnersDelete);
		
		JButton btnRaceWinnersUpdate = new JButton("UPDATE");
		btnRaceWinnersUpdate.setBounds(426, 446, 117, 29);
		panel_3.add(btnRaceWinnersUpdate);
		
		JButton btnRaceWinnersQuit = new JButton("QUIT");
		btnRaceWinnersQuit.setBounds(555, 446, 117, 29);
		panel_3.add(btnRaceWinnersQuit);
		
		JLabel lblRaceWinner = new JLabel("Race Winner:");
		lblRaceWinner.setForeground(Color.LIGHT_GRAY);
		lblRaceWinner.setBounds(167, 236, 117, 16);
		panel_3.add(lblRaceWinner);
		
		JLabel lblRaceName = new JLabel("Race Name:");
		lblRaceName.setForeground(Color.LIGHT_GRAY);
		lblRaceName.setBounds(167, 34, 110, 16);
		panel_3.add(lblRaceName);
		
		JLabel lblRaceYear = new JLabel("Race Year:");
		lblRaceYear.setForeground(Color.LIGHT_GRAY);
		lblRaceYear.setBounds(167, 89, 110, 16);
		panel_3.add(lblRaceYear);
		
		JLabel lblRiderName = new JLabel("Rider Name:");
		lblRiderName.setForeground(Color.LIGHT_GRAY);
		lblRiderName.setBounds(167, 140, 110, 16);
		panel_3.add(lblRiderName);
		
		JLabel lblDistance = new JLabel("Distance:");
		lblDistance.setForeground(Color.LIGHT_GRAY);
		lblDistance.setBounds(167, 187, 117, 16);
		panel_3.add(lblDistance);
		
		txtRacename = new JTextField();
		txtRacename.setText("RaceName");
		txtRacename.setBounds(297, 28, 300, 28);
		panel_3.add(txtRacename);
		txtRacename.setColumns(10);
		
		txtRaceyear = new JTextField();
		txtRaceyear.setText("RaceYear");
		txtRaceyear.setBounds(297, 83, 300, 28);
		panel_3.add(txtRaceyear);
		txtRaceyear.setColumns(10);
		
		txtRidername = new JTextField();
		txtRidername.setText("RiderName");
		txtRidername.setBounds(297, 134, 300, 28);
		panel_3.add(txtRidername);
		txtRidername.setColumns(10);
		
		txtDistance = new JTextField();
		txtDistance.setText("Distance");
		txtDistance.setBounds(297, 181, 300, 28);
		panel_3.add(txtDistance);
		txtDistance.setColumns(10);
		
		txtRacewinner = new JTextField();
		txtRacewinner.setText("RaceWinner");
		txtRacewinner.setBounds(297, 230, 300, 28);
		panel_3.add(txtRacewinner);
		txtRacewinner.setColumns(10);
		
		JPanel panel_0 = new JPanel();
		panel_0.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("RaceBikes", null, panel_0, null);
		panel_0.setLayout(null);
		
		JButton btnRaceBikesAdd = new JButton("ADD");
		btnRaceBikesAdd.setBounds(167, 446, 117, 29);
		panel_0.add(btnRaceBikesAdd);
		
		JButton btnRaceBikesDelete = new JButton("DELETE");
		btnRaceBikesDelete.setBounds(297, 446, 117, 29);
		panel_0.add(btnRaceBikesDelete);
		
		JButton btnRaceBikesUpdate = new JButton("UPDATE");
		btnRaceBikesUpdate.setBounds(426, 446, 117, 29);
		panel_0.add(btnRaceBikesUpdate);
		
		JButton btnRaceBikesQuit = new JButton("QUIT");
		btnRaceBikesQuit.setBounds(555, 446, 117, 29);
		panel_0.add(btnRaceBikesQuit);
		
		txtCountryoforigin = new JTextField();
		txtCountryoforigin.setBounds(297, 114, 246, 28);
		panel_0.add(txtCountryoforigin);
		txtCountryoforigin.setColumns(10);
		
		txtCost = new JTextField();
		txtCost.setBounds(297, 206, 246, 28);
		panel_0.add(txtCost);
		txtCost.setColumns(10);
		
		JLabel lblBikeName = new JLabel("Bike name:");
		lblBikeName.setForeground(Color.LIGHT_GRAY);
		lblBikeName.setBounds(167, 45, 117, 16);
		panel_0.add(lblBikeName);
		
		JLabel lblCountryOfOrigin = new JLabel("Country of origin:");
		lblCountryOfOrigin.setForeground(Color.LIGHT_GRAY);
		lblCountryOfOrigin.setBounds(167, 120, 117, 16);
		panel_0.add(lblCountryOfOrigin);
		
		JLabel lblCost = new JLabel("Cost:");
		lblCost.setForeground(Color.LIGHT_GRAY);
		lblCost.setBounds(167, 212, 117, 16);
		panel_0.add(lblCost);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(300, 41, 243, 27);
		panel_0.add(comboBox);
		
		
	}
}
