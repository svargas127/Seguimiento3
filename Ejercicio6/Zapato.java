package Ejercicio6;

public class Zapato {
    private String nombre;
    private String material;
    private String color;
    private double precio;
    private String coleccion;


    //constructor

    public Zapato(String nombre, String material, String color, double precio, String coleccion){
        this.nombre = nombre;
        this.material = material;
        this.color = color;
        this.precio = precio;
        this.coleccion = coleccion;
    }

    //Getters and Setters

    public String getNombre(){
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }


    public String getMaterial(){
        return material;
    }

    public void setMaterial (String material){
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColeccion(){
        return coleccion;
    }

    public void setColeccion(String coleccion){
        this.coleccion = coleccion;
    }

}
