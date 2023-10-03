package accesoADatos;

import java.sql.Connection;

public class ProveedorData {
	private Connection con = null;
	
	
	public ProveedorData() {
		this.con = Conexion.getConexion();
	}
}