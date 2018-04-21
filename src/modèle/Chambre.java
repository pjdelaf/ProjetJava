package modèle;
import java.util.*;
import java.sql.*;
import controller.*;

public class Chambre
{
    private Connexion connect;
    public String requete = "SELECT * FROM service;";
    public ArrayList resultat;
    public Vector<Vector>  result;

    public Chambre(Connexion con)
    {
        connect = con;
        resultat = actualiser(con);
    }

    /**
     *
     * @param connect
     * @param new_requete
     * @return
     */
    public ArrayList recherche(Connexion connect, String new_requete)
    {
        try
        {
            result = connect.remplirChampsRequete(new_requete);
        }
        catch (SQLException e)
        {
            System.out.println("erreur lors de la recherche : " + e);
        }
        return resultat;
    }

    public void modifier(Connexion connect, String requete)
    {
        try
        {
            connect.executeUpdate(requete);
        }
        catch (SQLException e)
        {
            System.out.println("erreur lors de la modification : " + e);
        }
    }


    public ArrayList actualiser(Connexion con)
    {
        resultat = recherche(con, "SELECT * FROM chambre;");
        return resultat;
    }


    public void ajouter(Connexion con, String requete)
    {
        try
        {
            connect.execute(requete);
        }
        catch (SQLException e)
        {
            System.out.println("erreur lors de l'ajout : " + e);
        }
    }

    public void supprimer(Connexion con, String requete)
    {
        try
        {
            connect.execute(requete);
        }
        catch (SQLException e)
        {
            System.out.println("erreur lors de la suppression de l'élément : " + e);
        }
    }




    public Vector getChambre(int i)
    {
        return result.get(i);
    }


}
