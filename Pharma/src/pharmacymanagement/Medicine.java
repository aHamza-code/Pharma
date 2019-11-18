
package pharmacyManagement;

import java.awt.BorderLayout;
import java.awt.Color;
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

public class Medicine extends JFrame{
	
	static Medicine frame;
	private JPanel panel;
	
	public static void  page() {
		frame = new Medicine();
		frame.setVisible(true);
	}
	
	Medicine(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(100, 100, 550, 300);
		setTitle("Salesman panel");
		
		panel = new JPanel();
		setContentPane(panel);
		
		JLabel lblSalesmanView = new JLabel("All avilable Medicine list");
		lblSalesmanView.setBounds(150, 20, 150, 30);
		lblSalesmanView.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalesmanView.setForeground(Color.GRAY);
		panel.add(lblSalesmanView, BorderLayout.CENTER);
		
		String data[][]=null;
		String column[]=null;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from medicine",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
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
