package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class StudentAccountInformationPage {
	private String HW = "Hello World!!!!!";

	private JFrame frmStudentAccount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentAccountInformationPage window = new StudentAccountInformationPage();
					window.frmStudentAccount.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentAccountInformationPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentAccount = new JFrame();
		frmStudentAccount.setTitle("Student Account Information");
		frmStudentAccount.setBounds(100, 100, 450, 300);
		frmStudentAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentAccount.getContentPane().setLayout(null);
		
		JButton btnResetPassword = new JButton("Reset Password");
		btnResetPassword.setBounds(147, 227, 137, 30);
		frmStudentAccount.getContentPane().add(btnResetPassword);
		
		JLabel label = new JLabel("Username:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(47, 21, 129, 30);
		frmStudentAccount.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Password:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(47, 48, 129, 30);
		frmStudentAccount.getContentPane().add(label_1);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirstName.setBounds(47, 131, 129, 30);
		frmStudentAccount.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastName.setBounds(47, 162, 129, 30);
		frmStudentAccount.getContentPane().add(lblLastName);
		
		JLabel label_5 = new JLabel("Last Name goes here");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(186, 162, 214, 30);
		frmStudentAccount.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel(HW);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(186, 131, 214, 30);
		frmStudentAccount.getContentPane().add(label_6);
		
		JLabel label_8 = new JLabel("Password goes here");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(186, 48, 214, 30);
		frmStudentAccount.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Username goes here");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_9.setBounds(186, 21, 214, 30);
		frmStudentAccount.getContentPane().add(label_9);
	}
}
