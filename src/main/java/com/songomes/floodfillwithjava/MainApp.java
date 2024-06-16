package com.songomes.floodfillwithjava;

import javax.swing.*;
import java.awt.*;

public class MainApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainApp::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Flood Fill Algorithm");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Configurar o layout da grade
        JPanel panel = new JPanel(new GridLayout(4, 4));

        for (int i = 1; i <= 16; i++) {
            JButton button = new JButton("Button " + i);
            button.addActionListener(event -> System.out.println(button.getText() + " clicked"));
            panel.add(button);
        }

        frame.getContentPane().add(panel);

        // Centralizar a janela na tela
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }


}
