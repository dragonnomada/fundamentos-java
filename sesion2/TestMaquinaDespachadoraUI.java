import javax.swing.*;

public class TestMaquinaDespachadoraUI {

    public static void main(String[] args) {

        MaquinaDespachadoraUI maquinaDespachadoraUI = new MaquinaDespachadoraUI();

        JFrame frame = new JFrame();

        frame.add(maquinaDespachadoraUI.mainPanel);

        frame.setSize(400, 400);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }

}
