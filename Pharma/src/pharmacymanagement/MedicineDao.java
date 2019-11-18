
package pharmacyManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MedicineDao {
	
	public static int save(String callno,String name,String author,int price,int quantity){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into medicine(callno,name,author,price,quantity) values(?,?,?,?,?)");
			ps.setString(1,callno);
			ps.setString(2,name);
			ps.setString(3,author);
			ps.setInt(4,price);
			ps.setInt(5,quantity);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(int id) {
		int sttus =0;
		try {
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement("delete From medicine where id=?");
			ps.setInt(1, id);
			sttus = ps.executeUpdate();
			con.close();			
			
		}catch(Exception e){System.out.println(e);}
		return sttus;
	}

}
