package Ejercicio6;

public class Inventario {
        private Zapato modelo;
        private int[] tallas;
        private int[] cantidades;

        // Constructor
        public Inventario(Zapato modelo, int[] tallas, int[] cantidades) {
            this.modelo = modelo;
            this.tallas = tallas;
            this.cantidades = cantidades;
        }

        // Métodos para registrar entrada/salida de stock
        public void registrarEntrada(int talla, int cantidad) {
            for (int i = 0; i < tallas.length; i++) {
                if (tallas[i] == talla) {
                    cantidades[i] += cantidad;
                    break;
                }
            }
        }

        public void registrarSalida(int talla, int cantidad) {
            for (int i = 0; i < tallas.length; i++) {
                if (tallas[i] == talla) {
                    cantidades[i] -= cantidad;
                    break;
                }
            }
        }

        // Método para mostrar el inventario actual
        public void mostrarInventario() {
            System.out.println("Modelo: " + modelo.getNombre());
            System.out.println("Material: " + modelo.getMaterial());
            System.out.println("Color: " + modelo.getColor());
            System.out.println("Colección: " + modelo.getColeccion());
            System.out.println("Precio: $" + modelo.getPrecio());
            for (int i = 0; i < tallas.length; i++) {
                System.out.println("Talla: " + tallas[i] + " - Cantidad: " + cantidades[i]);
            }
            System.out.println();
        }
    }

