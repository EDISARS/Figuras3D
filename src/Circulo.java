public class Circulo extends Figura {
    private Punto2D centro;
    private double radio;

    public Circulo(Punto2D centro, double radio) {
        super("Círculo");
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Centro: " + centro);
        System.out.println("Radio: " + radio);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
        System.out.println("---------------------");
    }
}