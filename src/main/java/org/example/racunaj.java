package org.example;

public class racunaj {
    double n;
    public racunaj(double x) {
        n = x;
    }
    public double dajSinus() {
        return Math.sin(n);
    }

    public double dajFaktorijel() {
        double rez = 1;
        for(int i = 1; i <= n; i++) {
            rez = rez * i;
        }
        return rez;
    }
}
