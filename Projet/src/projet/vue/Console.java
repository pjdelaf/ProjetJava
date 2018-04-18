/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.vue;

import java.util.Scanner;

/**
 *
 * @author mlcmi
 */
public class Console {
    Scanner in = new Scanner (System.in); //pour lire au clavier


    public Console() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        String s;
        s= in.next();
        return s;
    }
    
    //AFFICHAGE MENU + RETOUR du choix
    public char menu (){
        String unchoix;
        
        System.out.println(" Bonjour et Bienvenu! ");
        
        System.out.println("Appuyer sur 0 pour Rechercher une information sur la Gestion de l'hôpital");
        System.out.println("Appuyer sur 1 pour Insérer une nouvelle information");
        System.out.println("Appuyer sur 2 pour Modifier une information");
        System.out.println("Appuyer sur 3 pour Supprimer une information");
        System.out.println("Appuyer sur 4 pour Quitter");
        
        System.out.println("Veuillez entrer votre choix: ");
        unchoix=in.next();
        return unchoix.charAt(0);
    }
}
    
