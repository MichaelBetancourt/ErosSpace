package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Registros;
import modelo.RegistrosDAO;
import vistas.VistaPrincipal;
import vistas.VistaRegistro;

/**
 *
 * @author Michael González
 */
public class ControladorRegistro extends VistaRegistro implements ActionListener {

    private RegistrosDAO registrosDAO;
    private TADLista<Registros> listaRegistros;
    private VistaRegistro vistaRegistros;

    public ControladorRegistro() {
        this.listaRegistros = new TADLista<>();
        this.registrosDAO = new RegistrosDAO();
        this.vistaRegistros = new VistaRegistro();
        mostrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registrarse) {
            agregarRegistro();
        }
        
        if (e.getSource() == volver) {
            new VistaPrincipal().setVisible(true);
            this.dispose();
        }
        
        if (e.getSource() == buscar) {
            buscarRegistro();
        }
        
        if (e.getSource() == modificar) {
            modificarRegistro();
        }
        
        if (e.getSource() == mostrar) {
            JOptionPane.showMessageDialog(null, mostrarRegistros(), "Mostrar", -1);
        }
        
        if (e.getSource() == borrar) {
            borrarRegistro();
        }
        
        if (e.getSource() == limpiar) {
            limpiar();
        }
    }

    public void agregarRegistro() {
        if (java.util.Arrays.equals(clave.getPassword(), confClave.getPassword())) {
            String iNombre = nombre.getText();
            int iCedula = Integer.parseInt(cedula.getText());
            String iFechaNacimiento = fechaNacimiento();
            long iTelefono = Long.parseLong(telefono.getText());
            String iDireccion = direccion.getText();
            String iCiudad = ciudad.getText();
            String iMedioPago = medioPago.getSelectedItem().toString();
            String iUsuario = usuario.getText();
            String iClave = String.valueOf(clave.getPassword());
            
            Registros newRegister = new Registros(iNombre, iCedula, iFechaNacimiento, iTelefono, iDireccion, iCiudad, iMedioPago, iUsuario,iClave);
            registrosDAO.insertarRegistro(newRegister);
            listaRegistros.addLast(newRegister);
        } else {
            JOptionPane.showMessageDialog(null, "Registro inválido. Las claves no coinciden."
                    + "\nPor favor inténtelo de nuevo", "Error", 0);
        }
        limpiar();
    }

    public void buscarRegistro() {
        int iCedula = Integer.parseInt(cedula.getText());
        boolean validar = false;
        int pos = 0;
        for (int i = 0; i < listaRegistros.size(); i++) {
            if (iCedula == listaRegistros.get(i).getIdentificacion()) {
                validar = true;
                pos = i;
            }
        }
        if (validar) {
            cedula.setEnabled(false);
            nombre.setText(listaRegistros.get(pos).getNombre());
            telefono.setText(listaRegistros.get(pos).getTelefono() + "");
            direccion.setText(listaRegistros.get(pos).getDireccion());
            ciudad.setText(listaRegistros.get(pos).getCiudad());
        } else {
            System.out.println("No encontrado");
            JOptionPane.showMessageDialog(null, "El registro no existe", "ERROR", 0);
            limpiar();
        }
    }

    public void modificarRegistro() {
        int iCedula = Integer.parseInt(cedula.getText());
        boolean validar = false;
        int pos = 0;
        for (int i = 0; i < listaRegistros.size(); i++) {
            if (iCedula == listaRegistros.get(i).getIdentificacion()) {
                validar = true;
                pos = i;
            }
        }
        if (validar) {
            cedula.setEnabled(false);
            String[] opciones = {"SELECCIONE", "NOMBRE", "CEDULA", "TELEFONO", "FECHA DE NACIMIENTO", "DIRECCION", "CIUDAD", "MEDIO PAGO"};
            Object opc = JOptionPane.showInputDialog(null, "Ingrese el dato a modificar", "Modificar", 3, null, opciones, 0);
            switch (String.valueOf(opc)) {
                case "SELECCIONE":
                    JOptionPane.showMessageDialog(null, "Seleccione una opción", "Modificar", 1);
                    break;
                case "NOMBRE":
                    listaRegistros.get(pos).setNombre(JOptionPane.showInputDialog(null, "Ingrese el nuevo dato", "Modificar", 1));
                    break;
                case "CEDULA":
                    listaRegistros.get(pos).setIdentificacion(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo dato", "Modificar", 1)));
                    break;
                case "TELEFONO":
                    listaRegistros.get(pos).setTelefono(Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese el nuevo dato", "Modificar", 1)));
                    break;
                case "FECHA DE NACIMIENTO":
                    listaRegistros.get(pos).setFechaNacimiento(fechaNacimiento());
                    break;
                case "DIRECCION":
                    listaRegistros.get(pos).setDireccion(JOptionPane.showInputDialog(null, "Ingrese el nuevo dato", "Modificar", 1));
                    break;
                case "CIUDAD":
                    listaRegistros.get(pos).setCiudad(JOptionPane.showInputDialog(null, "Ingrese el nuevo dato", "Modificar", 1));
                    break;
                case "MEDIO PAGO":
                    String[] opciones1 = {"(SELECCIONE)", "Visa", "Mastercard", "Maestro", "American Express", "PSE", "EFECTIVO"};
                    String o = String.valueOf(JOptionPane.showInputDialog(null, "Ingrese el nuevo dato", "Modificar", 1, null, opciones1, 0));
                    listaRegistros.get(pos).setMedioPago(o);
                    break;
            }
        } else {
            System.out.println("No encontrado");
            JOptionPane.showMessageDialog(null, "El registro no existe", "ERROR", 0);
        }
        limpiar();
    }

    public void borrarRegistro() {
        int iCedula = Integer.parseInt(cedula.getText());
        boolean validar = false;
        int pos = 0;
        for (int i = 0; i < listaRegistros.size(); i++) {
            if (iCedula == listaRegistros.get(i).getIdentificacion()) {
                validar = true;
                pos = i;
            }
        }
        if (validar) {
            listaRegistros.remove(pos);
        } else {
            System.out.println("No encontrado");
            JOptionPane.showMessageDialog(null, "El registro no existe", "ERROR", 0);
        }
        limpiar();
    }

    public String mostrarRegistros() {
        return listaRegistros.print();
    }
    
    /**
     * Se pide la fecha de nacimiento y se organiza en su formato.
     *
     * @return Contador con la fecha de nacimineto en String
     */
    public String fechaNacimiento() {
        java.util.Calendar calendario = java.util.Calendar.getInstance();
        int anio = Integer.parseInt(campoAnio.getText());
        int mes = Integer.parseInt(campoMes.getText());
        int dia = Integer.parseInt(campoDia.getText());
        calendario.set(anio, mes - 1, dia);
        return calendario.getTime().toString();
    }

    /**
     * Método para limpiar los campos.
     */
    public void limpiar() {
        cedula.setEnabled(true);
        nombre.setText(null);
        cedula.setText(null);
        telefono.setText(null);
        campoDia.setText(null);
        campoMes.setText(null);
        campoAnio.setText(null);
        direccion.setText(null);
        ciudad.setText(null);
        medioPago.setSelectedIndex(0);
        usuario.setText(null);
        clave.setText(null);
        confClave.setText(null);
    }

}
