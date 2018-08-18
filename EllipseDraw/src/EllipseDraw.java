import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class EllipseDraw extends JFrame
{

	public EllipseDraw()
	{
		setTitle("EllipseDraw");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.drawOval(340, 340, 300, 200);
		g.fillOval(340, 340, 300, 200);

	}
	public static void main(String[] args) 
	{
		EllipseDraw e = new EllipseDraw();
	}

}