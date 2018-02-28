import javax.swing.JFrame;

public class TictactoeMain {
	
	public static void main(String[] args) {
		
		
		createAndShowGUI();
		
	}
	private static void createAndShowGUI()
	{
		TicTacToeBoard board = new TicTacToeBoard();
		JFrame frame = new JFrame("Tic Tac Toe baord");
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		frame.add(board);
		frame.setSize(622, 722);
		frame.setVisible(true);
	}
}