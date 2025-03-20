package Collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("Akash");
        linkedList.add("Shubham");
        linkedList.add(30);
        linkedList.add(true);
        System.out.println(linkedList); // [Akash, Shubham, 30, true]
        System.out.println(linkedList.size()); //4
        linkedList.set(1,"Shinu");
        System.out.println(linkedList); //[Akash, Shinu, 30, true]
        System.out.println(linkedList.remove(2)); //[Akash, Shinu, true]
        linkedList.addFirst("Shraddha");
        System.out.println(linkedList); //[Shraddha, Akash, Shinu, true]
    }
}
