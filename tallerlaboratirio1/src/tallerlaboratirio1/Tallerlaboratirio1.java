/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerlaboratirio1;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Tallerlaboratirio1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //entrada de datos
    Scanner entrada = new Scanner (System.in);
    //defino variables como double
    double descuento;    
    double hora;
    double c_hora;
    double valort;
    double des;
    double valortt;
    //Escribir y leer
    System.out.print("Ingrese el valor por hora");
    c_hora = entrada.nextDouble();
    System.out.print("Ingrese las horas trabajadas");
    hora = entrada.nextDouble();
   // operaciones
    valort = c_hora * hora;
    des = valort*0.10;
    valortt= valort-des;
    //Presentacion de datos o resultados
    System.out.printf("El valor a pagar es: %.2f\n "
            + "El descuento del seguro social %.2f",valortt,des);
    
    }
    
}
