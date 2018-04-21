package controller;
import vue.Pagedaccueil;
import vue.Panneaux;

import javax.swing.*;
import java.util.*;
import java.sql.*;


public class HopitalTest
{
    public static void main(String[] args)
    {
        // TODO code application logic here

        Panneaux panneaux = new Panneaux();
        while (!panneaux.validation()) {
            panneaux.validation();
        }
        if (panneaux.validation())
        {


            Connexion connect = null;


            try {
                connect = new Connexion("hopital", "root", "");
                String table = "chambre";
                String requete = "SELECT * FROM chambre;";
                Vector<Vector> ligne = connect.remplirChampsRequete(requete);

                for (int j = 0; j < ligne.size(); j++) {
                    Vector n = new Vector();
                    String champ = "";
                    n = ligne.get(j);
                    for (int i = 0; i < n.size(); i++) {
                        champ = champ + " " + n.get(i);
                    }
                    champ = champ + "\n";
                    //System.out.println(champ);
                }

                /**
                 ConnexionGraphique connexion = new ConnexionGraphique(hopital);
                 *  si connexion valider alors
                 *   connexion.setVisible(false);
                 *   hopital.setVisible(true);
                 *
                 */


            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("erreur : " + e);
            }
            Pagedaccueil pda = new Pagedaccueil(connect);
        }

        System.out.println("yolo");
    }
}

