import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class UsedCarDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UsedCarDialog dialog = new UsedCarDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UsedCarDialog() {
		setTitle("This does nothing");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnNewButton = new JButton("Down");
			btnNewButton.setBounds(79, 193, 117, 29);
			contentPanel.add(btnNewButton);
		}
		{
			textField = new JTextField();
			textField.setBounds(152, 6, 134, 28);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JButton btnNewButton_2 = new JButton("Up");
			btnNewButton_2.setBounds(79, 111, 117, 29);
			contentPanel.add(btnNewButton_2);
		}
		{
			JButton btnNewButton_1 = new JButton("Right");
			btnNewButton_1.setBounds(152, 152, 117, 29);
			contentPanel.add(btnNewButton_1);
		}
		{
			JButton btnLeft = new JButton("Left");
			btnLeft.setBounds(6, 151, 117, 29);
			contentPanel.add(btnLeft);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JCheckBox chckbxNewCheckBox = new JCheckBox("Save Game?");
				buttonPane.add(chckbxNewCheckBox);
			}
			{
				JButton okButton = new JButton("JUST DO IT!!");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
