package Collection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Object> v=new Vector<>(/*24*/10);
        System.out.println(v.capacity()); //24--/10
        for (int i = 0; i < 10; i++) {
            v.addElement(i);
        }
        System.out.println(v.capacity()); //24--10
        v.addElement("A");
        System.out.println(v.capacity()); //24--20
        System.out.println(v); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
        System.out.println(v.capacity());
    }

}
