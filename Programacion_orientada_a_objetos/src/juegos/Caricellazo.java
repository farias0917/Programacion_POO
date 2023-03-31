package juegos;

import java.util.Scanner;
import java.util.Random;

public class Caricellazo implements Juego {
    String nombre;
    String eleccion;
    int eleccionRandom;


    public Caricellazo(String nombre, String eleccion) {
        this.nombre = nombre;
        this.eleccion = eleccion;
    }

    public void iniciar() {
        System.out.println("Hola "+nombre+" bienvenido este es el juego de caricellazo" );
    }

    public void jugar(){
        Scanner leerDato=new Scanner(System.in);
        Random numRandom = new Random();
        eleccionRandom= 1 +numRandom.nextInt(2);
        System.out.println("Elige una de las dos caras");
        System.out.println("-Cara\n-Sello");
         eleccion=leerDato.next();
         leerDato.close();
    }

    public void finalizar(){
        switch (eleccion.toLowerCase()) {
            case "cara":
            if (eleccionRandom==1) {
                System.out.println(nombre.toUpperCase()+"¡HAS GANADO!");
                System.err.println("cayo: --cara--");
                System.err.println("Tu elegiste: "+eleccion);

            }if(eleccionRandom==2){
                System.out.println(nombre.toUpperCase()+"¡has perdido :(!");
                System.err.println("cayo: --sello--");
                System.err.println("Tu elegiste: "+eleccion);
            }
                break;

            case "sello":
            if (eleccionRandom==1) {
                System.out.println(nombre.toUpperCase()+"¡has perdido :(!");
                System.err.println("cayo: --cara--");
                System.err.println("Tu elegiste: "+eleccion);

            }if(eleccionRandom==2){
                System.out.println(nombre.toUpperCase()+"¡HAS GANADO!");
                System.err.println("cayo: --sello--");
                System.err.println("Tu elegiste: "+eleccion);
            }
                break;
            default:
            System.out.println("No selecciono ninguna de las opciones anteriores");
                break;
        }
    }
}
