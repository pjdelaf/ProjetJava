/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.modele;


import java.util.ArrayList;

/**
 *
 * @author mlcmi
 */
public class Chambre extends Service {
    ArrayList no_chambre = new ArrayList();
    ArrayList lit = new ArrayList();
    private float nb_moyen_de_lits;
    
    //constructeur par defaut

    /**
     *
     */

    public Chambre(){
       this.requete=requete;
       this.connect=connect;
       this.code_service=code_service;
       this.nb_moyen_de_lits=nb_moyen_de_lits;
       this.resultat=resultat;
    
        
    }
    //accesseur
    public float GetNb_moyen_de_lits(){
        return nb_moyen_de_lits;
        
    }
    /*public ArrayList <int> getNo_chambre (){
        return no_chambre;
    }*/
    
    
}
