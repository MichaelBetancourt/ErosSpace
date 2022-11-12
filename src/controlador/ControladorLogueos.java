package controlador;

import javax.swing.JOptionPane;
import modelo.Logueos;
import modelo.LogueosDAO;
import modelo.RegistrosDAO;
import vistas.VistaAdmin;
import vistas.VistaLogIn;
import vistas.VistaPrincipal;

/**
 *
 * @author Michael González
 */
public class ControladorLogueos {

    private LogueosDAO logueosDAO;
    private RegistrosDAO registrosDAO;
    private TADLista<Logueos> listaLogueos;
    private VistaLogIn vistaLogueo;
    
    public ControladorLogueos() {
        this.logueosDAO = new LogueosDAO();
        this.registrosDAO = new RegistrosDAO();
        this.listaLogueos = new TADLista<>();
        this.vistaLogueo = new VistaLogIn();
    }

    public void agregarLogueo() {
        String user = "", pwd = "";
        boolean ingresoCorrecto = false;
        for (int i = 0; i < listaLogueos.size(); i++) {
            user = registrosDAO.buscarRegistro(vistaLogueo.getUserField().getText()).getUsuario();
            pwd = registrosDAO.buscarRegistro(vistaLogueo.getUserField().getText()).getClave();
            if (user.equals(vistaLogueo.getUserField().getText()) && pwd.equals(String.valueOf(vistaLogueo.getPassField().getPassword()))) {
                ingresoCorrecto = true;
            }
        }
        if (ingresoCorrecto) {
            Logueos newLog = new Logueos("Usuario", user, pwd, "Ingreso correcto");
            logueosDAO.insertarLogueo(newLog);
            listaLogueos.addLast(newLog);
            JOptionPane.showMessageDialog(null, "Ha ingresado exitosamente", "Éxito", 1);
            new VistaPrincipal().setVisible(true);
            vistaLogueo.dispose();
        } else {
            logueosDAO.insertarLogueo(new Logueos("Usuario", user, pwd, "Ingreso errado"));
            JOptionPane.showMessageDialog(null, "Ingreso inválido \nVuelva a intentarlo", "Error", 0);
        }
        JOptionPane.showMessageDialog(null, listaLogueos.print(), "Mostrar", -1);
    }

    public void agregarLogueoAdmin(String usuario, String clave) {
        if (usuario.equals(vistaLogueo.getUserField().getText()) && clave.equals(String.valueOf(vistaLogueo.getPassField().getPassword()))) {
            logueosDAO.insertarLogueo(new Logueos("Administrador", "El usuario del administrador no se puede mostrar", "La clave menos", "Ingreso correcto"));
            JOptionPane.showMessageDialog(null, "Ha ingresado exitosamente", "Éxito", 1);
            new VistaAdmin().setVisible(true);
            vistaLogueo.dispose();
        } else {
            logueosDAO.insertarLogueo(new Logueos("Administrador", vistaLogueo.getUserField().getText(), String.valueOf(vistaLogueo.getPassField().getPassword()), "Ingreso errado"));
            JOptionPane.showMessageDialog(null, "Ingreso inválido \nVuelva a intentarlo", "Error", 0);
        }
        JOptionPane.showMessageDialog(null, listaLogueos.print(), "Mostrar", -1);
    }

    public String mostrarLogueos() {
        return listaLogueos.print();
    }

}
