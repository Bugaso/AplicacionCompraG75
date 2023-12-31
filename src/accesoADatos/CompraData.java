package accesoADatos;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import entidades.Compra;
import entidades.DetalleCompra;

public class CompraData {
	private Connection con = null;
	private ProveedorData provData;
	private ProductoData prodData;
	
	
	public CompraData() {
		this.con = Conexion.getConexion();
		this.provData = new ProveedorData();
		this.prodData = new ProductoData();
	}
	
	public void guardarCompra(Compra compra) {
		String sql = "INSERT INTO compra (idProveedor, fecha) VALUES (?, ?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			ps.setInt(1, compra.getProveedor().getIdProveedor());
			ps.setDate(2, Date.valueOf(compra.getFecha()));
			ps.executeUpdate();
			
			ResultSet rs = ps.getGeneratedKeys();
			
			if(rs.next()) {
				compra.setIdCompra(rs.getInt(1));
				JOptionPane.showMessageDialog(null, "Compra Guardada Exitosamente");
			}
			
			ps.close();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra");
		}
	}
	
        
        public ArrayList<Compra> listarCompras(){
            ArrayList<Compra> compras = new ArrayList<Compra>();
            Compra compra= null;
            String sql = "SELECT `idCompra`, `idProveedor`, `fecha` FROM `compra`";
            
            //java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
            try{
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    compra = new Compra();
                    compra.setIdCompra(rs.getInt("idCompra"));
                    compra.setProveedor(provData.buscarProveedor(rs.getInt("idProveedor")));
                    compra.setFecha(rs.getDate("fecha").toLocalDate());
                    compras.add(compra);
                }
                
                ps.close();
            }catch(SQLException e){
                
            }
            return compras;
        }
        
        
        public ArrayList<Compra> listarPorFecha(LocalDate fecha){
            ArrayList<Compra> compras = new ArrayList<Compra>();
            Compra compra= null;
            String sql = "SELECT `idCompra`, `idProveedor`, `fecha` FROM `compra` where fecha = ?";
            
            //java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
            try{
                PreparedStatement ps = con.prepareStatement(sql);
                
                ps.setDate(1, Date.valueOf(fecha));
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    compra = new Compra();
                    compra.setIdCompra(rs.getInt("idCompra"));
                    compra.setProveedor(provData.buscarProveedor(rs.getInt("idProveedor")));
                    compra.setFecha(fecha);
                    compras.add(compra);
                }
                
                ps.close();
            }catch(SQLException e){
                
            }
            return compras;
        }
        
	public void modificarFechaCompra(int idCompra, int idProveedor, LocalDate fecha) {
		String sql = "UPDATE compra SET fecha = ? WHERE idCompra = ? AND idProveedor = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setDate(1, Date.valueOf(fecha));
			ps.setInt(2, idCompra);
			ps.setInt(3, idProveedor);
			
			int exito = ps.executeUpdate();
			
			if(exito == 1) {
				JOptionPane.showMessageDialog(null, "Fecha de la compra modificado exitosamente");
			}
			
			ps.close();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra");
		}
	}
	
	public Compra buscarCompra(int idCompra) {
		Compra compra = null;
		String sql = "SELECT idProveedor, fecha FROM compra WHERE idCompra = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, idCompra);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				compra = new Compra();
				compra.setIdCompra(idCompra);
				compra.setProveedor(provData.buscarProveedor(rs.getInt("idProveedor")));
				compra.setFecha(rs.getDate("fecha").toLocalDate());
			}
			
			ps.close();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra");
		}
		
		return compra;
	}
	
	public ArrayList<DetalleCompra> ComprasAUnProveedor(int idProveedor){
		ArrayList<DetalleCompra> compras = new ArrayList<DetalleCompra>();
//		String sql = "SELECT idCompra, idProveedor, fecha FROM compra WHERE idProveedor = ?";
		String sql = "SELECT dc.idDetalle, c.idCompra, c.idProveedor, c.fecha, p.*, dc.precioCosto, dc.cantidad "
				+ "FROM compra c "
				+ "INNER JOIN detallecompra dc ON (c.idCompra = dc.idCompra) "
				+ "INNER JOIN producto p ON (dc.idProducto = p.idProducto) "
				+ "WHERE c.idProveedor = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, idProveedor);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
//				Compra compra = new Compra();
//				compra.setIdCompra(rs.getInt("idCompra"));
//				compra.setProveedor(provData.buscarProveedor(idProveedor));
//				compra.setFecha(rs.getDate("fecha").toLocalDate());
//				compras.add(compra);
				DetalleCompra detCompra = new DetalleCompra();
				detCompra.setIdDetalle(rs.getInt("dc.idDetalle"));
				detCompra.setCompra(buscarCompra(rs.getInt("c.idCompra")));
				detCompra.setProducto(prodData.buscarProducto(rs.getInt("p.idProducto")));
				detCompra.setPrecioCosto(rs.getDouble("dc.precioCosto"));
				detCompra.setCantidad(rs.getInt("dc.cantidad"));
				compras.add(detCompra);
			}
			
			ps.close();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra");
		}
		
		return compras;
	}
}