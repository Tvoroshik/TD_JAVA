package main;

import javax.swing.JFrame;

public class Game extends JFrame {
	
	private GameScreen GameScreen;
	
	public Game() {
	
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		GameScreen = new GameScreen();
		add(GameScreen);
		
	}

	public static void main(String[] args) {
		System.out.println("start");
		
		Game game=new Game();
	}

}
