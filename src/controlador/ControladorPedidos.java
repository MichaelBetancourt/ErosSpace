package controlador;

import javax.swing.JOptionPane;
import modelo.Pedidos;
import modelo.PedidosDAO;
import modelo.RegistrosDAO;
import vistas.VistaFactura;
import vistas.VistaLogIn;
import vistas.VistaPrincipal;

/**
 *
 * @author Michael González
 */
public class ControladorPedidos {

    private PedidosDAO pedidosDAO;
    private RegistrosDAO registrosDAO;
    private TADCola<Pedidos> colaPedidos;
    private VistaPrincipal vistaPrincipal;
    private VistaLogIn vistaLogueo;
    
    public ControladorPedidos() {
        this.pedidosDAO = new PedidosDAO();
        this.registrosDAO = new RegistrosDAO();
        this.colaPedidos = new TADCola<>();
        this.vistaPrincipal = new VistaPrincipal();
        this.vistaLogueo = new VistaLogIn();
    }

    public void agregarPedido() {
        if (vistaPrincipal.getPrecioTotal() == 0) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningún artículo. \nPor favor vuelva al primer paso y seleccione sus preferencias de compra", "ERROR", 0);
            vistaPrincipal.getNext().setEnabled(false);
        } else {
            String nom = JOptionPane.showInputDialog(null, "Por favor, ingrese su nombre de usuario: ", "Finalizar pedido", 3);
            if (nom.equals(registrosDAO.buscarRegistro(nom).getUsuario())) {
                Pedidos newAsk = new Pedidos(nom, vistaPrincipal.getConcepto(), vistaPrincipal.getPrecioTotal());
                pedidosDAO.insertarPedido(newAsk);
                colaPedidos.queue(newAsk);
                new VistaFactura().setVisible(true);
                vistaPrincipal.dispose();
            } else {                  
                JOptionPane.showMessageDialog(null, "El nombre de usuario ingresado no coincide. \nInténtelo de nuevo", "ERROR", 0);
            }
        }
    }

    public void buscarPedido() {
        boolean validar = false;
        int pos = 0;
        String nombre = JOptionPane.showInputDialog(null, "Escriba su nombre para localizar su pedido", "Buscar un pedido", 3);
        for (int i = 0; i < colaPedidos.size(); i++) {
            if (nombre.equals(colaPedidos.get(i).getPersonaPedido())) {
                validar = true;
                pos = i;
            }
        }
        if (validar) {
            JOptionPane.showMessageDialog(null, colaPedidos.get(pos).toString(), "Su pedido", 1);
        } else {
            System.out.println("No encontrado");
            JOptionPane.showMessageDialog(null, "Pedido no encontrado", "ERROR", 3);
        }
    }

    public void modificarPedido() {
        boolean validar = false;
        int pos = 0;
        String conf = JOptionPane.showInputDialog(null, "Ingrese la clave de administrador para acceder a esta función.", "Modificar un pedido", 2);
        if (conf.equals(vistaLogueo.getCLAVE_ADMINISTRADOR())) {
            String nombre = JOptionPane.showInputDialog(null, "Escriba el nombre del usuario que desea modificar su pedido", "Modificar un pedido", 3);
            for (int i = 0; i < colaPedidos.size(); i++) {
                if (nombre.equals(colaPedidos.get(i).getPersonaPedido())) {
                    validar = true;
                    pos = i;
                }
            }
            if (validar) {
                String[] opciones = {"SELECCIONE", "CONCEPTO", "PRECIO"};
                Object opc = JOptionPane.showInputDialog(null, "Ingrese el dato a modificar", "Modificar", 3, null, opciones, 0);
                switch (String.valueOf(opc)) {
                    case "SELECCIONE":
                        JOptionPane.showMessageDialog(null, "Seleccione una opción", "Modificar", 1);
                        break;
                    case "CONCEPTO":
                        colaPedidos.get(pos).setConcepto(JOptionPane.showInputDialog(null, "Ingrese el nuevo dato", "Modificar", 1));
                        break;
                    case "PRECIO":
                        colaPedidos.get(pos).setPrecioTotal(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el nuevo dato", "Modificar", 1)));
                        break;
                }
            } else {
                System.out.println("No encontrado");
                JOptionPane.showMessageDialog(null, "El pedido no existe", "ERROR", 0);
            }
            colaPedidos.print();
        } else {
            JOptionPane.showMessageDialog(null, "¡CLAVE ERRADA!", "ERROR", 0);
        }
    }

    public void borrarPedido() {
        boolean validar = false;
        int pos = 0;
        String conf = JOptionPane.showInputDialog(null, "Ingrese la clave de administrador para acceder a esta función.", "Eliminar un pedido", 2);
        if (conf.equals(vistaLogueo.getCLAVE_ADMINISTRADOR())) {
            String nombre = JOptionPane.showInputDialog(null, "Escriba el nombre del usuario que desea eliminar su pedido", "Eliminar un pedido", 3);
            for (int i = 0; i < colaPedidos.size(); i++) {
                if (nombre.equals(colaPedidos.get(i).getPersonaPedido())) {
                    validar = true;
                    pos = i;
                }
            }
            if (validar) {
                colaPedidos.remove(pos);
            } else {
                System.out.println("No encontrado");
                JOptionPane.showMessageDialog(null, "El pedido no existe", "ERROR", 0);
            }
            colaPedidos.print();
        } else {
            JOptionPane.showMessageDialog(null, "¡CLAVE ERRADA!", "ERROR", 0);
        }
    }

    public String mostrarPedidos(int opcion) {
        return (opcion == 0) ? colaPedidos.print() : colaPedidos.peek().toString();
    }

}
