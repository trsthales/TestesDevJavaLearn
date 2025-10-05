package tests;
/**
 * Classe que demonstra que Strings em Java são imutáveis.
 * Mesmo tentando modificar o valor da String dentro do método,
 * a String original permanece inalterada fora do método.
 * @author ChatGPT
 * @date 05/10/2025
 */
public class TestingImmutabilityOfString {
    public static void main(String[] args) {
        String original = "World";
        System.out.println("Before method call: " + original);

        ChangeValueOfString changer = new ChangeValueOfString();
        String modified = changer.modifyString(original);

        System.out.println("After method call: " + original);
        System.out.println("Returned from method: " + modified);
    }
}
