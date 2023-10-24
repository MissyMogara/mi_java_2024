import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI extends JFrame implements ActionListener {

    private JTextField pantalla;
    private JButton[] botones;

    public CalculadoraGUI() {
        // Configuración de la ventana
        setTitle("Calculadora");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Pantalla
        pantalla = new JTextField();
        pantalla.setFont(new Font("Arial", Font.PLAIN, 24));
        add(pantalla, BorderLayout.NORTH);

        // Botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4));

        String[] labels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        botones = new JButton[16];
        for (int i = 0; i < 16; i++) {
            botones[i] = new JButton(labels[i]);
            botones[i].setFont(new Font("Arial", Font.PLAIN, 18));
            botones[i].addActionListener(this);
            panelBotones.add(botones[i]);
        }

        add(panelBotones, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equals("=")) {
            try {
                String expresion = pantalla.getText();
                double resultado = evaluarExpresion(expresion);
                pantalla.setText(Double.toString(resultado));
            } catch (Exception ex) {
                pantalla.setText("Error");
            }
        } else {
            pantalla.setText(pantalla.getText() + comando);
        }
    }

    private double evaluarExpresion(String expresion) {
        // Este método debería evaluar la expresión matemática, pero para simplificar el ejemplo, lo omitiremos.
        return 0.0;
    }

    public static void main(String[] args) {
        new CalculadoraGUI();
    }
}
