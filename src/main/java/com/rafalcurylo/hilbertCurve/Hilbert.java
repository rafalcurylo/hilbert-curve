package com.rafalcurylo.hilbertCurve;

import javax.swing.*;
import java.util.stream.Stream;

/**
 * @author - rafal.curylo@gmail.com
 */
public class Hilbert {

    private final static int SIZE = 800;
    private final static int MARGIN = 50;

    private final static int DEFAULT_LEVEL = 3;
    private final int targetLevel;

    public Hilbert(int targetLevel) {
        this.targetLevel = targetLevel;
    }

    public void buildHilbert() {
        JFrame frame = new JFrame("Hilbert");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.add(new Component(targetLevel, SIZE - MARGIN));

        frame.pack();
        frame.setSize(SIZE, SIZE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        int level = Stream.of(args).findFirst().map(Integer::valueOf).orElse(DEFAULT_LEVEL);
        new Hilbert(level).buildHilbert();
    }

}