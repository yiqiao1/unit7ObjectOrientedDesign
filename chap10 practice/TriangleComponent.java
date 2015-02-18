import javax.swing.JComponent;

public class TriangleComponent extends JComponent
{
    private Point2D points[];
    private int numPoints;
    
    private static final int MAX_POINTS = 3;
    
    public TriangleComponent()
    {
        this.points = new Points2D[MAX_POINTS];
        this.numPoints = 0;
        this.addMouseListener(new MouseClickListener());
    }
    
    public void setPoint(int x, int y)
    {
        if (this.numPoints < MAX_POINTS)
        {
            points[numPoints] = new Point2D.Double(x, y);
            numPoints++;
        }
        else
        {
            numPoints = 0;
        }
        
        this.repaint();
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        if (this.numPoints > 0)
        {
            g2.draw(new Ellipse2D.Double(this.points[0].getX(),
                this.points[0].getY(), 1, 1));
        }
        if (this.numPoints > 1)
        {
            g2.draw(newLine2D.Double(this.points[0], this.points[1]));
        }
        if(this.numPoints > 2)
        {
            g2.draw(new Line2D.Double(this.points[1], this.points[2]));
            g2.draw(new Line2D.Double(this.points[2], this.points[3]));
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
        
        }
        
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
        public void mousePressed(MouseEvent event) {}
        public void mouseReleased(MouseEvent event) {}

    }
} 
