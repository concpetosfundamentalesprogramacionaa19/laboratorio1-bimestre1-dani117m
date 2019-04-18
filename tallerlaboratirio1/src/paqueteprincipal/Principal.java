/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal;
//Importar datos de las 3 clases anterior mente creadas 
import paquete1.*;
import paquete2.*;
import paquete3.*;
/**
 *
 * @author Salas
 */
public class Principal {
    public static void main(String[] args) {
        //comprovacion de edad para su impresion por expresion logica
        String rt= Miclase1.edad >=18 ? "y mayor de edad":"y menor de edad";
        //Resultados
        System.out.printf("Nombre:\n\t%s\nApellido:\n\t%s\nEdad:\n\t%d %s"
                ,Miclase2.nombre, Miclase3.apellido, Miclase1.edad,rt);
    
    }
}
