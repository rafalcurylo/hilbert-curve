package com.rafalcurylo.hilbertCurve;

import java.awt.*;

/**
 * @author - rafal.curylo@gmail.com
 */
public class HilbertPainter {

    private final int h;
    private final int targetLevel;
    private final Graphics2D graphics2D;

    public HilbertPainter(int height, int targetLevel, Graphics2D graphics2D) {
        this.h = height;
        this.targetLevel = targetLevel;
        this.graphics2D = graphics2D;
    }

    public void paint(Position startingPosition) {
        Position pos = new Position(startingPosition.getX(), startingPosition.getY());
        figA(targetLevel, pos);
    }

    private void figA(int level, Position pos) {
        if (level > 0) {
            figD(level-1, pos); pos.move(-h, 0); line(pos);
            figA(level-1, pos); pos.move(0, -h); line(pos);
            figA(level-1, pos); pos.move(h, 0); line(pos);
            figB(level-1, pos);
        }
    }

    private void figB(int level, Position pos) {
        if (level > 0) {
            figC(level-1, pos); pos.move(0, h); line(pos);
            figB(level-1, pos); pos.move(h, 0); line(pos);
            figB(level-1, pos); pos.move(0, -h); line(pos);
            figA(level-1, pos);
        }
    }

    private void figC(int level, Position pos) {
        if (level > 0) {
            figB(level-1, pos); pos.move(h, 0); line(pos);
            figC(level-1, pos); pos.move(0, h); line(pos);
            figC(level-1, pos); pos.move(-h, 0); line(pos);
            figD(level-1, pos);
        }
    }

    private void figD(int level, Position pos) {
        if (level > 0) {
            figA(level-1, pos); pos.move(0, -h); line(pos);
            figD(level-1, pos); pos.move(-h, 0); line(pos);
            figD(level-1, pos); pos.move(0, h); line(pos);
            figC(level-1, pos);
        }
    }

    private void line(Position pos) {
        graphics2D.drawLine(pos.getxPrev(), pos.getyPrev(), pos.getX(), pos.getY());
    }

}