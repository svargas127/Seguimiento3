package Ejercicio4;

    public class Propiedad {
        private String idPropiedad;
        private String direccion;
        private double area;
        private double precio;
        private int habitaciones;
        private int baños;
        private boolean garaje;
        private String estado;

        // Constructor
        public Propiedad(String idPropiedad, String direccion, double area, double precio, int habitaciones, int baños, boolean garaje, String estado) {
            this.idPropiedad = idPropiedad;
            this.direccion = direccion;
            this.area = area;
            this.precio = precio;
            this.habitaciones = habitaciones;
            this.baños = baños;
            this.garaje = garaje;
            this.estado = estado;
        }

        // Getters And Setters
        public String getIdPropiedad() {
            return idPropiedad;
        }

        public void setIdPropiedad(String idPropiedad) {
            this.idPropiedad = idPropiedad;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getHabitaciones() {
            return habitaciones;
        }

        public void setHabitaciones(int habitaciones) {
            this.habitaciones = habitaciones;
        }

        public int getBaños() {
            return baños;
        }

        public void setBaños(int banos) {
            this.baños = baños;
        }

        public boolean getGaraje() {
            return garaje;
        }

        public void setGaraje(boolean garaje) {
            this.garaje = garaje;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }


        //Metodo que muestra la propiedad de los datos

        public void mostrarDatos() {
            System.out.println("ID Propiedad: " + idPropiedad);
            System.out.println("Dirección: " + direccion);
            System.out.println("Área: " + area + " m2");
            System.out.println("Precio: $" + precio);
            System.out.println("Habitaciones: " + habitaciones);
            System.out.println("Baños: " + baños);
            System.out.println("Garaje: " + (garaje ? "Sí" : "No"));
            System.out.println("Estado: " + estado);
            System.out.println();
        }

       //Main
        public static void main(String[] args) {
            Propiedad propiedad1 = new Propiedad("001", "Calle Falsa 123", 120.5, 200000, 3, 2, true, "Disponible");
            Propiedad propiedad2 = new Propiedad("002", "Av. Siempreviva 742", 95.0, 150000, 2, 1, false, "Vendida");
            Propiedad propiedad3 = new Propiedad("003", "Calle Elm 456", 80.0, 100000, 2, 1, true, "Rentada");

             //arrays
            Propiedad[] propiedades = {propiedad1, propiedad2, propiedad3};

        //ciclo
            for (Propiedad propiedad : propiedades) {
                propiedad.mostrarDatos();
            }

            propiedad1.setEstado("Vendida");

            System.out.println("Después de modificar el estado de la propiedad 1:");
           //Declara los resultados en la consola
            propiedad1.mostrarDatos();
        }
    }

