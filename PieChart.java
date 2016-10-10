package q5;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * <p> This class receive all needed 
 * data to draw a pie chart.</p>
 * @author Ron Tran - Set A 
 * @version 1.0
 */
 public class PieChart extends JFrame {
/**
* <p> The x position of the text.</p>
*/
 private static final int X_POSITION = 20;
    /** 
     * <p> The y position of the text.</p>
     */
 private static final int Y_POSITION = 20;
 /**
  * <p>The default constructor which sets the title of this app, sets the
  * default close operation to exit, creates a new content pane and finally
  * sets size and sets the visibility of this frame to true (show).</p>
  */
 public PieChart() {
       super("Pie Chart");
       final int size1 = 350;
       final int size2 = 220;  
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setContentPane(new PieChartPanel());
       setSize(size1, size2);
       setVisible(true);
}

/**
 *<p>A panel that acts as the Frame's content pane.</p>
 */
 class PieChartPanel extends JPanel { 
 
/**
 * <p>An image object that can be used to paint to the panel.</p> 
 */
 
/**
 * <p>The default constructor that retrieves an image to draw.</p>
 */
PieChartPanel() {
 }
 /**
  * <p>Called by the environment when the frame needs to be updated.</p>
  * 
  * @param g the graphics context with which we paint into.
  */
 public void paintComponent(Graphics g) {
/**
 * <p> Declare all the needed variables. 
 * Provide datas, number to create 8 equal 
 * pie charts</p>     
 */
     final double pie1 = 45;
     final double pie2 = 45;
     final double pie3 = 45;
     final double pie4 = 45;
     final double pie5 = 45;
     final double pie6 = 45;
     final double pie7 = 45;
     final double pie8 = 45;
     int angle = 0;
     final int xposition = 50;
     final int yposition = 50;
     final int width = 80;
     final int height = 80;     
     final int color1 = 60;
     final int color2 = 225;     
     final int color3 = 140;  
     final int color4 = 200;     
     super.paintComponent(g);
     setBackground(new Color(color1, color2, color3));
     g.setColor(new Color(color3, xposition, color4));
     g.drawString("an acceptable pie chart?", X_POSITION, Y_POSITION);
     g.drawOval(xposition, yposition, width, height); 
     
     g.setColor(Color.red);
     g.fillArc(xposition, yposition, width, height, angle, (int) pie1);
     angle -= pie1;
     
     g.setColor(Color.yellow);
     g.fillArc(xposition, yposition, width, height, angle, (int) pie2);    
     angle -= pie2;
     
     g.setColor(Color.pink);
     g.fillArc(xposition, yposition, width, height, angle, (int) pie3);
     angle -= pie3;
     
     g.setColor(Color.black);
     g.fillArc(xposition, yposition, width, height, angle, (int) pie4);
     angle -= pie4;
     
     g.setColor(Color.blue);
     g.fillArc(xposition, yposition, width, height, angle, (int) pie5);
     angle -= pie5;
     
     g.setColor(Color.gray);
     g.fillArc(xposition, yposition, width, height, angle, (int) pie6);
     angle -= pie6;
     
     g.setColor(Color.white);
     g.fillArc(xposition, yposition, width, height, angle, (int) pie7);
     angle -= pie7;
     
     g.setColor(Color.orange);
     g.fillArc(xposition, yposition, width, height, angle, (int) pie8);
     angle -= pie8;
     
     
     
 }
 
 
 }
 
/**
 * <p>This method creates a new pie chart.</p> 
 * @param args args
 */
 public static void main(String[] args) {
    new PieChart();
 }
 
 
 
 
 
 
 
 
 
 
 
}