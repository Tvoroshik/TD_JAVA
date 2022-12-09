package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GameScreen extends JPanel{
	
	public GameScreen() {
		
	}
	public void paintComponent(Graphics G) {
		super.paintComponent(G);
		
		G.setColor(Color.red);
		G.fillRect(50,50,100,100);
	}

}
