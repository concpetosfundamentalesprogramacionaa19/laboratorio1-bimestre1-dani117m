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
public class Tallerlaboratirio3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
      
    Scanner entrada = new Scanner (System.in);
    //defino variables como string y el proemdio como double
    String nota1;    
    String nota2;
    String nota3;
    double promedio;
    
    //Entrada de datos 
    System.out.println("Ingrese su primera nota");
    nota1 = entrada.nextLine();
    System.out.println("Ingrese su segunda nota");
    nota2 = entrada.nextLine();
    System.out.println("Ingrese su tercera nota");
    nota3 = entrada.nextLine();
    //tranformacion de variables de string-> double
    double nota11 = Double.parseDouble(nota1);
    double nota22 = Double.parseDouble(nota2);
    double nota33 = Double.parseDouble(nota3);
 //operacion 
    promedio = (nota11+nota22+nota33)/3; 
  
    String notatotal = promedio> 14 ? "Usted paso el año ": "Usted reprobo "
            + "el año";
    System.out.printf("notatotal es: %s\n", notatotal);
 
   
    }
    
}
