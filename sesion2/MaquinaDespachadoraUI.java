import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaquinaDespachadoraUI {
    public JPanel mainPanel;

    private JButton aButton;
    private JButton bButton;
    private JButton cButton;
    private JButton dButton;
    private JButton eButton;
    private JButton fButton;
    private JButton despacharButton;
    private JLabel displayMaquina;

    MaquinaDespachadora maquinaDespachadora = new MaquinaDespachadora();

    public MaquinaDespachadoraUI() {
        aButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                maquinaDespachadora.seleccionarA();
                displayMaquina.setText(maquinaDespachadora.getDisplay());
            }
        });
        bButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                maquinaDespachadora.seleccionarB();
                displayMaquina.setText(maquinaDespachadora.getDisplay());
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                maquinaDespachadora.seleccionarC();
                displayMaquina.setText(maquinaDespachadora.getDisplay());
            }
        });
        dButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                maquinaDespachadora.seleccionarD();
                displayMaquina.setText(maquinaDespachadora.getDisplay());
            }
        });
        eButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                maquinaDespachadora.seleccionarE();
                displayMaquina.setText(maquinaDespachadora.getDisplay());
            }
        });
        fButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                maquinaDespachadora.seleccionarF();
                displayMaquina.setText(maquinaDespachadora.getDisplay());
            }
        });
        despacharButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                maquinaDespachadora.despachar();
                displayMaquina.setText(maquinaDespachadora.getDisplay());
            }
        });
    }
}
