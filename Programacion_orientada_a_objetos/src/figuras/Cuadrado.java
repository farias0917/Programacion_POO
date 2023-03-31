package figuras;

public class Cuadrado extends Figura {
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public void calcularArea(){
        float area = lado*lado;
        System.out.println("el area del cuadrado es "+area);
    }

}
