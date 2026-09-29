public class ComisionPersonalizada implements EstrategiaComision {

    private int n;

    public ComisionPersonalizada(String primerNombre) {
        this.n = primerNombre.length();
    }

    @Override
    public double calcularComision(double montoVenta) {
        double porcentaje = (5 + n) / 100.0;
        return montoVenta * porcentaje;
    }
}