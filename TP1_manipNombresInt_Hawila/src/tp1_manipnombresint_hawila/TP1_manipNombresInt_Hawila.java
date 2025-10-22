/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_hawila;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TP1_manipNombresInt_Hawila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        System.out.println("entre un premier nombre");
        int nb1 = sc.nextInt();
        System.out.println("entre un deuxieme nombre");
        int nb2 = sc.nextInt();
        
        // TODO code application logic here
     int S=0;
        S=nb2+nb1 ;
    System.out.println(S);
     int D=0;
        D=nb2-nb1 ;
    System.out.println(D);
     int Q=0;
        Q=nb2*nb1 ;
    System.out.println(Q);
     int F=0;
        F=nb2/nb1 ;
    System.out.println(F);
            }
    
}
