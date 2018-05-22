package utilidades;

import java.sql.*;
import javax.sql.*;


public class Acceso {
	
	public static Statement aMysql(String driverUrl, String user, String password){
    Connection con = null;
    Statement st = null;
    
	
 
    	String driverClassName = "com.mysql.jdbc.Driver";
    	System.out.println("vamos a crear el st");
    	try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(driverUrl,user,password);
	    	
	    	st =  con.createStatement();
	    	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    	
    	
  

	return st;
}
	
	


public static ResultSet consultMySql(String driverUrl, String user, String password, String query){
	
	Statement st = null;
	ResultSet rs = null;
	try{
	st = aMysql( driverUrl,  user,  password);
	System.out.println("Tenemos el st con exito");
	rs = st.executeQuery(query);
	
	}catch (SQLException e){
		e.toString();
	}catch (Exception e){
		e.toString();
	}
	return rs;
}

public static int modifMySql(String driverUrl, String user, String password, String query) throws SQLException{
	
	Statement st = null;
	int num = -3;
	try{
	st = aMysql( driverUrl,  user,  password);
	
	num = st.executeUpdate(query);
	}catch (SQLException e){
		e.toString();
	}catch (Exception e){
		e.toString();
	}
	return num;
}
}
