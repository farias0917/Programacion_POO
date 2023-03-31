package Salud;

public class Empleado extends Persona {
    private String cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String departamento;

    

    public Empleado(String tipoDoc, int documento, String nombre, String apellido, int edad, String sexo, String cargo,
            int valorHora, int horasTrabajadas, String departamento) {
        super(tipoDoc, documento, nombre, apellido, edad, sexo);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    //metodos

    public double calcularHonorarios(int valorHora, int horasTrabajadas) {
        double totalPagar = (valorHora * horasTrabajadas)-0.966;
        return totalPagar;
    }

    public void mostrarEmpleado(){
        System.out.println("tipo de documento: "+getTipoDoc()+"\nNumero de documento: "+getDocumento()+
       "\nNombre: "+getNombre()+"\nApellido: "+getApellido()+"\nCargo: "+cargo+"\nHoras trabajadas: "+horasTrabajadas+
       "\nValor por hora: "+ valorHora);
    }
}
