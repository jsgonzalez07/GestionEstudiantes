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

        VistaEstudiante vista = new VistaEstudiante();

        ControladorEstudiante controlador =
                new ControladorEstudiante(vista);

        controlador.iniciarGestion();
    }
}