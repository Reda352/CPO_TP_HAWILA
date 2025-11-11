/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_hawilaa;

/**
 *
 * @author ADMIN
 */
public class TP2_Bieres_HAWILAA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        BouteilleBiere biere3 = new BouteilleBiere("Pelforth", 5.5, "Brasserie Pelforth");
        BouteilleBiere biere4 = new BouteilleBiere("Hoegaarden", 4.9, "Brasserie Hoegaarden");

        // Affichage des étiquettes
        uneBiere.lireEtiquette();
        autreBiere.lireEtiquette();
        biere3.lireEtiquette();
        biere4.lireEtiquette();

        System.out.println();

        // Décapsulage
        uneBiere.decapsuler();  // réussit
        autreBiere.decapsuler(); // réussit
        autreBiere.decapsuler(); // déjà ouverte, affiche message d'erreur

        // Affichage via toString()
        System.out.println(uneBiere);
        System.out.println(autreBiere);
        System.out.println(biere3);
        System.out.println(biere4);
    }
}

        
        // TODO code application logic here
    
    

