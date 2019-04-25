
package pila;

import javax.swing.JOptionPane;
/**
 *
 * @author Jorge Ivan Vasquez Sosa (0901-16-4067)
 */
public class Menu {
    public static void main (String arg []){
      int opcion = 0, nodo = 0;
        pila Pila = new pila();

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Eliminar un nodo\n"
                        + "3. ¿La Pila esta vacia?\n"
                        + "4. Salir.\n\n"));
                        
                
                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Porfavor ingresa el valor a guardar en el nodo"));
                        Pila.InsertarNodo(nodo);
                        break;
                        
                    case 2:
                        if(!Pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                             + Pila.EliminarNodo());
                        }else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                        
                    case 3:
                        if(Pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila NO vacia");
                        }
                        break;
                        
                    case 4:
                       opcion = 4;
                        break;                                     
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve intentar nuevamente.");
                        break;
                }
                

            } catch (NumberFormatException e) {

            }
        } while (opcion != 4);
    }
}
