/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Estudiante;
import Vista.VistaEstudiante;
/**
 *
 * @author juans
 */

public class ControladorEstudiante {
    private final VistaEstudiante vista;
    private Estudiante[] modelos;

    public ControladorEstudiante(VistaEstudiante vista) {
        this.vista = vista;
    }

    public void iniciarGestion() {

        //la cantidad temporal de estudiantes
        int cantidadEstudiantes = 3;

        //arreglo de estudiantes
        modelos = new Estudiante[cantidadEstudiantes];

        //registrar cada estudiante
        for (int i = 0; i < modelos.length; i++) {

            String nombre = vista.capturarNombre();
            String codigo = vista.capturarCodigo();
            double promedio = vista.capturarPromedio();

            // guardar el estudiante en la posición correspondiente del arreglo
            modelos[i] = new Estudiante(nombre, codigo, promedio);
        }

        //mostrar los resultados de cada estudiante
        for (int i = 0; i < modelos.length; i++) {

            boolean estaAprobado = modelos[i].apruebaAsignatura();

            vista.mostrarResultadoFinal(
                    modelos[i].getNombre(),
                    modelos[i].getPromedioPonderado(),
                    estaAprobado
            );
        }
    }
}