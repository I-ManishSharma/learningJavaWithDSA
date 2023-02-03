import java.sql.SQLOutput;
import java.util.ArrayList;

public class topicArrayList {
    public static void main(String[] args) {

        //Declaring or Creating an ArrayList.
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Add items
        list.add(3);
        list.add(4);
        list.add(6);
        System.out.println(list);

        //Accessing an item
        int ele1 = list.get(0);
        int ele2 = list.get(1);
        System.out.println("Element at index 0 : "+ele1);
        System.out.println("Element at index 1: "+ele2);
                            //OR
        System.out.println("Element at index 2: "+list.get(2));

        //Change an element
        list.set(0,100);
        System.out.println(list);

        //Remove an item
        list.remove(1);
        System.out.println(list);

        //ArrayList Size
        int size = list.size();
        System.out.println("Using size object : "+size);
                //OR
        System.out.println("Without creating an object : "+list.size());

        //Loop through an ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index "+i+" : "+list.get(i));
        }

        //Remove all element from ArrayList
        list.clear();
        System.out.println(list);
    }
}
