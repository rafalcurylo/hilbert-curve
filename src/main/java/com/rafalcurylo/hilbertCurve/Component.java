package com.rafalcurylo.hilbertCurve;

import javax.swing.*;
import java.awt.*;

/**
 * @author - rafal.curylo@gmail.com
 */
public class Component extends JComponent {

    private static final Stroke STROKE = new BasicStroke(3.0f);
    private static final Color COLOR = Color.GREEN;

    private final int targetLevel;
    private final int height;

    public Component(int targetLevel, int height) {
        this.targetLevel = targetLevel;
        this.height = height;
    }

    @Override
    public void paintComponent(Graphics g) {

        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setStroke(STROKE);
        graphics2D.setPaint(COLOR);

        int h = height;
        int x0 = h / 2;
        int y0 = h / 2;
        for (int i = 0; i < targetLevel ; i++) {
            h/=2;
            x0+=h/2;
            y0+=h/2;
        }
        HilbertPainter hilbertPainter = new HilbertPainter(h, targetLevel, graphics2D);
        hilbertPainter.paint(new Position(x0, y0));
    }

}