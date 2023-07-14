import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Figura> figuras = new ArrayList<>();

        while (true) {
            System.out.println("Seleccione una figura:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Esfera");
            System.out.println("5. Cubo");
            System.out.println("6. Pirámide");
            System.out.println("7. Imprimir registro de figuras");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo del programa...");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese las coordenadas del centro (x y):");
                    double xCirculo = scanner.nextDouble();
                    double yCirculo = scanner.nextDouble();
                    Punto2D centro = new Punto2D(xCirculo, yCirculo);

                    System.out.println("Ingrese el radio:");
                    double radioCirculo = scanner.nextDouble();

                    Figura circulo = new Circulo(centro, radioCirculo);
                    figuras.add(circulo);
                    break;

                case 2:
                    System.out.println("Ingrese las coordenadas de los 4 puntos (x y):");
                    Punto2D[] puntosCuadrado = new Punto2D[4];
                    for (int i = 0; i < 4; i++) {
                        double xCuadrado = scanner.nextDouble();
                        double yCuadrado = scanner.nextDouble();
                        puntosCuadrado[i] = new Punto2D(xCuadrado, yCuadrado);
                    }

                    Figura cuadrado = new Cuadrado(puntosCuadrado);
                    figuras.add(cuadrado);
                    break;

                case 3:
                    System.out.println("Ingrese las coordenadas de los 3 puntos (x y):");
                    Punto2D[] puntosTriangulo = new Punto2D[3];
                    for (int i = 0; i < 3; i++) {
                        double xTriangulo = scanner.nextDouble();
                        double yTriangulo = scanner.nextDouble();
                        puntosTriangulo[i] = new Punto2D(xTriangulo, yTriangulo);
                    }

                    Figura triangulo = new Triangulo(puntosTriangulo);
                    figuras.add(triangulo);
                    break;

                case 4:
                    System.out.println("Ingrese las coordenadas del centro (x y z):");
                    double xEsfera = scanner.nextDouble();
                    double yEsfera = scanner.nextDouble();
                    double zEsfera = scanner.nextDouble();
                    Punto3D centroEsfera = new Punto3D(xEsfera, yEsfera, zEsfera);

                    System.out.println("Ingrese el radio:");
                    double radioEsfera = scanner.nextDouble();

                    Figura esfera = new Esfera(centroEsfera, radioEsfera);
                    figuras.add(esfera);
                    break;

                case 5:
                    System.out.println("Ingrese las coordenadas de los 8 puntos (x y z):");
                    Punto3D[] puntosCubo = new Punto3D[8];
                    for (int i = 0; i < 8; i++) {
                        double xCubo = scanner.nextDouble();
                        double yCubo = scanner.nextDouble();
                        double zCubo = scanner.nextDouble();
                        puntosCubo[i] = new Punto3D(xCubo, yCubo, zCubo);
                    }

                    Figura cubo = new Cubo(puntosCubo);
                    figuras.add(cubo);
                    break;

                case 6:
                    System.out.println("Ingrese las coordenadas de los 4 puntos de la base (x y z):");
                    Punto3D[] puntosPiramide = new Punto3D[4];
                    for (int i = 0; i < 4; i++) {
                        double xPiramide = scanner.nextDouble();
                        double yPiramide = scanner.nextDouble();
                        double zPiramide = scanner.nextDouble();
                        puntosPiramide[i] = new Punto3D(xPiramide, yPiramide, zPiramide);
                    }

                    Figura piramide = new Piramide(puntosPiramide);
                    figuras.add(piramide);
                    break;

                case 7:
                    System.out.println("Registro de figuras:");
                    for (Figura figura : figuras) {
                        figura.imprimirDetalles();
                    }
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }
}