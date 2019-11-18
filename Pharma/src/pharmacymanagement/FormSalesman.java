
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

public class FormSalesman extends JFrame{
	
	static FormSalesman frame;
	private Container c;

//	public static void main(String[] args) {
//		
//		frame = new SalesmanForm();
//		frame.setVisible(true);
//
//	}
	
public static void page() {
		
		frame = new FormSalesman();
		frame.setVisible(true);
		
	}



	FormSalesman(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Salesman Form");
	
		c = this.getContentPane();
		c.setLayout(null);
	
		JLabel lblSalesmanForm = new JLabel("Addition of new Medicine");
		lblSalesmanForm.setBounds(150, 20, 150, 30);
		lblSalesmanForm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalesmanForm.setForeground(Color.GRAY);
		c.add(lblSalesmanForm);
		
		
		JLabel lblname = new JLabel("Name");
		lblname.setBounds(20, 60, 60, 20);
		lblname.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblname.setForeground(Color.GRAY);
		c.add(lblname);
		
		JTextField nameText = new JTextField();
		nameText.setBounds(90, 60, 100, 20);
		nameText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		nameText.setForeground(Color.GRAY);
		c.add(nameText);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(20, 85, 60, 20);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPassword.setForeground(Color.GRAY);
		c.add(lblPassword);
		
		
		JTextField passwordField = new JTextField();
		passwordField.setBounds(90, 85, 100, 20);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		passwordField.setForeground(Color.GRAY);
		c.add(passwordField);
		
		JLabel lblemail = new JLabel("email");
		lblemail.setBounds(20, 110, 60, 20);
		lblemail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblemail.setForeground(Color.GRAY);
		c.add(lblemail);
		
		JTextField emailText = new JTextField();
		emailText.setBounds(90, 110, 100, 20);
		emailText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		emailText.setForeground(Color.GRAY);
		c.add(emailText);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(20, 135, 60, 20);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAddress.setForeground(Color.GRAY);
		c.add(lblAddress);
		
		
		JTextField AddressField = new JTextField();
		AddressField.setBounds(90, 135, 100, 20);
		AddressField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		AddressField.setForeground(Color.GRAY);
		c.add(AddressField);
		
		JLabel lblContactNo = new JLabel("ContactNo");
		lblContactNo.setBounds(20, 160, 60, 20);
		lblContactNo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblContactNo.setForeground(Color.GRAY);
		c.add(lblContactNo);
		
		JTextField ContactNoText = new JTextField();
		ContactNoText.setBounds(90, 160, 100, 20);
		ContactNoText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ContactNoText.setForeground(Color.GRAY);
		c.add(ContactNoText);
	
		JButton btnadd = new JButton("Add Salesman");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String name = nameText.getText();
					String password = passwordField.getText();
					String email = emailText.getText();
					String address = AddressField.getText();
					String contact=ContactNoText.getText();

					int i=SalesmanDao.save(name, password, email, address, contact);
					if(i>0){
						JOptionPane.showMessageDialog(FormSalesman.this,"Salesman added successfully!");
						AdminSuccess.page();
						frame.dispose();
						
					}else{
						JOptionPane.showMessageDialog(FormSalesman.this,"Sorry, unable to save!");
					}
				
			}
		});
		
		btnadd.setBounds(270, 220, 130, 20);
		btnadd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnadd.setForeground(Color.GRAY);
		
		c.add(btnadd);
		/*
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Salesman Form");
	
		c = this.getContentPane();
		c.setLayout(null);
	
		JLabel lblSalesmanForm = new JLabel("Salesman Form Page");
		lblSalesmanForm.setBounds(150, 20, 150, 30);
		lblSalesmanForm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalesmanForm.setForeground(Color.GRAY);
		c.add(lblSalesmanForm);
		
		
		JLabel lblCallNo = new JLabel("Callno");
		lblCallNo.setBounds(20, 60, 60, 20);
		lblCallNo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCallNo.setForeground(Color.GRAY);
		c.add(lblCallNo);
		
		JTextField callnoText = new JTextField();
		callnoText.setBounds(90, 60, 100, 20);
		callnoText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		callnoText.setForeground(Color.GRAY);
		c.add(callnoText);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(20, 85, 60, 20);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblName.setForeground(Color.GRAY);
		c.add(lblName);
		
		
		JTextField nameField = new JTextField();
		nameField.setBounds(90, 85, 100, 20);
		nameField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		nameField.setForeground(Color.GRAY);
		c.add(nameField);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(20, 110, 60, 20);
		lblAuthor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAuthor.setForeground(Color.GRAY);
		c.add(lblAuthor);
		
		JTextField authorText = new JTextField();
		authorText.setBounds(90, 110, 100, 20);
		authorText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		authorText.setForeground(Color.GRAY);
		c.add(authorText);
					
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(20, 135, 60, 20);
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPrice.setForeground(Color.GRAY);
		c.add(lblPrice);
		
		JTextField priceText = new JTextField();
		priceText.setBounds(90, 135, 100, 20);
		priceText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		priceText.setForeground(Color.GRAY);
		c.add(priceText);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(20, 160, 60, 20);
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblQuantity.setForeground(Color.GRAY);
		c.add(lblQuantity);
		
		JTextField quantityText = new JTextField();
		quantityText.setBounds(90, 160, 100, 20);
		quantityText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		quantityText.setForeground(Color.GRAY);
		c.add(quantityText);
	
		JButton btnAddMedicine = new JButton("Add Medicine");
		btnAddMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String callno = callnoText.getText();
					String name = nameField.getText();
					String author = authorText.getText();
					String sprice= priceText.getText();
					int price = Integer.parseInt(sprice);
					String squantity = quantityText.getText();
					int quantity = Integer.parseInt(squantity);

					int i=MedicineDao.save(callno,name,author,price,quantity);
					if(i>0){
						JOptionPane.showMessageDialog(FormSalesman.this,"Medicine added successfully!");
						SalesmanSuccess.page();
						frame.dispose();
						
					}else{
						JOptionPane.showMessageDialog(FormSalesman.this,"Sorry, unable to save!");
					}
				
			}
		});
		
		btnAddMedicine.setBounds(270, 220, 130, 20);
		btnAddMedicine.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAddMedicine.setForeground(Color.GRAY);
		
		c.add(btnAddMedicine);
		*/
	}

}
