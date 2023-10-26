package accesoADatos;

import entidades.Producto;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductoData {
	private Connection con = null;
	
	
	public ProductoData() {
		this.con = Conexion.getConexion();
	}
        
    public void guardarProducto(Producto producto) {//Este método se utiliza para insertar un nuevo alumno en la base de datos.
                                                 	//Toma un objeto Alumno como parámetro y utiliza una consulta SQL parametrizada para realizar la inserción.
	String sql = "INSERT INTO producto (nombreProducto, descripción, precioActual, stock, estado)" 
				+ "VALUES(?, ?, ?, ?, ?)";
		
	try {
		PreparedStatement ps = this.con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);//obtiene la clave generada automáticamente (posiblemente el ID del alumno) 
                                                                                               //utilizando `Statement.RETURN_GENERATED_KEYS` y actualiza el ID del objeto
                                                                                               //`Alumno` con el valor generado.
		ps.setString(1, producto.getNombreProducto());
		ps.setString(2, producto.getDescripcion());
		ps.setDouble(3, producto.getPrecioActual());
		ps.setInt(4, producto.getStock());
		ps.setBoolean(5, producto.isEstado());
		ps.executeUpdate();
			
		ResultSet rs = ps.getGeneratedKeys();
			
		if(rs.next()) {
			producto.setIdProducto(rs.getInt(1));
			JOptionPane.showMessageDialog(null, "El producto ha sido guardado exitosamente");// Muestra un mensaje de éxito o error en una ventana emergente utilizando `JOptionPane`
		}
		
		ps.close();
		
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
		}
    }
    
    public Producto buscarProducto(int idProducto) {//Este método busca un producto en la base de datos por su ID.
                                            		//Toma un ID como parámetro y devuelve un objeto `Alumno` 
                                            		//si se encuentra o `null` si no se encuentra.
	Producto producto = null;
	String sql = "SELECT nombreProducto, descripción, precioActual, stock FROM producto "
				+ "WHERE idProducto = ? AND estado = 1";
		
	try {
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, idProducto);
		ResultSet rs = ps.executeQuery();
			
		if(rs.next()) {
			producto = new Producto();
			producto.setIdProducto(idProducto);// cambia el valor del idproducto
			producto.setNombreProducto(rs.getString("nombreProducto"));//cambia el nombre del producto
			producto.setDescripcion(rs.getString("descripción"));
			producto.setPrecioActual(rs.getDouble("precioActual"));
			producto.setStock(rs.getInt("stock"));
			producto.setEstado(true);
		}/*else {
			JOptionPane.showMessageDialog(null, "No exite el producto con el ID = " + idProducto);
		}*/
		
		ps.close();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
		}
		
		return producto;
	}
        
    public void modificarProducto(Producto producto){
    	String sql = "UPDATE producto SET nombreProducto = ?, descripción = ?, precioActual = ?, stock = ?,estado = ? "
    			+ "WHERE idProducto = ?";
    	
        try {
        	PreparedStatement ps = con.prepareStatement(sql);//prepara la sentencia sql para enviar a la base de datos
        	
            ps.setString(1,producto.getNombreProducto());//trae el nombre del producto
            ps.setString(2, producto.getDescripcion());//trae la descripcion
            ps.setDouble(3,producto.getPrecioActual());//trae el precio actual
            ps.setInt(4,producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6,producto.getIdProducto());
                
            int exito = ps.executeUpdate();//envia el PreparedStatement a la base de datos y te regresa la cantidad de filas que se modificaron
            
            if (exito == 1){
            	JOptionPane.showMessageDialog(null, "Producto Modificado Exitosamente");
            }
            
            ps.close();
            
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
            }
    }
    
    public ArrayList<Producto> ProductosDebajoDelStockMinimo(){
    	ArrayList<Producto> productos = new ArrayList<Producto>();
    	String sql = "SELECT * FROM producto WHERE stock <= ? AND estado = 1";
             
        try {
        	PreparedStatement ps = con.prepareStatement(sql);
        	
            ps.setInt(1, 5);
            
            ResultSet rs = ps.executeQuery();//. en este caso te devuelve el productos si el stock esta debajo de 30
            
            while(rs.next()){
            	Producto producto = new Producto();
            	producto.setIdProducto(rs.getInt("idProducto"));
            	producto.setNombreProducto(rs.getString("nombreProducto"));
            	producto.setDescripcion(rs.getString("descripción"));
            	producto.setPrecioActual(rs.getDouble("precioActual"));
            	producto.setStock(rs.getInt("stock"));
            	producto.setEstado(rs.getBoolean("estado"));
            	productos.add(producto);
            }
                    
            ps.close();
            
        	} catch (SQLException e) {
        	  JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        	}
        
        return productos;
    }     
    
    public ArrayList<Producto> listarProductos(){
    	ArrayList<Producto> productos = new ArrayList<Producto>();
    	String sql = "SELECT idProducto, nombreProducto, descripción, precioActual, stock FROM producto WHERE estado = 1";
             
        try {
        	PreparedStatement ps = con.prepareStatement(sql);
        	
            ps.setInt(1,0);
            
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){
            	Producto producto = new Producto();
            	producto.setIdProducto(rs.getInt("idProducto"));
            	producto.setNombreProducto(rs.getString("nombreProducto"));
            	producto.setDescripcion(rs.getString("descripción"));
            	producto.setPrecioActual(rs.getDouble("precioActual"));
            	producto.setStock(rs.getInt("stock"));
            	
            	productos.add(producto);
            }
                    
            ps.close();
            
        	} catch (SQLException e) {
        	  JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        	}
        
        return productos;
    }
    
    public ArrayList<Producto> listarProductosInactivos(){
    	ArrayList<Producto> productos = new ArrayList<Producto>();
    	String sql = "SELECT idProducto, nombreProducto, descripción, precioActual, stock FROM producto WHERE estado = 0";
             
        try {
        	PreparedStatement ps = con.prepareStatement(sql);
        	
            ps.setInt(1,0);
            
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){
            	Producto producto = new Producto();
            	producto.setIdProducto(rs.getInt("idProducto"));
            	producto.setNombreProducto(rs.getString("nombreProducto"));
            	producto.setDescripcion(rs.getString("descripción"));
            	producto.setPrecioActual(rs.getDouble("precioActual"));
            	producto.setStock(rs.getInt("stock"));
            	
            	productos.add(producto);
            }
                    
            ps.close();
            
        	} catch (SQLException e) {
        	  JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        	}
        
        return productos;
    }
}