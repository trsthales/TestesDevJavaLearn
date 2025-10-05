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
    /**
     * Construtor que clona o array recebido para garantir a imutabilidade.
     * @author ChatGPT
     * @date 05/10/2025
     */
    public RecordIntArray(int[] values) {
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
