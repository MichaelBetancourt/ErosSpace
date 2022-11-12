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
public class LogueosDAO extends ConexionDB {

    private PreparedStatement ps;
    //ConexionDB conexiondb;
    private final Connection connection = conectar();
    
//    public LogueosDAO() {
//        this.ps = null;
//        this.conexiondb = new ConexionDB();
//    }

    /**
     * Agrega un inicio de sesión a la tabla logueo de la base de datos. También
     * agrega el objeto a la lista correspondiente.
     *
     * @param log El objeto de entrada que se ingresará a la base de datos.
     */
    public void insertarLogueo(Logueos log) {

        String sql = "INSERT INTO logueo (tipo, usuario, clave, confirmacion) VALUES (?,?,?,?)";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, log.getTipo());
            ps.setString(2, log.getUsuario());
            ps.setString(3, log.getClave());
            ps.setString(4, log.getConfirmacion());
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
     * Busca un inicio de sesión en la tabla logueo en la base de datos.
     *
     * @param user El dato que se va a buscarRegistro. En este caso, el usuario.
     * @return Objeto buscado de tipo Logueos.
     */
    public Logueos buscarLogueo(String user) {

        ResultSet rs;

        String sql = "SELECT * FROM logueo WHERE usuario = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, user);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Logueos(rs.getString("tipo_logueo"),
                        rs.getString("usuario"),
                        rs.getString("clave"),
                        rs.getString("confirmacion"));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;

    }
}
