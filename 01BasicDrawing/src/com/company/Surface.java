package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Surface extends JPanel implements ActionListener {
    private final int delay = 150; // timer delay;
    private Timer timer;

    public Surface() {
        initTimer();
    }

    private void initTimer() {
        timer = new Timer(delay, this);
        timer.start();
    }

    public Timer getTimer() {
        return timer;
    }

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(Color.ORANGE);

        int width = getWidth();
        int height = getHeight();

        Random random = new Random();

        for (int i = 0; i < 2000; i++) {
            int x = Math.abs(random.nextInt() % width);
            int y = Math.abs(random.nextInt() % height);

            g2d.drawLine(x, y, x, y);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        doDrawing(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }


}
