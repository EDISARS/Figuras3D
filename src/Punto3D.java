
public class Punto3D {
    private double x;
    private double y;
    private double z;

    public Punto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double calcularDistancia(Punto3D otroPunto) {
        double dx = x - otroPunto.getX();
        double dy = y - otroPunto.getY();
        double dz = z - otroPunto.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}