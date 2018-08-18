package h1;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class FaceDraw extends JFrame
{

	public FaceDraw()
	{
		setTitle("FaceDraw");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(250, 200, 350, 350);
		//g.setColor(Color.YELLOW)
		//g.dOval(250,200,350,350);
		

		
		g.setColor(Color.black);
		g.fillRect(310,290,80,8);
		
		g.setColor(Color.black);
		g.fillRect(460,290,80,8);
		
		g.setColor(Color.black);
		g.fillRect(355,460,150,8);
		
		



		
	
		
	}
	public static void main(String[] args) 
	{
		FaceDraw f = new FaceDraw();
	}

}