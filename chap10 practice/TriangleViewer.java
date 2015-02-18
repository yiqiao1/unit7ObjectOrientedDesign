import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComponent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import java.util.ArrayList;

public class TriangleViewer extends JFrame
{
    ArrayList mouseLocation = new ArrayList();
    int mouseClicks = 0;
    
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;
    
    private JFrame frame;
    private TriangleComponent component;
    
    public TriangleViewer()
    {
        frame = new JFrame();
        component = new TriangleComponent();
        frame.add(component);
        
        MouseClickListener listener = new MouseClickListener();
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public class TriangleComponent extends JComponent
    {
        private Point2D points[];
        private int numPoints;
        
        private static final int MAX_POINTS = 3;
        
        public TriangleComponent()
        {
            this.points = new Points2D[MAX_POINTS];
            this.numPoints = 0;
            this.addMouseListener(new MouseClickListener);
        }
        
        public void setPoint
        
        public void paintComponent(Graphics g)
        {
            Graphics2D g2 = (Graphics2D) g;
            
            double x1 = mouseLocation.get(0);
            double x2 = mouseLocation.get(1);
            
            if (mouseLocation.size() == 2)
            {
                Point2D.Double point = new Point2D.Double(x1, x2);
            }
        }
    }
    
    public class MouseClickListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            
            mouseClicks++;
            
            mouseLocation.add(x);
            mouseLocation.add(y);
            
            if (mouseClicks == 4)    
            {
                for (int i = 0; i < mouseLocation.size(); i++)
                {
                    mouseLocation.set(i, 0);
                }
            }
            
            repaint();
        }
        
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
        public void mousePressed(MouseEvent event) {}
        public void mouseReleased(MouseEvent event) {}
    }
    
    public static void main(String[] args)
    {
        TriangleViewer viewer = new TriangleViewer();
    }
}