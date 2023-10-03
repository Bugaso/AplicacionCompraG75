package accesoADatos;

import java.sql.*;

public class ProductoData {
	private Connection con = null;
	
	
	public ProductoData() {
		con = Conexion.getConexion();
	}
}