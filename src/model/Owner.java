package model;

public class Owner extends Usuario{
    private Wallet objWallet;

    public Owner(String prmNombre){
        objWallet = new Wallet(true);
        super.setAtrNombre(prmNombre);
    }

    public Wallet getObjWallet() {
        return objWallet;
    }
}
