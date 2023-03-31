package figuras;

public class Rectangulo extends Figura {
    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

     public void calcularArea(){
        float area = base*altura;
        System.out.println("el area del rectangulo es "+area);
    }

}
