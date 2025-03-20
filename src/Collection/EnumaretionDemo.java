package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumaretionDemo {
    public static void main(String[] args) {
        Vector<Object> v=new Vector<>();
        for (int i = 0; i < 10; i++) {
            v.addElement(i);
        }
        System.out.println(v); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        Enumeration<Object> e=v.elements();
        while (e.hasMoreElements()){
            Integer integer=(Integer) e.nextElement();
            if (integer%2 == 0) {
                System.out.print(integer+" "+" "); //0 2 4 8
            }
        }
    }
}
