package com.company;

public class CajaDeAhorro extends Cuenta{
    private Double cobrarInteres;
    public CajaDeAhorro(Cliente titular){
        super(titular);
        this.cobrarInteres = 0.10 * getSaldo();
    }
}
