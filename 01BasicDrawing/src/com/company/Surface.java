package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Surface extends JPanel implements ActionListener {
    private final int delay = 150; // timer delay;
    private Timer timer;

    public Surface() {
        timer = new Timer(delay, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public Timer getTimer() {
        return timer;
    }
}
