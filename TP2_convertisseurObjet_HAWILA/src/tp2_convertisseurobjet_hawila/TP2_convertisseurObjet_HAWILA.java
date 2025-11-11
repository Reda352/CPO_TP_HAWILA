/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_hawila;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TP2_convertisseurObjet_HAWILA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convertisseur c = new Convertisseur();
        int ch; 
        double val, res = 0;

        do {
            System.out.println("""
                1:C->K  2:K->C  3:F->C
                4:C->F  5:K->F  6:F->K
                0:Quitter""");
            ch = sc.nextInt();
            if (ch == 0) break;

            System.out.print("Température : "); 
            val = sc.nextDouble();

            switch (ch) {
                case 1 -> res = c.CelciusVersKelvin(val);
                case 2 -> res = c.KelvinVersCelcius(val);
                case 3 -> res = c.FarenheitVersCelcius(val);
                case 4 -> res = c.CelciusVersFarenheit(val);
                case 5 -> res = c.KelvinVersFarenheit(val);
                case 6 -> res = c.FarenheitVersKelvin(val);
                default -> System.out.println("Choix invalide !");
            }

            if (ch >= 1 && ch <= 6)
                System.out.println("Résultat = " + res);

        } while (true);

        System.out.println(c);
    }
}


