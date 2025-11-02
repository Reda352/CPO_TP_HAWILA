/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_hawila;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
import java.util.Random;

public class TP1_guessMyNumber_HAWILA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int nombreSecret = rand.nextInt(101); // nombre entre 0 et 100
        int essais = 0, saisie = -1;

        System.out.println("Devinez le nombre entre 0 et 100 !");

        while (saisie != nombreSecret) {
            System.out.print("Votre proposition : ");
            if (sc.hasNextInt()) {
                saisie = sc.nextInt();
                essais++;
                if (saisie < nombreSecret) System.out.println("Trop petit !");
                else if (saisie > nombreSecret) System.out.println("Trop grand !");
                else System.out.println("Gagne  Nombre trouve en " + essais + " essais.");
            } else {
                sc.next(); // ignore entrée invalide
                System.out.println("Entrez un nombre valide !");
            }
        }

        sc.close();
    }
}
