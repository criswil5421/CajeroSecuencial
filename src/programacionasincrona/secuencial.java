/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionasincrona;

/**
 *
 * @author Pc
 */
public class secuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        tarea1();
        tarea2();
        tarea3();
        
        // TODO code application logic here
    }
    public static void tarea1(){
        for (int i = 0; i < 5; i++) {
            System.out.println("tarea 1: " + i);
        }
    }
    public static void tarea2(){
        for (int i = 0; i < 5; i++) {
            System.out.println("tarea 2: " + i);
        }
    }
    public static void tarea3(){
        for (int i = 0; i < 5; i++) {
            System.out.println("tarea 3: " + i);
        }
    }
    
}
