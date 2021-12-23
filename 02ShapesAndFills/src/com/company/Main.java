package com.company;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    Main() {
        initUI();
    }

    private void initUI() {
        add(new Surface());
        setTitle("Basic shapes");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main shapesAndFillsExample = new Main();
                shapesAndFillsExample.setVisible(true);
            }
        });
    }
}
