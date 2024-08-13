package Ejercicio8;

public class main {
    public static void main(String[] args) {
        // Crear un objeto Concierto con capacidad para 100 entradas en General y 50 en VIP
        Concierto concierto = new Concierto(100, 50);

        // Verificar disponibilidad en zona General y VIP
        System.out.println("Disponibilidad en General: " + concierto.verificarDisponibilidad("GENERAL"));
        System.out.println("Disponibilidad en VIP: " + concierto.verificarDisponibilidad("VIP"));

        // Vender entradas
        concierto.venderEntrada("GENERAL", 50.0);
        concierto.venderEntrada("VIP", 100.0);
        concierto.venderEntrada("VIP", 100.0);

        // Intentar vender más entradas de las disponibles
        for (int i = 0; i < 50; i++) {
            concierto.venderEntrada("VIP", 100.0);
        }

        // Simular el ingreso de algunas entradas previamente vendidas
        concierto.registrarIngreso(1);
        concierto.registrarIngreso(2);
        concierto.registrarIngreso(3);
    }
}
