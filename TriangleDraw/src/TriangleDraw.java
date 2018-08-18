
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class TriangleDraw extends JFrame
{

	public TriangleDraw()
	{
		setTitle("TriangleDraw");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.drawLine(100, 250, 400, 250);
		g.setColor(Color.BLACK);
		g.drawLine(100, 250, 250, 100);
		g.setColor(Color.BLACK);
		g.drawLine(250, 100, 400, 250);
		
	
	}

	public static void main(String[] args) 
	{
		TriangleDraw l = new TriangleDraw();
	}

}
