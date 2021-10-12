/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarrays;

/**
 *
 * @author Santiago
 */
public class TestArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edades[] = new int [3];
        System.out.println("edades ="+edades);
        //Modificación de los elementos del array
        edades[0] = 15;
        System.out.println("edades 0 ="+edades[0]);
        //Acceso a un nuevo índice
        //edades[3] = 24;
        
        for(var i = 0; i < edades.length; i++){
            System.out.println("edades["+i+"] = "+edades[i]);
        }
    }
    
}
