public class Piramide extends Figura {
    private Punto3D[] puntos;

    public Piramide(Punto3D[] puntos) {
        super("Pirámide");
        this.puntos = puntos;
    }

    @Override
    public double calcularArea() {
        double areaBase = 0;
        for (int i = 0; i < puntos.length - 1; i++) {
            areaBase += puntos[i].calcularDistancia(puntos[i + 1]);
        }
        areaBase += puntos[puntos.length - 1].calcularDistancia(puntos[0]);

        double areaLateral = 0;
        for (int i = 0; i < puntos.length - 1; i++) {
            areaLateral += calcularAreaTriangulo(puntos[i], puntos[i + 1], puntos[puntos.length - 1]);
        }
        areaLateral += calcularAreaTriangulo(puntos[puntos.length - 1], puntos[0], puntos[puntos.length - 1]);

        return areaBase + areaLateral;
    }

    private double calcularAreaTriangulo(Punto3D p1, Punto3D p2, Punto3D p3) {
        double lado1 = p1.calcularDistancia(p2);
        double lado2 = p2.calcularDistancia(p3);
        double lado3 = p3.calcularDistancia(p1);
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }

    @Override
    public double calcularPerimetro() {
        // No aplicable a una pirámide, retorna 0
        return 0;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puntos:");
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Punto " + (i + 1) + ": " + puntos[i]);
        }
        System.out.println("Área: " + calcularArea());
        System.out.println("---------------------");
    }
}