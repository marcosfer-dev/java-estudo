package collections;

import collections.dominio.Smartphone;

public class EqualTeste02 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("1ABC1", "Iphone");
        System.out.println(s1.equals(s2)); // true

        Smartphone s3 = new Smartphone("1ABC1", "Iphone");
        Smartphone s4 = s3; // agora faz referência ao mesmo objeto
        System.out.println(s3.equals(s4)); // true
    }
}
