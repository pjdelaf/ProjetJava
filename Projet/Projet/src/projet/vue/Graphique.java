/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.vue;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author mlcmi
 */
//Pour l interface graphique, prenons exemple sur le tp3
public class Graphique extends JFrame implements ActionListener{
    private JPanel pan; //panneau
    private JButton button [][]; //MATRICE DE BOUTONS
    private Object o;
    private JButton b1;//pour afficher une requete
    private JButton b2;//pour inserer une nouvelle
    private JButton b3;//pour la modifier
    private JButton b4;//pour la supprimer

   
    
    //constructeur
    public Graphique (){
        
        setTitle("Menu pour la Gestion du Centre Hospitalier");
        setSize (600, 250);
        pan= new JPanel ();//instanciation du panneau
        getContentPane().add(pan);//ajout du panneau dans la fenetre
    }

/**
     *
     * @param o
     */
 
//methode pour afficher
//Ajout des buttons dans le panneau
public void affiche(Object o){
pan.setLayout(new BoxLayout(pan.getTailleY(), pan.getTailleX ()));
for (int i=0; i<pan.getTailleY(); i++){
     for (int j=0; o.getTailleX(); i++){
         button[i][j]=new JButton ();//on instancie chaque Bouton
          pan.add(button [i][j]);
}
}
}
    
//instancie les boutons
 
/*JButton b2= new JButton ("Insérer une nouvelle requête");
JButton b3= new JButton ("modifier une requête");
JButton b4= new JButton ("supprimer une requête);"

b1.setSize(100,80);
b2.setSize(80,80);
b3.setSize(80,80);
b4.setSize(80,80);
b5.setSize (100,100);
b6.setSize (100,100);
pan.add(b1);
pan.add(b2);
pan.add(b3);
pan.add(b4);

*/

// rendre la fenetre visible 

this.setVisible(true);  

 //getter des boutons pour les réutiliser notamment dans Testlaby

    /**
     *
     * @return
     */
    public JButton getb1 () {
       
    return b1;
}

    /**
     *
     * @return
     */
    public JButton getb2 () {
       
    return b2;
}

    /**
     *
     * @return
     */
    public JButton getb3 () {
        
    return b3;
}
 
    /**
     *
     * @return
     */
    public JButton getb4 () {
        
    return b4;
}
}