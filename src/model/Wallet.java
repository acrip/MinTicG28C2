package model;

import java.util.Optional;

public class Wallet {
    public static final int cnsLIMITE = 500000;
    private int atrSaldo;
    private boolean atrTieneLimite;
    private int atrMeta;

    public Wallet(boolean prmLimite) {
        this.atrSaldo = 0;
        this.atrTieneLimite = prmLimite;
        this.atrMeta = 1000000;
    }

    public int getSaldo(){
        return this.atrSaldo;
    }

    public void setSaldo(int prmSaldo){
        this.atrSaldo = prmSaldo;
    }
    
    public String putSaldo(int prmValor){
        if(this.atrSaldo + prmValor > cnsLIMITE && atrTieneLimite)
            return "No puede superar el limite";
        this.atrSaldo += prmValor;
        this.verificarMeta();
        return "Operacion exitosa, el nuevo saldo es: "+this.atrSaldo;
    }

    public String sacarSaldo(int prmValor){
        if(prmValor > this.atrSaldo){
            int varSaldoActual = this.atrSaldo;
            this.atrSaldo = 0;
            return "Saldo insuficiente, saldo retirado: " + varSaldoActual;
        }
        this.atrSaldo -= prmValor;
        return "Transaccion exitosa, el nuevo saldo es: " + this.atrSaldo; 
    }
    public String breakLimit(){
        String mensaje = null;
        if(this.atrTieneLimite == true){
            if(this.atrSaldo >= 10000){
                this.atrTieneLimite = false;
                this.atrSaldo -= 10000;
                mensaje = "Exito, ahora su wallet no tiene limites.";
            }else mensaje = "Cancelado, no cuenta con saldo suficiente para romper limites.";
        }
        return Optional.ofNullable(mensaje).orElse("Cancelado, su wallet no tiene limites."); 
    }

    public String definirMeta(int prmValor){
        this.atrMeta = prmValor;
        return "Se ha definido la meta exitosamente";
    }
    //TODO: Verificar en donde se debe llamar a este metodo
    private void verificarMeta(){
        if(this.atrSaldo >= this.atrMeta){
            System.out.println("Felicitaciones, ha logrado su meta");
        }
        System.out.println("Aun no superas tu meta");
    }
}






