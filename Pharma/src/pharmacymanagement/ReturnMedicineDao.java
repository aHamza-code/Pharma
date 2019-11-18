
package pharmacyManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReturnMedicineDao {
	
	public static int delete(String medicineName,int clientid, int unit){
		int status=0, sunit=0;
		try{
			Connection con=DB.getConnection();
			
			status=updatebook(medicineName,unit);//updating quantity and issue
			sunit = soldUnit(medicineName,clientid);
                        //System.out.println("<<<<<>>>>"+sunit);
			//
			if(status>0 && sunit>=unit){
			PreparedStatement ps=con.prepareStatement("update sold_medicine set unit=? where name=? and clientid=?");
			ps.setInt(1,sunit-unit);
                        ps.setString(2,medicineName);         //update medicine set quantity=?,issued=? where name=?
			ps.setInt(3,clientid);
			status=ps.executeUpdate();
			}
			
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int updatebook(String medicineName, int unit){
		int status=0;
		int quantity=0,issued=0, un=unit;
		try{
			Connection con=DB.getConnection();
			
			PreparedStatement ps=con.prepareStatement("select quantity,issued from medicine where name=?");
			ps.setString(1,medicineName);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				quantity=rs.getInt("quantity");
				issued=rs.getInt("issued");
			}
			if(issued<un){
                            status = 0;
                        }else if(issued>0 && issued>=un){
			PreparedStatement ps2=con.prepareStatement("update medicine set quantity=?,issued=? where name=?");
			ps2.setInt(1,quantity+un);
			ps2.setInt(2,issued-un);
			ps2.setString(3,medicineName);
			
			status=ps2.executeUpdate();
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
        
        public static int soldUnit(String medicineName,int clientid){
            int sunit=0;
            try{Connection con=DB.getConnection();
			
			PreparedStatement ps =con.prepareStatement("select unit from sold_medicine where name=? and clientid=?");
			ps.setString(1,medicineName);
			ps.setInt(2,clientid);
			ResultSet rs=ps.executeQuery();
                        if(rs.next()){
                            sunit = rs.getInt("unit");
                        }
            }catch(Exception e){System.out.println(e);}
            //System.out.println("..>>>"+sunit);
            return sunit;
        }

}
