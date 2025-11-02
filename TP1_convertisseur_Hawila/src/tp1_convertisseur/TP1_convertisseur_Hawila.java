/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur;

import java.util.Scanner;       

/**
 *Reda Hawila
 * 25/10/2025
 * @author ADMIN
 */
public class TP1_convertisseur_Hawila {

    /**
     * @param args the command line arguments
     */
    public static  double CelsiusVersKelvin (double tCelsius) {
        double tKelvin;
        tKelvin = tCelsius + 273 ;
        return tKelvin ;
    }
     public static double KelvinversCelsius (double tKelvin) {
         double tCelsius ;
         tCelsius = tKelvin- 273 ;
         return tCelsius ;
     }
     public static double FarenheitVersCelsius (double tFaren) {
         double tCelsius ;
         tCelsius = tFaren-273 ;
         return tCelsius ;
     }
     
     public static  double CelsiusVersFaraenheit (double tCelsius){
         double tFaren ;
         tCelsius = tFaren - 17 ;
         return tFaren ;
     }
     public static  double KelvinVersFaraenheit (double tKelvin){
        double tFaren ;
        tFaren= tKelvin-255 ;
        return tFaren ;
     }
    
    public static  double FarenheitVersKelvin (double tFaren){
        double tKelvin;
        tKelvin= tFaren-255 ;
        return tKelvin ;
    }
    public static void main (String [] args) {
        double  var ;
        Scanner sc = new Scanner(System.in);
        System.out.println("bonjour,saisissez une valeur");
        var = sc.nextDouble();
  System.out.println("Saisissez la conversion que vous souhaitez effectuer :"
                + "\n1) De Celsius vers Kelvin"
                + "\n2) De Kelvin vers Celsius"
                + "\n3) De Fahrenheit vers Celsius"
                + "\n4) De Celsius vers Fahrenheit"
                + "\n5) De Kelvin vers Fahrenheit"
                + "\n6) De Fahrenheit vers Kelvin");        int conv=sc.nextInt();
        if (conv==1){
            System.out.println(CelsiusVersKelvin(var));
        }
        else if (conv==2){
            System.out.println(KelvinversCelsius(var));
                    }
        else if (conv==3){
            System.out.println(FarenheitVersCelsius(var));
        }
        else if (conv==4){
            System.out.println(CelsiusVersFaraenheit(var));
        }
        else if (conv==5){
            System.out.println(KelvinVersFaraenheit(var));
        }
        else if (conv==6){
            System.out.println(FarenheitVersKelvin(var));
        }
        else {
            System.out.println("pas le bon nombre");
        }
        
             
                    
         
            
        
        
              
     
                

             

         
         
            
    
     }

        
        // TODO code application logic here
    }
    

