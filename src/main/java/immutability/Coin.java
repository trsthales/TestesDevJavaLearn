package immutability;

/**
 * Esse enum representa moedas com seus respectivos valores.
 * Ele é imutável por natureza, já que os valores dos enums não podem
 * ser alterados após a definição.
 * Cada moeda tem um valor associado que pode ser acessado através do método getValue().
 * O construtor do enum é privado e é chamado apenas internamente para definir os valores.
 */
public enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    Coin(int value){
        this.value = value;
    }

    private final int value;

    public int getValue() {
        return value;
    }
}
