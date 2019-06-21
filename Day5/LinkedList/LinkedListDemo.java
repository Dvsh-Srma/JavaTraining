import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Android");
        list.add("iOS");
        list.add("Flutter");
        list.add("Xamarin");
        list.add("React Native");
        list.add("Ionic");
        list.add("Phonegap");
        System.out.println("Original Contents of the list are \n" + list);
        list.remove("Xamarin");
        list.remove(5);
        System.out.println("Contents after deletion of items are \n" + list);

        String val = (String) list.get(4);
        list.set(4, val + " changed");
        System.out.println("List after changing \n" + list);
    }
}