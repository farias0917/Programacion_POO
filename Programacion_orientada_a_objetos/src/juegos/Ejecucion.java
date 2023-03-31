package juegos;

import java.util.Scanner;

public class Ejecucion {
        public static void main(String[] args) {
            String nombre;
            int eleccionJuego;
            
            Scanner leerDato=new Scanner(System.in);
            
            System.out.println("¿Como te llamas?");
            nombre = leerDato.next();

            System.out.println("¿cual juego deseas elegir?");
            System.out.println("1.piedra papel o tijera / 2.Caricellazo");
            eleccionJuego = leerDato.nextInt();
            switch (eleccionJuego) {
                case 1:
                Ppt p = new Ppt(nombre,"");
                p.iniciar();
                p.jugar();
                p.finalizar();

                    break;
                case 2:
                Caricellazo c = new Caricellazo(nombre, "");
                c.iniciar();
                c.jugar();
                c.finalizar();
                default:
                    break;
            }
         leerDato.close();
        }
}
