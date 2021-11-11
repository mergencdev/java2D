package com.company;

import javax.swing.*;
import java.awt.*;

//'Main' class extends JFrame for window frame;
public class MainIntroduction extends JFrame {

    MainIntroduction() {
        initUI();
    }

    //fun for main UI operations;
    private void initUI() {
        //add 'Surface' panel in the frame;
        add(new Surface());

        setTitle("Java 2D Introduction");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainIntroduction introduction = new MainIntroduction();
                //set visible;
                introduction.setVisible(true);
            }
        });

    }
}
