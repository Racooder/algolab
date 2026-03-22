package de.hska.iwi.ads.solution.interfaces;

import de.hska.iwi.ads.interfaces.AbstractCircle;
import de.hska.iwi.ads.interfaces.Vector;

public class Circle extends AbstractCircle {

    public Circle(double radius) {
        super(radius);
    }

    public Circle(Vector middlePoint, double radius) {
        super(middlePoint, radius);
    }

    @Override
    public void scale(double factor) {

    }

    @Override
    public double getDimension() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }
}
