package com.company;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Surface {

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(new Color(150, 150, 150)); // gray;

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY
        );

        g2d.setRenderingHints(rh);

        g2d.fillRect(30, 20, 50, 50);
        g2d.fillRect(120, 20, 90, 60);
        g2d.fillRoundRect(250, 20, 70, 60, 25, 25);

        g2d.fill(new Ellipse2D.Double(10, 100, 80, 100));
        g2d.fillArc(120, 130, 110, 100, 5, 150);
        g2d.fillOval(270, 130, 50, 50);
    }
}
