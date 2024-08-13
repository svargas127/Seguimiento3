package Ejercicio2;

import javax.swing.*;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private int grado;
    private int edad;
    private float promedioAcademico;
    private String nombreDeLaMadre;
    private String nombreDelPadre;
    private long telefonoDeContacto;            //Números de contacto padres
    private long telefonoDeContacto2;

    //Constructores
    public Estudiante(String nombres, String apellidos, int grado, int edad, float promedioAcademico, String nombreDeLaMadre, String nombreDelPadre) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.grado = grado;
        this.edad = edad;
        this.promedioAcademico = promedioAcademico;
        this.nombreDeLaMadre = nombreDeLaMadre;
        this.nombreDelPadre = nombreDelPadre;
    }

    public Estudiante(String nombres, String apellidos, int grado, int edad, float promedioAcademico, String nombreDeLaMadre, String nombreDelPadre, long telefonoDeContacto) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.grado = grado;
        this.edad = edad;
        this.promedioAcademico = promedioAcademico;
        this.nombreDeLaMadre = nombreDeLaMadre;
        this.nombreDelPadre = nombreDelPadre;
        this.telefonoDeContacto = telefonoDeContacto;
    }

    public Estudiante(String nombres, String apellidos, int grado, int edad, float promedioAcademico, String nombreDeLaMadre, String nombreDelPadre , long telefonoDeContacto, long telefonoDeContacto2) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.grado = grado;
        this.edad = edad;
        this.promedioAcademico = promedioAcademico;
        this.nombreDeLaMadre = nombreDeLaMadre;
        this.nombreDelPadre = nombreDelPadre;
        this.telefonoDeContacto = telefonoDeContacto;
        this.telefonoDeContacto2 = telefonoDeContacto2;

    }

    //metodo para mostrar consola
    public void mostrarDatos(){
        System.out.println("los datos son:"+ "\n nombres: " +nombres+ "\n Apellidos :"+apellidos+"\n Grado:"+grado + "\n Edad :"+ edad + "\n Promedio :"+promedioAcademico + "\nMamá :"+nombreDeLaMadre +"\n Padre :"+nombreDelPadre
                + "\nTeléfonos: "+ telefonoDeContacto+ "\n" +telefonoDeContacto2);

    }
//main

        public static void main (String[]args){
            Estudiante primerEstudiante = new Estudiante("Carlos Arturo", "Barón Estrada", 11, 19, 4.8f, "Maria", "Eduardo");
            Estudiante segundoEsrudiante = new Estudiante("Samuel", "Vargas Fory", 11, 17, 4.0f, "Luz Dary", "vicor Alfonso", 366548999);
            Estudiante tercerEstudiante = new Estudiante("Fernada", "pérez", 10, 16, 3.8f, "Valentina Pérez", "Cristobal Ortiz", 314558667, 316212458);


            //Se muestra en consola
            primerEstudiante.mostrarDatos();
            segundoEsrudiante.mostrarDatos();
            tercerEstudiante.mostrarDatos();

        }




    }
