
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

public class ReturnMedicine extends JFrame{
	
	static ReturnMedicine frame;
	private Container c;
	
	public static void page() {
		frame = new ReturnMedicine();
		frame.setVisible(true);
	}
	
	ReturnMedicine(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Salesman panel");
	
		c = this.getContentPane();
		c.setLayout(null);
	
		JLabel lblDeleteMedicine = new JLabel("Returned Medicine");
		lblDeleteMedicine.setBounds(170, 20, 150, 30);
		lblDeleteMedicine.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDeleteMedicine.setForeground(Color.GRAY);
		c.add(lblDeleteMedicine);
		
		JLabel lblMedicineName = new JLabel("Medicine Name:");
		lblMedicineName.setBounds(30, 100, 120, 20);
		lblMedicineName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMedicineName.setForeground(Color.GRAY);
		c.add(lblMedicineName);
		
		JLabel lblClientId = new JLabel("Client Id:");
		lblClientId.setBounds(30, 130, 120, 20);
		lblClientId.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblClientId.setForeground(Color.GRAY);
		c.add(lblClientId);
		
		JLabel lblReturn = new JLabel("Return Unit:");
		lblReturn.setBounds(30, 160, 120, 20);
		lblReturn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblReturn.setForeground(Color.GRAY);
		c.add(lblReturn);
		
		JTextField nameText = new JTextField();
		nameText.setBounds(150, 100, 100, 20);
		nameText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		nameText.setForeground(Color.GRAY);
		c.add(nameText);
		
		JTextField clientIdText = new JTextField();
		clientIdText.setBounds(150, 130, 100, 20);
		clientIdText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		clientIdText.setForeground(Color.GRAY);
		c.add(clientIdText);
		
		JTextField returnText = new JTextField();
		returnText.setBounds(150, 160, 100, 20);
		returnText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		returnText.setForeground(Color.GRAY);
		c.add(returnText);
		
		JButton btnLogin = new JButton("Return");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String medicineName = nameText.getText();
				int clientid = Integer.parseInt(clientIdText.getText());
				int unit = Integer.parseInt(returnText.getText());
				int i=ReturnMedicineDao.delete(medicineName, clientid, unit);
				if(i>0){
					JOptionPane.showMessageDialog(ReturnMedicine.this,"Medicine returned successfully!");
					SalesmanSuccess.page();
					frame.dispose();
					
				}else{
					JOptionPane.showMessageDialog(ReturnMedicine.this,"Sorry, unable to return Medicine!");
				}
				
				
				
			}
		});
		
		btnLogin.setBounds(20, 200, 120, 20);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogin.setForeground(Color.GRAY);
		
		c.add(btnLogin);
		
		
	}


}
