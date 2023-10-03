package entidades;

import java.time.LocalDate;

public class Compra {
    private int idCompra;
    private Proveedor proveedor;
    private LocalDate fecha;
    
    
    public Compra() {
    }

    public Compra(int idCompra, Proveedor proveedor, LocalDate fecha) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.fecha = fecha;
    }
    
    public Compra(Proveedor proveedor, LocalDate fecha) {
    	this.proveedor = proveedor;
    	this.fecha = fecha;
    }

    public int getIdCompra() {return this.idCompra;}

    public void setIdCompra(int idCompra) {this.idCompra = idCompra;}

    public Proveedor getProveedor() {return this.proveedor;}

    public void setProveedor(Proveedor proveedor) {this.proveedor = proveedor;}

    public LocalDate getFecha() {return this.fecha;}

    public void setFecha(LocalDate fecha) {this.fecha = fecha;}

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", proveedor=" + proveedor + ", fecha=" + fecha + '}';
    }
}