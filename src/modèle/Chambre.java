package modèle;
import java.util.*;
import java.sql.*;
import controller.*;

public class Chambre
{
    private Connexion connect;
    public Vector<Vector> result;
    public String requete = "SELECT * FROM service;";
    public ArrayList resultat;

    public Chambre(Connexion con) {
        connect = con;
        result = actualiser(con);
    }

    /**
     *
     * @param connect
     * @param new_requete
     * @return
     */
    public Vector<Vector> recherche(Connexion connect, String new_requete)
    {
        Vector<Vector> result = new Vector<Vector>();
        try
        {
            resultat = connect.remplirChampsRequete(new_requete);
        }
        catch (SQLException e)
        {
            System.out.println("erreur lors de la recherche : " + e);
        }
        return result;
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


    public Vector<Vector> actualiser(Connexion con)
    {
        result = recherche(con, "SELECT * FROM chambre;");
        return result;
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
