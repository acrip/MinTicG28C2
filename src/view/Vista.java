package view;
import model.Wallet;

public class Vista {
    public static void main2(String[] args) {
        Wallet wallet1 = new Wallet(true);
        Wallet wallet2 = new Wallet(false);
        Wallet wallet3 = new Wallet(true);


        String varSaldo1 = wallet1.putSaldo(600000);
        System.out.println(varSaldo1);
        
        String varSaldo2 = wallet2.putSaldo(600000);
        System.out.println(varSaldo2);

        String varSaldo3 = wallet3.putSaldo(600000);
        System.out.println(varSaldo3);
        
        System.out.println(wallet1.sacarSaldo(900000));
        System.out.println(wallet2.sacarSaldo(900000));
        System.out.println(wallet3.sacarSaldo(900000));

        System.out.println(wallet1.breakLimit());
        System.out.println(wallet2.breakLimit());
        System.out.println(wallet3.breakLimit());

    }
    
}
