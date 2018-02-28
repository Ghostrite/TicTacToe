import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
public class TicTacToeBoard extends JPanel {
	int Oturn = 0;
	ArrayList<drawX> xList = new ArrayList<drawX>();
	ArrayList<drawO> OList = new ArrayList<drawO>();
	int xCoord1 = 200;
	int xCoord2 = 400;
	int yCoord1 = 200;
	int yCoord2 = 400;
	List<String> xLogList = new ArrayList<String>();
	List<String> oLogList = new ArrayList<String>();
	
	
	
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
		g.drawString("Nicks TicTacToe Board",180,((20-myFont.getSize()/2 + myFont.getSize())));
		g.drawString("Click on a square in order to place",180,((580-myFont.getSize()/2 + myFont.getSize())));
		g.drawString("your X or O. X goes first.",180,((600-myFont.getSize()/2 + myFont.getSize())));
		Graphics2D g2 = (Graphics2D) g;
		
		g2.draw(new Line2D.Double( xCoord1, 60, xCoord1, 550));
		g2.draw(new Line2D.Double( xCoord2, 60, xCoord2, 550));
		g2.draw(new Line2D.Double( 10, yCoord1, 600, yCoord1));
		g2.draw(new Line2D.Double( 10, yCoord2, 600, yCoord2));
		
		
		for (TicTacToeBoard.drawO thisO : OList) {
			
			g.drawString("O", thisO.xCoord, thisO.yCoord);
		}
		for (TicTacToeBoard.drawX thisX : xList) {
			
			g.drawString("X", thisX.xCoord, thisX.yCoord);
		
		
		
			
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
				if (Oturn == 0 && !oLogList.contains("top left") && !xLogList.contains("top left")) {
			drawX x = new drawX(xCoord1-100,yCoord1-75);
			Oturn=1;
			xLogList.add("top left");
			System.out.println(xLogList);
			System.out.println("Player 2's turn");
			xList.add(x);
			repaint();}
				else if (Oturn == 1 && !oLogList.contains("top left") && !xLogList.contains("top left")) {
					drawO o = new drawO(xCoord1-100,yCoord1-75);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("top left");
					OList.add(o);
					repaint();
				}
			}
			//top middle
			if (e.getX() > xCoord1 && e.getY() < yCoord1 && e.getX() < xCoord2) {
				if (Oturn == 0 && !oLogList.contains("top middle") && !xLogList.contains("top middle")) {
				drawX x = new drawX(xCoord1+100,yCoord1-75);
				System.out.println("Player 2's turn");
				Oturn = 1;
				xLogList.add("top middle");
				xList.add(x);
				repaint();}
				else if (Oturn == 1 && !oLogList.contains("top middle") && !xLogList.contains("top middle")) {
					drawO o = new drawO(xCoord1+100,yCoord1-75);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("top middle");
					OList.add(o);
					repaint();
				}
			}
			//top right
			if (e.getX() > xCoord2 && e.getY() < yCoord1) {
				if (Oturn == 0 && !oLogList.contains("top right") && !xLogList.contains("top right")) {
				drawX x = new drawX(xCoord2+100,yCoord1-75);
				System.out.println("Player 2's turn");
				Oturn = 1;
				xList.add(x);
				xLogList.add("top right");
				repaint();
				}
				else if (Oturn == 1 && !oLogList.contains("top right") && !xLogList.contains("top right")) {
					drawO o = new drawO(xCoord2+100,yCoord1-75);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("top right");
					OList.add(o);
					repaint();
				}
				}
				
			//middle left
			if (e.getX() < xCoord1 && e.getY() > yCoord1 && e.getY() < yCoord2) {
				if (Oturn == 0 && !oLogList.contains("middle left") && !xLogList.contains("middle left")) {
				drawX x = new drawX(xCoord1-100,yCoord1+95);
				System.out.println("Player 2's turn");
				Oturn = 1;
				xLogList.add("middle left");
				xList.add(x);
				repaint();}
				else if (Oturn == 1 && !oLogList.contains("middle left") && !xLogList.contains("middle left")) {
					drawO o = new drawO(xCoord1-100,yCoord1+95);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("middle left");
					OList.add(o);
					repaint();
				}
				}
			//middle middle
			if (e.getX() > xCoord1 && e.getY() > yCoord1 && e.getX() < xCoord2 && e.getY() < yCoord2 ) {
				if (Oturn == 0 && !oLogList.contains("middle middle") && !xLogList.contains("middle middle")) {
				drawX x = new drawX(xCoord1+100,yCoord1+95);
				System.out.println("Player 2's turn");
				Oturn = 1;
				xLogList.add("middle middle");
				xList.add(x);
				repaint();}
				else if (Oturn == 1 && !oLogList.contains("middle middle") && !xLogList.contains("middle middle")) {
					drawO o = new drawO(xCoord1+100,yCoord1+95);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("middle middle");
					OList.add(o);
					repaint();
				}
				
				}
			//middle right
			if (e.getX() > xCoord2 && e.getY() > yCoord1 && e.getY() < yCoord2) {
				if (Oturn == 0 && !oLogList.contains("middle right") && !xLogList.contains("middle right")) {
				drawX x = new drawX(xCoord2+100,yCoord1+95);
				System.out.println("Player 2's turn");
				Oturn = 1;
				xList.add(x);
				xLogList.add("middle right");
				repaint();}
				else if (Oturn == 1 && !oLogList.contains("middle right") && !xLogList.contains("middle right")) {
					drawO o = new drawO(xCoord2+100,yCoord1+95);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("middle right");
					OList.add(o);
					repaint();
				}
				}
			//bottom left
			if (e.getX() < xCoord1 && e.getY() > yCoord2) {
				if (Oturn == 0 && !oLogList.contains("bottom left") && !xLogList.contains("bottom left")) {
				drawX x = new drawX(xCoord1-100,yCoord2+75);
				System.out.println("Player 2's turn");
				Oturn = 1;
				xLogList.add("bottom left");
				xList.add(x);
				repaint();}
				else if (Oturn == 1 && !oLogList.contains("bottom left") && !xLogList.contains("bottom left")) {
					drawO o = new drawO(xCoord1-100,yCoord2+75);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("bottom left");
					OList.add(o);
					repaint();
				}
				}
			//bottom middle
			if (e.getX() > xCoord1 && e.getY() > yCoord2 && e.getX() < xCoord2 ) {
				if (Oturn == 0 && !oLogList.contains("bottom middle") && !xLogList.contains("bottom middle")) {
				drawX x = new drawX(xCoord1+100,yCoord2+75);
				System.out.println("Player 2's turn");
				Oturn = 1;
				xLogList.add("bottom middle");
				xList.add(x);
				repaint();}
				else if (Oturn == 1 && !oLogList.contains("bottom middle") && !xLogList.contains("bottom middle")) {
					drawO o = new drawO(xCoord1+100,yCoord2+75);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("bottom middle");
					OList.add(o);
					repaint();
				}
				}
			//bottom right
			if (e.getX() > xCoord2 && e.getY() > yCoord2) {
				if (Oturn == 0 && !xLogList.contains("bottom right") && !oLogList.contains("bottom right")) {
				drawX x = new drawX(xCoord2+100,yCoord2+75);
				System.out.println("Player 2's turn");
				xLogList.add("bottom right");
				Oturn = 1;
				xList.add(x);
				repaint();}
				else if (Oturn == 1 && !oLogList.contains("bottom right") && !xLogList.contains("bottom right")) {
					drawO o = new drawO(xCoord2+100,yCoord2+75);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("bottom right");
					OList.add(o);
					repaint();
				}
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