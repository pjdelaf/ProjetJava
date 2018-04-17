package vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pagedaccueil extends JFrame implements ActionListener
{
    private JPanel MenuDaccueil;
    private JPanel North;
    private JPanel South;
    private JPanel Center;
    private JButton MAJButton;
    private JButton RECHERCHEButton;
    private JButton GENERATIONButton;
    private JButton déconnexionButton;

    public Pagedaccueil()
    {
        this.setTitle("menu d'accueil");
        this.setSize(500,300);
        Container c =this.getContentPane();
        c.setLayout(null);
        déconnexionButton = new JButton("déconnexion");
        déconnexionButton.addActionListener(this);
        c.add(déconnexionButton);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if ((JButton)e.getSource()==déconnexionButton)
        {
            this.setVisible(false);
        }
    }

    public static void main(String[] args)
    {
        Pagedaccueil pda = new Pagedaccueil();
        pda.setVisible(true);
    }


}
