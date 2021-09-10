/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliminarelementoarreglo;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EliminarElementoArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[]= new int [10];
        int posicionEliminar = 0;
        
        for (int i=0; i< 10; i++){ //llenar arreglo
            System.out.println("Digite un número para la posición ["+i+"]: ");
            arreglo[i] = teclado.nextInt();
        }
        System.out.println("\nEl arreglo es: ");
        for(int i = 0; i< 10; i++){
            System.out.println(arreglo[i]+" en la posición " + i);
        }
        
        posicionEliminar = (posicionEliminar / 2);
        
        
        for (int i = posicionEliminar; i < 9; i++){
            arreglo[i] = arreglo[i+1];
            System.out.println(arreglo[i]+ " en la posicion "+i);
        }
    }
    
    
}
