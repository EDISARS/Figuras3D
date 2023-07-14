public class Cubo extends Figura {
    private Punto3D[] puntos;

    public Cubo(Punto3D[] puntos) {
        super("Cubo");
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
            area += puntos[i].calcularDistancia(puntos[i + 1]);
        }
        area += puntos[puntos.length - 1].calcularDistancia(puntos[0]);
        return 6 * area;
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
