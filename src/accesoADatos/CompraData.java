package accesoADatos;

import java.sql.Connection;

public class CompraData {
	private Connection con = null;
	
	
	public CompraData() {
		con = Conexion.getConexion();
	}
}