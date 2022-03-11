package ma.fstm.ilisi2.ExpertSysCovid19.view.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtPassword;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new LineBorder(new Color(51, 204, 204), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(UIManager.getColor("Button.light"));
		panel.setBounds(0, 0, 233, 400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Logo");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(49, 67, 91, 62);
		panel.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(250, 250, 210));
		textField.setDisabledTextColor(new Color(0, 153, 153));
		textField.setBorder(null);
		textField.setBounds(358, 158, 222, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setDisabledTextColor(new Color(0, 153, 153));
		txtPassword.setColumns(10);
		txtPassword.setBorder(null);
		txtPassword.setBackground(new Color(250, 250, 210));
		txtPassword.setBounds(358, 250, 222, 40);
		contentPane.add(txtPassword);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(0, 0, 128));
		textField_2.setBounds(368, 322, 147, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setBounds(525, 325, 14, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setForeground(new Color(105, 105, 105));
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(270, 164, 46, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel_1_1.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(256, 256, 79, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("ICON");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(401, 62, 91, 62);
		contentPane.add(lblNewLabel_2);
		setUndecorated(true);
		
	}
}
