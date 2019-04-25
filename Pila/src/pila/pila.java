/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author Jorge Ivan Vasquez Sosa (0901-16-4067)
 */
public class pila {
    
    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista = "";
    
    String arr[];
    int maxSize;
    int top;
    
    public pila(){
       
       UltimoValorIngresado = null;
        tamano = 0;
    }
    
    //Método para saber cuando la pila esta vacia
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
    }
    
    //Método para insertar un nodo en la pila
    public void InsertarNodo(int nodo){
        Nodo nuevo_nocdo = new Nodo(nodo);
        nuevo_nocdo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nocdo;
        tamano++;
    }    
    
    public int EliminarNodo(){
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }
    
    public void push(String str){
        if(top < arr.length){
          arr[top]= str; //[hola,x]
        top++;  
        }
        else{
            String temporal[] = new String[arr.length+10];
            for(int i=0; i<arr.length;i++)
            {
                temporal[i]= arr[i];
            }
            arr=temporal;
        }
    }
    
    public String peek(){
        if (top >0)
       return arr[top-1]; 
        else
            return null;
    }
    
    public String pop(){
        String temp=null;
       if (top>0){
           temp = arr[top-1];
           arr[top-1]=null;
           top--;
       } 
       return temp;
    }
}
