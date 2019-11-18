
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

public class DeleteSalesman extends JFrame{
	
	static DeleteSalesman frame;
	private Container c;

//	public static void main(String[] args) {
//		frame = new ViewSalesman();
//		frame.setVisible(true);
//
//	}
	
	public static void page() {
		
		frame = new DeleteSalesman();
		frame.setVisible(true);
		
	}
	DeleteSalesman(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Salesman View");
	
		c = this.getContentPane();
		c.setLayout(null);
	
		JLabel lblSalesmanDelete = new JLabel("Salesman Delete Page");
		lblSalesmanDelete.setBounds(150, 20, 150, 30);
		lblSalesmanDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalesmanDelete.setForeground(Color.GRAY);
		c.add(lblSalesmanDelete);
		
		JLabel lblSalesmanId = new JLabel("Salesman Id");
		lblSalesmanId.setBounds(20, 80, 100, 20);
		lblSalesmanId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalesmanId.setForeground(Color.GRAY);
		c.add(lblSalesmanId);
		
		JTextField idText = new JTextField();
		idText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String tId = idText.getText();
				if(tId==null || tId.trim().equals("")) {
					JOptionPane.showMessageDialog(DeleteSalesman.this,"Id can't be blank");
				}else {
					int id = Integer.parseInt(tId);
					int i = SalesmanDao.delete(id);
					if(id>0) {
						JOptionPane.showMessageDialog(DeleteSalesman.this, "Record deleted successfully!");
						AdminSuccess.page();
					}else {
						JOptionPane.showMessageDialog(DeleteSalesman.this, "Unable to delete given id!");
					}
				}
				
			}
		});
		
		idText.setBounds(120, 80, 30, 20);
		idText.setFont(new Font("Tahoma", Font.PLAIN, 14));
		idText.setForeground(Color.GRAY);
		c.add(idText);
		
		//SalesmanDao.delete();
	}

}
