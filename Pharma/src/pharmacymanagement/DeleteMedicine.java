
package pharmacyManagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeleteMedicine extends JFrame{
	static DeleteMedicine frame;
	private Container c;
	
	public static void page() {
		frame = new DeleteMedicine();
		frame.setVisible(true);
	}
	
	DeleteMedicine(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Salesman panel");
	
		c = this.getContentPane();
		c.setLayout(null);
	
		JLabel lblDeleteMedicine = new JLabel("All Deleted Medicine List");
		lblDeleteMedicine.setBounds(170, 20, 150, 30);
		lblDeleteMedicine.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDeleteMedicine.setForeground(Color.GRAY);
		c.add(lblDeleteMedicine);
		
		JLabel lblSalesmanId = new JLabel("Medicine ID");
		lblSalesmanId.setBounds(20, 80, 100, 20);
		lblSalesmanId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalesmanId.setForeground(Color.GRAY);
		c.add(lblSalesmanId);
		
		JTextField idText = new JTextField();
		idText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tId = idText.getText();
				if(tId==null || tId.trim().equals("")) {
					JOptionPane.showMessageDialog(DeleteMedicine.this,"Id can't be blank");
				}else {
					int id = Integer.parseInt(tId);
					int i = MedicineDao.delete(id);
					if(id>0) {
						JOptionPane.showMessageDialog(DeleteMedicine.this, "Record deleted successfully!");
						SalesmanSuccess.page();
						frame.dispose();
					}else {
						JOptionPane.showMessageDialog(DeleteMedicine.this, "Unable to delete given id!");
					}
				}
				
			}
		});
		
		idText.setBounds(120, 80, 40, 20);
		idText.setFont(new Font("Tahoma", Font.PLAIN, 14));
		idText.setForeground(Color.GRAY);
		c.add(idText);
	}

}
