/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import static java.lang.System.console;
import projet.vue.Console;
import projet.vue.Graphique;

/**
 *
 * @author mlcmi
 */
public class Test {

    private static Graphique fen;
    private static Console console;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, String nomficher) {
        // TODO code application logic here
        fen= new Console (); 
        console= new Console ();//instancie la console
        console.toString();
        Testgestion test;
        test= new Testgestion (new File(nomficher)); //instancie la bdd à partir du fichier
        console.affiche (o);
        
        class BoutonListener implements ActionListener {
            @Override
            public void actionPerformed (ActionEvent arg0){
                    test.afficher();
        }
        }
         class BoutonListener2   implements ActionListener {
            @Override
            public void actionPerformed (ActionEvent arg0){
                    test.inserer();
        }
        }
          class BoutonListener3 implements ActionListener {
            @Override
            public void actionPerformed (ActionEvent arg0){
                    test.modifier();
        }
        }
           class BoutonListener4 implements ActionListener {
            @Override
            public void actionPerformed (ActionEvent arg0){
                    test.supprimer();
        }
        }
         fen.getb1().addActionListener (new BoutonListener());
         fen.getb2().addActionListener (new BoutonListener2());
         fen.getb3().addActionListener (new BoutonListener3());
         fen.get4().addActionListener (new BoutonListener4());
            
          
            
           char choix = console.menu ();//affichage du menu de gestion de l hopital en mode console
    }
    
}

        

           