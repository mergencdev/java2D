package com.company;

import javax.swing.*;
import java.awt.*;

// 'Surface' class extends JPanel for window panel in the frame;
public class Surface extends JPanel {

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // set string and set location info (x, y);
        g2d.drawString("Java 2D Introduction // ZetCode <3 mergencdev", 10, 150);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}
