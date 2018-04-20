/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.vue;

import java.util.Scanner;
import projet.controleur.Test;

/**
 *
 * @author mlcmi
 */
public class Console {
    Scanner in = new Scanner (System.in); //pour lire au clavier
    private Object Int;

    
    @Override
    public String toString(){
        String s;
        s= in.next();
        return s;
    }
    
    //AFFICHAGE MENU + RETOUR du choix
    public int menu (){
        int unchoix;
        
        System.out.println(" Bonjour et Bienvenu! ");
        
        System.out.println("Appuyer sur 0 pour Rechercher une information sur la Gestion de l'hôpital");
        System.out.println("Appuyer sur 1 pour Mettre à jour la Base de Donnée de l'Hôpital");
        System.out.println("Appuyer sur 2 pour Afficher une information");
        System.out.println("Appuyer sur 3 pour Supprimer une information");
        System.out.println("Appuyer sur 4 pour modifier une information");
        System.out.println("Appuyer sur 5 pour Quitter");
        
        System.out.println("Veuillez entrer votre choix: ");
        unchoix=in.nextInt();
        
      //blindage du choix de l'interface
        if (unchoix<5){
           return unchoix; 
        }
        else {
            System.out.println("Error! Choississez une Option");
            System.out.println ("Veuillez entrer un nombre entre 0 et 5");
        return 0;
        }
      
    }

    public void affiche(Test testgestion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
