package Salud;

import java.util.Scanner;

public class Persona {
    //atributos
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    //private int peso;
    //private float estatura;
    private int edad;
    private String sexo;

    public Persona(){
        
    }

    public Persona(String tipoDoc, int documento, String nombre, String apellido, int edad, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //metodos
    public void pedirDatos(){
        Scanner leerDato = new Scanner(System.in);

        System.out.println("Por favor ingrese su tipo de documento");
        tipoDoc=leerDato.next();

        System.out.println("Por favor digite su documento de identidad");
        documento=leerDato.nextInt();

        System.out.println("Por favor digite su nombre");
        nombre=leerDato.next();

        System.out.println("Por favor digite su apellido");
        apellido=leerDato.next();

        //System.out.println("Por favor digite su peso");
        //*peso=leerDato.nextInt();

       // System.out.println("Por favor digite su estatura");
        //estatura=leerDato.nextFloat();

       // System.out.println("Por favor digite su edad");
       // edad=leerDato.nextInt(); 

       // System.out.println("Por favor digite su sexo");
        //sexo=leerDato.next();

        leerDato.close();
    }

    public void mostrarPersona() {
        System.out.println("Tipo de documento: "+tipoDoc);
        System.out.println("Documento: "+documento);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        //System.out.println("Peso: "+peso);
        //System.out.println("Estatura: "+estatura);
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);
    }

    public float calcularImc(int peso, float estatura) {
        /*float pesoActual=peso / (estatura*estatura);
        if (pesoActual < 20) {
            System.out.println("Usted pesa: "+peso+"Kg, esta por debajo de lo ideal");
        }else if(pesoActual>=20 && pesoActual<=25){
            System.out.println("Usted pesa: "+peso+"Kg, su peso es ideal");
        }else{
            System.out.println("Usted pesa: "+peso+"Kg, tiene sobrepeso");
        }*/

        float pesoActual=peso / (estatura*estatura);
        return pesoActual;
    }


    public void mayorEdad() {
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        }else if(edad >= 0){
            System.out.println("Usted es menor de edad");
        }else{
            System.out.println(edad+" es un valor incorrecto");
        }
    }

}
