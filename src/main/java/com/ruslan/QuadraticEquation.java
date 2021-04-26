package com.ruslan;

public class QuadraticEquation extends LinearEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c){
        super(a, b);
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }

    public int getNumberOfRoots() {
        if (isQuadratic()) {
            double discriminant = this.getDiscriminant();
            if (discriminant > 0) {
                return 2;
            } else if (discriminant == 0.0) {
                return 1;
            } else {
                return 0;
            }
        }

        if (isLinear()) {
            return 1;
        }

        return Integer.MAX_VALUE;
    }

    private boolean isLinear() {
        return (a == 0) && (b != 0) && (c != 0);
    }

    private double getDiscriminant() {
        return b*b - 4*a*c;
    }

    private boolean isQuadratic() {
        return a != 0;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
