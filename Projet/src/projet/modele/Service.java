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
public class Service extends Batiment {
    private String code_service;
    private float nb_moyen_de_lits;
    

//constructeur
     public Service(){
         code_service=null;
         nb_moyen_de_lits=0;

}
//accesseurs
     public String GetCode_service(){
         return code_service;
     }
     
     public float GetNb_moyen_de_lits(){
         return nb_moyen_de_lits;
     }
     
}