package com.consingleton;

public class ContadorSingleton {
    private int cuenta;
    static int contador;
    private static ContadorSingleton instancia;

    private ContadorSingleton() {
        cuenta = 0;
        contador++;
    }

    public static ContadorSingleton getInstance() {
        if (instancia == null) {
            instancia = new ContadorSingleton();
        }
        return instancia;
    }

    public void aumentar() {
        cuenta++;
    }

    public int getCuenta() {
        return cuenta;
    }
}
