package com.qa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    App app = new App();


    @Test
    public void blackjackTest() {

        assertEquals(21, app.blackjack(10, 21));
        assertEquals(20, app.blackjack(20, 18));
        assertEquals(1, app.blackjack(1, 22));
        assertEquals(0, app.blackjack(22, 23));

    }
}
