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
public class Rapport {//classe sur le rapport entre:
    //le nombre i d'infirmiers affectes au service 
    // et le nbr de malades m hospitalises ds le service
    
    private float rapport_i_sur_m;
    
    //constructeurs
  public  Rapport(){
      float rapport_i_sur_m=0;
    
}
  
  public Rapport ( int i, int m){
      rapport_i_sur_m=i/m;
  }
  
  //accesseurs
  public float GetRapport(){
      return rapport_i_sur_m;
  }
  
  
  
}