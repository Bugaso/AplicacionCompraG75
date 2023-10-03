package accesoADatos;

import java.sql.*;

public class DetalleCompraData {
	private Connection con = null;
	
	
	public DetalleCompraData() {
		con = Conexion.getConexion();
	}
}