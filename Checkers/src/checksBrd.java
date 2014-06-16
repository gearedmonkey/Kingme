package src;

import java.awt.*;

import javax.swing.*;

public class checksBrd {
	
	JFrame outline;
	JPanel spaces[][] = new JPanel[10][10];
	JLayeredPane duck;
	
	
	public checksBrd() {
		JPanel Board = new JPanel();
		duck.add(Board, JLayeredPane.DEFAULT_LAYER);
		outline = new JFrame("Game");
	    outline.setSize(500, 500);
	    outline.setLayout(new GridLayout(8, 8));

	    for (int i = 0; i < 8; i++) {
	        for (int j = 0; j < 8; j++) {
	            spaces[i][j] = new JPanel();
	
	            
	            if ((i + j) % 2 == 0) {
	              spaces[i][j].setBackground(Color.black);
	            } else {
	              spaces[i][j].setBackground(Color.white);
	            }   
	            outline.add(spaces[i][j]);
	        }
}

	}
}
