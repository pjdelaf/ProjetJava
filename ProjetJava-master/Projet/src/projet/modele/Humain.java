/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.modele;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mlcmi
 */
abstract class Humain {//CREATION D UNE CLASSE ABSTRAITE MERE pour tous les differents employés 
    protected String name;
    protected String prenom;
    private String requete;
    
 //constructeur par defaut
    public Humain(){
        name=null;
        prenom=null;
    }
    
//accesseur
  public String GetName(){
      return name;
  }
  public String GetPrenom(){
      return prenom;
  }
  
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
     public ArrayList<ArrayList> maj (Connexion connect, ArrayList<ArrayList> resultat){
         resultat=rechercher (connect, "SELECT * FROM Service");
                 return resultat;
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
     
      public ArrayList <ArrayList> supprimer (Connexion connect, ArrayList<ArrayList> resultat){
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
