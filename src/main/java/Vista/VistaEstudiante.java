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

    public int capturarCantidadEstudiantes() {
        String input = JOptionPane.showInputDialog(
                null,
                "Ingrese el número de estudiantes:",
                "Cantidad de Estudiantes",
                JOptionPane.QUESTION_MESSAGE
        );

        return Integer.parseInt(input);
    }

    public String capturarNombre() {
        return JOptionPane.showInputDialog(
                null,
                "Ingrese el nombre del estudiante:",
                "Datos del Estudiante",
                JOptionPane.QUESTION_MESSAGE
        );
    }

    public String capturarCodigo() {
        return JOptionPane.showInputDialog(
                null,
                "Ingrese el código estudiantil:",
                "Datos del Estudiante",
                JOptionPane.QUESTION_MESSAGE
        );
    }

    public String capturarPrograma() {
        return JOptionPane.showInputDialog(
                null,
                "Ingrese el programa del estudiante:",
                "Datos del Estudiante",
                JOptionPane.QUESTION_MESSAGE
        );
    }

    public double capturarPromedio() {
        String input = JOptionPane.showInputDialog(
                null,
                "Ingrese la nota definitiva del estudiante:",
                "Datos del Estudiante",
                JOptionPane.QUESTION_MESSAGE
        );

        return Double.parseDouble(input);
    }

    public double capturarNotaLimite() {
        String input = JOptionPane.showInputDialog(
                null,
                "Ingrese la nota límite entre 0.0 y 4.9:",
                "Nota Límite",
                JOptionPane.QUESTION_MESSAGE
        );

        return Double.parseDouble(input);
    }

    public void mostrarResultadoFinal(String nombre, double promedio, boolean aprobado) {
        String estado = aprobado ? "APROBADO" : "REPROBADO";

        int tipoIcono = aprobado
                ? JOptionPane.INFORMATION_MESSAGE
                : JOptionPane.WARNING_MESSAGE;

        String mensaje = """
                         --- RESULTADO DE EVALUACION ---
                         
                         Estudiante: """ + nombre + "\n"
                + "Promedio: " + promedio + "\n"
                + "Estado final: " + estado;

        JOptionPane.showMessageDialog(
                null,
                mensaje,
                "Resultado Final",
                tipoIcono
        );
    }

    public void mostrarEstudianteTecnologia(
            String codigo,
            String nombre,
            double nota) {

        String mensaje = "Código: " + codigo + "\n"
                + "Nombre: " + nombre + "\n"
                + "Nota definitiva: " + nota;

        JOptionPane.showMessageDialog(
                null,
                mensaje,
                "Estudiante de Tecnología",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
