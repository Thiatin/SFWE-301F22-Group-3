package PracticeSystem;

import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.FontMetrics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Buttons extends JButton {
    private boolean mouseOver = false;
	private boolean mousePressed = false;

	public Buttons(String text){
		super(text);
		setOpaque(false);
		setFocusPainted(false);
		setBorderPainted(false);

		MouseAdapter mouseListener = new MouseAdapter(){

			@Override
			public void mousePressed(MouseEvent me){
				if(contains(me.getX(), me.getY())){
					mousePressed = true;
					repaint();
				}
			}

			@Override
			public void mouseReleased(MouseEvent me){
				mousePressed = false;
				repaint();
			}

			@Override
			public void mouseExited(MouseEvent me){
				mouseOver = false;
				mousePressed = false;
				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent me){
				mouseOver = contains(me.getX(), me.getY());
				repaint();
			}
		};

		addMouseListener(mouseListener);
		addMouseMotionListener(mouseListener);		
	}

	private int getWidthBoundary(){
		double Bound = (getWidth() * 1);
        int wBound = (int) Bound;
		return wBound;
	}

	@Override
	public Dimension getPreferredSize(){
		FontMetrics metrics = getGraphics().getFontMetrics(getFont());
		int minWidth = 20 + metrics.stringWidth("Resources");//setting every button to the width of resource button
        int minHeight = 20 + metrics.getHeight();
		return new Dimension(minWidth, minHeight);
	}

	@Override
	public boolean contains(int x, int y){
		return Point2D.distance(x, y, getWidth()/2, getHeight()/2) < getWidthBoundary()/2;
	}

	@Override
	public void paintComponent(Graphics g){

		if(mousePressed){
			g.setColor(Color.decode("#378DBD"));
		}
		else{
			g.setColor(Color.decode("#0C234B"));
		}

		if(mouseOver){
			g.setColor(Color.decode("#378DBD"));
		}
		else{
			g.setColor(Color.decode("#0C234B"));
		}

        g.fillRect(0, 0, getWidthBoundary(), getHeight());
		g.setColor(Color.WHITE);
		g.setFont(getFont());
		FontMetrics metrics = g.getFontMetrics(getFont());
		int stringWidth = metrics.stringWidth(getText());
		int stringHeight = metrics.getHeight();
		g.drawString(getText(), getWidth()/2 - stringWidth/2, getHeight()/2 + stringHeight/4);
	}
}

