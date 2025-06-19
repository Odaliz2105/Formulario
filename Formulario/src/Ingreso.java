import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ingreso extends JFrame {
    private JPanel Principal;

    private JTextField textNombre;
    private JTextField textApellido;
    private JTextField textDireccion;
    private JTextField textTelefono;
    private JTextField textnacimiento;
    private JTextField txtEstatura;

    private JButton btnMostrarJOption;
    private JButton btnMostrarLabel;
    private JLabel lblResultado;

    public Ingreso() {
        setTitle("Formulario de Datos Personales");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(Principal);
        setVisible(true);

        // Acción del botón 1: mostrar datos en JOptionPane
        btnMostrarJOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datos = obtenerDatos();
                JOptionPane.showMessageDialog(null, datos, "Datos Ingresados", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        // Acción del botón 2: mostrar datos en JLabel
        btnMostrarLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblResultado.setText("<html>" + obtenerDatos().replaceAll("\n", "<br>") + "</html>");
            }
        });
    }

    private String obtenerDatos() {
        String nombre = textNombre.getText();
        String apellido = textApellido.getText();
        String direccion = textDireccion.getText();
        String telefono = textTelefono.getText();
        String nacimiento = textnacimiento.getText();
        String estatura = txtEstatura.getText();

        return "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Dirección: " + direccion + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Año de nacimiento: " + nacimiento + "\n" +
                "Estatura: " + estatura + " m";
    }
}
