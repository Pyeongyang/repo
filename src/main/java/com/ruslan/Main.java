package com.ruslan;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        double xL, D;
        Scanner scannerIn = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        double a = scannerIn.nextDouble();
        System.out.print("Введите значение b: ");
        double b = scannerIn.nextDouble();
        System.out.print("Введите значение c: ");
        double c = scannerIn.nextDouble();
        QuadraticEquation quadEq = new QuadraticEquation(a, b, c);

        D = quadEq.getNumberOfRoots();
        if ( 2.0 == D){
            double x1 = (-b - Math.sqrt(D)/(2*a));
            double x2 = -b + Math.sqrt(D)/(2*a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (1 == D) {
            // TODO: +решение линейного уравнения
            double x = -b/(2*a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else
            System.out.println("Уравнение не имеет действительных корней");
        System.in.read();
    }
}