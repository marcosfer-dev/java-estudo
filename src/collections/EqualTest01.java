package collections;

public class EqualTest01 {
    public static void main(String[] args) {
        String nome = "Marcos";
        String nome2 = "Marcos";
        String nome3 = new String("Marcos");

        System.out.println(nome == nome2); //Ambas variáveis fazem referência ao mesmo objeto -- TRUE
        System.out.println(nome.equals(nome2));

        System.out.println(nome == nome3); //Ambas variáveis fazem referência a objetos diferentes -- FALSE
        System.out.println(nome.equals(nome3));
    }
}
