package demo;

/*
 * Player.java
 * 
 * Name: Javier Chavez
 * Email: javierc@unm.edu
 * Sept. 4 2013
 * CS 251 Lab 2
 * 
 */

import cs251.lab2.GomokuModel;
import cs251.lab2.GomokuModel.Outcome;
import cs251.lab2.GomokuModel.Square;

public class Player{
    private Square symbol;
    private boolean isComputer;
    
    
    public Player(Square s, boolean c) {
        this.setComputer(c);
        this.setSymbol(s);
    }
    
    public Outcome getOutcome(){
        if (getSymbol() == GomokuModel.Square.CROSS) {
            return Outcome.CROSS_WINS;
        } else {
            return Outcome.RING_WINS;
        }
    }
    public boolean isComputer() {
        return isComputer;
    }
    public void setComputer(boolean isComputer) {
        this.isComputer = isComputer;
    }

    public Square getSymbol() {
        return symbol;
    }

    private void setSymbol(Square symbol) {
        this.symbol = symbol;
    }

        
}