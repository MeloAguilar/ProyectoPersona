package ClasesPersonaje.Clases;
import ClasesPersonaje.Enums.TiposDeArmas;
/*
* Esta clase se encargará de crear los atributos el objeto Arma de el objeto Personaje
*
* Atributos:
*           danho: entero consultable y no modificable.
*           nombre: cadena consultable y no modificable.
*           tipoDeArma: tipo TipodeArmas consultable y no modificable.
*
*
* Interface:
*       setNombre(cadena nombre);
*       setDanho(entero danho);
*       setTipoDeArma(TipoDeArma tipoDeArma);
 */

public class Arma{

    //Atributos
    private int danho;
    private String nombre;
    private TiposDeArmas tipoDeArma;


    //Métodos

    //Constructor.
    public Arma(){
        this.danho = 0;
        this.nombre = "";
        this.tipoDeArma = TiposDeArmas.ALABARDA;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDanho(int danho){
        this.danho = danho;
    }
    public void setTipoDeArma(TiposDeArmas t){
        this.tipoDeArma = t;
    }
    public int getDanho() {
        return danho;
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return "Arma{" + "\n" +
                "daño=" + danho + "\n" +
                "nombre='" + nombre + "\n" +
                "tipoDeArma=" + tipoDeArma + "\n" +
                '}';
    }
}

