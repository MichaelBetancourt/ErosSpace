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
public class ProductosDAO extends ConexionDB {

    private PreparedStatement ps;
    //ConexionDB conexiondb;
    private final Connection connection = conectar();

//    public ProductosDAO() {
//        this.ps = null;
//        this.conexiondb = new ConexionDB();
//    }
    
    /**
     * Agrega un producto a la tabla producto de la base de datos. También
     * agrega el objeto a la pila correspondiente.
     *
     * @param prod El objeto de entrada que se ingresará a la base de datos.
     */
    public void insertarProducto(Productos prod) {

        String sql = "INSERT INTO producto (id_producto, nombre_producto, precio_producto, descripcion) VALUES (?,?,?,?)";

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, prod.getIdProducto());
            ps.setString(2, prod.getNombre());
            ps.setFloat(3, prod.getPrecio());
            ps.setString(4, prod.getDescripcion());
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
     * Modifica un producto de la tabla producto en la base de datos.
     *
     * @param prod El objeto de entrada que se va a modificarRegistro.
     */
    public void modificarProducto(Productos prod) {

        String sql = "UPDATE producto SET nombre_producto = ?, precio_producto = ?, descripcion = ? WHERE id_producto = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, prod.getNombre());
            ps.setFloat(2, prod.getPrecio());
            ps.setString(3, prod.getDescripcion());
            ps.setInt(4, prod.getIdProducto());
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
     * Elimina un producto de la tabla producto en la base de datos.
     *
     * @param prod El objeto de entrada que se va a eliminar.
     */
    public void eliminarProducto(Productos prod) {

        String sql = "DELETE FROM producto WHERE id_producto = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, prod.getIdProducto());
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
     * Busca un producto en la tabla producto en la base de datos.
     *
     * @param idProducto El dato que se va a buscarRegistro. En este caso, el
     * id.
     * @return Objeto buscado de tipo Productos.
     */
    public Productos buscarProducto(int idProducto) {

        ResultSet rs;

        String sql = "SELECT * FROM producto WHERE id_producto = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, idProducto);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Productos(rs.getInt("id_producto"),
                        rs.getString("nombre_producto"),
                        rs.getFloat("precio_producto"),
                        rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;

    }

}
