package modelo;

/**
 * Clase que almacena toda la información de los inicios de sesión de
 * administrador y de usuarios. Guarda el usuario y contraseña ingresados, junto
 * con el tipo de inicio sesión y si es errada o no.
 */
public class Logueos {

    private String tipo;
    private String usuario;
    private String clave;
    private String confirmacion;

    public Logueos(String tipo, String usuario, String clave, String confirmacion) {
        this.tipo = tipo;
        this.usuario = usuario;
        this.clave = clave;
        this.confirmacion = confirmacion;
    }

    @Override
    public String toString() {
        return "Tipo → " + tipo + "\nUsuario → " + usuario
                + "\nClave → " + clave + "\nConfirmacion → " + confirmacion + "\n";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(String confirmacion) {
        this.confirmacion = confirmacion;
    }

}
