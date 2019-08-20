package com.qa;

/**
 * Hello world!
 *
 */
public class App {

    public int blackjack(int player1, int player2) {
        if (player1 >= player2 && player1 <= 21) {
            return player1;
        }else if (player1 >= player2 && player2 <= 21) {
            return player2;
        }else if (player2 >= player1 && player2<=21) {
            return player2;
        }else if (player2 >= player1 && player1 <=21) {
            return player1;
        }else {
            return 0;
        }
    }
}
