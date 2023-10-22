package com.jcgc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void lose_when_dice_number_is_too_low() {
        Dice dice = new Dice(6);
        Player player = new Player(dice, 3);
        assertEquals(false, player.play());
    }

}