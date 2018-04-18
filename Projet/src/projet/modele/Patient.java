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
public class Patient extends Humain{
    private String mutuelle;
    private int nb_soignants;
    private int nb_specialites;
    
//constructeur par defaut
    public Patient (){
        super();
        mutuelle=null;
        nb_soignants=0;
        nb_specialites=0;
    }
    
    
    //accesseur
   public String GetMutuelle() {
    return mutuelle;
}
   public int GetNb_soignants(){
       return nb_soignants;
   }
   public int GetNb_specialites(){
       return nb_specialites;    
   }


}
