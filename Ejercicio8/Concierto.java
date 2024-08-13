package Ejercicio8;

import java.util.ArrayList;

public class Concierto {
    private int maxGeneral;
    private int maxVIP;
    private ArrayList<Entrada> entradas;

    public Concierto(int maxGeneral, int maxVIP) {
        this.maxGeneral = maxGeneral;
        this.maxVIP = maxVIP;
        this.entradas = new ArrayList<>();
    }

    public boolean verificarDisponibilidad(String zona) {
        int count = 0;
        for (Entrada entrada : entradas) {
            if (entrada.getZona().equalsIgnoreCase(zona) && entrada.isVendida()) {
                count++;
            }
        }
        if (zona.equalsIgnoreCase("GENERAL")) {
            return count < maxGeneral;
        } else if (zona.equalsIgnoreCase("VIP")) {
            return count < maxVIP;
        }
        return false;
    }

    public void venderEntrada(String zona, double valor) {
        if (verificarDisponibilidad(zona)) {
            int numero = entradas.size() + 1;
            Entrada nuevaEntrada = new Entrada(numero, zona, valor);
            nuevaEntrada.marcarVendida();
            entradas.add(nuevaEntrada);
            System.out.println("Entrada vendida: Zona " + zona + ", Número " + numero);
        } else {
            System.out.println("No hay disponibilidad en la zona " + zona);
        }
    }

    public void registrarIngreso(int numeroEntrada) {
        if (numeroEntrada > 0 && numeroEntrada <= entradas.size()) {
            Entrada entrada = entradas.get(numeroEntrada - 1);
            entrada.marcarIngreso();
        } else {
            System.out.println("Número de entrada inválido.");
        }
    }
}
