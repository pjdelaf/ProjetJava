/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.modele;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author mlcmi
 */
public class Service extends Batiment {
    private Connexion connect;
    private ArrayList <ArrayList > resultat;
    public String requete;
    private String code_service;
    private float nb_moyen_de_lits;
    
   
    
   

//constructeur
     public Service(Connexion connect ){
         code_service=null;
         nb_moyen_de_lits=0;
         connect=connect;

}
//accesseurs
     public String GetCode_service(){
         return code_service;
     }
     
     public float GetNb_moyen_de_lits(){
         return nb_moyen_de_lits;
     }
     
     public ArrayList <ArrayList> rechercher (Connexion connect){
         ArrayList <ArrayList> resultat = new ArrayList<ArrayList>();
         try{
             resultat=connect.remplirChampsRequete(requete);
         }
         catch (SQLEXception e){
             System.out.println("Erreur: "+e);
         }
        return null;
     }
     
    
     
     //maj pour mise à jour
     public ArrayList<ArrayList> maj (Connexion connect){
         resultat=rechercher (connect, "SELECT * FROM Service");
                 return resultat;
     }
     
     public ArrayList <ArrayList> afficher (Connexion connect){
         ArrayList <ArrayList> resultat = new ArrayList<ArrayList>();
         try{
             resultat=connect.remplirChampsRequete(requete);
         }
         catch (SQLEXception e){
             System.out.println("Erreur: "+e);
         }
        return resultat;
     }
     
      public ArrayList <ArrayList> supprimer (Connexion connect){
         try {
             connect.execute(requete);
         }
         
         catch (SQLEXception e){
             System.out.println("Erreur: "+e);
         }
        return resultat;
     }
   
       public ArrayList <ArrayList> modifier (Connexion connect){
         ArrayList <ArrayList> resultat = new ArrayList<ArrayList>();
         try{
             resultat=connect.remplirChampsRequete(requete);
         }
         catch (SQLEXception e){
             System.out.println("Erreur: "+e);
         }
        return resultat;
     }
     
     
}