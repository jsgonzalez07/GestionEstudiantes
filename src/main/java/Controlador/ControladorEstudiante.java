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

        int cantidadEstudiantes = vista.capturarCantidadEstudiantes();

        modelos = new Estudiante[cantidadEstudiantes];

        for (int i = 0; i < modelos.length; i++) {

            String nombre = vista.capturarNombre();
            String codigo = vista.capturarCodigo();
            String programa = vista.capturarPrograma();
            double promedio = vista.capturarPromedio();

            modelos[i] = new Estudiante(
                    nombre,
                    codigo,
                    promedio,
                    programa
            );
        }

        for (int i = 0; i < modelos.length; i++) {

            boolean estaAprobado = modelos[i].apruebaAsignatura();

            vista.mostrarResultadoFinal(
                    modelos[i].getNombre(),
                    modelos[i].getPromedioPonderado(),
                    estaAprobado
            );
        }

        double notaLimite = vista.capturarNotaLimite();

        mostrarTecnologiasPorNota(notaLimite);
    }

    public void mostrarTecnologiasPorNota(double notaLimite) {

        for (int i = 0; i < modelos.length; i++) {

            if (modelos[i].getPrograma().equalsIgnoreCase("Tecnología")
                    && modelos[i].getPromedioPonderado() > notaLimite) {

                vista.mostrarEstudianteTecnologia(
                        modelos[i].getCodigoEstudiantil(),
                        modelos[i].getNombre(),
                        modelos[i].getPromedioPonderado()
                );
            }
        }
    }
}