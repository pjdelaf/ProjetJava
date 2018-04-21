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
public class Infirmier extends Employe {
    private float moyenne_des_salaires;
    private boolean rotation_nuit;
    private int nb_infirmier_service;// le nombre i d'infirmiers affectes au service pour la classe Rapport
    
    //constructeur par defaut initialisation
    public Infirmier(){
        super();
        moyenne_des_salaires=0;
        rotation_nuit=false;
        nb_infirmier_service=0;
    }
    
    //accesseur
    public float GetMoyenne_des_salaires(){
        return moyenne_des_salaires;
    }
    public boolean GetRotation_nuit(){
        return rotation_nuit;
    }
    public int nb_infirmier_service(int i){
        return nb_infirmier_service=i;
    }
}
