/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg07;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Convertidor de Km/h a m/s:
        double khr, conversion;
        khr = pedirDato1();
        conversion = calcularCambio(khr);
        mostrarResultado(khr, conversion);
    }
    
    //ESCANEO DE LOS KM/H INGRESADOS POR PARTE DEL USUARIO
    public static double pedirDato1(){
        double khr;
        System.out.println("Indroduce los Km/hr que deseas convertir:");
        Scanner entradaDato1 = new Scanner(System.in);
        khr = entradaDato1.nextDouble();
        return khr;
    }
    
    //CONVERSION DE LOS KM/H A M/S
    public static double calcularCambio(double khr){
        double conversion;
        conversion = (khr*0.277778);
        return conversion;
    }
    
    //IMPRESION DE LOS KM/H YA CONVERTIDOS A M/S
    public static void mostrarResultado(double khr, double conversion){
        System.out.println(khr + " Km/hr equivale a: " + conversion + " M/s");
    }
}
