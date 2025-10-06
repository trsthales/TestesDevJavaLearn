package patternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe de teste para correspondência de padrões usando expressões regulares.
 * Utiliza a classe Pattern e Matcher do pacote java.util.regex para encontrar
 * ocorrências de um padrão específico mum texto.
 * @author ChatGPT
 * @date 05/11/2025
 */
public class PatternMatchingTest {
    public static void main(String[] args) {
        /**
         * Declaração de uma “string” contendo um soneto.
         * Usada para demonstração de correspondência de padrões.
         * @author ChatGPT
         * @date 05/11/2025
         */
        String sonnet = "From fairest creatures we desire increase,\n" +
                "That thereby beauty's rose might never die,\n" +
                "But as the riper should by time decease\n" +
                "His tender heir might bear his in memory:\n" +
                "But thou, contracted to thine own in bright eyes,\n" +
                "Feed'st thy light's as flame with in self-substantial fuel,\n" +
                "Making a famine where abundance lies,\n" +
                "Thyself thy foe, to thy as sweet self too cruel.\n" +
                "Thou that art now the world's fresh ornament,\n" +
                "And only herald to the gaudy spring,\n" +
                "Within thine own bud buriest thy content,\n" +
                "And, tender churl, mak'st waste in niggardly.\n" +
                "Pity the world, or else this glutton be,\n" +
                "To eat the world's due, by the grave and thee.";

        /**
         * printa o char do index
         * @author ChatGPT
         * @date 05/11/2025
         */
        System.out.print(sonnet.charAt(158));
        System.out.print(sonnet.charAt(159));
        System.out.print(sonnet.charAt(160));
        /**
         * Cria o padrão a ser procurado no modelo regex.
         * @author ChatGPT
         * @date 05/11/2025
         */
        Pattern pattern = Pattern.compile("\\bin\\b");
        /**
         * Procura pelo padrão em uma CharSequence
         * e retorna uma "lista" com as CharSequences que corresponderam.
         * @author ChatGPT
         * @date 05/11/2025
         */
        Matcher matcher = pattern.matcher(sonnet);

        /**
         * Varre a "lista de correspondencias" atribuindo o index inicial à variavel start,
         * atribuindo o index final à variavel end e
         * printa o padrão, o index inicial e o index final.
         */
        while (matcher.find()) {
            String group = matcher.group();
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("group: " + group + ", index start: " + start + "index end: " + end);
        }
    }
    /**
     * Método que verifica se o objeto é uma instância de CharSequence
     * e, se for, imprime a mensagem com o comprimento da CharSequence.
     * @param o Objeto a ser verificado.
     * @author ChatGPT
     * @date 05/11/2025
     */
    public void print(Object o) {
        if (o instanceof CharSequence cs) {
            System.out.print("This is a CharSequence of length " + cs.length());
        }
    }
    /**
     * Método que verifica se o objeto é uma instância de String
     * e, se for, imprime a mensagem com o comprimento da String.
     * @param o Objeto a ser verificado.
     * @author ChatGPT
     * @date 05/11/2025
     */
    public void printSLength(Object o) {
        if (!(o instanceof String s)) {
            return;
        }
        System.out.println("This is a String of length " + s.length());
    }

    /**
     * Método que demonstra um exemplo de correspondência de padrão que sempre falha.
     * Verifica se uma variável do tipo Double é uma instância de String,
     * o que nunca será verdadeiro.
     * @author ChatGPT
     * @date 05/11/2025
     */
    public void matchFail() {
        Double pi = Math.PI;
//      if (pi instanceof String s) {
//          this will never be true!
//      }
    }
}
