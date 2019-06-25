import java.util.Collections;
import java.util.HashSet;
import java.util.Enumeration;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("N");
        hashSet.add("D");
        hashSet.add("R");
        hashSet.add("O");
        hashSet.add("I");
        hashSet.add("D");

        Enumeration<String> e = Collections.enumeration(hashSet);
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement() + " ");
        }

    }
}