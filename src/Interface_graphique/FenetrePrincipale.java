package Interface_graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class FenetrePrincipale extends JFrame{
	public FenetrePrincipale() {
		
		
		
		
		
		
		
		JFrame fenetre = new JFrame("Jeu de la vie (Celui ci est toujours une version du pauvre)");
		
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(500, 500);
        
        
        fenetre.setResizable(false);
        JLabel text = new JLabel("Jeu de la vie ");
        text.setForeground(Color.BLUE);
        fenetre.add(text, BorderLayout.NORTH);
        
    	
//        Integer[][] array = {{1,2},{3,4}};
//        String[] lineName = {"Colonne 1", "Colonne 2"};
//        JTable table = new JTable(array, lineName );
//        fenetre.add(table, BorderLayout.SOUTH);
        fenetre.setVisible(true);

	}
}
