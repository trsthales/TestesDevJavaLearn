package tests;

import immutability.Coin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testes unitários para a enum Coin.
 * Verifica se os valores e a ordem dos enums estão corretos.
 * Cada enum é imutável e os seus valores não podem ser alterados.
 * Asserta que a quantidade de enums e os seus valores correspondem ao esperado.
 * @author ChatGPT
 * @date 05/10/2025
 */
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