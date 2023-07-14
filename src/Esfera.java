
public class Esfera extends Figura {
    private Punto3D centro;
    private double radio;

    public Esfera(Punto3D centro, double radio) {
        super("Esfera");
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        // No aplicable a una esfera, retorna 0
        return 0;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Centro: " + centro);
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + calcularArea());
        System.out.println("---------------------");
    }
}