
package pharmacyManagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SalesmanLogin extends JFrame{
	
	static SalesmanLogin frame;
	private Container c;

//	public static void main(String[] args) {
//		frame = new AdminLogin();
//		frame.setVisible(true);
//
//	}
	
public static void page() {
		
		frame = new SalesmanLogin();
		frame.setVisible(true);
		
	}
	SalesmanLogin(){
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Salesman Panel");
	
		c = this.getContentPane();
		c.setLayout(null);
	
		JLabel lblSalesmanLogin = new JLabel("Salesman Page");
		lblSalesmanLogin.setBounds(170, 20, 150, 30);
		lblSalesmanLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalesmanLogin.setForeground(Color.GRAY);
		c.add(lblSalesmanLogin);
		
		JLabel lbluser = new JLabel("Salesman ID");
		lbluser.setBounds(30, 100, 60, 20);
		lbluser.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbluser.setForeground(Color.GRAY);
		c.add(lbluser);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(30, 140, 60, 20);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPassword.setForeground(Color.GRAY);
		c.add(lblPassword);
		
		JTextField userText = new JTextField("abhi");
		userText.setBounds(100, 100, 100, 20);
		userText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		userText.setForeground(Color.GRAY);
		c.add(userText);
		
		JPasswordField passwordField = new JPasswordField("abhi");
		passwordField.setBounds(100, 140, 100, 20);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		passwordField.setForeground(Color.GRAY);
		c.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userId = userText.getText();
				String password = passwordField.getText();
				//System.out.println(name+" "+password);
				if(SalesmanDao.validate(userId, password)) {
					SalesmanSuccess.page();
					frame.dispose(); 
				}else{
					JOptionPane.showMessageDialog(SalesmanLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					userText.setText("");
					passwordField.setText("");
				}
				
				
				
			}
		});
		
		btnLogin.setBounds(20, 200, 120, 20);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogin.setForeground(Color.GRAY);
		
		c.add(btnLogin);
}

}
