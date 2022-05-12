/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 *
 * @author Lenovo
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Automotor auto1 = new Automotor();
        
        auto1.establecerValorMatricula();
        
        System.out.printf("Objeto sin argumentos\n\n"
                + "Cédula del dueño: %d\n"
                + "Marca del vehículo: %s\n"
                + "Año de fabricación: %d\n"
                + "Valor del vehículo: %.3f\n"
                + "Valor de la matrícula: %.3f\n",
                auto1.obtenerCedulaDuenio(),
                auto1.obtenerMarcaVehiculo(),
                auto1.obtenerAnioFabricacion(),
                auto1.obtenerValorVehiculo(),
                auto1.obtenerValorMatricula());
        
        System.out.println("Objeto sin argumentos\n");
        System.out.printf("%s\n",auto1);       
        
        System.out.println("------------------------------");
        
        long cedulaDuenio2 = 1105575821;
        String marcaVehiculo2 = "Hyundai";
        int anioFabricacion2 = 2021;
        int anioEnCurso = 2022;
        double valorVehiculo2 = 30000;
        
        Automotor auto2 = new Automotor(cedulaDuenio2, marcaVehiculo2, anioFabricacion2, anioEnCurso, valorVehiculo2);
        
        auto2.establecerValorMatricula();
        
        System.out.println("Objeto con argumentos\n");
        System.out.printf("%s\n", auto2);
    }   
}