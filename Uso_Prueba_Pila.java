/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.Scanner;

/**
 *
 * @author José Mendoza
 */
public class Uso_Prueba_Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,dato;
        Scanner in=new Scanner(System.in);
        System.out.println("Ingresa el numero de elementos para la pila");
        n=in.nextInt();
        Prueba_Pila n1=new Prueba_Pila();
        
     
        
        for(int i=0;i<n;i++){
            System.out.println("Ingrese el valor");
            dato=in.nextInt();
            n1.apilar(dato);
           
    }
        System.out.println("¿La pila esta vacia?: "+n1.Vacia());
        System.out.println("¿Cual es el tamaño de la pila?: "+n1.Size());
        System.out.println("El valor superior es: "+n1.Peek());
        System.out.println("El valor eliminado es: "+n1.Desapilar());
        System.out.println("La pila sera vaciada");
        n1.vaciar();
        System.out.println("¿La pila esta vacia?: "+n1.Vacia());
        System.out.println("¿Cual es el tamaño de la pila?: "+n1.Size());
       
        
        System.out.println("El valor superior es: "+n1.Peek());
        
       
    }
    
}
