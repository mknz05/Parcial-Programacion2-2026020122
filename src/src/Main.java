public class Main {
    public static void main(String[] args) {
        EstrategiaComision comision = new ComisionEstandar();
        Vendedor empleado = new Vendedor("Pepito", 1000.0, comision);
        empleado.mostrarDetalle();
    }
}