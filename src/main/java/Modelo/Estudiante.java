/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juans
 */

public class Estudiante {

    private String nombre;
    private String codigoEstudiantil;
    private double promedioPonderado;
    private String programa;

    public Estudiante() {
    }

    public Estudiante(String nombre, String codigoEstudiantil, double promedioPonderado, String programa) {
        this.nombre = nombre;
        this.codigoEstudiantil = codigoEstudiantil;
        this.promedioPonderado = promedioPonderado;
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEstudiantil() {
        return codigoEstudiantil;
    }

    public void setCodigoEstudiantil(String codigoEstudiantil) {
        this.codigoEstudiantil = codigoEstudiantil;
    }

    public double getPromedioPonderado() {
        return promedioPonderado;
    }

    public void setPromedioPonderado(double promedioPonderado) {
        this.promedioPonderado = promedioPonderado;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public boolean apruebaAsignatura() {
        return this.promedioPonderado >= 3.0;
    }
}
