package tests;

import immutability.Coin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EnumTestTest {

    @Test
    void testEnumValues() {
        Coin[] coins = Coin.values();
        assertEquals(4, coins.length);
        assertEquals(Coin.PENNY, coins[0]);
        assertEquals(Coin.NICKEL, coins[1]);
        assertEquals(Coin.DIME, coins[2]);
        assertEquals(Coin.QUARTER, coins[3]);
    }
}