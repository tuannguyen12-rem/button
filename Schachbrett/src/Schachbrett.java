import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Schachbrett  extends JPanel {

	private static final long serialVersionUID = 5340234103512418822L;
	
	private final int breiteFeld = 40;

	public static void main (String args[]) {
		
		JFrame frame = new JFrame("Schachbrett");
		frame.setSize(340,360);
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		int x = (d.width - frame.getSize().width) / 2;
		int y = (d.height - frame.getSize().height) / 2;
	
		frame.setLocation(x, y);
		
		frame.add(new Schachbrett());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		boolean feldSchwarz;
		
		for(int i =0; i< 8;i++) {
			if(i%2 ==0) {
				feldSchwarz = false;
			}else {
				feldSchwarz = true;
			}
			
			for(int j = 0; j < 8;j++) {
				// Farbe für Schachbrett setzen
				if(feldSchwarz) {
					g.setColor(Color.BLACK);
				}else {
					g.setColor(Color.WHITE);
				}
				
				// Schachmuster zeichnen
				g.fillRect(i* breiteFeld, j* breiteFeld,breiteFeld,breiteFeld);
				
				// Farbe für Beschriftung setzen
				if(feldSchwarz) {
					g.setColor(Color.WHITE);
				}else {
					g.setColor(Color.BLACK);
				}
				// Beschriftung setzen
				g.drawString((char) (65+i)+ ""+ (8-j),i* breiteFeld +10, j* breiteFeld +25);
				feldSchwarz = ! feldSchwarz;
			}
		}
		
	}
	
}
