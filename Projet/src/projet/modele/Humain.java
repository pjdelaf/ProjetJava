/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.modele;

/**
 *
 * @author mlcmi
 */
abstract class Humain {//CREATION D UNE CLASSE ABSTRAITE MERE pour tous les differents employés 
    protected String name;
    protected String prenom;
    
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
}
