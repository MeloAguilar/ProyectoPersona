package ClasesPersonaje.Clases;
/*
*Esta clase nos servirá para añadir estadisticas a un objeto personaje
*
* Atributos:
*
*       puntosVida: entero consultable y modificable
*       puntosDestreza: entero consultable y modificable.
*       puntosResistenia: entero consultable y modificable.
*       puntosInteligencia: entero consultable y modificable.
*       puntosFuerza: entero consultable y no modificable.
*       PUNTOSMAXIMOS: entero no modificable y consultable.
*       puntosRestantes: entero consultable y no modificable.
*
*
 */

public class Estadisticas {
    //Atributos
    private int puntosVida;
    private int puntosDestreza;
    private int puntosInteligencia;
    private int puntosResistencia;
    private int puntosFuerza;
    private int puntosRestantes;
    private int PUNTOSMAXIMOS = 100;

    //Este método establece los puntos asignados al personaje si su profesion es Arquero.
    //Precondiciones: la propiedad profesion del objeto Personaje debe ser Profesiones.ARQUERO.
    //Postcondiciones: se forma el objeto estadisticas.
    //Entrada: nada
    //SAlida: nada
    public void setPuntosArquero() {
        this.puntosFuerza = 12;
        this.puntosInteligencia = 6;
        this.puntosResistencia = 15;
        this.puntosDestreza = 15;
        this.puntosVida = 6;
        setPuntosRestantes ();
    }
    //Este método establece los puntos asignados al personaje si su profesion es Defensor.
    //Precondiciones: la propiedad profesion del objeto Personaje debe ser Profesiones.DEFENSOR.
    //Postcondiciones: se forma el objeto estadisticas.
    //Entrada: nada
    //SAlida: nada
    public void setPuntosDefensor() {
        this.puntosFuerza = 25;
        this.puntosInteligencia = 6;
        this.puntosResistencia = 25;
        this.puntosVida = 25;
        this.puntosDestreza = 4;
        setPuntosRestantes ();

    }
    //Este método establece los puntos asignados al personaje si su profesion es Paladin.
    //Precondiciones: la propiedad profesion del objeto Personaje debe ser Profesiones.PALADIN.
    //Postcondiciones: se forma el objeto estadisticas.
    //Entrada: nada
    //SAlida: nada
    public void setPuntosPaladin() {
        this.puntosFuerza = 20;
        this.puntosInteligencia = 7;
        this.puntosResistencia = 20;
        this.puntosVida = 20;
        this.puntosDestreza = 6;
        setPuntosRestantes ();

    }


    //Este método establece los puntos asignados al personaje si su profesion es Erudito.
    //Precondiciones: la propiedad profesion del objeto Personaje debe ser Profesiones.ERUDITO.
    //Postcondiciones: se forma el objeto estadisticas.
    //Entrada: nada
    //SAlida: nada
    public void setPuntosErudito() {
        this.puntosFuerza = 8;
        this.puntosInteligencia = 25;
        this.puntosResistencia = 8;
        this.puntosVida = 8;
        this.puntosDestreza = 12;
        setPuntosRestantes ();

    }
    //Este método establece los puntos asignados al personaje si su profesion es Herrero.
    //Precondiciones: la propiedad profesion del objeto Personaje debe ser Profesiones.HERRERO.
    //Postcondiciones: se forma el objeto estadisticas.
    //Entrada: nada
    //SAlida: nada
    public void setPuntosHerrero() {
        this.puntosFuerza = 22;
        this.puntosInteligencia = 6;
        this.puntosResistencia = 18;
        this.puntosVida = 25;
        this.puntosDestreza = 4;
        setPuntosRestantes ();
    }
    //Este método establece los puntos asignados al personaje si su profesion es Ladron.
    //Precondiciones: la propiedad profesion del objeto Personaje debe ser Profesiones.LADRON.
    //Postcondiciones: se forma el objeto estadisticas.
    //Entrada: nada
    //SAlida: nada
    public void setPuntosLadron() {
        this.puntosFuerza = 5;
        this.puntosVida = 5;
        this.puntosResistencia = 12;
        this.puntosDestreza = 20;
        this.puntosInteligencia = 12;
        setPuntosRestantes ();
    }
    //Este método establece los puntos asignados al personaje si su profesion es Guerrero Pesado.
    //Precondiciones: la propiedad profesion del objeto Personaje debe ser Profesiones.GUERRERO_PESADO.
    //Postcondiciones: se forma el objeto estadisticas.
    //Entrada: nada
    //SAlida: nada
    public void setPuntosGuerreroPesado() {
        this.puntosFuerza = 20;
        this.puntosVida = 20;
        this.puntosResistencia = 20;
        this.puntosDestreza = 5;
        this.puntosInteligencia = 4;
        setPuntosRestantes ();
    }
    //Este método establece los puntos asignados al personaje si su profesion es Paria.
    //Precondiciones: la propiedad profesion del objeto Personaje debe ser Profesiones.PARIA.
    //Postcondiciones: se forma el objeto estadisticas.
    //Entrada: nada
    //SAlida: nada
    public void setPuntosParia() {
        this.puntosFuerza = 5;
        this.puntosVida = 5;
        this.puntosResistencia = 5;
        this.puntosDestreza = 5;
        this.puntosInteligencia = 5;
        setPuntosRestantes ();
    }
    //Establece los puntos que quedarán despues de establecer los principales puntos
    //Precondiciones: puntosRestantes debe ser mayor que la
    //siguiente suma->(puntosDestreza + puntosResistencia + puntosVida + puntosInteligencia + puntosFuerza)
    //Postcondiciones: devolverá los puntos que el usuario puede establecer
    //Entrada:nada
    //Salida: entero puntosRestantes.
    public int setPuntosRestantes() {
        this.puntosRestantes = PUNTOSMAXIMOS;
        this.puntosRestantes -= (getPuntosDestreza ( ) + getPuntosResistencia ( ) + getPuntosVida ( ) + getPuntosFuerza ( ) + getPuntosInteligencia ( ));
        return this.puntosRestantes;
    }

    public int getPuntosDestreza() {
        return puntosDestreza;
    }

    public int getPuntosFuerza() {
        return puntosFuerza;
    }

    public int getPuntosInteligencia() {
        return puntosInteligencia;
    }

    public int getPuntosResistencia() {
        return puntosResistencia;
    }

    public int getPuntosVida() {
        return puntosVida;
    }
}
