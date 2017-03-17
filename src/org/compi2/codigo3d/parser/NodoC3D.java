package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String Ev;
    private String Ef;

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
     public NodoC3D(String Ev,String Ef) {
        this.Ev=Ev;
        this.Ef=Ef;      
    }

     //Gets y Sets
    public String getEv() {
        return Ev;
    }

    public void setEv(String Ev) {
        this.Ev = Ev;
    }

    public String getEf() {
        return Ef;
    }

    public void setEf(String Ef) {
        this.Ef = Ef;
    }
    
    public String getCad(){
        return cad;
    }
        
}
