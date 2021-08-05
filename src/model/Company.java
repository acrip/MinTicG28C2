package model;

public class Company extends Usuario{
    private Wallet objWallet;

    public Company(String prmNombre){
        objWallet = new Wallet(false);
        super.setAtrNombre(prmNombre);
    }
    
    public Wallet getObjWallet() {
        return objWallet;
    }
}
