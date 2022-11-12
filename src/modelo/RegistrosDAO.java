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
public class RegistrosDAO extends ConexionDB {

    private PreparedStatement ps;
    private final Connection connection = conectar();
    
//    public RegistrosDAO() {
//        this.ps = null;
//    }

    /**
     * Agrega un registro a la tabla registro de la base de datos. También
     * agrega el objeto a la lista correspondiente.
     *
     * @param reg El objeto de entrada que se ingresará a la base de datos.
     */
    public void insertarRegistro(Registros reg) {

        String sql = "INSERT INTO registro (cedula, nombre, fecha_nacimiento, telefono, direccion, ciudad, medio_pago, usuario, clave) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, reg.getIdentificacion());
            ps.setString(2, reg.getNombre());
            ps.setString(3, reg.getFechaNacimiento());
            ps.setLong(4, reg.getTelefono());
            ps.setString(5, reg.getDireccion());
            ps.setString(6, reg.getCiudad());
            ps.setString(7, reg.getMedioPago());
            ps.setString(8, reg.getUsuario());
            ps.setString(9, reg.getClave());
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
     * Modifica un registro de la tabla registro en la base de datos.
     *
     * @param reg El objeto de entrada que se va a modificarRegistro.
     */
    public void modificarRegistro(Registros reg) {

        String sql = "UPDATE registro nombre = ?, fecha_nacimiento = ?, telefono = ?, direccion = ?, ciudad = ?, medio_pago = ?, usuario = ?, clave = ? WHERE cedula = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, reg.getNombre());
            ps.setString(2, reg.getFechaNacimiento());
            ps.setLong(3, reg.getTelefono());
            ps.setString(4, reg.getDireccion());
            ps.setString(5, reg.getCiudad());
            ps.setString(6, reg.getMedioPago());
            ps.setString(7, reg.getUsuario());
            ps.setString(8, reg.getClave());
            ps.setInt(9, reg.getIdentificacion());
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
     * Elimina un registro de la tabla registro en la base de datos.
     *
     * @param reg El objeto de entrada que se va a eliminar.
     */
    public void eliminarRegistro(Registros reg) {

        String sql = "DELETE FROM registro WHERE cedula = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, reg.getIdentificacion());
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
     * Busca un registro en la tabla registro en la base de datos.
     *
     * @param user El dato que se va a buscarRegistro. En este caso, el usuario.
     * @return Objeto buscado de tipo Registros.
     */
    public Registros buscarRegistro(String user) {

        ResultSet rs;
        String sql = "SELECT * FROM registro WHERE usuario = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, user);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Registros(rs.getString("nombre"),
                        rs.getInt("cedula"),
                        rs.getString("fecha_nacimiento"),
                        rs.getLong("telefono"),
                        rs.getString("direccion"),
                        rs.getString("ciudad"),
                        rs.getString("medio_pago"),
                        rs.getString("usuario"),
                        rs.getString("clave"));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;

    }
}
