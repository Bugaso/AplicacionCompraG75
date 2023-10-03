package entidades;

public class Producto {
    private int idProducto;
    private String nombreProducto;
    private String descripcion;
    private double precioActual;
    private int stock;
    private boolean estado;
    
    
    public Producto() {
    	
    }
    
    public Producto(int idProducto, String nombreProducto, String descripcion, double precioActual, int stock, boolean estado) {
    	this.idProducto = idProducto;
    	this.nombreProducto = nombreProducto;
    	this.descripcion = descripcion;
    	this.precioActual = precioActual;
    	this.stock = stock;
    	this.estado = estado;
    }
    
    public Producto(String nombreProducto, String descripcion, double precioActual, int stock, boolean estado) {
    	this.nombreProducto = nombreProducto;
    	this.descripcion = descripcion;
    	this.precioActual = precioActual;
    	this.stock = stock;
    	this.estado = estado;
    }

    public int getIdProducto() {return this.idProducto;}

    public void setIdProducto(int idProducto) {this.idProducto = idProducto;}

    public String getNombreProducto() {return this.nombreProducto;}

    public void setNombreProducto(String nombreProducto) {this.nombreProducto = nombreProducto;}

    public String getDescripcion() {return this.descripcion;}

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public double getPrecioActual() {return this.precioActual;}

    public void setPrecioActual(double precioActual) {this.precioActual = precioActual;}

    public int getStock() {return this.stock;}

    public void setStock(int stock) {this.stock = stock;}

    public boolean isEstado() {return this.estado;}

    public void setEstado(boolean estado) {this.estado = estado;}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", descripcion="
				+ descripcion + ", precioActual=" + precioActual + ", stock=" + stock + ", estado=" + estado + "]";
	}
}