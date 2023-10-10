package entidades;

public class DetalleCompra {
    private int idDetalle;
    private Compra compra;
    private Producto producto;
    private double precioCosto;
    private int cantidad;

    public DetalleCompra() {
    }

    public DetalleCompra(int idDetalle, Compra compra, Producto producto, double precioCosto, int cantidad) {
        this.idDetalle = idDetalle;
        this.compra = compra;
        this.producto = producto;
        this.precioCosto = precioCosto;
        this.cantidad = cantidad;
    }
    
    public DetalleCompra(Compra compra, Producto producto, double precioCosto, int cantidad) {
        this.compra = compra;
        this.producto = producto;
        this.precioCosto = precioCosto;
        this.cantidad = cantidad;
    }

    public int getIdDetalle() {return this.idDetalle;}

    public void setIdDetalle(int idDetalle) {this.idDetalle = idDetalle;}
    
    public Compra getCompra() {return this.compra;}

    public void setCompra(Compra compra) {this.compra = compra;}

    public Producto getProducto() {return this.producto;}

    public void setProducto(Producto producto) {this.producto = producto;}
    
    public double getPrecioCosto() {return this.precioCosto;}

    public void setPrecioCosto(double precioCosto) {this.precioCosto = precioCosto;}

    public int getCantidad() {return this.cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

	@Override
	public String toString() {
		return "DetalleCompra [idDetalle=" + idDetalle + ", compra=" + compra + ", producto=" + producto
				+ ", precioCosto=" + precioCosto + ", cantidad=" + cantidad + "]";
	}
}