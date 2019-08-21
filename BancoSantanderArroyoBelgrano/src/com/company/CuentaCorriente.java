package com.company;

public class CuentaCorriente extends Cuenta{
    private Double saldoAFavor;
    private Double montoDescubierto;
    public CuentaCorriente (Cliente titular){
        super(titular);
        montoDescubierto = 2000.0;
    }
    public void extraer(Double platita){
        if(platita <= getSaldo() + montoDescubierto){
            saldoAFavor = saldoAFavor - (montoDescubierto - platita);
            super.extraer(platita);
        }
    }
}
