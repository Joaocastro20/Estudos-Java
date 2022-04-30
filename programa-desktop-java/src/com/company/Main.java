package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
	    final String USER = "joao";
        final String PASS = "acerola";

        JFrame frame = new JFrame("programa : : Acesso ao sistema");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JLabel lblUsuario = new JLabel();
        JTextField txtUsuario = new JTextField(20);
        txtUsuario.setToolTipText("Informe seu usuario de acesso:");

        JLabel lblSenha = new JLabel("Senha:");
        JPasswordField txtSenha = new JPasswordField(20);
        txtSenha.setToolTipText("Informe a senha:");

        JButton btnLogin = new JButton("Login");

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtUsuario.getText().equals(USER) && new String(txtSenha.getPassword()).equals(PASS)){
                    JOptionPane.showMessageDialog(frame, "acesso autorizado");
                }else {
                    JOptionPane.showMessageDialog(frame, "acesso negado");
                }
            }
        });

        panel.add(lblUsuario);
        panel.add(txtUsuario);

        panel.add(lblSenha);
        panel.add(txtSenha);

        panel.add(btnLogin);

        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);





    }
}
