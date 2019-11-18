
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
import javax.swing.table.DefaultTableModel;

public class ViewMedicineSold extends JFrame{
	
	static ViewMedicineSold frame;
	private JPanel panel;
        //private Container c;
	
	public static void page() {
		frame = new ViewMedicineSold();
		frame.setVisible(true);
	}
	ViewMedicineSold(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(100, 100, 550, 300);
		setTitle("Salesman panel");
		
                //c = this.getContentPane();
                //c.setLayout(null);
                
		panel = new JPanel();
		setContentPane(panel);
		
		JLabel lblSalesmanView = new JLabel("All sold Medicine list");
		lblSalesmanView.setBounds(170, 20, 150, 30);
		lblSalesmanView.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblSalesmanView.setForeground(Color.GRAY);
		panel.add(lblSalesmanView, BorderLayout.CENTER);
		
		String data[][]=null;
		String column[]=null;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from sold_medicine",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
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
                //DefaultTableModel model = new DefaultTableModel();
                //model.setColumnIdentifiers(column);
                //table.setModel(model);
                
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(20, 60, 300,150);
                panel.add(sp);//, BorderLayout.CENTER);
		
	}

}
