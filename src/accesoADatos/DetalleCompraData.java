package accesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;
import entidades.DetalleCompra;

public class DetalleCompraData {
	private Connection con = null;
	
	
	public DetalleCompraData() {
		con = Conexion.getConexion();
	}
	
	public void guardarDetalleCompra(DetalleCompra detCompra) {
		String sql = "INSERT INTO detallecompra (idCompra, idProducto, precioCosto, cantidad) VALUES (?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			ps.setInt(1, detCompra.getCompra().getIdCompra());
			ps.setInt(2, detCompra.getProducto().getIdProducto());
			ps.setDouble(3, detCompra.getPrecioCosto());
			ps.setInt(4, detCompra.getCantidad());
			ps.executeUpdate();
			
			ResultSet rs = ps.getGeneratedKeys();
			
			if(rs.next()) {
				detCompra.setIdDetalle(1);
				JOptionPane.showMessageDialog(null, "Detalle de Compra guardado exitosamente!!!");
			}
			
			ps.close();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Detalle de Compra");
		}
	}
}