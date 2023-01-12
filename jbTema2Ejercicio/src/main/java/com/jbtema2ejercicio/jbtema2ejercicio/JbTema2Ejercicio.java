/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.jbtema2ejercicio.jbtema2ejercicio;

/**
 *
 * @author Wilmer Alexander Varon Rodriguez 
 */
public class JbTema2Ejercicio {

    public static void main(String[] args) {
        
        System.out.println("El Valor con iva incluido es: "+getIvaIncluido(100));
        
   
    }
    public static double getIvaIncluido(double valor){
          
    return (valor*1.16) ;      
    }
    
}

