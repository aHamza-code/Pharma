
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
import javax.swing.JTextField;

public class MedicineForm extends JFrame{
	
	static MedicineForm frame;
	private Container c;
	
	public static void page() {
		frame = new MedicineForm();
		frame.setVisible(true);
	}
	MedicineForm(){
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
					String sprice = priceText.getText();
					int price = Integer.parseInt(sprice);
					String squantity = quantityText.getText();
					int quantity = Integer.parseInt(squantity);

					int i=MedicineDao.save(callno,name,author,price,quantity);
					if(i>0){
						JOptionPane.showMessageDialog(MedicineForm.this,"Medicine added successfully!");
						SalesmanSuccess.page();
						frame.dispose();
						
					}else{
						JOptionPane.showMessageDialog(MedicineForm.this,"Sorry, unable to save!");
					}
				
			}
		});
		
		btnAddMedicine.setBounds(270, 220, 130, 20);
		btnAddMedicine.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAddMedicine.setForeground(Color.GRAY);
		
		c.add(btnAddMedicine);
	}

}
