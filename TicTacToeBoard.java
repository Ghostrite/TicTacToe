import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


import javax.swing.JPanel;
public class TicTacToeBoard extends JPanel {
	private static final Component frame = null;


	int Cats = 0;
	
	
	int Oturn = 0;
	ArrayList<drawX> xList = new ArrayList<drawX>();
	ArrayList<drawO> OList = new ArrayList<drawO>();
	int answer = JOptionPane.showConfirmDialog(frame, "Do you want to play against a CPU?");
	
	int xCoord1 = 200;
	int xCoord2 = 400;
	int yCoord1 = 200;
	int yCoord2 = 400;
	int AI = 0;
	List<String> xLogList = new ArrayList<String>();
	List<String> oLogList = new ArrayList<String>();
	
	
	public TicTacToeBoard() {
		setSize(322,422);
		setBackground(Color.white);
		
		JacobMouse j = new JacobMouse();
		addMouseListener(j);
		
		
	}
	public void paintComponent(Graphics g) {
		if (answer == JOptionPane.YES_OPTION) {
		     AI = 1;
		     }
		Font myFont = new Font("Comic Sans MS", Font.BOLD, 18);
		Font myFont2 = new Font("Comic Sans MS", Font.BOLD, 36);
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
		int counterX = 0;
		int counterO = 0;
		
		for (TicTacToeBoard.drawO thisO : OList) {
			
			g.drawString("O", thisO.xCoord, thisO.yCoord);
			counterO = counterO + 1;
		}
		for (TicTacToeBoard.drawX thisX : xList) {
			
			g.drawString("X", thisX.xCoord, thisX.yCoord);
			 counterX = counterX + 1;
		}
		if (xLogList.contains("top right") && xLogList.contains("top left") && xLogList.contains("top middle") || 
				xLogList.contains("top right") && xLogList.contains("middle right") && xLogList.contains("bottom right") ||
				xLogList.contains("top right") && xLogList.contains("middle middle") && xLogList.contains("bottom left") ||
				xLogList.contains("top left") && xLogList.contains("middle left") && xLogList.contains("bottom left") ||
				xLogList.contains("top left") && xLogList.contains("middle middle") && xLogList.contains("bottom right") ||
				xLogList.contains("middle left") && xLogList.contains("middle middle") && xLogList.contains("middle right") ||
				xLogList.contains("top middle") && xLogList.contains("middle middle") && xLogList.contains("bottom middle") ||
				xLogList.contains("bottom left") && xLogList.contains("bottom middle") && xLogList.contains("bottom right")
				) {
			
				System.out.println("X wins");
		if (xLogList.contains("top right") && xLogList.contains("top left") && xLogList.contains("top middle")){
			g2.draw(new Line2D.Double(xCoord1-100, yCoord1-85, xCoord2+105, yCoord1-85));
		}
		if (xLogList.contains("top right") && xLogList.contains("middle right") && xLogList.contains("bottom right")) {
			g2.draw(new Line2D.Double(xCoord2+105, yCoord1-85, xCoord2+105, yCoord2+75));
		}
		if(xLogList.contains("top right") && xLogList.contains("middle middle") && xLogList.contains("bottom left")) {
			g2.draw(new Line2D.Double(xCoord2+105, yCoord1-85, xCoord1-100, yCoord2+80));
		}
		if(xLogList.contains("top left") && xLogList.contains("middle left") && xLogList.contains("bottom left")) {
			g2.draw(new Line2D.Double(xCoord1-95, yCoord1-85, xCoord1-95, yCoord2+80));
		}
		if(xLogList.contains("top left") && xLogList.contains("middle middle") && xLogList.contains("bottom right")) {
			g2.draw(new Line2D.Double(xCoord1-95, yCoord1-85, xCoord2+105, yCoord2+75));
		}
		if(xLogList.contains("middle left") && xLogList.contains("middle middle") && xLogList.contains("middle right")) {
			g2.draw(new Line2D.Double(xCoord1-95, yCoord1+85, xCoord2+105, yCoord1+85));
		}
		if(xLogList.contains("top middle") && xLogList.contains("middle middle") && xLogList.contains("bottom middle")) {
			g2.draw(new Line2D.Double(xCoord1+105, yCoord1-85, xCoord1+105, yCoord2+85));
		}
		if(xLogList.contains("bottom left") && xLogList.contains("bottom middle") && xLogList.contains("bottom right")) {
			g2.draw(new Line2D.Double(xCoord1-105, yCoord2+70, xCoord2+105, yCoord2+70));
		}
		Cats = 1;
		g.drawString("X's WINS!.",180,((645-myFont2.getSize()/2 + myFont2.getSize())));
		}
		

		if (oLogList.contains("top right") && oLogList.contains("top left") && oLogList.contains("top middle") || 
				oLogList.contains("top right") && oLogList.contains("middle right") && oLogList.contains("bottom right") ||
				oLogList.contains("top right") && oLogList.contains("middle middle") && oLogList.contains("bottom left") ||
				oLogList.contains("top left") && oLogList.contains("middle left") && oLogList.contains("bottom left") ||
				oLogList.contains("top left") && oLogList.contains("middle middle") && oLogList.contains("bottom right") ||
				oLogList.contains("middle left") && oLogList.contains("middle middle") && oLogList.contains("middle right") ||
				oLogList.contains("top middle") && oLogList.contains("middle middle") && oLogList.contains("bottom middle") ||
				oLogList.contains("bottom left") && oLogList.contains("bottom middle") && oLogList.contains("bottom right")
				) {
			
			System.out.println("O wins");
			
			Cats = 1;
			if (oLogList.contains("top right") && oLogList.contains("top left") && oLogList.contains("top middle")){
				g2.draw(new Line2D.Double(xCoord1-100, yCoord1-85, xCoord2+105, yCoord1-85));
			}
			if (oLogList.contains("top right") && oLogList.contains("middle right") && oLogList.contains("bottom right")) {
				g2.draw(new Line2D.Double(xCoord2+105, yCoord1-85, xCoord2+105, yCoord2+75));
			}
			if(oLogList.contains("top right") && oLogList.contains("middle middle") && oLogList.contains("bottom left")) {
				g2.draw(new Line2D.Double(xCoord2+105, yCoord1-85, xCoord1-100, yCoord2+80));
			}
			if(oLogList.contains("top left") && oLogList.contains("middle left") && oLogList.contains("bottom left")) {
				g2.draw(new Line2D.Double(xCoord1-95, yCoord1-85, xCoord1-95, yCoord2+80));
			}
			if(oLogList.contains("top left") && oLogList.contains("middle middle") && oLogList.contains("bottom right")) {
				g2.draw(new Line2D.Double(xCoord1-95, yCoord1-85, xCoord2+105, yCoord2+75));
			}
			if(oLogList.contains("middle left") && oLogList.contains("middle middle") && oLogList.contains("middle right")) {
				g2.draw(new Line2D.Double(xCoord1-95, yCoord1+85, xCoord2+105, yCoord1+85));
			}
			if(oLogList.contains("top middle") && oLogList.contains("middle middle") && oLogList.contains("bottom middle")) {
				g2.draw(new Line2D.Double(xCoord1+105, yCoord1-85, xCoord1+105, yCoord2+85));
			}
			if(oLogList.contains("bottom left") && oLogList.contains("bottom middle") && oLogList.contains("bottom right")) {
				g2.draw(new Line2D.Double(xCoord1-105, yCoord2+70, xCoord2+105, yCoord2+70));
			}
			g.drawString("O's WINS!.",180,((645-myFont2.getSize()/2 + myFont2.getSize())));
			Cats = 1;
			}
		
		if((counterO == 4 && counterX ==5 && Cats !=1)|| (counterO == 5 && counterX == 4 && Cats !=1)) {
			g.drawString("Cats game!",180,((645-myFont2.getSize()/2 + myFont2.getSize())));
			Cats = 1;
		}
		if (Cats == 1) {
			return;
		}
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
			if (Cats == 1) {
				return;}
			//top left
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
				if (AI == 1 && Oturn ==1) {
				if (!oLogList.contains("bottom right") && !xLogList.contains("bottom right")) {
					drawO o = new drawO(xCoord2+100,yCoord2+75);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("bottom right");
					OList.add(o);
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
				else if (Oturn == 1 && !oLogList.contains("bottom left") && !xLogList.contains("bottom left")) {
					drawO o = new drawO(xCoord1-100,yCoord2+75);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("bottom left");
					OList.add(o);
					repaint();
				}
				else if (Oturn == 1 && !oLogList.contains("middle right") && !xLogList.contains("middle right")) {
					drawO o = new drawO(xCoord2+100,yCoord1+95);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("middle right");
					OList.add(o);
					repaint();
				}
				else if (Oturn == 1 && !oLogList.contains("middle middle") && !xLogList.contains("middle middle")) {
					drawO o = new drawO(xCoord1+100,yCoord1+95);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("middle middle");
					OList.add(o);
					repaint();
				}
				else if (Oturn == 1 && !oLogList.contains("middle left") && !xLogList.contains("middle left")) {
					drawO o = new drawO(xCoord1-100,yCoord1+95);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("middle left");
					OList.add(o);
					repaint();
				}
				else if (Oturn == 1 && !oLogList.contains("bottom middle") && !xLogList.contains("bottom middle")) {
					drawO o = new drawO(xCoord1+100,yCoord2+75);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("bottom middle");
					OList.add(o);
					repaint();
				}
				else if (Oturn == 1 && !oLogList.contains("top middle") && !xLogList.contains("top middle")) {
					drawO o = new drawO(xCoord1+100,yCoord1-75);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("top middle");
					OList.add(o);
					repaint();
				}
				else if (Oturn == 1 && !oLogList.contains("top left") && !xLogList.contains("top left")) {
					drawO o = new drawO(xCoord1-100,yCoord1-75);
					System.out.println("Player 1's turn");;
					Oturn = 0;
					oLogList.add("top left");
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