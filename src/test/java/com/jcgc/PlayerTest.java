package com.jcgc;

import com.jcgc.player.Dice;
import com.jcgc.player.Player;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void lose_when_dice_number_is_too_low() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 3);
        assertFalse(player.play());
    }

    @Test
    public void wins_when_dice_number_is_big() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }

}