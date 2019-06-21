import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    Map app = new HashMap();
    app.put(1, "Android");
    app.put(2, "Java");
    app.put(3, "Python");
    app.put(4, "ML");
    app.put(5, "AI");
    app.put(6, "VR");
    app.put(7, "Web shit");
    for (Object o : app.keySet()) {
      // app.keySet();
      System.out.println(o + ": " + app.get(o));
    }
  }
}
