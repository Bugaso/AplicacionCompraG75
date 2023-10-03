package entidades;

public class Proveedor {
    private int idProveedor;
    private String razonSocial;
    private String domicilio;
    private String telefono;
    
    
    public Proveedor() {
    }

    public Proveedor(int idProveedor, String razonSocial, String domicilio, String telefono) {
        this.idProveedor = idProveedor;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    
    public Proveedor(String razonSocial, String domicilio, String telefono) {
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

	public int getIdProveedor() {return this.idProveedor;}

	public void setIdProveedor(int idProveedor) {this.idProveedor = idProveedor;}

	public String getRazonSocial() {return this.razonSocial;}

	public void setRazonSocial(String razonSocial) {this.razonSocial = razonSocial;}

	public String getDomicilio() {return this.domicilio;}

	public void setDomicilio(String domicilio) {this.domicilio = domicilio;}

	public String getTelefono() {return this.telefono;}

	public void setTelefono(String telefono) {this.telefono = telefono;}

	@Override
	public String toString() {
		return "Proveedor [idProveedor=" + idProveedor + ", razonSocial=" + razonSocial + ", domicilio=" + domicilio
				+ ", telefono=" + telefono + "]";
	}
}