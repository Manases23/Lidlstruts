package classes;

import java.sql.ResultSet;

import bd.MysqlConnect;

public class GestorUsuario {

	public static boolean existeUsuario (String username, String password){
		
		MysqlConnect c = MysqlConnect.getDbCon();		
		ResultSet rs=null;
	
		try {
			
			rs = c.query("SELECT * FROM cliente WHERE cliente.usuario = '"+username+"' and cliente.contrasena ='"+password+"'");
			if (rs.next()) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return false;
		
	}
	
	public static boolean registraUsuario(String username, String password, String nombre, int edad){
		
		MysqlConnect c = MysqlConnect.getDbCon();		
		
		try {
			
			if(c.insert("INSERT INTO cliente(`nombre`, `edad`, `usuario`, `contrasena`) VALUES('"+nombre+"','"+edad+"','"+username+"','"+password+"');")>0){
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	

}
