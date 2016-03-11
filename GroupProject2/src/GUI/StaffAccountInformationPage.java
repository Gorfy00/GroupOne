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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StaffAccountInformationPage {

	private JFrame frmStaffAccount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffAccountInformationPage window = new StaffAccountInformationPage();
					window.frmStaffAccount.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StaffAccountInformationPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStaffAccount = new JFrame();
		frmStaffAccount.setTitle("Staff Account Information");
		frmStaffAccount.setBounds(100, 100, 450, 300);
		frmStaffAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStaffAccount.getContentPane().setLayout(null);
		
		JLabel lblUse = new JLabel("Username:");
		lblUse.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUse.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUse.setBounds(25, 25, 129, 30);
		frmStaffAccount.getContentPane().add(lblUse);
		
		JLabel label = new JLabel("Password:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(25, 52, 129, 30);
		frmStaffAccount.getContentPane().add(label);
		
		JLabel lblUsernameGoesH = new JLabel("Username goes here");
		lblUsernameGoesH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsernameGoesH.setBounds(164, 25, 214, 30);
		frmStaffAccount.getContentPane().add(lblUsernameGoesH);
		
		JLabel label_1 = new JLabel("Password goes here");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(164, 52, 214, 30);
		frmStaffAccount.getContentPane().add(label_1);
		
		JButton btnResetPassword = new JButton("Reset Password");
		btnResetPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResetPasswordScreen nw = new ResetPasswordScreen();
				nw.showResetPasswordScreen();
			}
		});
		btnResetPassword.setBounds(147, 227, 137, 30);
		frmStaffAccount.getContentPane().add(btnResetPassword);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDepartment.setBounds(25, 80, 129, 30);
		frmStaffAccount.getContentPane().add(lblDepartment);
		
		JLabel lblDepartmentGoesHere = new JLabel("Department goes here.....");
		lblDepartmentGoesHere.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDepartmentGoesHere.setBounds(164, 80, 214, 30);
		frmStaffAccount.getContentPane().add(lblDepartmentGoesHere);
		
		JLabel lblFirstName = new JLabel("First name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirstName.setBounds(25, 135, 129, 30);
		frmStaffAccount.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastName.setBounds(25, 166, 129, 30);
		frmStaffAccount.getContentPane().add(lblLastName);
		
		JLabel lblFirstNameGoes = new JLabel("First Name goes here");
		lblFirstNameGoes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstNameGoes.setBounds(164, 135, 214, 30);
		frmStaffAccount.getContentPane().add(lblFirstNameGoes);
		
		JLabel lblLastNameGoes = new JLabel("Last Name goes here");
		lblLastNameGoes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastNameGoes.setBounds(164, 166, 214, 30);
		frmStaffAccount.getContentPane().add(lblLastNameGoes);
	}
}
