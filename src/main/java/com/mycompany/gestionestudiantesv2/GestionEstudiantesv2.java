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

        //instanciar la vista
        VistaEstudiante vista = new VistaEstudiante();

        // instanciar el controlador
        ControladorEstudiante controlador = new ControladorEstudiante(vista);

        // inicializar
        controlador.iniciarGestion();
    }
}
