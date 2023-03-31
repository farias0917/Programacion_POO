package figuras;

public class Circulo extends Figura {
    private int radio;
    public Circulo(int radio) {
        this.radio = radio;
    }
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        Double area = 3.1416 * (radio*radio);
        System.out.println("el area del circulo es "+area);
    }
}
