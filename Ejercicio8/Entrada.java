package Ejercicio8;

public class Entrada {
    private int numero;
    private String zona;
    private double valor;
    private boolean vendida;
    private boolean ingresada;

    public Entrada(int numero, String zona, double valor) {
        this.numero = numero;
        this.zona = zona;
        this.valor = valor;
        this.vendida = false;
        this.ingresada = false;
    }

    public void marcarVendida() {
        this.vendida = true;
    }

    public void marcarIngreso() {
        if (vendida && !ingresada) {
            this.ingresada = true;
            System.out.println("Entrada " + numero + " ingresada con éxito.");
        } else if (!vendida) {
            System.out.println("Esta entrada no ha sido vendida.");
        } else if (ingresada) {
            System.out.println("Esta entrada ya fue ingresada.");
        }
    }

    public boolean isVendida() {
        return vendida;
    }

    public String getZona() {
        return zona;
    }
}
