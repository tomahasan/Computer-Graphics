
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
public class RectangleDraw extends JFrame 
{
  
	public RectangleDraw()
	{
		setTitle("RectangleDraw");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.drawLine(100, 250, 400, 250);
		g.setColor(Color.BLACK);
		g.drawLine(100, 250, 100, 450);
		g.setColor(Color.BLACK);
		g.drawLine(100, 450, 400, 450);
		g.setColor(Color.BLACK);
		g.drawLine(400, 450, 400, 250);
		
	
	}
	public static void main(String[] args) 
	{
		
		RectangleDraw r = new RectangleDraw();
	}

}
