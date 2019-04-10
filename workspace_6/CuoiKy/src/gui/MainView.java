package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import ai.AlphaBetaPrunning;
import caro.*;
import util.Function;

public class MainView extends JPanel implements MouseListener, MouseMotionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public static final int SIZEX = 25;
    public static final int SIZEY = 25;
    public static final int OFFSET = 60;
    private static final int WEIGHT = 600, HEIGHT = 600;
    private static final int SQUAD = 32;
    public static final int DEPTH = 2;
    private GameState gameState;
    private int victory;
    private int drawX;
    private int drawY;
    public static boolean ok = false;

    public MainView() {
        gameState = new GameState(Player.BLACK);
        victory = -1;
        gameState.addSquare(new Square(SIZEX / 2, SIZEY / 2));
        addMouseMotionListener(this);
        addMouseListener(this);

    }

    /**
     * This is the function repaint of class MainView, it overrides the parent
     * class JPanel
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i <= SIZEX; i++) {
            g.drawLine(SQUAD * i + OFFSET, OFFSET, SQUAD * i + OFFSET, SQUAD * SIZEY + OFFSET);
        }
        for (int i = 0; i <= SIZEY; i++) {
            g.drawLine(OFFSET, SQUAD * i + OFFSET, SQUAD * SIZEX + OFFSET, SQUAD * i + OFFSET);
        }
        g.drawString("(" + drawX + "," + drawY + ")", 20, 20);
        ArrayList<Piece> move = gameState.getMove();
        for (int i = 0; i < move.size(); i++) {
            Piece piece = move.get(i);
            
            g.drawImage(piece.getPlayer().getImg(), SQUAD * piece.getSquare().getCoordX() + OFFSET,
                    SQUAD * piece.getSquare().getCoordY() + OFFSET, this);
        }
        Font defaultFont = g.getFont();
        switch (victory) {
            case 1:
                g.setFont(new Font(defaultFont.getFontName(), 1, 30));
                g.drawString("AI (BLACK) wins!", 50, 50);
                g.setFont(defaultFont);
                break;
            case 2:
                g.setFont(new Font(defaultFont.getFontName(), 1, 30));
                g.drawString("HUMAN (WHITE) wins!", 50, 50);
                g.setFont(defaultFont);
                break;
            case 0:
                g.setFont(new Font(defaultFont.getFontName(), 1, 30));
                g.drawString("DRAW!", 50, 50);
                g.setFont(defaultFont);
                break;
            default:
                break;
        }
    }

    public static void main(String[] ags) {
    	try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println("play");
        JFrame frame = new JFrame();
        frame.add(new MainView());
        frame.setTitle("Gomoku Game");
        frame.setSize(WEIGHT, HEIGHT);
        frame.setBackground(Color.GRAY);
        frame.setFocusable(true);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        int coordX = (e.getX() - OFFSET) / SQUAD;
        int coordY = (e.getY() - OFFSET) / SQUAD;
        System.out.println(coordX + " " + coordY);
        Square square = new Square(coordX, coordY);
        if (gameState.getCurrentPlayer() == Player.WHITE && e.getButton() == 1) {
            int[][] board = gameState.getBoard();
            if (board[coordX][coordY] == 0) {
                gameState.addSquare(square);
                //System.out.println("Current Player" + gameState.getCurrentPlayer());
                Pair pair = AlphaBetaPrunning.search(gameState);
                System.out.println("Node = " + AlphaBetaPrunning.cnt);
                if (pair.getSquare() == null) {
                    if (Function.evaluate(gameState, Player.WHITE) >= 10000) {
                        victory = 2;
                    } else {
                        victory = 0;
                    }
                } else {
                    gameState.addSquare(pair.getSquare());
                    if (Function.evaluate(gameState, Player.BLACK) >= 10000) {
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
