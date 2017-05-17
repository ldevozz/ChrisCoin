import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.Choice;


public class Gui {

	private JFrame frmChriscoin;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frmChriscoin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChriscoin = new JFrame();
		frmChriscoin.setTitle("ChrisCoin");
		frmChriscoin.setBounds(100, 100, 450, 300);
		frmChriscoin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChriscoin.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel userpage = new JPanel();
		frmChriscoin.getContentPane().add(userpage, "name_251074102865496");
		userpage.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(142, 11, 137, 37);
		userpage.add(lblUsername);
		
		JLabel lblNewLabel = new JLabel("\"Balance\"");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(152, 59, 124, 37);
		userpage.add(lblNewLabel);
		
		JPanel login = new JPanel();
		frmChriscoin.getContentPane().add(login, "name_251318859429429");
		login.setLayout(null);
		
		JLabel label = new JLabel("Username");
		label.setBounds(146, 93, 76, 31);
		login.add(label);
		
		JLabel label_1 = new JLabel("Password");
		label_1.setBounds(146, 121, 76, 31);
		login.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(208, 98, 86, 20);
		login.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(208, 126, 86, 20);
		login.add(textField_3);
		
		JButton button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(176, 163, 89, 23);
		login.add(button);
		
		JLabel label_2 = new JLabel("ChrisCoin Wallet");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_2.setBounds(78, 42, 275, 31);
		login.add(label_2);
		
		JButton button_1 = new JButton("Create Account");
		button_1.setBounds(317, 227, 107, 23);
		login.add(button_1);
		
		JPanel transaction = new JPanel();
		frmChriscoin.getContentPane().add(transaction, "name_252953700443350");
		transaction.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Send coins");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(164, 70, 115, 22);
		transaction.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Amount");
		lblNewLabel_2.setBounds(144, 116, 46, 14);
		transaction.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(219, 113, 86, 20);
		transaction.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("To");
		lblNewLabel_3.setBounds(144, 152, 46, 14);
		transaction.add(lblNewLabel_3);
		
		Choice choice = new Choice();
		choice.setBounds(219, 152, 86, 20);
		transaction.add(choice);
	}
}
