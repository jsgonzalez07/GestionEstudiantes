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
    private Estudiante modelo;

    // El constructor solo recibe la vista. El modelo se creará en iniciarGestion()
    public ControladorEstudiante(VistaEstudiante vista) {
        this.vista = vista;
    }

    public void iniciarGestion() {
        // 1. Capturar datos a través de la vista
        String nombre = vista.capturarNombre();
        String codigo = vista.capturarCodigo();
        double promedio = vista.capturarPromedio();

        // 2. Instanciar el modelo con los datos capturados
        modelo = new Estudiante(nombre, codigo, promedio);

        // 3. Evaluar la regla de negocio
        boolean estaAprobado = modelo.apruebaAsignatura();

        // 4. Enviar los resultados finales a la vista para que los muestre
        vista.mostrarResultadoFinal(modelo.getNombre(), modelo.getPromedioPonderado(), estaAprobado);
    }
}
