
package pharmacyManagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SalesmanSuccess extends JFrame{
	
	static SalesmanSuccess frame;
	private Container c;
	
	public static void page() {
		
		frame = new SalesmanSuccess();
		frame.setVisible(true);
		
	}

	SalesmanSuccess(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Salesman Panel");
	
		c = this.getContentPane();
		c.setLayout(null);
	
		JLabel lblSalesmanSuccess = new JLabel("Salesman Page");
		lblSalesmanSuccess.setBounds(170, 20, 150, 30);
		lblSalesmanSuccess.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalesmanSuccess.setForeground(Color.GRAY);
		c.add(lblSalesmanSuccess);
		
		JButton btnMedicineList = new JButton("Avilable Medicine");
		btnMedicineList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AdminLogin.main(new String[]{});
				Medicine.page();
				frame.dispose();
				
			}
			
			
		});
		
		btnMedicineList.setBounds(20, 100, 130, 20);
		btnMedicineList.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMedicineList.setForeground(Color.GRAY);
		
		c.add(btnMedicineList);
		
		JButton btnViewMedicine = new JButton("Add Medicine");
		btnViewMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AdminLogin.main(new String[]{});
				MedicineForm.page();
				frame.dispose();
				
			}
			
			
		});
		
		btnViewMedicine.setBounds(260, 100, 140, 20);
		btnViewMedicine.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnViewMedicine.setForeground(Color.GRAY);
		
		c.add(btnViewMedicine);
		//
		
		JButton btnSoldMedicine = new JButton("Sold Medicine");
		btnSoldMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AdminLogin.main(new String[]{});
				MedicineSold.page();
				frame.dispose();
				
			}
			
			
		});
		
		btnSoldMedicine.setBounds(20, 140, 130, 20);
		btnSoldMedicine.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSoldMedicine.setForeground(Color.GRAY);
		
		c.add(btnSoldMedicine);
		
		JButton btnViewSoldMedicine = new JButton("View sold Medicine");
		btnViewSoldMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AdminLogin.main(new String[]{});
				ViewMedicineSold.page();
				frame.dispose();
				
			}
			
			
		});
		
		btnViewSoldMedicine.setBounds(260, 140, 140, 20);
		btnViewSoldMedicine.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnViewSoldMedicine.setForeground(Color.GRAY);
		
		c.add(btnViewSoldMedicine);
		
		JButton btnReturnMedicine = new JButton("Returned Medicine");
		btnReturnMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AdminLogin.main(new String[]{});
				ReturnMedicine.page();
				frame.dispose();
				
			}
			
			
		});
		
		btnReturnMedicine.setBounds(20, 180, 130, 20);
		btnReturnMedicine.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturnMedicine.setForeground(Color.GRAY);
		
		c.add(btnReturnMedicine);
		
		JButton btnMedicineDelete = new JButton("Delete Medicine");
		btnMedicineDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AdminLogin.main(new String[]{});
				DeleteMedicine.page();
				frame.dispose();
				
			}
			
			
		});
		
		btnMedicineDelete.setBounds(260, 180, 140, 20);
		btnMedicineDelete.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMedicineDelete.setForeground(Color.GRAY);
		
		c.add(btnMedicineDelete);
		
				
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
