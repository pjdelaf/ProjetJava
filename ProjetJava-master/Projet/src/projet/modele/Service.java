/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.modele;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author mlcmi
 */
public class Service extends Batiment {
    protected Connexion connect;
    protected ArrayList <ArrayList > resultat;
    public String requete;
    protected String code_service;
    protected float nb_moyen_de_lits;
    
   
    
   

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
     
     public float GetNb_moyen_de_lits(int i){
         return nb_moyen_de_lits;
     }
     
     public ArrayList <ArrayList> rechercher (Connexion connect){
        return rechercher(connect, "SELECT * FROM Service");
     }

    /**
     *
     * @param connect the value of connect
     * @param select__from_Service the value of select__from_Service
     */
    public ArrayList <ArrayList> rechercher(Connexion connect, String select__from_Service) {
        ArrayList <ArrayList> resultat = new ArrayList<ArrayList>();
        try {
            resultat = connect.remplirChampsRequete(requete);
            
        }catch (SQLException e){
            System.out.println("Erreur: "+e);
        }
        return null;
    }
     
    
    
     
     //maj pour mise à jour
     public ArrayList<ArrayList> maj (Connexion connect){
         resultat=rechercher (connect, "SELECT * FROM Service");
                 return resultat;
                 ArrayList=0;
                   for(int i=0;i<ArrayList.size(); i++){
                       GetCode_service();
                       GetNb_moyen_de_lits(i);
                   }
        return null;
     }
     
     public ArrayList <ArrayList> afficher (Connexion connect){
         ArrayList <ArrayList> resultat = new ArrayList<ArrayList>();
         try{
             resultat=connect.remplirChampsRequete(requete);
         }
         catch (SQLException e){
             System.out.println("Erreur: "+e);
         }
        return resultat;
     }
     
      public ArrayList <ArrayList> supprimer (Connexion connect){
         try {
             connect.executeUpdate(requete);
         }
         
         catch (SQLException e){
             System.out.println("Erreur: "+e);
         }
        return resultat;
     }
   
      
       public ArrayList <ArrayList> modifier (Connexion connect){
         ArrayList <ArrayList> resultat = new ArrayList<ArrayList>();
         try{
             resultat=connect.remplirChampsRequete(requete);
         }
         catch (SQLException e){
             System.out.println("Erreur: "+e);
         }
        return resultat;
     }
     
     
}