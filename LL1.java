import java.util.*;
class LL1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

       /*  list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.add("list");
        list.addFirst("this");
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("NULL");
        System.out.println(list.size());
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);*/

        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        Collections.reverse(list);
        System.out.println(list);
       
    }
}
