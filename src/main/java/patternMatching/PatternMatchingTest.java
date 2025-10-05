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
         * Declaração de uma string contendo um soneto.
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
         * @date 05/11/2025
         * printa o char do index
         */
        System.out.print(sonnet.charAt(158));
        System.out.print(sonnet.charAt(159));
        System.out.print(sonnet.charAt(160));
        /**
         * @date 05/11/2025
         * Cria o padrão a ser procurado no modelo regex.
         */
        Pattern pattern = Pattern.compile("\\bin\\b");
        /**
         * @date 05/11/2025
         * Procura pelo padrão em uma CharSequence
         * e retorna uma "lista" com as CharSequences que corresponderam.
         */
        Matcher matcher = pattern.matcher(sonnet);

        /**
         * @date 05/11/2025
         * varre a "lista de correspondencias" atribuindo o index inicial à variavel start,
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

}
