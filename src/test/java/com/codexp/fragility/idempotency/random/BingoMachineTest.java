package com.codexp.fragility.idempotency.random;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BingoMachineTest {

    @Test
    @Disabled("To have the tests running for the other exercises")
    public void should_be_able_to_draw_a_ball(){
        BingoMachine bingo = new BingoMachine();
        String ball = bingo.draw();
        assertThat(ball, is("A1"));
    }

    @Test
    @Disabled("To have the tests running for the other exercises")
    public void should_be_able_to_draw_a_bingo_column(){
        BingoMachine bingo = new BingoMachine();
        String ball1 = bingo.draw();
        String ball2 = bingo.draw();
        String ball3 = bingo.draw();
        String ball4 = bingo.draw();
        String ball5 = bingo.draw();

        assertThat(ball1, is("A1"));
        assertThat(ball1, is("A2"));
        assertThat(ball1, is("A3"));
        assertThat(ball1, is("A4"));
        assertThat(ball1, is("A5"));
    }
}
