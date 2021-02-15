package ClasesPersonaje.Clases;
/*
 *En esta clase realizaremos un objeto Personaje que será la representación
 *de un personaje de videojuego el cual tendra una serie de estadisticas, un nombre, una raza, un arma, un hechizo
 *, una profesión.
 *
 * Las propiedades de la clase son:
 *       nombre: cadena modificable y consultable.
 *       vida: entero consultable y no modificable.
 *       destreza: entero consultable y no modificable.
 *       fuerza: entero consultable y no modificable.
 *       inteligencia: entero, consultable y no modificable.
 *       resistencia: entero, consultable y no modificable.
 *       raza: Razas, consultable y no modificable.
 *       profesion: Profesiones, consultable y no modificable.
 *       arma: Armas, consultable y modificable a través de métodos.
 *       hechizo: Hechizo, consultable y modificable a través de métodos.
 *       estadisticas: Estadisticas, consultable y modificable mediante métodos.
 *       vivo: booleano consultable y modificable a través de métodos.
 *
 * Propiedades derivadas:
 *       vida, fuerza, destreza, inteligencia y resistencia provienen de estadisticas;
 *
 *
 *Interface:
 *
 *          setNombre(cadena nombre);
 *          setProfesion(Profesiones profesion);
 *          setRaza(Razas raza);
 *
 */

import ClasesPersonaje.Clases.Interfaces.PersonajeImp;
import ClasesPersonaje.Enums.Hechizos;
import ClasesPersonaje.Enums.Profesiones;
import ClasesPersonaje.Enums.Razas;
import ClasesPersonaje.Enums.TiposDeArmas;
import java.util.Scanner;

public class Personaje implements PersonajeImp {
    //Atributos
    private String nombre;
    private int vida;
    private int destreza;
    private int fuerza;
    private int resistencia;
    private int inteligencia;
    private Razas raza;
    private Arma arma;
    private Hechizo hechizo;
    private Profesiones profesion;
    private Estadisticas estadisticas;
    private boolean vivo;

    //métodos

    //Constructor
    public Personaje() {
        this.nombre = "";
        this.destreza = 0;
        this.vida = 0;
        this.fuerza = 0;
        this.resistencia = 0;
        this.inteligencia = 0;
        this.profesion = Profesiones.PARIA;
        this.arma = new Arma ( );
        armaSegunProfesion ();
        this.hechizo = new Hechizo ( );
        hechizoSegunProfesion ();
        this.raza = Razas.ALTO_ELFO;
        this.vivo = true;
    }

    //Pregunta al usuario que nombre decide establecer para su personaje
    //Precondiciones: nombre debe ser una cadena
    //postcondiciones: establecera el atributo nombre
    //Entrada: nada.
    //Salida: nombre.
    public void setNombre(String n) {
        this.nombre = n;
    }

    //Getters y setters
    public void setProfesion(Profesiones profesion) {
        this.profesion = profesion;
        armaSegunProfesion ( );
        setEstadisticas ( );
    }

    public Profesiones getProfesion() {
        return this.profesion;
    }

    private void setVida(int vida) {
        this.vida = vida;

    }

    private void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    private void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    private void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    private void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public Arma getArma() {
        return arma;
    }

    private void setHechizo(Hechizo hechizo) {
        this.hechizo = hechizo;
    }

    //Este método pregunta al usuario que profesión quiere paraa su personaje y la establece
    //Precondiciones: ninguna
    //Postcondiciones: Se establecerá la propiedad Profesion.
    //Entrada: nada
    //Salida: profesion.


    public void setRaza(Razas raza) {
        this.raza = raza;
    }

    private Estadisticas setPuntosEstadisticas() {
        if (getProfesion ( ) == Profesiones.ARQUERO) {
            this.estadisticas.setPuntosArquero ( );
        } else if (getProfesion ( ) == Profesiones.DEFENSOR) {
            this.estadisticas.setPuntosDefensor ( );
        } else if (getProfesion ( ) == Profesiones.PALADIN) {
            this.estadisticas.setPuntosPaladin ( );
        } else if (getProfesion ( ) == Profesiones.ERUDITO) {
            this.estadisticas.setPuntosErudito ( );
        } else if (getProfesion ( ) == Profesiones.HERRERO) {
            this.estadisticas.setPuntosHerrero ( );
        } else if (getProfesion ( ) == Profesiones.GUERRERO_PESADO) {
            this.estadisticas.setPuntosGuerreroPesado ( );
        } else if (getProfesion ( ) == Profesiones.LADRON) {
            this.estadisticas.setPuntosLadron ( );
        } else if (getProfesion ( ) == Profesiones.PARIA) {
            this.estadisticas.setPuntosParia ( );
        }
        return this.estadisticas;
    }

