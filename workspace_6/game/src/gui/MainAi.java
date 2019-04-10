package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import ai.AlphaBetaPrunning;
import caro.*;
import util.Function;
import util.ShowMessage;

public class MainAi extends JPanel implements MouseListener, MouseMotionListener {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public static final int SIZEBOX = 25; // số dòng và hàng
	public static final int OFFSET = 55;
	private static final int WEIGHT = 720, HEIGHT = 740;
	private static final int SQUAD = 24; // kích thước ô vuông
	public static final int DEPTH = 2;
	private GameState gameState;
	private static JFrame frame;
	private int victory, drawX, drawY;
	public static boolean ok = false;
	public JPanel panel;
	public static JButton btnewGame;

	public MainAi() {
		gameState = new GameState(Player.AI); // cho máy đi trước
		victory = -1;
		gameState.addSquare(new Square(12, 12)); // vị trí của máy
		addMouseMotionListener(this);
		addMouseListener(this);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//
		//
		for (int i = 0; i <= SIZEBOX; i++) {
			g.drawLine(SQUAD * i + OFFSET, OFFSET, SQUAD * i + OFFSET, SQUAD * SIZEBOX + OFFSET);
		}
		for (int i = 0; i <= SIZEBOX; i++) {
			g.drawLine(OFFSET, SQUAD * i + OFFSET, SQUAD * SIZEBOX + OFFSET, SQUAD * i + OFFSET);
		}
		//
		g.drawString("Toa do: (" + drawX + "," + drawY + ")", 200, 20);
		//
		ArrayList<Piece> move = gameState.getMove();
		for (int i = 0; i < move.size(); i++) {
			Piece piece = move.get(i);
			g.drawImage(piece.getPlayer().getImg(), SQUAD * piece.getSquare().getCoordX() + OFFSET,
					SQUAD * piece.getSquare().getCoordY() + OFFSET, this);
		}
		Font defaultFont = g.getFont();

		//
		if (CheckFinal() == 1) {
			//
			g.setFont(new Font(defaultFont.getFontName(), 1, 14));
			g.drawString("AI (1) wins!", 70, 30);
			g.setFont(defaultFont);
			//
			drawTable(g);
			//

		} else if (CheckFinal() == 2) {
			//
			g.setFont(new Font(defaultFont.getFontName(), 1, 14));
			g.drawString("HUMAN (2) wins!", 70, 30);
			g.setFont(defaultFont);
			// //
			drawTable(g); // xoa bang
			// InitGUI(); //
		}
		//
		repaint();
	}

	public void drawTable(Graphics g) {
		//
		//
		drawX = 0;
		drawY = 0;
		//
		for (int i = 0; i <= SIZEBOX; i++) {
			g.drawLine(SQUAD * i + OFFSET, OFFSET, SQUAD * i + OFFSET, SQUAD * SIZEBOX + OFFSET);
		}
		for (int i = 0; i <= SIZEBOX; i++) {
			g.drawLine(OFFSET, SQUAD * i + OFFSET, SQUAD * SIZEBOX + OFFSET, SQUAD * i + OFFSET);
		}
		//
		g.drawString("Toa do: (" + drawX + "," + drawY + ")", 200, 20);

		ArrayList<Piece> move = gameState.getMove();
		//
		move.clear();
		//
		for (int i = 0; i < move.size(); i++) {
			Piece piece = move.get(i);
			g.drawImage(piece.getPlayer().getImg(), SQUAD * piece.getSquare().getCoordX() + OFFSET,
					SQUAD * piece.getSquare().getCoordY() + OFFSET, this);
		}
	}

	public int CheckFinal() {
		//
		ShowMessage showMess = new ShowMessage();
		//
		if (Function.evaluate(gameState, Player.HM) >= 10000) {
			if (!showMess.showMessageHumanWin()) {
				System.exit(0);
			}
			return 2;
		} else if (Function.evaluate(gameState, Player.AI) >= 10000) {
			if (!showMess.showMessageAIWin()){
				System.exit(0);
			}
			return 1;
		} else {
			return 0;
		}
	}

	public static void InitGUI() {
		System.out.println("Play Game");
		frame = new JFrame();
		//
		btnewGame = new JButton("New Game");
		btnewGame.setBounds(0, 0, 100, 40);
		frame.add(btnewGame);
		
		btnewGame.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				ShowMessage sh = new ShowMessage();
				// TODO Auto-generated method stub
				if (e.getSource() == btnewGame) {
					if (sh.showMessageNewGame()) {						
						MainAi pnew = new MainAi();					
					}
				}
			}
		});
		
		//
		frame.add(new MainAi());
		frame.setTitle("Caro Game");
		frame.setSize(WEIGHT, HEIGHT);
		frame.setBackground(Color.GRAY);
		frame.setFocusable(true);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] ags) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		InitGUI();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int coordX = (e.getX() - OFFSET) / SQUAD;
		int coordY = (e.getY() - OFFSET) / SQUAD;
		//
		System.out.println(coordX + " " + coordY);
		Square square = new Square(coordX, coordY);
		//
		if (gameState.getCurrentPlayer() == Player.HM && e.getButton() == 1) {
			int[][] board = gameState.getBoard();
			if (board[coordX][coordY] == 0) {
				gameState.addSquare(square);
				//
				// System.out.println("Current Player" +
				// gameState.getCurrentPlayer());
				//
				Pair pair = AlphaBetaPrunning.searchAB(gameState);
				//
				System.out.println("Node = " + AlphaBetaPrunning.cnt);
				if (pair.getSquare() == null) {
					if (Function.evaluate(gameState, Player.HM) >= 10000) {
						victory = 2;
					} else {
						victory = 0;
					}
				} else {
					gameState.addSquare(pair.getSquare());
					if (Function.evaluate(gameState, Player.AI) >= 10000) {
						victory = 1;
					}
				}
			}
		}
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int coordX = (e.getX() - OFFSET) / SQUAD;
		int coordY = (e.getY() - OFFSET) / SQUAD;
		drawX = coordX;
		drawY = coordY;

		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
