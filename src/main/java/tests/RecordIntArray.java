package tests;

/**
 * Exemplo de classe imutável que possui um array de int.
 * A imutabilidade é garantida ao clonar o array tanto no construtor
 * quanto no método de acesso.
 * Isso evita que o array interno seja modificado externamente.
 * @author ChatGPT
 * @date 05/10/2025
 */
public record RecordIntArray(int[] values) {

    public RecordIntArray(int[] values) {
        this.values = values.clone(); // Store a copy
    }

    @Override
    public int[] values() {
        return values.clone(); // Return a copy
    }
}
