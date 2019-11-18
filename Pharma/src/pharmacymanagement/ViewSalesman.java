
package pharmacyManagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ViewSalesman extends JFrame{
	
	static ViewSalesman frame;
	private Container c;

//	public static void main(String[] args) {
//		frame = new ViewSalesman();
//		frame.setVisible(true);
//
//	}
	
	public static void page() {
		
		frame = new ViewSalesman();
		frame.setVisible(true);
		
	}
	ViewSalesman(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(100, 100, 550, 300);
		setTitle("Salesman View");
	
//		c = this.getContentPane();
//		c.setLayout(null);
//	
//		JLabel lblSalesmanForm = new JLabel("Salesman View Page");
//		lblSalesmanForm.setBounds(150, 20, 150, 30);
//		lblSalesmanForm.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lblSalesmanForm.setForeground(Color.GRAY);
//		c.add(lblSalesmanForm);
		
		JPanel panel = new JPanel();
		setContentPane(panel);
		
		JLabel lblSalesmanView = new JLabel("Salesman View Page");
		lblSalesmanView.setBounds(150, 20, 150, 30);
		lblSalesmanView.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalesmanView.setForeground(Color.GRAY);
		panel.add(lblSalesmanView, BorderLayout.CENTER);
		
		String data[][]=null;
		String column[]=null;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from salesman",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=ps.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols=rsmd.getColumnCount();
			column=new String[cols];
			for(int i=1;i<=cols;i++){
				column[i-1]=rsmd.getColumnName(i);
			}
			
			rs.last();
			int rows=rs.getRow();
			rs.beforeFirst();

			data=new String[rows][cols];
			int count=0;
			while(rs.next()){
				for(int i=1;i<=cols;i++){
					data[count][i-1]=rs.getString(i);
				}
				count++;
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		JTable table = new JTable(data,column);
		JScrollPane sp=new JScrollPane(table);
		
		panel.add(sp, BorderLayout.CENTER);  
		
	}

}
