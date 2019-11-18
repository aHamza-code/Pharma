
package pharmacyManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SoldMedicineDao {
	
	public static boolean checkBook(String medicinename){
		boolean status=false;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from medicine where name=?");
			ps.setString(1,medicinename);
		    ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static int save(String medicinename,int unit, int clientid,String clientname,String clientcontact){
		int status=0;
		try{
			Connection con=DB.getConnection();
			
			status=updatebook(medicinename, unit);//updating quantity and issue
			
			if(status>0){
			PreparedStatement ps=con.prepareStatement("insert into sold_medicine(name,unit,clientid,clientname,clientcontact ) values(?,?,?,?,?)");
			ps.setString(1,medicinename);
			ps.setInt(2,unit);
			ps.setInt(3,clientid);
			ps.setString(4,clientname);
			ps.setString(5,clientcontact);
			status=ps.executeUpdate();
			}
			
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int updatebook(String medicinename, int unit){
		int status=0;
		int quantity=0,issued=0;
		int unitSold = unit;
		try{
			Connection con=DB.getConnection();
			
			PreparedStatement ps=con.prepareStatement("select quantity,issued from medicine where name=?");
			ps.setString(1,medicinename);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				quantity=rs.getInt("quantity");
				issued=rs.getInt("issued");
			}
			
			if(quantity>0 && unitSold <= quantity){
			PreparedStatement ps2=con.prepareStatement("update medicine set quantity=?,issued=? where name=?");
			ps2.setInt(1,quantity-unitSold);
			ps2.setInt(2,issued+unitSold);
			ps2.setString(3,medicinename);
			
			status=ps2.executeUpdate();
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
        

}
