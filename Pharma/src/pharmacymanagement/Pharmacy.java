
package pharmacyManagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pharmacy extends JFrame{
	
	static Pharmacy frame;
	private Container c;

	public static void main(String[] args) {
		
		frame = new Pharmacy();
		frame.setVisible(true);
                		

	}
	Pharmacy(){
		
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 300);
	setTitle("Pharmacy Management");
	
	c = this.getContentPane();
	c.setLayout(null);
	
	JLabel lblPharmacyManagement = new JLabel("Islam Pharma Management");
	lblPharmacyManagement.setBounds(100, 30, 250, 30);
	lblPharmacyManagement.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblPharmacyManagement.setForeground(Color.GRAY);
		
	c.add(lblPharmacyManagement);
	
	JButton btnAdminLogin = new JButton("Admin Login");
	btnAdminLogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//AdminLogin.main(new String[]{});
			AdminLogin.page();
			frame.dispose();
			
		}
		
		
	});
	
	btnAdminLogin.setBounds(20, 100, 120, 20);
	btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
	btnAdminLogin.setForeground(Color.GRAY);
	
	c.add(btnAdminLogin);
	
	JButton btnSalesmanLogin = new JButton("Salesman Login");
	btnSalesmanLogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//AdminLogin.main(new String[]{});
			SalesmanLogin.page();
			frame.dispose();
			
		}
		
		
	});
	
	btnSalesmanLogin.setBounds(20, 140, 120, 20);
	btnSalesmanLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
	btnAdminLogin.setForeground(Color.GRAY);
	
	c.add(btnSalesmanLogin);
	
	JLabel lblCourtesy = new JLabel("@Developed By Abdullah");
	lblCourtesy.setBounds(300, 220, 150, 30);
	lblCourtesy.setFont(new Font("Tahoma", Font.PLAIN, 9));
	lblCourtesy.setForeground(Color.GRAY);
		
	c.add(lblCourtesy);
	
	}

}
