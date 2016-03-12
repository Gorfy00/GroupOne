import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel ResetPassword = new JPanel();
		frame.getContentPane().add(ResetPassword, "name_5442867194626");
		
		JPanel StaAccInfoPage = new JPanel();
		frame.getContentPane().add(StaAccInfoPage, "name_5445283180603");
		
		JPanel StuAccInfoPage = new JPanel();
		frame.getContentPane().add(StuAccInfoPage, "name_5447204352736");
	}

}
