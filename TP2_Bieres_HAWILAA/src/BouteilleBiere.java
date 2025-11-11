/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_hawilaa;

/**
 *
 * @author ADMIN
 */
public class BouteilleBiere {
    // Attributs
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    // Constructeur vide (optionnel)
    public BouteilleBiere() {
        ouverte = false;
    }

    // Constructeur avec paramètres
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    // Méthode pour lire l'étiquette
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres)\nBrasserie : " + brasserie);
    }

    // Méthode pour décapsuler
    public boolean decapsuler() {
        if (!ouverte) {
            ouverte = true;
            return true;
        } else {
            System.out.println("Erreur : bière déja ouverte !");
            return false;
        }
    }

    // Redéfinition de toString()
    @Override
    public String toString() {
        String chaine = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        chaine += (ouverte) ? "oui" : "non";
        return chaine;
    }
}

    
}
