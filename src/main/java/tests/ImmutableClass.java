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

    /**
     * Retorna uma cópia do array interno para garantir a imutabilidade.
     * sobrescreve o método values() do record
     * para garantir que o array retornado seja uma cópia
     * e não o array interno original.
     * @return uma cópia do array de valores
     * @author ChatGPT
     * @date 05/10/2025
     */
    @Override
    public int[] values() {
        return values.clone(); // Return a copy
    }
}