    private Hechizo hechizoSegunProfesion() {
        if (this.profesion == Profesiones.ARQUERO) {
            this.hechizo.setNombreHechizo ("Tromba de agua");
            this.hechizo.setDanhoHechizo (12);
            this.hechizo.setTipoHechizo (Hechizos.AGUA);
        } else if (this.profesion == Profesiones.DEFENSOR) {
            this.hechizo.setNombreHechizo ("Tornado igneo");
            this.hechizo.setDanhoHechizo (15);
            this.hechizo.setTipoHechizo (Hechizos.FUEGO);
        } else if (this.profesion == Profesiones.ERUDITO) {
            this.hechizo.setNombreHechizo ("Tumba rocas");
            this.hechizo.setDanhoHechizo (30);
            this.hechizo.setTipoHechizo (Hechizos.TIERRA);
        } else if (this.profesion == Profesiones.HERRERO) {
            this.hechizo.setNombreHechizo ("Tornado");
            this.hechizo.setDanhoHechizo (9);
            this.hechizo.setTipoHechizo (Hechizos.AIRE);
        } else if (this.profesion == Profesiones.GUERRERO_PESADO) {
            this.hechizo.setNombreHechizo ("Arenas movedizas");
            this.hechizo.setDanhoHechizo (7);
            this.hechizo.setTipoHechizo (Hechizos.TIERRA);
        } else if (this.profesion == Profesiones.LADRON) {
            this.hechizo.setNombreHechizo ("Shuriken agua");
            this.hechizo.setDanhoHechizo (27);
            this.hechizo.setTipoHechizo (Hechizos.AGUA);
        } else if (this.profesion == Profesiones.PALADIN) {
            this.hechizo.setNombreHechizo ("Refuerzo igneo de espadón");
            this.hechizo.setDanhoHechizo (9);
            this.hechizo.setTipoHechizo (Hechizos.FUEGO);
        } else if (this.profesion == Profesiones.PARIA) {
            this.hechizo.setNombreHechizo ("Gracia de la diosa");
            this.hechizo.setDanhoHechizo (36);
            this.hechizo.setTipoHechizo (Hechizos.AGUA);
        }
        return this.hechizo;
    }

    //Método que establece el arma inicial del jugador según la profesión que elija.
    //Precondiciones: Ninguna.
    //Postcondiciones:
    //Entrada: Nada
    //Salida: Un Objeto tipo Arma construido
    private Arma armaSegunProfesion() {
        if (profesion == Profesiones.ARQUERO) {
            this.arma.setTipoDeArma (TiposDeArmas.ARCO);
            this.arma.setDanho (7);
            this.arma.setNombre ("Arco de madera refinada");
        } else if (profesion == Profesiones.DEFENSOR) {
            arma.setTipoDeArma (TiposDeArmas.ESPADON);
            arma.setDanho (30);
            arma.setNombre ("Espadón Gaiano");
        } else if (profesion == Profesiones.ERUDITO) {
            arma.setTipoDeArma (TiposDeArmas.DAGA);
            arma.setDanho (8);
            arma.setNombre ("Daga de inteligencia");
        } else if (profesion == Profesiones.HERRERO) {
            arma.setTipoDeArma (TiposDeArmas.ALABARDA);
            arma.setDanho (14);
            arma.setNombre ("Alabarda punta de lanza");
        } else if (profesion == Profesiones.GUERRERO_PESADO) {
            arma.setTipoDeArma (TiposDeArmas.ESPADA_LARGA);
            arma.setDanho (20);
            arma.setNombre ("Espada larga corrupta");
        } else if (profesion == Profesiones.LADRON) {
            arma.setTipoDeArma (TiposDeArmas.DAGAS_DOBLES);
            arma.setDanho (18);
            arma.setNombre ("Dagas de Loki");
        } else if (profesion == Profesiones.PALADIN) {
            arma.setTipoDeArma (TiposDeArmas.ESPADON);
            arma.setDanho (22);
            arma.setNombre ("Espadón traga-almas");
        } else if (profesion == Profesiones.PARIA) {
            arma.setTipoDeArma (TiposDeArmas.DAGA);
            arma.setDanho (30);
            arma.setNombre ("Daga de la princesa Gwinnevere");
        }
        return this.arma;
    }

