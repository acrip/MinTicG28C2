package model;

public class Usuario{
    private String atrNombre;
    private char atrEstado;

    public String getAtrNombre() {
        return atrNombre;
    }
    
    public char getAtrEstado() {
            return atrEstado;
    }

    public void setAtrNombre(String prmNombre) {
        this.atrNombre = prmNombre;
    }

    public void setAtrEstado(char prmEstado) {
        this.atrEstado = prmEstado;
    }

}