/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_addition;

import java.util.Scanner; // importer la classe Scanner du package java.util

/**
 * Reda Hawila 
 * 20/10/2025
 */
public class Tp0_Addition {

    public static void main(String[] args) { 
        int nb;      // nombre d'entiers à additionner
        int result;  // résultat
        int ind;     // indice

        // Création d'un scanner pour lire au clavier
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer le nombre : ");
        nb = sc.nextInt();  

        // Initialisation
        result = 0;  
        ind = 1;

        // Addition des nb premiers entiers
        while (ind <= nb) {
            result = result + ind;
            ind++;
        }

        // Affichage du résultat 
        System.out.println("La somme des " + nb + " premiers entiers est : " + result);

        sc.close();
    }
}
