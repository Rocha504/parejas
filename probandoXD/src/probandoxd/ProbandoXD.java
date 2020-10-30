/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probandoxd;



import java.util.Scanner;

/**
 *
 * @author josue
 */
public class ProbandoXD {

   static Scanner read = new Scanner(System.in);
   
    public static void main(String[] args) {
        boolean FLAG = true;
        while (FLAG == true) {            
            System.out.println("1. sumar 2. restar");
            int opcion = read.nextInt();
            switch(opcion){
                case 3:{
                    System.out.println("Ingrese un nuevo numero");
                    int num1=read.nextInt();
                    System.out.println("Ingrese nuevo numero");
                    int num2=read.nextInt();
                    int suma=num2+num1;
                    System.out.println();
                    System.out.println(suma);}
                    
                case 1:{
                    System.out.println("Ingrese un nuevo numero");
                    int num1=read.nextInt();
                    System.out.println("Ingrese nuevo numero");
                    int num2=read.nextInt();
                    int suma=num2+num1;
                    System.out.println();
                    System.out.println(suma);}
                    
                
            }
            
        }
    }
    
}
