public class Triangulo extends Figura {
    private Punto2D[] puntos;
    public Triangulo(Punto2D[] puntos) {
        super("Triángulo");
        this.puntos = puntos;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 0;
        for (int i = 0; i < puntos.length - 1; i++) {
            perimetro += puntos[i].calcularDistancia(puntos[i + 1]);
        }
        perimetro += puntos[puntos.length - 1].calcularDistancia(puntos[0]);
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area = 0;
        for (int i = 0; i < puntos.length - 1; i++) {
            area += puntos[i].getX() * puntos[i + 1].getY() - puntos[i + 1].getX() * puntos[i].getY();
        }
        area += puntos[puntos.length - 1].getX() * puntos[0].getY() - puntos[0].getX() * puntos[puntos.length - 1].getY();
        return Math.abs(area / 2);
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puntos:");
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Punto " + (i + 1) + ": " + puntos[i]);
        }
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
        System.out.println("---------------------");
    }
}