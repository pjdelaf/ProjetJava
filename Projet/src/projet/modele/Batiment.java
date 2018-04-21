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
public class Batiment {
    private String nom_batiment;
    

//constructeur par defaut
    public Batiment (){
        nom_batiment=null;
    }
    
//accesseur

     public String GetNom_batiment(){
         return nom_batiment;
         
     }
}
