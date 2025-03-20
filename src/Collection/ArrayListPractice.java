package Collection;
import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("Hello");
        a.add("Shinu");
        a.add(10);
        a.add(10.5);
        a.add(true);
        a.add(null);
        a.add(null);
        System.out.println(a); //[Hello, 10, 10.5, true, null, null]
        a.remove(3);
        System.out.println(a); //[Hello, 10, true, null, null]
        a.add(4,"Shinu");
        System.out.println(a);  // [Hello, 10, true, Shinu, null, null]
    }
}
