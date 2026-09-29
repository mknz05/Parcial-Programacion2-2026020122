public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia) {
        super(nombre, ventasMes, estrategia);
    }

    @Override
    public void mostrarDetalle() {
        double comisionObtenida = estrategia.calcularComision(ventasMes);

        System.out.println("/// Detalles del Vendedor ///");
        System.out.println("Nombre: " + nombre);
        System.out.println("Venta Total: $" + ventasMes);
        System.out.println("Comisión Obtenida: $" + comisionObtenida);
    }
}