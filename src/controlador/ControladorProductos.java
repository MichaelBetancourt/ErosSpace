package controlador;

import javax.swing.JOptionPane;
import modelo.Productos;
import modelo.ProductosDAO;
import vistas.VistaAdmin;

/**
 *
 * @author Michael González
 */
public class ControladorProductos {

    private ProductosDAO productosDAO;
    private TADPila<Productos> pilaProductos;
    private VistaAdmin vistaAdmin;
    
    public ControladorProductos() {
        this.productosDAO = new ProductosDAO();
        this.pilaProductos = new TADPila<>();
        this.vistaAdmin = new VistaAdmin();
    }

    public void agregarProducto(int idProducto, String nombre, float precio, String descripcion) {
        Productos newProduct = new Productos(idProducto, nombre, precio, descripcion);
        productosDAO.insertarProducto(newProduct);
        pilaProductos.push(newProduct);
        vistaAdmin.limpiar();
        JOptionPane.showMessageDialog(null, pilaProductos.print(), "Pila Productos", -1);
    }

    public void buscarProducto(int idProducto) {
        boolean validar = false;
        int pos = 0;
        for (int i = 0; i < pilaProductos.size(); i++) {
            if (idProducto == pilaProductos.get(i).getIdProducto()) {
                validar = true;
                pos = i;
            }
        }
        if (validar) {
            vistaAdmin.getIdProField().setEnabled(false);
            vistaAdmin.getNameField().setText(pilaProductos.get(pos).getNombre());
            vistaAdmin.getPriceField().setText(String.valueOf(pilaProductos.get(pos).getPrecio()));
            vistaAdmin.getDesciptionArea().setText(pilaProductos.get(pos).getDescripcion());
        } else {
            System.out.println("No encontrado");
            JOptionPane.showMessageDialog(null, "El producto no existe", "ERROR", 0);
        }
        vistaAdmin.limpiar();
    }

    public void modificarProducto(int idProducto) {
        boolean validar = false;
        int pos = 0;
        for (int i = 0; i < pilaProductos.size(); i++) {
            if (idProducto == pilaProductos.get(i).getIdProducto()) {
                validar = true;
                pos = i;
            }
        }
        if (validar) {
            String[] opciones = {"SELECCIONE", "ID PRODUCTO", "NOMBRE", "PRECIO", "DESCRIPCION"};
            Object opc = JOptionPane.showInputDialog(null, "Ingrese el dato a modificar", "Modificar", 3, null, opciones, 0);
            switch (String.valueOf(opc)) {
                case "SELECCIONE":
                    JOptionPane.showMessageDialog(null, "Seleccione una opcion", "Modificar", 1);
                    break;
                case "ID PRODUCTO":
                    pilaProductos.get(pos).setIdProducto(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo dato", "Modificar", 1)));
                    break;
                case "NOMBRE":
                    pilaProductos.get(pos).setNombre(JOptionPane.showInputDialog(null, "Ingrese el nuevo dato", "Modificar", 1));
                    break;
                case "PRECIO":
                    pilaProductos.get(pos).setPrecio(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el nuevo dato", "Modificar", 1)));
                    break;
                case "DESCRIPCION":
                    pilaProductos.get(pos).setDescripcion(JOptionPane.showInputDialog(null, "Ingrese el nuevo dato", "Modificar", 1));
                    break;
            }
        } else {
            System.out.println("No encontrado");
            JOptionPane.showMessageDialog(null, "El producto no existe", "ERROR", 0);
        }
        vistaAdmin.limpiar();
    }

    public void borrarProducto(int idProducto) {
        boolean validar = false;
        int pos = 0;
        for (int i = 0; i < pilaProductos.size(); i++) {
            if (idProducto == pilaProductos.get(i).getIdProducto()) {
                validar = true;
                pos = i;
            }
        }
        if (validar) {
            pilaProductos.remove(pos);
        } else {
            System.out.println("No encontrado");
            JOptionPane.showMessageDialog(null, "El producto no existe", "ERROR", 0);
        }
        vistaAdmin.limpiar();
    }

    public String mostrarProductos(int opcion) {
        return (opcion == 0) ? pilaProductos.print() : pilaProductos.peek().toString();
    }

}
