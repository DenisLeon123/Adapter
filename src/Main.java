import dleon.EnumerationIterator;

import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {
        Enumeration<String> enumer = new Enumeration<String>() {
            @Override
            public boolean hasMoreElements() {
                return false;
            }

            @Override
            public String nextElement() {
                return null;
            }
        };

        EnumerationIterator<String> enumerationIterator = new EnumerationIterator<>(enumer);
        System.out.println(enumerationIterator.hasNext());

    }
}
