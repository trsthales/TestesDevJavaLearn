package tests;
/**
 * Classe que demonstra que Strings em Java são imutáveis.
 * Mesmo tentando modificar o valor da String dentro do método,
 * a String original permanece inalterada fora do método.
 * @author ChatGPT
 * @date 05/10/2025
 */
public class ConstWordTest {

    public static void main(String[] args) {
        String toPrint = "olá mundo";
        ChangeValueOfString f = new ChangeValueOfString();
        String toPrint2 = f.modifyString(toPrint);
        System.out.println(toPrint2);
    }
}
