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
public class Tallerlaboratirio2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
       
    Scanner entrada = new Scanner (System.in);
    //defino variables como string y m como double
    String v_x;    
    String v_y;
    String v_z;
    double v_m;
    //Escribir y leer (Entrada de datos)
    System.out.println("Ingrese el valor X");
    v_x = entrada.nextLine();
    System.out.println("Ingrese el valor de Y");
    v_y = entrada.nextLine();
    System.out.println("Ingrese el valor de Y");
    v_z = entrada.nextLine();
 //tranformacion de string a double
    double v_x2 = Double.parseDouble(v_x);
    double v_y2 = Double.parseDouble(v_y);
    double v_z2 = Double.parseDouble(v_z);
    //operacion matematica
    v_m =(v_x2+(v_y2/v_z2))/(v_x2+(v_y2/v_z2));
    //Presentacion de datos o resultados
    System.out.printf("El valor de m, en base a las variables:\n x = %.2f\n\t "
            + "y = %.2f\n\t\t x = %.2f\n\t \n El resultado de m es:"
            + "\n\t m =%.2f",v_x2,v_y2,v_z2,v_m);
           
    }
    
}
