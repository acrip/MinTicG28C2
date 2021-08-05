package view;

import model.Company;
import model.Owner;

public class VistaUser {

    public static void main(String[] args) {
        Owner objOwner1 = new Owner("Sara");
        Owner objOwner2 = new Owner("Nahomy");
        System.out.println(objOwner1.getAtrNombre());
        System.out.println(objOwner2.getAtrNombre());
        objOwner1.getObjWallet().putSaldo(100000);
        
        Company objEmpresa = new Company("Tesla");
        String varResponse = objEmpresa.getObjWallet().putSaldo(10000000);
        System.out.println(varResponse);

    }
    
}
