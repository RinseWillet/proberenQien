/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */

 /*
 *
 * @author Willet
 *
 * Ganzenbord
 * skeleton program derived from https://github.com/Geuskensruud/Ganzenbord/blob/master/Ganzenbord.java 18-5-2020 - Geuskensruud;
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class GanzenbordMain {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Player> playerList = new ArrayList<Player>();
    static int cycle;
    static boolean game = true;
    static boolean winner = false;
    static int numberOfPlayers;
    static int index;
    static int TrapCell;

    public static void main(String[] args) {

        //Add new players to ArrayList
        addPlayers();
        Random random = new Random();
        cycle = 1;
        TrapCell = 0;

        while (game) {                                          //as long as game is true - there is a game
            if (cycle % numberOfPlayers == 0) {
                index = numberOfPlayers;
            } else {
                index = cycle % numberOfPlayers;
            }
            if (playerList.get(index).getWaitTurn() > 0) {
                System.out.println(playerList.get(index).getName() + " moet een beurt overslaan.");

                playerList.get(index).waitTurnReduction();
                cycle++;

                if (cycle % numberOfPlayers == 0) {
                    index = numberOfPlayers;
                } else {
                    index = cycle % numberOfPlayers;
                }

            }
            System.out.println(" ");
            System.out.println("Gooi je dobbelsteen (g):");
            while (!"g".equals(scan.nextLine())) {
                continue;

            }

            cycle++;
            int diceThrow = random.nextInt(6) + 1;
            System.out.println(playerList.get(index).getName() + ", je hebt " + diceThrow + " gegooid.");
            playerList.get(index).moveForward(diceThrow);

            //endgame rules
            if (playerList.get(index).getPosition() == 63) {
                game = false;
                winner = true;
                System.out.println("--********** " + playerList.get(index).getName() + " heeft gewonnen! **********--");
            }
            if (playerList.get(index).getPosition() > 63) {
                System.out.println("je staat nu voorbij het einde, op " + playerList.get(index).printPosition());
                System.out.println(playerList.get(index).getName() + ", je dacht zeker dat je er al was heh? Nou mooi niet! Ga maar het aantal stappen teveel terug.");
                int currentPosition = playerList.get(index).getPosition();
                int numberStepsBack = (currentPosition - 63) * 2;
                playerList.get(index).moveBackward(numberStepsBack);

            }

            //overige regels
            /* if (playerList.get(index).getPosition() == 10 || playerList.get(index).getPosition() == 20 || playerList.get(index).getPosition() == 30 || playerList.get(index).getPosition() == 40 || playerList.get(index).getPosition() == 50 || playerList.get(index).getPosition() == 60) {
                System.out.println("Je staat op " + playerList.get(index).printPosition() + ", Bonus stapjes!");
                playerList.get(index).moveForward(diceThrow);
                
            } */
 /*if (playerList.get(index).getPosition() == 23) {
                game = false;
                System.out.println("In de gevangenis, maat. Voie gras you will be!");
            } */
 /*if (playerList.get(index).getPosition() == 25 || playerList.get(index).getPosition() == 45) {
                System.out.println("Je staat nu op " + playerList.get(index).getPosition());
                playerList.get(index).setPosition(0);
                System.out.println("Terug naar start.");
            } */
            if (playerList.get(index).getPosition() == 6) {
                playerList.get(index).setPosition(12);
                System.out.println("Brug! Ga door naar vak 12.");
            }

            if (playerList.get(index).getPosition() == 19) {
                System.out.println("Je staat op vak 19, de Herberg. Eén beurt overslaan.");
                playerList.get(index).setWaitTurn(1);
            }

            if (playerList.get(index).getPosition() == 31) {

                if (TrapCell != 2) {
                    System.out.println("Je staat op vak 31, in de put. Wacht tot je door medespeler wordt bevrijd.");
                    playerList.get(index).setWaitTurn(1);
                    for (int i = 0; i < numberOfPlayers; i++) {

                        if (playerList.get(i).getPosition() == 31);
                        {
                            TrapCell++;
                        }
                    }
                } else {
                    continue;
                }

            }

            if (playerList.get(index).getPosition() == 42) {
                playerList.get(index).setPosition(39);
                System.out.println("Je staat nu op vak 42, en raad eens? Dat is het doolhof! Terug naar vak 39.");
            }

            if (playerList.get(index).getPosition() == 52) {
                System.out.println("Je staat op vak 52, de Gevangenis. Drie beurten overslaan.");
                playerList.get(index).setWaitTurn(3);
            }

            if (playerList.get(index).getPosition() == 58) {
                playerList.get(index).setPosition(0);
                System.out.println("Vak 58 - vak des Doods, terug naar start.");

            } else {
                System.out.println("Je staat nu op " + playerList.get(index).printPosition() + ". Niks aan de hand.");

            }

        }
    }

    static void addPlayers() {
        System.out.println("Geef het aantal spelers in:");
        numberOfPlayers = scan.nextInt();
        System.out.println("Vul de namen in van de spelers:");

        for (int x = 0; x <= numberOfPlayers; x++) {
            String name = scan.nextLine();
            playerList.add(x, new Player(name));

        }
    }

}
