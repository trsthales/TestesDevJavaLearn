package tests;
/**
 * Classe que demonstra que Strings em Java são imutáveis.
 * Mesmo tentando modificar o valor da String dentro do método,
 * a String original permanece inalterada fora do método.
 * @author ChatGPT
 * @date 05/10/2025
 */
public class ChangeValueOfString {
    public String modifyString(String toPrint) {
        toPrint = "Hello";
        return toPrint;
    }

}
