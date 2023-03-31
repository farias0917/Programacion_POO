package juegos;

import java.util.Random;
import java.util.Scanner;

public class Ppt implements Juego {
    String nombre;
    String eleccion;
    int eleccionRandom;

    public Ppt(String nombre, String eleccion) {
        this.nombre = nombre;
        this.eleccion = eleccion;
    }
    public void iniciar(){
       System.out.println("Hola "+nombre+" bienvenido este es el juego de piedra papel o tijera" );

    }
    public void jugar(){
        Scanner leerDato=new Scanner(System.in);
        Random numRandom = new Random();
        eleccionRandom= 1 +numRandom.nextInt(3);
        System.out.println("¿Con que opcion deseas jugar?");
        System.out.println("-Piedra\n-Papel\n-Tijera");
         eleccion=leerDato.next();
         leerDato.close();
    }

    public void finalizar(){
        switch (eleccion.toLowerCase()) {
            case "piedra":
            if (eleccionRandom==1) {
                System.out.println(nombre.toUpperCase()+"¡has quedado en empate!");
                System.err.println("cayo --piedra--");
                System.err.println("Tu elegiste: "+eleccion);

            }if(eleccionRandom==2){
                System.out.println(nombre.toUpperCase()+"¡has perdido :(!");
                System.out.println("cayo --papel--");
                System.err.println("Tu elegiste: "+eleccion);
            }if (eleccionRandom==3) {
                System.out.println(nombre.toUpperCase()+"¡HAS GANADO!");
                System.out.println("cayo --tijera--");
                System.err.println("Tu elegiste: "+eleccion);
            }
                break;

            case "papel":
            if (eleccionRandom==1) {
                System.out.println(nombre.toUpperCase()+"¡HAS GANADO!");
                System.err.println("cayo --piedra--");
                System.err.println("Tu elegiste: "+eleccion);

            }if(eleccionRandom==2){
                System.out.println(nombre.toUpperCase()+"¡has quedado en empate!");
                System.out.println("cayo --papel--");
                System.err.println("Tu elegiste: "+eleccion);
            }if (eleccionRandom==3) {
                System.out.println(nombre.toUpperCase()+"¡has perdido :(!");
                System.out.println("cayo --tijera--");
                System.err.println("Tu elegiste: "+eleccion);
            }
                break;

            case "tijera":
            if (eleccionRandom==1) {
                System.out.println(nombre.toUpperCase()+"¡has perdido :(!");
                System.err.println("cayo --piedra--");
                System.err.println("Tu elegiste: "+eleccion);

            }if(eleccionRandom==2){
                System.out.println(nombre.toUpperCase()+"¡HAS GANADO!");
                System.out.println("cayo --papel--");
                System.err.println("Tu elegiste: "+eleccion);
            }if (eleccionRandom==3) {
                System.out.println(nombre.toUpperCase()+"¡has quedado en empate!");
                System.out.println("cayo --tijera--");
                System.err.println("Tu elegiste: "+eleccion);
            }
                break;
            default:
            System.out.println("No selecciono ninguna de las opciones anteriores");
                break;
        }
    }

}


