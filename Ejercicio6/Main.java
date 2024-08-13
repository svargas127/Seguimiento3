package Ejercicio6;
import java.util.ArrayList;
import java.util.Date;

public class Main {
        public static void main(String[] args) {
            // Crear modelos de zapatos
            Zapato zapato1 = new Zapato("Modelo A", "Cuero", "Negro", 100.0, "Primavera 2024");
            Zapato zapato2 = new Zapato("Modelo B", "Gamuza", "Marrón", 120.0, "Verano 2024");
            Zapato zapato3 = new Zapato("Modelo C", "Textil", "Azul", 80.0, "Otoño 2024");
            Zapato zapato4 = new Zapato("Modelo D", "Cuero", "Blanco", 150.0, "Invierno 2024");
            Zapato zapato5 = new Zapato("Modelo E", "Sintético", "Rojo", 70.0, "Primavera 2024");

            // Crear inventario
            Inventario inventario1 = new Inventario(zapato1, new int[]{40, 41, 42}, new int[]{10, 5, 8});
            Inventario inventario2 = new Inventario(zapato2, new int[]{39, 40, 42}, new int[]{7, 6, 9});
            Inventario inventario3 = new Inventario(zapato3, new int[]{40, 41, 43}, new int[]{12, 10, 7});
            Inventario inventario4 = new Inventario(zapato4, new int[]{38, 39, 40}, new int[]{15, 12, 14});
            Inventario inventario5 = new Inventario(zapato5, new int[]{39, 41, 42}, new int[]{8, 11, 10});

            // Array de inventarios
            Inventario[] inventarios = {inventario1, inventario2, inventario3, inventario4, inventario5};

            // Registrar ventas
            ArrayList<Venta> ventas = new ArrayList<>();
            ventas.add(new Venta(new Date(), zapato1, 40, 2));
            inventario1.registrarSalida(40, 2);

            ventas.add(new Venta(new Date(), zapato2, 39, 1));
            inventario2.registrarSalida(39, 1);

            ventas.add(new Venta(new Date(),zapato3, 43, 3));
            inventario3.registrarSalida(43, 3);

            // Mostrar inventario actual
            System.out.println("Inventario Actual:");
            for (Inventario inventario : inventarios) {
                inventario.mostrarInventario();
            }

            // Imprimir detalle de ventas realizadas
            System.out.println("Detalle de Ventas Realizadas:");
            for (Venta venta : ventas) {
                venta.imprimirDetalle();
            }
        }
    }



