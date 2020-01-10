package conllection;

import java.util.LinkedList;

/**
 * Created by lenovo on 2019/12/30.
 */
public class LinkedListDemo {
    public static void main (String args[]){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        System.out.println("111");
        String str1 = new String();
        System.out.println(str1.getClass() == String.class);
        System.out.println((Object) str1.getClass() == (Object)String.class);
        System.out.println((Object) str1 == (Object) String.class);
    }


}
