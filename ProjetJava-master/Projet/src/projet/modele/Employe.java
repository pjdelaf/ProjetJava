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
public class Employe extends Humain{
    protected String code_service;
    
    
    //constructeur par defaut
    public Employe(){
        super();
        code_service=null;
    }
    
    //accesseur
    public String GetCode_service(){
        return code_service;
    }
}
