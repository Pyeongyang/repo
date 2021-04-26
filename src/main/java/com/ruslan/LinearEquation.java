package com.ruslan;

public class LinearEquation extends Equations {
    protected double b;
    public LinearEquation(double a, double b) { super(a); this.b = b; }
    public int getNumberOfRoots() {
        if (this.isZero(a))
            return 0;
        return 1;
    }
}
