/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author alumno
 */
public class Menu {
    public static void main (String arg []){
        pila Pila = new pila();
        
        Pila.push("primero");
        Pila.push("segundo");
        Pila.push("tercero");
        Pila.push("cuarto");
        Pila.push("quinto");
        Pila.push("sexto");
        Pila.push("septimo");
        Pila.push("octavo");
        Pila.push("novenno");
        Pila.push("ultimo");
        
        
        System.out.println(Pila.pop());
        System.out.println(Pila.empty());
        System.out.println(Pila.pop());
        System.out.println(Pila.empty());
        System.out.println(Pila.pop());
        System.out.println(Pila.empty());
        System.out.println(Pila.pop());
        System.out.println(Pila.empty());
         System.out.println(Pila.pop());
        System.out.println(Pila.empty());
        System.out.println(Pila.pop());
        System.out.println(Pila.empty());
         System.out.println(Pila.pop());
        System.out.println(Pila.empty());
        System.out.println(Pila.pop());
        System.out.println(Pila.empty());
         System.out.println(Pila.pop());
        System.out.println(Pila.empty());
        System.out.println(Pila.pop());
        System.out.println(Pila.empty());
         
    }
}
