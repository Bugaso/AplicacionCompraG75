package accesoADatos;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import entidades.*;

public class DetalleCompraData {
	private Connection con = null;
	private CompraData compraData;
	private ProveedorData provData;
	private ProductoData prodData;
	
	
	public DetalleCompraData() {
		this.con = Conexion.getConexion();
		this.compraData = new CompraData();
		this.provData = new ProveedorData();
		this.prodData = new ProductoData();
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
	
        
        
        
        
	public ArrayList<DetalleCompra> productosDeUnaCompraDeUnaFecha(LocalDate fecha){
		ArrayList<DetalleCompra> productos = new ArrayList<DetalleCompra>();
		String sql = "SELECT dc.idDetalle, c.idCompra, c.idProveedor, c.fecha, p.*, dc.precioCosto, dc.cantidad "
				+ "FROM compra c JOIN detallecompra dc ON (dc.idCompra = c.idCompra) "
				+ "JOIN producto p ON (dc.idProducto = p.idProducto) "
				+ "WHERE c.fecha = ?";
                try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setDate(1, Date.valueOf(fecha));
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
//				Producto producto = new Producto();
//				producto.setIdProducto(rs.getInt("p.idProducto"));
//				producto.setNombreProducto(rs.getString("p.nombreProducto"));
//				producto.setDescripcion(rs.getString("p.descripción"));
//				producto.setPrecioActual(rs.getDouble("p.precioActual"));
//				producto.setStock(rs.getInt("p.stock"));
//				producto.setEstado(rs.getBoolean("p.estado"));
//				productos.add(producto);
				DetalleCompra detCompra = new DetalleCompra();
				detCompra.setIdDetalle(rs.getInt("dc.idDetalle"));
				detCompra.setCompra(compraData.buscarCompra(rs.getInt("c.idCompra")));
				detCompra.setProducto(prodData.buscarProducto(rs.getInt("p.idProducto")));
				detCompra.setPrecioCosto(rs.getDouble("dc.precioCosto"));
				detCompra.setCantidad(rs.getInt("dc.cantidad"));
				productos.add(detCompra);
			}
			
			ps.close();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra y/o Detalle Compra y/o Producto");
		}
		
		return productos;
	}
	
	public ArrayList<DetalleCompra> productosDeUnaCompra(int idCompra){
		ArrayList<DetalleCompra> productos = new ArrayList<DetalleCompra>();
		String sql = "SELECT dc.idDetalle, c.idCompra, c.idProveedor, c.fecha, p.*, dc.precioCosto, dc.cantidad "
				+ "FROM compra c "
				+ "INNER JOIN detallecompra dc ON (c.idCompra = dc.idCompra) "
				+ "INNER JOIN producto p ON (dc.idProducto = p.idProducto) "
				+ "WHERE c.idCompra = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, idCompra);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
//				Producto producto = prodData.buscarProducto(rs.getInt("dc.idProducto"));
//				productos.add(producto);
				DetalleCompra detCompra = new DetalleCompra();
				detCompra.setIdDetalle(rs.getInt("dc.idDetalle"));
				detCompra.setCompra(compraData.buscarCompra(rs.getInt("c.idCompra")));
				detCompra.setProducto(prodData.buscarProducto(rs.getInt("p.idProducto")));
				detCompra.setPrecioCosto(rs.getDouble("dc.precioCosto"));
				detCompra.setCantidad(rs.getInt("dc.cantidad"));
				productos.add(detCompra);
			}
			
			ps.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra y/o Detalle Compra");
		}
		
		return productos;
	}
	
	public ArrayList<Proveedor> proveedoresQueProveenUnProducto(int idProducto){
		ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
		String sql = "SELECT dc.idDetalle, c.idCompra, c.idProveedor, c.fecha, p.*, dc.precioCosto, dc.cantidad "
				+ "FROM compra c "
				+ "INNER JOIN detallecompra dc ON (c.idCompra = dc.idCompra) "
				+ "INNER JOIN producto p ON (dc.idProducto = p.idProducto) "
				+ "WHERE p.idCompra = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, idProducto);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
//				Proveedor proveedor = provData.buscarProveedor(rs.getInt("c.idProveedor"));
//				proveedores.add(proveedor);
				DetalleCompra detCompra = new DetalleCompra();
				detCompra.setIdDetalle(rs.getInt("dc.idDetalle"));
				detCompra.setCompra(compraData.buscarCompra(rs.getInt("c.idCompra")));
				detCompra.setProducto(prodData.buscarProducto(rs.getInt("p.idProducto")));
				detCompra.setPrecioCosto(rs.getDouble("dc.precioCosto"));
				detCompra.setCantidad(rs.getInt("dc.cantidad"));
				proveedores.add(provData.buscarProveedor(rs.getInt("c.idProveedor")));
			}
			
			ps.close();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra y/o Detalle Compra y/o Producto");
		}
		
		return proveedores;
	}
	
	public ArrayList<Producto> productosMasCompradosEntreDosFechas(LocalDate fecha1, LocalDate fecha2){
		ArrayList<Producto> productos = new ArrayList<Producto>();
		String sql = "SELECT dc.idDetalle, c.idCompra, c.idPreveedor, c.fecha, p.*, dc.precioCosto, dc.cantidad, "
				+ "SUM(dc.cantidad) AS TOTAL"
				+ "FROM compra c "
				+ "INNER JOIN detallecompra dc ON (c.idCompra = dc.idCompra) "
				+ "INNER JOIN producto p ON (dc.idProducto = p.idProducto) "
				+ "WHERE c.fecha BETWEEN ? AND ? "
				+ "GROUP BY p.idProducto, p.nombreProducto, p.descripción "
				+ "HAVING TOTAL >= 5 "
				+ "ORDER BY TOTAL ASC";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setDate(1, Date.valueOf(fecha1));
			ps.setDate(2, Date.valueOf(fecha2));
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
//				Producto producto = new Producto();
//				producto.setIdProducto(rs.getInt("p.idProducto"));
//				producto.setNombreProducto(rs.getString("p.nombreProducto"));
//				producto.setDescripcion(rs.getString("p.descripción"));
//				producto.setPrecioActual(rs.getDouble("p.precioActual"));
//				producto.setStock(rs.getInt("p.stock"));
//				producto.setEstado(rs.getBoolean("p.estado"));
//				productos.add(producto);
				DetalleCompra detCompra = new DetalleCompra();
				detCompra.setIdDetalle(rs.getInt("dc.idDetalle"));
				detCompra.setCompra(compraData.buscarCompra(rs.getInt("c.idCompra")));
				detCompra.setProducto(prodData.buscarProducto(rs.getInt("p.idProducto")));
				detCompra.setPrecioCosto(rs.getDouble("dc.precioCosto"));
				detCompra.setCantidad(rs.getInt("dc.cantidad"));
				productos.add(detCompra.getProducto());
			}
			
			ps.close();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compra y/o Detalle Compra y/o Producto");
		}
		
		return productos;
	}
}