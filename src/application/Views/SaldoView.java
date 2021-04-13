package application.Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaldoView {
    private JList listSaldo;
    private JButton adicionarButton;
    private JButton excluirButton;
    private JTextField textField1;
    private JTextField textField2;
    private JButton menuButton;
    private JLabel saldoTotal;
    public JPanel panel1;

    public SaldoView() {


        saldoTotal.setText("1789.9");
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
