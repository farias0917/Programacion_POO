package figuras;

public class Triangulo extends Figura{
    private float base;
    private float altura;
    public Triangulo(float base,float altura) {
        this.altura = altura;
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }

    public void calcularArea() {
        float area = (base * altura)/2;
        System.out.println("el area del triangulo es "+area);
    }
}


