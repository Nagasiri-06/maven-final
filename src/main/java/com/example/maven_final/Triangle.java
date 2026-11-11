package com.example.maven_final;

public class Triangle {

    private static final double EPSILON = 1e-9;

    public static boolean isEquilateral(
            double a, double b, double c) {

        // Check whether all sides are positive and finite
        if (!Double.isFinite(a) ||
            !Double.isFinite(b) ||
            !Double.isFinite(c) ||
            a <= 0 || b <= 0 || c <= 0) {

            return false;
        }

        // Check whether all three sides are equal
        return Math.abs(a - b) <= EPSILON &&
               Math.abs(b - c) <= EPSILON &&
               Math.abs(a - c) <= EPSILON;
    }

    public static void main(String[] args) {

        double a = 5;
        double b = 5;
        double c = 5;

        System.out.println("Side A: " + a);
        System.out.println("Side B: " + b);
        System.out.println("Side C: " + c);

        if (isEquilateral(a, b, c)) {
            System.out.println(
                "Result: Equilateral Triangle");
        } else {
            System.out.println(
                "Result: Not an Equilateral Triangle");
        }
    }


}
