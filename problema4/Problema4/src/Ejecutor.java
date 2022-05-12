/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

/**
 *
 * @author Lenovo
 */
public class Ejecutor {
    public static void main(String[] args) {
             
        ChequeEntidadFinanciera cheque1 = new ChequeEntidadFinanciera();
        
        cheque1.establecerComisionBanco();
        
        
        /*System.out.printf("Objeto sin argumentos\n"
                + "\nNombre del cliente: %s\n"
                + "Nombre del banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comisión que cobra el banco: %.2f\n",
                cheque1.obtenerNombreCliente(),
                cheque1.obtenerNombreBanco(),
                cheque1.obtenerValorCheque(),
                cheque1.obtenerComisionBanco());*/
        
        System.out.println("Objeto sin argumentos\n");
        System.out.printf("%s\n",cheque1);

        
        System.out.println("-----------------------------------------------------");
        System.out.println("Objeto con argumentos\n");
        
        String nombreCliente2 = "Jose Antonio Celi Loaiza";
        String nombreBanco2 = "Banco de Loja";
        double valorCheque2 = 1546.10;
        double comisionBanco2;
        
        
        ChequeEntidadFinanciera cheque2 = new ChequeEntidadFinanciera(nombreCliente2,
                nombreBanco2, valorCheque2);
        
        cheque2.establecerComisionBanco();
        
        // Imprimir los datos en pantalla
        System.out.printf("%s\n",cheque2);    
        
    }
}