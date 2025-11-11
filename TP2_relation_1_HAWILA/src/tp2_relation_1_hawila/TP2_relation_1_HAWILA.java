/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_hawila;

/**
 *
 * @author ADMIN
 */
public class TP2_relation_1_HAWILA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2; 

        System.out.println("Assiette2 = " + assiette2.nbCalories); 
        System.out.println("Assiette3 = " + assiette3.nbCalories); 

        assiette2.nbCalories += 50;

        System.out.println("Après modification :");
        System.out.println("Assiette2 = " + assiette2.nbCalories); // 650
        System.out.println("Assiette3 = " + assiette3.nbCalories); // 650

        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("Après échange :");
        System.out.println("Assiette1 = " + assiette1.nbCalories); 
        System.out.println("Assiette2 = " + assiette2.nbCalories);

        Moussaka[] tabMoussaka = new Moussaka[10];
        for (int i = 0; i < tabMoussaka.length; i++) {
            tabMoussaka[i] = new Moussaka(400 + i * 50); 
            System.out.println("Moussaka " + i + " = " + tabMoussaka[i].nbCalories + " cal");
        }

        
    }
}

class Tartiflette {
    int nbCalories;

    public Tartiflette(int nbCalories) {
        this.nbCalories = nbCalories;
    }
}


class Moussaka {
    int nbCalories;

    public Moussaka(int nbCalories) {
        this.nbCalories = nbCalories;
    }
}

        // TODO code application logic here
    
