package Principal;

import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        String cargo;
        int valor;
        int hora;
        double total;
        Scanner leerDato=new Scanner(System.in);
        Persona p = new Persona();
       
     
        System.out.println("Por favor digite el cargo");
        cargo=leerDato.next();

        System.out.println("Por favor digite el valor hora");
        valor=leerDato.nextInt();

        System.out.println("Por favor digite horas trabajadas");
        hora=leerDato.nextInt();

        p.pedirDatos();

        Empleado e = new Empleado(p.getTipoDoc(), p.getDocumento(), p.getNombre(), p.getApellido(), p.getEdad(), p.getSexo(),cargo , valor, hora, "0");
    
        e.mostrarEmpleado();
        total= e.calcularHonorarios(valor, hora);
        System.out.println("pago total "+total);

        leerDato.close();
       
        /*int peso;
        float altura;
        float resultado;
        Scanner LeerDato=new Scanner(System.in);
        Persona p = new Persona();

        

        System.out.println("Por favor digite su peso(Kg)");
        peso=LeerDato.nextInt();

        System.out.println("Por favor digite su altura");
        altura=LeerDato.nextFloat();

        p.pedirDatos();
        p.mostrarPersona();

        
        resultado = p.calcularImc(peso, altura);
        if (resultado < 20) {
            System.out.println("Usted pesa: "+peso+"Kg, esta por debajo de lo ideal");
        }else if(resultado>=20 && resultado<=25){
            System.out.println("Usted pesa: "+peso+"Kg, su peso es ideal");
        }else{
            System.out.println("Usted pesa: "+peso+"Kg, tiene sobrepeso");
        }

        p.mayorEdad();

        */
        

        
      

    
     
      
    }
}
