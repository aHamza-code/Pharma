
package pharmacyManagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class UpdateSalesman extends JFrame{
	
	static UpdateSalesman frame;
	private Container c;
	
	public static void page() {
		frame = new UpdateSalesman();
		frame.setVisible(true);
		
	}
	
	UpdateSalesman(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Update Salesman");
	
		c = this.getContentPane();
		c.setLayout(null);
	
		JLabel lblAdminSuccess = new JLabel("Update Salesman Page");
		lblAdminSuccess.setBounds(170, 20, 150, 30);
		lblAdminSuccess.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdminSuccess.setForeground(Color.GRAY);
		c.add(lblAdminSuccess);
	}

}
