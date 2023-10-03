package entidades;

public class DetalleCompra {
    private int idDetalle;
    private int cantidad;
    private double precioCosto;
    private Compra compra;
    private Producto producto;

    public DetalleCompra() {
    }

    public DetalleCompra(int idDetalle, int cantidad, double precioCosto, Compra compra, Producto producto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = compra;
        this.producto = producto;
    }
    
    public DetalleCompra(int cantidad, double precioCosto, Compra compra, Producto producto) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = compra;
        this.producto = producto;
    }

    public int getIdDetalle() {return this.idDetalle;}

    public void setIdDetalle(int idDetalle) {this.idDetalle = idDetalle;}

    public int getCantidad() {return this.cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public double getPrecioCosto() {return this.precioCosto;}

    public void setPrecioCosto(double precioCosto) {this.precioCosto = precioCosto;}

    public Compra getCompra() {return this.compra;}

    public void setCompra(Compra compra) {this.compra = compra;}

    public Producto getProducto() {return this.producto;}

    public void setProducto(Producto producto) {this.producto = producto;}

	@Override
	public String toString() {
		return "DetalleCompra [idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", precioCosto=" + precioCosto
				+ ", compra=" + compra + ", producto=" + producto + "]";
	}
}