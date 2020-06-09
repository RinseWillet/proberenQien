/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Willet
 */
public class Player {

    private String name;
    private int position;
    private int waitTurn;

    //constructor
    public Player(String name) {

        this.name = name;
        this.position = 0;
    }
// methods name of the player

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//methods position of the player

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void moveForward(int throwDice) {
        this.position += throwDice;
    }

    public void moveBackward(int throwDice) {
        this.position -= throwDice;
    }

    public void setWaitTurn(int numberturns) {
        this.waitTurn = numberturns;
    }
    public int getWaitTurn() {
        return this.waitTurn;
    }

    public void waitTurnReduction() {
        this.waitTurn -= 1;
    }

    public String printPosition() {
        if (getPosition() == 0) {
            return "start";
        } else {
            return "vak " + String.valueOf(position);
        }
    }
}
