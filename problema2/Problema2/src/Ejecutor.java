/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

/**
 *
 * @author Lenovo
 */
public class Ejecutor {

    public static void main(String[] args) {
       
        ProfesorInstituto prof1 = new ProfesorInstituto();
        
        prof1.establecerSueldoTotal();
        
        System.out.printf("Objeto sin argumentos:\n"
                + "\nNombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo básico: %.2f\n"
                + "Sueldo total: %.2f\n"
                + "Número de cédula: %d\n", prof1.obtenerNombre(),
                prof1.obtenerApellido(), prof1.obtenerSueldoBasico(),
                prof1.obtenerSueldoTotal(), prof1.obtenerNumeroCedula());*/
        
        
        System.out.printf("%s\n",prof1);
        
        System.out.println("----------------------------------------------");
               
        String nombre2 = "Anthony";
        String apellido2 = "Celi";
        double sueldoBasico2 = 320;
        double sueldoTotal2;
        long cedula2 = 1105575821;

        System.out.println("Objeto con argumentos\n");  
        
        ProfesorInstituto prof2 = new ProfesorInstituto(nombre2, apellido2,
        sueldoBasico2, cedula2);
        
        prof2.establecerSueldoTotal();
        
        System.out.printf("%s\n",prof2);
    }    
}