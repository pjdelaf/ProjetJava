package vue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;


public class Panneaux
{
    public JPanel connexion;
    private JPanel West;
    private JPanel North;
    private JPanel East;
    private JPanel South;
    private JLabel NomDeBase;
    private JLabel Login;
    private JLabel MotDePasse;
    private JLabel LocaleADistance;
    private JTextField NomDeBasetextField;
    private JTextField LogintextField;
    private JPasswordField passwordField;
    private JRadioButton localeRadioButton;
    private JRadioButton àDistanceRadioButton;
    private JButton validationButton ;
    public JFrame frame;
    private boolean valider;

    public Panneaux() {
        JFrame frame = new JFrame();
        frame.setContentPane(connexion);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        valider = false;
        }
        public boolean validation()
            {
                validationButton.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    valider= true;
                }
            });
                return valider ;
            }




    }

