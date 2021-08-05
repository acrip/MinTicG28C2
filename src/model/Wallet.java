package model;

import java.util.Optional;

public class Wallet {
    public static final int cnsLIMITE = 500000;
    public static final int cnsTOPETRANSACCION = 200000;
    public static final double cnsTAZATRANSFERENCIA = .2;
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
        if(atrTieneLimite){
            if(this.atrSaldo + prmValor > cnsLIMITE) return "No puede superar el limite";
            if(prmValor > cnsTOPETRANSACCION) return "No puede superar el tope de la transaccion.";
        }
        this.atrSaldo += prmValor;
        if(this.verificarMeta()) System.out.println("Has superado la meta");
        return "Operacion exitosa, el nuevo saldo es: "+this.atrSaldo;
    }

    public String sacarSaldo(int prmValor){
        if(atrTieneLimite && prmValor > cnsTOPETRANSACCION) return "No puede superar el tope de la transaccion";
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
        if(this.atrTieneLimite){
            if(this.atrSaldo >= 10000){
                this.atrTieneLimite = false;
                this.atrSaldo -= 10000;
                mensaje = "Exito, ahora su wallet no tiene limites.";
            }else mensaje = "Cancelado, no cuenta con saldo suficiente para romper limites.";
        }
        //TODO: verificar el funcionamiento de la siguiente instruccion
        return Optional.ofNullable(mensaje).orElse("Cancelado, su wallet no tiene limites."); 
    }

    public String definirMeta(int prmValor){
        if(prmValor > cnsLIMITE && atrTieneLimite) return "No puedes definir una meta superior al limite";
        if(prmValor <= 0 ) return "Valor ingresado no valido";
        if(prmValor <= this.atrSaldo) return "Este valor ya ha sido superado";
        this.atrMeta = prmValor;
        return "Se ha definido una nueva meta!";
    }

    //TODO: Verificar el stack de mensajes que desencadena este metodo
    private boolean verificarMeta(){
        if(this.atrSaldo >= this.atrMeta && this.atrMeta > 0) return true;
        return false;
    }

    public String transferirDinero(Wallet prmWallet, int prmValor){
        double varValorConTaza = prmValor + (prmValor * cnsTAZATRANSFERENCIA);
        if(this.atrSaldo >= varValorConTaza){
            prmWallet.putSaldo(prmValor);
            this.atrSaldo -= varValorConTaza;
        }
        //TODO: Implementar los casos en los que la transferencia no fue exitosa (Try catch)
        return "transferencia exitosa";
    }
}






