/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import javax.swing.JOptionPane;

/**
 *
 * @author juans
 */

public class VistaEstudiante {

    public String capturarNombre() {
        return JOptionPane.showInputDialog(null, 
                "Ingrese el nombre del estudiante:", 
                "Datos del Estudiante", 
                JOptionPane.QUESTION_MESSAGE);
    }

    public String capturarCodigo() {
        return JOptionPane.showInputDialog(null, 
                "Ingrese el código estudiantil:", 
                "Datos del Estudiante", 
                JOptionPane.QUESTION_MESSAGE);
    }

    public double capturarPromedio() {
        String input = JOptionPane.showInputDialog(null, 
                "Ingrese el promedio ponderado del estudiante:", 
                "Datos del Estudiante", 
                JOptionPane.QUESTION_MESSAGE);
        
        // Convertimos el texto ingresado a un valor numérico decimal
        return Double.parseDouble(input);
    }

    public void mostrarResultadoFinal(String nombre, double promedio, boolean aprobado) {
        String estado = aprobado ? "APROBADO" : "REPROBADO";
        
        // Cambiamos el icono dependiendo de si aprueba o reprueba
        int tipoIcono = aprobado ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.WARNING_MESSAGE;
        
        String mensaje = """
                         --- RESULTADO DE EVALUACION ---
                         
                         Estudiante: """ + nombre + "\n"
                       + "Promedio: " + promedio + "\n"
                       + "Estado final: " + estado;
        
        JOptionPane.showMessageDialog(null, mensaje, "Resultado Final", tipoIcono);
    }
}
