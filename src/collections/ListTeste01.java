package collections;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        nomes.add("Marcos");
        nomes.add("Stevie");

        for (String nome : nomes) {
            System.out.println(nomes);
        }
        nomes.add("Fernandes");
        System.out.println("----------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

    }
}
