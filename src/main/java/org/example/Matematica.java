package org.example;

public class Matematica {
    public boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public boolean ehMultiplo(int numero, int divisor) {
        return numero % divisor == 0;
    }
}
