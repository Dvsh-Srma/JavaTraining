import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
  public static void main(String[] args) {
    Set<String> set = new TreeSet<String>();
    set.add("A");
    set.add("N");
    set.add("D");
    set.add("R");
    set.add("O");
    set.add("I");
    set.add("D");

    Iterator<String> it = set.iterator();
    while (it.hasNext()) {
      Object item = it.next();
      System.out.println(item + " ");
    }
  }
}