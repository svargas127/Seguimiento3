package Ejercicio6;

import java.util.Date;
public class Venta {
        private Date fecha;
        private Zapato modelo;
        private int talla;
        private int cantidad;
        private double valor;

        // Constructor
        public Venta(Date fecha, Zapato modelo, int talla, int cantidad) {
            this.fecha = fecha;
            this.modelo = modelo;
            this.talla = talla;
            this.cantidad = cantidad;
            this.valor = calcularTotal();
        }

        // Método para calcular el total de la venta
        private double calcularTotal() {
            return modelo.getPrecio() * cantidad;
        }

        // Método para imprimir el detalle de la venta
        public void imprimirDetalle() {
            System.out.println("Fecha: " + fecha);
            System.out.println("Modelo: " + modelo.getNombre());
            System.out.println("Talla: " + talla);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Valor Total: $" + valor);
            System.out.println();
        }
    }


