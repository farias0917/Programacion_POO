package figuras;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        float lado, base, altura;
        int eleccion,radio;
        Scanner leerDato= new Scanner(System.in);


        System.out.println("¿Elija una figura para calcular su area?");
        System.out.println("1.cuadrado "+"\n2.rectangulo"+"\n3.Circulo"+"\n4.Triangulo");
        eleccion=leerDato.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println("por favor digite el lado del cuadrado");
                lado = leerDato.nextFloat();
                Cuadrado c1 = new Cuadrado(lado);
                c1.calcularArea();
                break;

            case 2:
                System.out.println("por favor digite la base del rectangulo");
                base = leerDato.nextFloat();
    
                System.out.println("por favor digite la altura del rectangulo");
                altura = leerDato.nextFloat();
                Rectangulo r = new Rectangulo(base, altura);
                r.calcularArea();
                break;

             case 3:
                System.out.println("por favor digite el radio del circulo");
                radio = leerDato.nextInt();
                Circulo c = new Circulo(radio);
                c.calcularArea();
                break;

            case 4:
                System.out.println("por favor digite la base del triangulo");
                base = leerDato.nextFloat();

                System.out.println("por favor digite la altura del triangulo");
                altura = leerDato.nextFloat();
                Triangulo t = new Triangulo(base,altura);
                t.calcularArea();
                break;
        
            default:
                 System.out.println("No eligio ninguna de las opciones");
                break;
        }

        
        leerDato.close();
    }
}
