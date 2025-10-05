package tests;

import static immutability.Coin.PENNY;

/**
 * @see immutability.Coin
 * Essa classe demonstra o uso do enum Coin.
 * Ela acessa o valor de uma moeda específica (PENNY) e imprime esse valor.
 * O enum Coin é imutável, garantindo que os valores das moedas não possam ser alterados.
 * O uso do enum torna o código mais legível e fácil de manter.
 * A importação estática permite acessar os membros do enum diretamente sem precisar qualificar com o nome do enum.
 * Isso melhora a clareza do código ao trabalhar com constantes.
 * Usando importação estática para acessar diretamente o membro PENNY do enum Coin
 * sem precisar qualificar com o nome do enum.
 * Isso torna o código mais limpo e legível.
 * Além disso, reforça a ideia de que estamos lidando com uma constante específica.
 */
public class EnumTest {
    public static void main(String[] args) {
        var valueCoin = PENNY.getValue();
        System.out.println("The value of a penny is: " + valueCoin + ".");
    }
}
