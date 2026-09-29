public class ComisionPersonalizada implements EstrategiaComision {
    private String primerNombre;


    public ComisionPersonalizada(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Override
    public double calcularComision(double montoVenta) {
        int n = primerNombre.length();
        double porcentaje = (5.0 + n) / 100.0;
        return montoVenta * porcentaje;
    }
}