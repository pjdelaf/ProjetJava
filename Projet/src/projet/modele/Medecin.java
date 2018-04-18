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
public class Medecin extends Employe{
    private String specialite;
    private boolean un_malade_hospitalise;
    
    //constructeur  par defaut
    public Medecin(){
        super();
        String specialite=null;
        boolean un_malade_hospitalise=false;
    }
    
    //ACCESSEUR
    public String GetSpecialite() {
        return specialite;
    }
    public boolean GetUn_malade_hospitalise(){
        return un_malade_hospitalise;
    }
}
