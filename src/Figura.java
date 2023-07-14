import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularPerimetro();

    public abstract double calcularArea();

    public abstract void imprimirDetalles();
}
