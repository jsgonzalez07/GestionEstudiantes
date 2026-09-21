/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestionestudiantesv2;

import Controlador.ControladorEstudiante;
import Vista.VistaEstudiante;

/**
 *
 * @author juans
 */
public class GestionEstudiantesv2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // 1. Instanciar la vista
        VistaEstudiante vista = new VistaEstudiante();

        // 2. Instanciar el controlador pasándole la vista
        ControladorEstudiante controlador = new ControladorEstudiante(vista);

        // 3. Iniciar el flujo del programa
        controlador.iniciarGestion();
    }
}
