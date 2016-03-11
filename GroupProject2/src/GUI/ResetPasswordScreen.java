package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResetPasswordScreen {

	private JFrame frmPasswordReset;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void showResetPasswordScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResetPasswordScreen window = new ResetPasswordScreen();
					window.frmPasswordReset.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ResetPasswordScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPasswordReset = new JFrame();
		frmPasswordReset.setTitle("Password Reset");
		frmPasswordReset.setBounds(100, 100, 450, 300);
		frmPasswordReset.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPasswordReset.getContentPane().setLayout(null);
		
		JLabel lblCurrentPassword = new JLabel("Current Password:");
		lblCurrentPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCurrentPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrentPassword.setBounds(47, 49, 147, 14);
		frmPasswordReset.getContentPane().add(lblCurrentPassword);
		
		JLabel lblNewPassword = new JLabel("New Password:");
		lblNewPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewPassword.setBounds(47, 110, 147, 14);
		frmPasswordReset.getContentPane().add(lblNewPassword);
		
		JLabel lblConfirmNewPassword = new JLabel("Confirm New Password:");
		lblConfirmNewPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmNewPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblConfirmNewPassword.setBounds(0, 151, 194, 14);
		frmPasswordReset.getContentPane().add(lblConfirmNewPassword);
		
		JEditorPane dtrpnY = new JEditorPane();
		dtrpnY.setToolTipText("Input your old password here.");
		dtrpnY.setForeground(new Color(0, 0, 0));
		dtrpnY.setBounds(204, 40, 194, 23);
		frmPasswordReset.getContentPane().add(dtrpnY);
		
		JButton btnConfirmPasswordReset = new JButton("Confirm Password Reset");
		btnConfirmPasswordReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnConfirmPasswordReset.setBounds(107, 234, 194, 23);
		frmPasswordReset.getContentPane().add(btnConfirmPasswordReset);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setToolTipText("Input your new password.");
		editorPane_1.setForeground(Color.BLACK);
		editorPane_1.setBounds(204, 101, 194, 23);
		frmPasswordReset.getContentPane().add(editorPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setToolTipText("Confirm new password here.");
		editorPane_2.setForeground(Color.BLACK);
		editorPane_2.setBounds(204, 142, 194, 23);
		frmPasswordReset.getContentPane().add(editorPane_2);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
