
package pharmacyManagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MedicineSold extends JFrame{
	
	static MedicineSold frame;
	private Container c;
	
	public static void page() {
		frame = new MedicineSold();
		frame.setVisible(true);
	}
        public static void unit(){
            
        }
	
	MedicineSold(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Salesman panel");
	
		c = this.getContentPane();
		c.setLayout(null);
	
		JLabel lblMedicineSold = new JLabel("Sold medicine");
		lblMedicineSold.setBounds(170, 20, 150, 30);
		lblMedicineSold.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMedicineSold.setForeground(Color.GRAY);
		c.add(lblMedicineSold);
		
		JLabel lblMedicineName = new JLabel("Name");
		lblMedicineName.setBounds(20, 60, 110, 20);
		lblMedicineName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblMedicineName.setForeground(Color.GRAY);
		c.add(lblMedicineName);
		
		JTextField medicineNameText = new JTextField();
		medicineNameText.setBounds(100, 60, 100, 20);
		medicineNameText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		medicineNameText.setForeground(Color.GRAY);
		c.add(medicineNameText);
		
		JLabel lblUnit = new JLabel("Unit");
		lblUnit.setBounds(20, 85, 110, 20);
		lblUnit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblUnit.setForeground(Color.GRAY);
		c.add(lblUnit);
		
		JTextField unitText = new JTextField();
		unitText.setBounds(100, 85, 100, 20);
		unitText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		unitText.setForeground(Color.GRAY);
		c.add(unitText);
		
		JLabel lblclientid = new JLabel("Client ID");
		lblclientid.setBounds(20, 110, 110, 20);
		lblclientid.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblclientid.setForeground(Color.GRAY);
		c.add(lblclientid);
		
		
		JTextField clientidField = new JTextField();
		clientidField.setBounds(100, 110, 100, 20);
		clientidField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		clientidField.setForeground(Color.GRAY);
		c.add(clientidField);
		
		JLabel lblClientName = new JLabel("Client Name");
		lblClientName.setBounds(20, 135, 110, 20);
		lblClientName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblClientName.setForeground(Color.GRAY);
		c.add(lblClientName);
		
		JTextField clientNameText = new JTextField();
		clientNameText.setBounds(100, 135, 100, 20);
		clientNameText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		clientNameText.setForeground(Color.GRAY);
		c.add(clientNameText);
					
		JLabel lblClientContact = new JLabel("Client Contact");
		lblClientContact.setBounds(20, 160, 110, 20);
		lblClientContact.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblClientContact.setForeground(Color.GRAY);
		c.add(lblClientContact);
		
		JTextField clientContactText = new JTextField();
		clientContactText.setBounds(100, 160, 100, 20);
		clientContactText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		clientContactText.setForeground(Color.GRAY);
		c.add(clientContactText);
		
		JButton btnIssueBook = new JButton("Issue Medicine");
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String name =medicineNameText.getText();
			int unit=Integer.parseInt(unitText.getText());
			int clientid=Integer.parseInt(clientidField.getText());
			String clientname=clientNameText.getText();
			String clientcontact=clientContactText.getText();
			
			if(SoldMedicineDao.checkBook(name)){
			
			int i=SoldMedicineDao.save(name, unit, clientid, clientname, clientcontact);
			if(i>0){
				JOptionPane.showMessageDialog(MedicineSold.this,"Medicine issued successfully!");
				SalesmanSuccess.page();
				frame.dispose();
				
			}else{
				JOptionPane.showMessageDialog(MedicineSold.this,"Sorry, unable to issue!");
			}//end of save if-else
			
			}else{
				JOptionPane.showMessageDialog(MedicineSold.this,"Sorry, Callno doesn't exist!");
			}//end of checkbook if-else
			
			}
		});
		
		btnIssueBook.setBounds(270, 220, 130, 20);
		btnIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnIssueBook.setForeground(Color.GRAY);
		c.add(btnIssueBook);
		
	}

}
