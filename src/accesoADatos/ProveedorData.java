package accesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;
import entidades.Proveedor;
import java.util.ArrayList;

public class ProveedorData {
	private Connection con;
	
	
	public ProveedorData() {
		this.con = Conexion.getConexion();
	}
	
	public void guardarProveedor(Proveedor proveedor) {
		String sql = "INSERT INTO proveedor (cuit, razonsocial, domicilio, telefono)" + "VALUES(?, ?,  ?, ?)";

		try {
			PreparedStatement ps = this.con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
                        ps.setLong(1, proveedor.getCuit());
                        ps.setString(2, proveedor.getRazonSocial());
                        ps.setString(3, proveedor.getDomicilio());
                        ps.setString(4, proveedor.getTelefono());
                        ps.executeUpdate();

                        ResultSet rs = ps.getGeneratedKeys();

			if (rs.next()) {
				proveedor.setIdProveedor(rs.getInt(1));
				JOptionPane.showMessageDialog(null, "Proveedor Guardado Exitosamente");
			}
			ps.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedores");
		}
	}

	public Proveedor buscarProveedor(int idProveedor) {
		Proveedor proveedor = null;
		String sql = "SELECT cuit, razonsocial, domicilio, telefono FROM proveedor WHERE idProveedor = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, idProveedor);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				proveedor = new Proveedor();
				proveedor.setIdProveedor(idProveedor);
                proveedor.setCuit(rs.getLong("cuit"));
                proveedor.setRazonSocial(rs.getString("razonsocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));              
			} /*else {
				JOptionPane.showMessageDialog(null, "No exite el proveedor con el ID = " + idProveedor);
			}*/

			ps.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor");
		}

		return proveedor;
	}

	public Proveedor buscarProveedorPorcuit(Long cuit) {
		Proveedor proveedor = null;
		String sql = "SELECT idProveedor, razonsocial, domicilio, telefono FROM proveedor " + "WHERE cuit = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setLong(1,cuit);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				proveedor = new Proveedor();
                                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                                proveedor.setCuit(cuit);
                                proveedor.setRazonSocial(rs.getString("razonsocial"));
                                proveedor.setDomicilio(rs.getString("domicilio"));
                                proveedor.setTelefono(rs.getString("telefono"));
			} /*else {
				JOptionPane.showMessageDialog(null, "No existe el proveedor con el CUIL = " + cuil);
			}*/

			ps.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor");
		}

		return proveedor;
	}
	
	public ArrayList<Proveedor> listarProveedor() {
		ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
		String sql = "SELECT idProveedor, cuit, razonsocial, domicilio, telefono FROM proveedor "
				+ "ORDER BY cuit";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Proveedor proveedor = new Proveedor();
				proveedor.setIdProveedor(rs.getInt("idProveedor"));
				proveedor.setCuit(rs.getLong("cuit"));
				proveedor.setRazonSocial(rs.getString("razonsocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
				proveedores.add(proveedor);
			}

			ps.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor");
		}

		return proveedores;
	}
    
	public void modificarProveedor(Proveedor proveedor) {
		String sql = "UPDATE proveedor SET razonsocial = ?, domicilio = ?, telefono = ? "
				+ "WHERE cuit = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setLong(4, proveedor.getCuit());

			int exito = ps.executeUpdate();

			if (exito == 1) {
				JOptionPane.showMessageDialog(null, "Proveedor Modificado Exitosamente");
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor");
		}
	}

	public void eliminarProveedor(Long cuit) {
		String sql = "DELETE FROM proveedor WHERE cuit = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setLong(1, cuit);

			int exito = ps.executeUpdate();

			if (exito == 1) {
				JOptionPane.showMessageDialog(null, "Proveedor Eliminado Exitosamente");
			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor");
		}
	}
}