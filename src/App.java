public class App {
    
    private String nombre;
    private int edad;
    private double estatura;
    private float peso;
    private char inicial;
    private String direccionVivienda;   

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Operadores aritmeticos
        int resultado = 5 + 4;
        double resultado2 = 5 / 4;
        double resultado3 = 12 % 4;
        resultado ++;
        resultado = resultado + 1;
        resultado --;
        resultado = -resultado;
        resultado = +resultado;

        //Operadores Logicos
        boolean respuesta = 5 > 4;
        respuesta = 25 != 12;
        respuesta = true;
        respuesta = 15 > 12 && 5 < 2;
        respuesta = 15 > 12 || 5 < 2;

        //Operadores bit a bit
        //&
        //^
        //|


        //-----------------------
        // ESTRUCTURAS DE CONTROL

        if (respuesta) {
            //Resultado si se cumple la condicion
        }
        
        if (respuesta) {
            //Resultado si se cumple la condicion
        } else {
            //Resultado si no se cumple la condicion
        }
        
        int valor = 3;
        switch (valor) {
            case 1:
                //Bloque de codigo aqui
                break;
            case 2:
                //Bloque de codigo aqui
                break;
            case 3:
            //Bloque de codigo aqui
            break;
            default:
            break;
        }
        
        //CICLOS O BUCLES
        while (valor != 3) {
            //Bloque de codigo aqui
        }
        
        do{
            //Bloque de codigo aqui
        }while(valor != 3);
        
        for (String string : args) {
            //Bloque de codigo aqui
        }
        
        
        for (int i = 0; i < args.length; i++) {
            //Bloque de codigo aqui
        }

        for(;;){} //for infinito
    }
}
