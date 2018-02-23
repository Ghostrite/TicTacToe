import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.*;
import java.util.ArrayList;

import javax.swing.JPanel;
public class TicTacToeBoard extends JPanel {
	ArrayList<drawX> xList = new ArrayList<drawX>();
	ArrayList<drawO> OList = new ArrayList<drawO>();
	boolean Oturn = false;
	int xCoord1 = 200;
	int xCoord2 = 400;
	int yCoord1 = 200;
	int yCoord2 = 400;
	public TicTacToeBoard() {
		setSize(322,422);
		setBackground(Color.white);
		
		JacobMouse j = new JacobMouse();
		addMouseListener(j);
		
	}
	public void paintComponent(Graphics g) {
		Font myFont = new Font("Comic Sans MS", Font.BOLD, 18);
		g.setColor(Color.black);
		g.setFont(myFont);
		g.drawString("Nicks TicTacToe Board",40,((10-myFont.getSize()/2 + myFont.getSize())));
		g.drawString("Click on a square in order to place",0,((320-myFont.getSize()/2 + myFont.getSize())));
		g.drawString("Your X or O. X goes first",0,((340-myFont.getSize()/2 + myFont.getSize())));
		Graphics2D g2 = (Graphics2D) g;
		
		g2.draw(new Line2D.Double( xCoord1, 60, xCoord1, 550));
		g2.draw(new Line2D.Double( xCoord2, 60, xCoord2, 550));
		g2.draw(new Line2D.Double( 10, yCoord1, 600, yCoord1));
		g2.draw(new Line2D.Double( 10, yCoord2, 600, yCoord2));
		
		
		
		for (TicTacToeBoard.drawX thisX : xList) {
			
			g.drawString("X", thisX.xCoord, thisX.yCoord);
		
		for (TicTacToeBoard.drawO thisO : OList) {
				
				g.drawString("O", thisO.xCoord, thisO.yCoord);
			
		
			
		}
		
			
		}
		//drawX testX = new drawX(200,200);
		//g.drawString("X", textX.xCoord, textX.yCoord);
		//drawO testO = new drawO(200,200);
		//g.drawString("X", textO.xCoord, textO.yCoord);
	}
	
	
	class drawX {
		int xCoord = 200;
		int yCoord = 200;
		
		public drawX(int xCoord ,int yCoord) {
			this.xCoord = xCoord;
			this.yCoord = yCoord;
		}
	}
	class drawO {
			int xCoord = 200;
			int yCoord = 200;
			
			public drawO(int xCoord ,int yCoord) {
				this.xCoord = xCoord;
				this.yCoord = yCoord;
			}
		}
		
		
	class JacobMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			//top left
			System.out.println(e.getX() + " " + e.getY());
			if (e.getX() < xCoord1 && e.getY() < yCoord1) {
			drawX x = new drawX(50,90);
			System.out.println("test");
			Oturn = false;
			xList.add(x);
			repaint();
			}
			//top middle
			if (e.getX() > xCoord1 && e.getY() < yCoord1 && e.getX() < xCoord2) {
				if (Oturn = false) {
				drawX x = new drawX(130,90);
				System.out.println("Player 2's turn");
				System.out.println(Oturn);
				xList.add(x);
				Oturn = false;
				repaint();
				}
				if (Oturn = true) {
					drawO o = new drawO(130,90);
					System.out.println("Player 1's turn");
					System.out.println(Oturn);
					OList.add(o);
					repaint();
					Oturn = false;
				}
			}
			//top right
			if (e.getX() > xCoord2 && e.getY() < yCoord1) {
				drawX x = new drawX(210,90);
				System.out.println("test");
				xList.add(x);
				Oturn = true;
				repaint();
				}
			//middle left
			if (e.getX() < xCoord1 && e.getY() > yCoord1 && e.getY() < yCoord2) {
				drawX x = new drawX(50,180);
				System.out.println("test");
				xList.add(x);
				Oturn = true;
				repaint();
				}
			//middle middle
			if (e.getX() > xCoord1 && e.getY() > yCoord1 && e.getX() < xCoord2 && e.getY() < yCoord2 ) {
				drawX x = new drawX(140,180);
				System.out.println("test");
				xList.add(x);
				Oturn = true;
				repaint();
				}
			//middle right
			if (e.getX() > xCoord2 && e.getY() > yCoord1 && e.getY() < yCoord2) {
				drawX x = new drawX(220,180);
				System.out.println("test");
				xList.add(x);
				Oturn = true;
				repaint();
				}
			//bottom left
			if (e.getX() < xCoord1 && e.getY() > yCoord2) {
				drawX x = new drawX(40,260);
				System.out.println("test");
				Oturn = true;
				xList.add(x);
				repaint();
				}
			//bottom middle
			if (e.getX() > xCoord1 && e.getY() > yCoord2 && e.getX() < xCoord2 ) {
				drawX x = new drawX(140,260);
				System.out.println("test");
				Oturn = true;
				xList.add(x);
				repaint();
				}
			//bottom right
			if (e.getX() > xCoord2 && e.getY() > yCoord2) {
				drawX x = new drawX(220,260);
				System.out.println("test");
				Oturn = true;
				xList.add(x);
				repaint();
				}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
			
		}
	}

