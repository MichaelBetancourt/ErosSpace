package modelo;

public class Registros {

    private String nombre;
    private int identificacion;
    private String fechaNacimiento;
    private long telefono;
    private String direccion;
    private String ciudad;
    private String medioPago;
    private String usuario;
    private String clave;

    public Registros(String nombre, int identificacion, String fechaNacimiento, long telefono, String direccion, String ciudad, String medioPago, String usuario, String clave) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.medioPago = medioPago;
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Nombre → " + nombre + "\nIdentificacion → " + identificacion
                + "\nFechaNacimiento → " + fechaNacimiento
                + "\nTeléfono → " + telefono + "\nDirección → " + direccion
                + "\nCiudad → " + ciudad + "\nMedio de Pago → " + medioPago
                + "\nUsuario → " + usuario + "\nClave → " + clave + "\n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
