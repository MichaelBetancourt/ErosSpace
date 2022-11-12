package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael González
 */
public class PedidosDAO extends ConexionDB {

    private PreparedStatement ps;
    //ConexionDB conexiondb;
    private final Connection connection = conectar();
    
//    public PedidosDAO() {
//        this.ps = null;
//        this.conexiondb = new ConexionDB();
//        this.connection = conexiondb.conectar();
//    }

    /**
     * Agrega un pedido a la tabla pedido de la base de datos. También agrega el
     * objeto a la cola correspondiente.
     *
     * @param ped El objeto de entrada que se ingresará a la base de datos.
     */
    public void insertarPedido(Pedidos ped) {

        String sql = "INSERT INTO pedido (persona_pedido, concepto, precio_total) VALUES (?,?,?)";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, ped.getPersonaPedido());
            ps.setString(2, ped.getConcepto());
            ps.setFloat(3, ped.getPrecioTotal());
            if (ps.execute()) {
                JOptionPane.showMessageDialog(null, "Ha sido registrado exitosamente", "Éxito", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrió un error de manera inesperada.", "ERROR", 0);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }

    }

    /**
     * Modifica un pedido de la tabla pedido en la base de datos.
     *
     * @param ped El objeto de entrada que se va a modificarRegistro.
     */
    public void modificarPedido(Pedidos ped) {

        String sql = "UPDATE pedido SET concepto = ?, precio_total = ? WHERE persona_pedido = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, ped.getConcepto());
            ps.setFloat(2, ped.getPrecioTotal());
            ps.setString(3, ped.getPersonaPedido());
            int con = ps.executeUpdate();
            if (con > 0) {
                JOptionPane.showMessageDialog(null, "Ha sido registrado exitosamente", "Éxito", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrió un error de manera inesperada.", "ERROR", 0);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }

    }

    /**
     * Elimina un pedido de la tabla pedido en la base de datos.
     *
     * @param ped El objeto de entrada que se va a eliminar.
     */
    public void eliminarPedido(Pedidos ped) {

        String sql = "DELETE FROM pedido WHERE persona_pedido = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, ped.getPersonaPedido());
            int con = ps.executeUpdate();
            if (con > 0) {
                JOptionPane.showMessageDialog(null, "Ha sido registrado exitosamente", "Éxito", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrió un error de manera inesperada.", "ERROR", 0);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }

    }

    /**
     * Busca un pedido en la tabla pedido en la base de datos.
     *
     * @param nombre El dato que se va a buscarRegistro. En este caso, el
     * nombre.
     * @return Objeto buscado de tipo Pedidos.
     */
    public Pedidos buscarPedido(String nombre) {

        ResultSet rs;

        String sql = "SELECT * FROM pedido WHERE persona_pedido = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Pedidos(rs.getString("persona_pedido"),
                        rs.getString("concepto"),
                        rs.getFloat("precio_total"));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;

    }
}
