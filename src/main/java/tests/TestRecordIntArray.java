package tests;
/**
 * Testa a imutabilidade da classe RecordIntArray.
 * Modifica o array original após a criação do objeto RecordIntArray
 * e verifica se o array interno do objeto permanece inalterado.
 * @author ChatGPT
 * @date 05/10/2025
 */
public class TestRecordIntArray {
    public static void main(String[] args) {
        /**
         * Cria um array original e um objeto RecordIntArray com esse array.
         * Modifica o array original e verifica se o array interno do objeto
         * RecordIntArray permanece inalterado.
         * @author ChatGPT
         * @date 05/10/2025
         */
        int[] originalArray = {1, 2, 3};
        RecordIntArray immutableObject = new RecordIntArray(originalArray);

        /**
         * Modifica o array original
         * para testar a imutabilidade do objeto RecordIntArray.
         * @author ChatGPT
         * @date 05/10/2025
         */
        originalArray[0] = 99;

        /**
         * Recupera o array do objeto RecordIntArray.
         * Deve retornar uma cópia do array interno,
         * que não deve ser afetada pela modificação do array original.
         * @author ChatGPT
         * @date 05/10/2025
         */
        int[] retrievedArray = immutableObject.values();


        /**
         * Imprime os arrays para verificar se o array interno do objeto
         * RecordIntArray permaneceu inalterado após a modificação do array original.
         * @author ChatGPT
         * @date 05/10/2025
         */
        System.out.println("Original array after modification: ");
        for (int value : originalArray) {
            System.out.print(value + " ");
        }
        /**
         * Imprime os valores do array interno do objeto RecordIntArray.
         * Deve mostrar os valores originais {1, 2, 3},
         * confirmando a imutabilidade.
         * @author ChatGPT
         * @date 05/10/2025
         */
        System.out.println("\nValues from RecordIntArray: ");
        for (int value : retrievedArray) {
            System.out.print(value + " ");
        }
    }
}
