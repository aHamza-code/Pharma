
package pharmacyManagement;

import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JScrollPane;
import javax.swing.JTable;


public class SalesmanDao{
	private static Container contentPane;
	

	
	public static int save(String name,String password,String email,String address,String contact){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into salesman(name,password,email,address,contact) values(?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,password);
			ps.setString(3,email);
			ps.setString(4,address);
			ps.setString(5,contact);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	public static int delete(int id) {
		int sttus =0;
		try {
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement("delete From salesman where id=?");
			ps.setInt(1, id);
			sttus = ps.executeUpdate();
			con.close();			
			
		}catch(Exception e){System.out.println(e);}
		return sttus;
	}
	public static boolean validate(String user, String password) {
		boolean status =false;
		try {
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from salesman where name=? and password=?");
			ps.setString(1,user);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		return status;
		
	}

	
}
