/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author Lenovo
 */
public class Ejecutor {
    public static void main(String[] args) {
       
        
        PromedioEstudiante promEst = new PromedioEstudiante();
        
       
        promEst.establecerPromedioCalificaciones();
        
        System.out.println("Objeto sin argumentos\n");
              
            System.out.printf("Nombre del Estudiante: %s\n"
                + "Calificacion Materia 1: %.2f\n"
                + "Calificacion Materia 2: %.2f\n"
                + "Calificacion Materia 3: %.2f\n"
                + "Promedio Calificaciones: %.2f\n",
                promEst.obtenerNombreEstudiante(),
                promEst.obtenerCalificacionMateria1(),
                promEst.obtenerCalificacionMateria2(),
                promEst.obtenerCalificacionMateria3(),
                promEst.obtenerPromedioCalificaciones());*/
        
              
        System.out.printf("%s\n",promEst);
        
       
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\nObjeto con argumentos\n");
        
       
        
        String nomEst2 = "Arancha Rosillo Andagua";
        double calif1 = 10;
        double calif2 = 10;
        double calif3 = 9;
        double promEstudiante2;
        
        PromedioEstudiante promEst2 = new PromedioEstudiante(nomEst2, calif1, calif2, calif3);
             
        promEst2.establecerPromedioCalificaciones();
        
        //Mostar los resultados en pantalla        
        System.out.printf("%s\n ",promEst2);
                
    }
}