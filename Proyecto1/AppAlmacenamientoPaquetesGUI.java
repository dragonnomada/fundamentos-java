import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppAlmacenamientoPaquetesGUI {
    private JTextField textField1;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner spinner3;
    private JSpinner spinner4;
    private JButton registrarButton;
    private JSpinner spinner5;
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JPanel panel1;
    private JTree tree1;
    private JTable table1;

    ComponenteRegistrarPaqueteUI registrador = new ComponenteRegistrarPaqueteUI();
    ComponenteAlmacenarPaquetes almacenador = new ComponenteAlmacenarPaquetes();
    ComponenteConsultarPaqueteUI consultador = new ComponenteConsultarPaqueteUI();
    ComponenteDetallesPaqueteUI detallador = new ComponenteDetallesPaqueteUI();

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        AppAlmacenamientoPaquetesGUI app = new AppAlmacenamientoPaquetesGUI();

        frame.add(app.panel1);

        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public AppAlmacenamientoPaquetesGUI() {
        AppAlmacenamientoPaquetesGUI app = this;

        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrador.capturar(app);
                almacenador.setPaqueteNuevo(registrador.getPaqueteRegistrado());
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // almacenador->IListadoPaquete<-consultador
                consultador.setListadoPaquetes(almacenador.getListadoPaquetes());
                consultador.consultar(app);
                // consultador->IPaquete<-detallador
                detallador.setPaquete(consultador.getPaqueteConsultado());
                detallador.updateUI(app);
            }
        });
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JSpinner getSpinner1() {
        return spinner1;
    }

    public JSpinner getSpinner2() {
        return spinner2;
    }

    public JSpinner getSpinner3() {
        return spinner3;
    }

    public JSpinner getSpinner4() {
        return spinner4;
    }

    public JButton getRegistrarButton() {
        return registrarButton;
    }

    public JSpinner getSpinner5() {
        return spinner5;
    }

    public JButton getButton1() {
        return button1;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public JLabel getLabel3() {
        return label3;
    }
}
