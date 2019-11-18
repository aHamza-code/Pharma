
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

public class AdminSuccess extends JFrame{
	
	static AdminSuccess frame;
	private Container c;

//	public static void main(String[] args) {
//		
//		frame = new AdminSuccess();
//		frame.setVisible(true);
//	
//
//	}
	
	public static void page() {
		
		frame = new AdminSuccess();
		frame.setVisible(true);
		
	}
	
	AdminSuccess(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Admin Success");
	
		c = this.getContentPane();
		c.setLayout(null);
	
		JLabel lblAdminSuccess = new JLabel("Admin Page");
		lblAdminSuccess.setBounds(170, 20, 150, 30);
		lblAdminSuccess.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdminSuccess.setForeground(Color.GRAY);
		c.add(lblAdminSuccess);
		
		
		JButton btnSalesmanForm = new JButton("Add Salesman");
		btnSalesmanForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AdminLogin.main(new String[]{});
				FormSalesman.page();
				frame.dispose();
				
			}
			
			
		});
		
		btnSalesmanForm.setBounds(20, 100, 130, 20);
		btnSalesmanForm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalesmanForm.setForeground(Color.GRAY);
		
		c.add(btnSalesmanForm);
		
		JButton btnSalesmanView = new JButton("View Salesman");
		btnSalesmanView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AdminLogin.main(new String[]{});
				ViewSalesman.page();
				frame.dispose();
				
			}
			
			
		});
		
		btnSalesmanView.setBounds(270, 100, 130, 20);
		btnSalesmanView.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalesmanView.setForeground(Color.GRAY);
		
		c.add(btnSalesmanView);
		//
		
		JButton btnSalesmanUpdate = new JButton("Update Salesman");
		btnSalesmanUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AdminLogin.main(new String[]{});
				UpdateSalesman.page();
				frame.dispose();
				
			}
			
			
		});
		
		btnSalesmanUpdate.setBounds(20, 150, 130, 20);
		btnSalesmanUpdate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalesmanUpdate.setForeground(Color.GRAY);
		
		c.add(btnSalesmanUpdate);
		
		JButton btnSalesmanDelete = new JButton("Delete Salesman");
		btnSalesmanDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AdminLogin.main(new String[]{});
				DeleteSalesman.page();
				frame.dispose();
				
			}
			
			
		});
		
		btnSalesmanDelete.setBounds(270, 150, 130, 20);
		btnSalesmanDelete.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalesmanDelete.setForeground(Color.GRAY);
		
		c.add(btnSalesmanDelete);
		
				
		//Back and Logout option
		/*
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.page();;
				frame.dispose();
				
			}
		});
		
		btnBack.setBounds(20, 220, 100, 20);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBack.setForeground(Color.GRAY);
		
		c.add(btnBack);
		*/
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pharmacy.main(new String[] {});
				frame.dispose();
				
			}
		});
		
		btnLogout.setBounds(300, 220, 100, 20);
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogout.setForeground(Color.GRAY);
		
		c.add(btnLogout);
		
	}

}
