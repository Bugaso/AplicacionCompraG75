package accesoADatos;

import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductoData {
	private Connection con = null;
	
	
	public ProductoData() {
		con = Conexion.getConexion();
	}
        
        public void guardarProducto(Producto producto) {//Este método se utiliza para insertar un nuevo alumno en la base de datos.
                                                 //Toma un objeto Alumno como parámetro y utiliza una consulta SQL parametrizada para realizar la inserción.
		String sql = "INSERT INTO producto (nombreProducto, descripcion, precioActual, stock, estado)" 
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
				JOptionPane.showMessageDialog(null, "el producto ha sido Guardado exitosamente");// Muestra un mensaje de éxito o error en una ventana emergente utilizando `JOptionPane`
}
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
		}
	}
        public Producto buscarProducto(int idProducto) {//Este método busca un producto en la base de datos por su ID.
                                            //Toma un ID como parámetro y devuelve un objeto `Alumno` 
                                            //si se encuentra o `null` si no se encuentra.
		Producto producto = null;
		String sql = "SELECT nombreProducto, descripcion, precioActual, stock FROM producto "
				+ "WHERE idProducto = ? AND estado = 1";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, idProducto);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				producto = new Producto();
				producto.setIdProducto(idProducto);// cambia el valor del idproducto
				producto.setNombreProducto(rs.getString("nombreProducto"));//cambia el nombre del producto
				producto.setDescripcion(rs.getString("descripcion"));
				producto.setPrecioActual(rs.getDouble("precioActual"));
				producto.setStock(rs.getInt("stock"));
				producto.setEstado(true);
			}else {
				JOptionPane.showMessageDialog(null, "No exite el producto con el ID = " + idProducto);
			}
			
			ps.close();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
		}
		
		return producto;
	}
        
        public void ModificarProducto(Producto produc){
            String sql ="UPDATE producto SET nombreProducto=?, descripcion=?, precioActual=?, stock=?,estado=? WHERE idProducto=?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);//prepara la sentencia sql para enviar a la base de datos
                ps.setString(1,produc.getNombreProducto());//trae el nombre del producto
                ps.setString(2, produc.getDescripcion());//trae la descripcion
                ps.setDouble(3,produc.getPrecioActual());//trae el precio actual
                ps.setInt(4,produc.getStock());
                ps.setBoolean(5, produc.isEstado());
                ps.setInt(6,produc.getIdProducto());
                
                int exito=ps.executeUpdate();//envia el PreparedStatement a la base de datos y te regresa la cantidad de filas que se modificaron
                if (exito==1){
                   JOptionPane.showMessageDialog(null, "Producto modicado exitosamente");
                }
        
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
            }
        }
      public ArrayList<Producto> ProductosDebajoDelStockMinimo(){
            String sql = "SELECT * FROM producto  WHERE stock<=?";
             ArrayList<Producto> producto= new ArrayList<Producto>();
             
            try {
               PreparedStatement ps = con.prepareStatement(sql);
               ps.setInt(1,30);
               ResultSet rs= ps.executeQuery();//. en este caso te devuelve el productos si el stock esta debajo de 30
               while(rs.next()){
                
                   
               }
                    
               
               
          } catch (Exception e) {
          }
            return producto;
      }
        
        //
}

