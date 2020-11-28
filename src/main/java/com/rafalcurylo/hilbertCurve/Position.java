package com.rafalcurylo.hilbertCurve;

/**
 * @author - rafal.curylo@gmail.com
 */
public class Position {

    private int x;
    private int y;
    private int xPrev;
    private int yPrev;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
        this.xPrev = x;
        this.yPrev = y;
    }

    public void move(int xDelta, int yDelta) {
        this.xPrev = x;
        this.yPrev = y;
        this.x += xDelta;
        this.y += yDelta;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getxPrev() {
        return xPrev;
    }

    public int getyPrev() {
        return yPrev;
    }
}