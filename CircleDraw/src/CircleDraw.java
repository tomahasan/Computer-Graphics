import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class CircleDraw extends JFrame
{

	public CircleDraw()
	{
		setTitle("CircleDraw");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.drawOval(200, 150, 250, 250);
		g.fillOval(200, 150, 250, 250);

	}
	public static void main(String[] args) 
	{
		CircleDraw c = new CircleDraw();
	}

}
