package src;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class checksBrd {

	JFrame outline;
	JPanel spaces[][] = new JPanel[10][10];
	JLayeredPane duck;

	public checksBrd() {
		JPanel Board = new JPanel();
		duck = new JLayeredPane();
		duck.add(Board, JLayeredPane.DEFAULT_LAYER);
		outline = new JFrame("Game");
		outline.setSize(500, 500);
		outline.setLayout(new GridLayout(8, 9));

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				spaces[i][j] = new JPanel();

				if ((i + j) % 2 == 0) {
					spaces[i][j].setBackground(Color.black);
				} else {
					spaces[i][j].setBackground(Color.red);
				}
				outline.add(spaces[i][j]);
			}
		}

		
		outline.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		outline.setVisible(true);

	}
}
