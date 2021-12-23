package com.company;

import java.awt.*;

public class Main {

    Main() {
        initUI();
    }

    private void initUI() {

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main shapesAndFillsExample = new Main();

            }
        });
    }
}
