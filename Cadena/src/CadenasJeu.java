/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.util.Random;

import java.util.Random;

public class CadenasJeu {

    private static final int LONGUEUR_CODE = 4;
    private static final int MAX_TENTATIVES = 5;
    private static final Random RAND = new Random();

    private int[] codeSecret;
    private int tentativesRestantes;
    private boolean estGagne;

    public CadenasJeu() {
        demarrerJeu();
    }

    public final void demarrerJeu() {
        codeSecret = new int[LONGUEUR_CODE];
        for (int i = 0; i < LONGUEUR_CODE; i++) {
            codeSecret[i] = RAND.nextInt(10);
        }
        tentativesRestantes = MAX_TENTATIVES;
        estGagne = false;
    }

    public int[] testerCombinaison(int[] essai) {
        if (essai == null || essai.length != LONGUEUR_CODE) {
            throw new IllegalArgumentException("L'essai doit contenir " + LONGUEUR_CODE + " chiffres.");
        }

        if (estPartieTerminee()) {
            return new int[]{0, 0, 0};
        }

        int exacts = 0;
        int tropHauts = 0;
        int tropBas = 0;

        for (int i = 0; i < LONGUEUR_CODE; i++) {
            if (essai[i] == codeSecret[i]) exacts++;
            else if (essai[i] > codeSecret[i]) tropHauts++;
            else tropBas++;
        }

        tentativesRestantes--;

        if (exacts == LONGUEUR_CODE) {
            estGagne = true;
        }

        return new int[]{exacts, tropHauts, tropBas};
    }

    public boolean estPartieTerminee() {
        return estGagne || tentativesRestantes <= 0;
    }

    public int getTentativesEffectuees() {
        return MAX_TENTATIVES - tentativesRestantes;
    }

    public int getMaxTentatives() {
        return MAX_TENTATIVES;
    }

    public boolean estGagne() {
        return estGagne;
    }

    public String getCodeSecretString() {
        StringBuilder sb = new StringBuilder();
        for (int i : codeSecret) sb.append(i);
        return sb.toString();
    }
}
