package tests;

/**
 * Exemplo de classe imutável que utiliza um array.
 * A imutabilidade é garantida ao clonar o array tanto no construtor
 * quanto no método de acesso.
 * Isso evita que o array interno seja modificado externamente.
 * @author ChatGPT
 * @date 05/10/2025
 */
public record ImmutableClass(int[] values) {

    public ImmutableClass(int[] values) {
        this.values = values.clone(); // Store a copy
    }

    @Override
    public int[] values() {
        return values.clone(); // Return a copy
    }
}
