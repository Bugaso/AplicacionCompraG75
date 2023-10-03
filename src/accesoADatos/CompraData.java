package accesoADatos;

import java.sql.*;

public class CompraData {
	private Connection con = null;
	
	
	public CompraData() {
		con = Conexion.getConexion();
	}
}