    //Método que funciona para que el personaje cambie de hechizo
    //Precondiciones: cambioHechizo debe ser un número entero.
    //Postcondiciones: Devolverá un hechizo con atributos diferentes al anterior.
    //Entrada: nada
    //Salida: un hechizo
    public Hechizo cambiarHechizo() {
        int cambioHechizo;
        Scanner sc = new Scanner (System.in);
        System.out.println ("¿A que hechizo queres cambiar?");
        System.out.println ("********************************");
        System.out.println ("1-> Agua\n2-> Tierra\n3-> Aire\n4-> Fuego");
        System.out.println ("********************************");
        cambioHechizo = sc.nextInt ( );
        Hechizo e = new Hechizo ( );
        if (cambioHechizo > 0 && cambioHechizo <= 4) {
            switch (cambioHechizo) {
                case 1 -> {
                    e.setTipoHechizo (Hechizos.AGUA);
                    e.setNombreHechizo ("Delicia del Tiburón");
                    e.setDanhoHechizo (27);
                    setHechizo (e);
                    break;
                }
                case 2 -> {
                    e.setTipoHechizo (Hechizos.TIERRA);
                    e.setNombreHechizo ("Apisonadora");
                    e.setDanhoHechizo (19);
                    setHechizo (e);
                    break;
                }
                case 3 -> {
                    e.setTipoHechizo (Hechizos.AIRE);
                    e.setNombreHechizo ("Resurgir de Aang");
                    e.setDanhoHechizo (32);
                    setHechizo (e);
                    break;
                }
                case 4 -> {
                    e.setTipoHechizo (Hechizos.FUEGO);
                    e.setNombreHechizo ("Perdición de los caidos");
                    e.setDanhoHechizo (24);
                    setHechizo (e);
                    break;
                }
            }
        } else {
            System.out.println ("No tenemos ese hechizo en la tienda de intercambios de hechizo.");
        }
        System.out.println ("Tu nuevo hechizo es");
        System.out.println (hechizo);
        return this.hechizo;
    }

    //Este método establece la vida, la resistencia, la fuerza, la destreza y la inteligencia
    // según los puntos dados al objeto Estadisticas. Tambien se tiene en cuenta
    //El valor del atributo danho del objeto Arma y el atributo danhoHechizo del objeto Hechizo

    //Precondiciones: El objeto personaje debe tener el atributo Profesion inicializado y con valor
    //ya que este se basa casi enteramente en la profesion para establecer las estadisticas.
    //También deben estar desarrollados los atributos hechizo y arma.

    //Postcondiciones: Este método creará la propiedad estadisticas y dará valores a
    //fuerza, inteligencia, vida, destreza y resistencia.

    //Entrada: nada.
    //Salida: nada.
    private void setEstadisticas() {
        this.estadisticas = new Estadisticas ( );
        setPuntosEstadisticas ( );
        setVida (estadisticas.getPuntosVida ( ) * 100);
        this.inteligencia = (estadisticas.getPuntosInteligencia ( ) * 20);
        this.inteligencia += (hechizo.getDanhoHechizo ( ) * 20);
        this.fuerza = (estadisticas.getPuntosFuerza ( ) * 20);
        this.fuerza += (arma.getDanho ( ) * 50);
        this.resistencia = (estadisticas.getPuntosResistencia ( ) * 20);
        this.destreza = (estadisticas.getPuntosDestreza ( ) * 20);
    }

    //Este método establece el arma y el hechizo según la profesion y también sus estadisticas
    //Precondiciones
    public void menu() {
        armaSegunProfesion ( );
        setEstadisticas ( );
    }

    public boolean cambiarArmas(Personaje e) {
        boolean cambio = false;
        Arma p = this.arma;
        this.arma = e.arma;
        e.arma = p;
        cambio = true;
        return cambio;
    }

    public boolean ataque(Personaje e) {
        e.vivo = true;
        this.vivo = true;
        if (this.fuerza > e.resistencia) {
            for (int i = 0; (i < this.fuerza && e.resistencia > 0); i++)
                e.resistencia -= 1;
            if (e.resistencia == 0) {
                e.vida -= (this.fuerza + (this.destreza / 2));
                if (e.vida <= 0) {
                    e.vivo = false;
                    System.out.println (nombre + " murió");
                }
            }
        }
        return e.vivo;
    }

    public void lanzarHechizo() {

    }

    @Override
    public String toString() {
        return "Personaje{" + "\n" +
                "nombre=" + nombre + "\n" +
                "raza=" + raza + "\n" +
                "profesion=" + profesion + "\n" +
                "ESTADISTICAS" + "\n" +
                "vida=" + vida + "\n" +
                "destreza=" + destreza + "\n" +
                "fuerza=" + fuerza + "\n" +
                "resistencia=" + resistencia + "\n" +
                "inteligencia=" + inteligencia + "\n" +
                "ARMA=" + arma + "\n" +
                "Esta vivo=" + vivo + "\n" +
                '}';
    }
}

