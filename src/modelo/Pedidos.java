package modelo;

public class Pedidos {

    private String personaPedido;
    private String concepto;
    private float precioTotal;

    public Pedidos(String personaPedido, String concepto, float precioTotal) {
        this.personaPedido = personaPedido;
        this.concepto = concepto;
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Nombre de quien hace el pedido → " + personaPedido + "\n"
                + "Concepto → " + concepto + "\n"
                + "Precio total → " + precioTotal + "\n";
    }

    public String getPersonaPedido() {
        return personaPedido;
    }

    public void setPersonaPedido(String personaPedido) {
        this.personaPedido = personaPedido;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

}
