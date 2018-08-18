import java.awt.*;
import javax.swing.*;
 
public class DrawRectangle extends JPanel {
 
  public void paintComponent(Graphics g) {
 
	  g.setColor(Color.black);
	  g.fillRect(50,100, 350,100);
	  g.setColor(Color.red);
	  g.fillRect(50,200, 350,100);
	  g.setColor(Color.yellow);
	  g.fillRect(50,300, 350,100);
	  
//	  g.drawRect(150,200, 300,200);
//	  g.setColor(Color.black);
//     g.fillRect(120,50,100,400);
//     g.drawRect(50,220, 300, 400);
    
 
  }
 
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("Draw Rectangle");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBackground(Color.white);
    frame.setSize(250, 200);
 
    DrawRectangle panel = new DrawRectangle();
 
    frame.add(panel);
 
    frame.setVisible(true);
  }
}