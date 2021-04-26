package com.ruslan;

public abstract class Equations implements Equation {
    protected double epsilon = 0.0000001;
    protected double a;
    protected Equations(double a) { this.a = a; }
    public boolean isZero(double x) {
        return Math.abs(x) <= epsilon;
    }
    public abstract int getNumberOfRoots();
}
