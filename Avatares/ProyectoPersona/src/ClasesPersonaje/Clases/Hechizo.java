package ClasesPersonaje.Clases;
/*
*En esta clase se le da forma a los hechizos, estableciendo su nombre, su tipo y la cantidad de daño que ejerce
*
* Propiedades:
*       danhoHechizo: entero, consultable y no modificable
*       nombreHechizo: cadena consultable y no modificable.
*       tipoHechizo: tipo Hechizos consultable y no modificable.
*
*
 */
import ClasesPersonaje.Enums.Hechizos;

public class Hechizo {
    //Atributos

    private int danhoHechizo;
    private String nombreHechizo;
    private Hechizos tipoHechizo;

    //Métodos
    public Hechizo(){
        this.danhoHechizo = 0;
        this.nombreHechizo = "";
        this.tipoHechizo = Hechizos.AGUA;
    }

    //Esta clase solo establecerá los atributos del hechizo por lo que
    //solo nos interesará que contenga los setter y getter
    public void setDanhoHechizo(int danhoHechizo) {
        this.danhoHechizo = danhoHechizo;
    }
    public void setNombreHechizo(String nombreHechizo) {
        this.nombreHechizo = nombreHechizo;
    }
    public void setTipoHechizo(Hechizos tipoHechizo) {
        this.tipoHechizo = tipoHechizo;
    }
    public Hechizos getTipoHechizo() {
        return tipoHechizo;
    }
    public int getDanhoHechizo() {
        return danhoHechizo;
    }
    public String getNombreHechizo() {
        return nombreHechizo;
    }

    @Override
    public String toString() {
        return "Hechizo{" + "\n" +
                "nombre del Hechizo='" + nombreHechizo + "\n" +
                "tipo de Hechizo=" + tipoHechizo + "\n" +
                "daño del Hechizo=" + danhoHechizo + "\n" +
                '}';
    }
}
