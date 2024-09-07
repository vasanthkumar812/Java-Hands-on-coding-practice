//import java.util.ArrayList;
//import java.util.Collections;
import java.util.*;
public class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();

        //add elemnts
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get elements
        int element=list.get(0);
        System.out.println(element);

        //ele in between
        list.add(1,5);
        System.out.println(list);

        //set element
        list.set(2, 2);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        int size=list.size();
        System.out.println(size);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }System.out.println();

        Collections.sort(list);
        System.out.println(list);

    }
}