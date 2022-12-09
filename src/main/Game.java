package main;
import java.io.IOException;
import java.io.InputStream;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Game extends JFrame {
	
	private GameScreen GameScreen;
	
	private BufferedImage img;
	
	public Game() {
	
		importImg();
		
		setSize(640,640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		GameScreen = new GameScreen();
		add(GameScreen);
		
	}
private void importImg() {

	InputStream is = getClass().getResourceAsStream("/res/spriteatlas.png");
	
	try {
		img = ImageIO.read(is);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
	public static void main(String[] args) {
	
		Game game=new Game();
	}

}
