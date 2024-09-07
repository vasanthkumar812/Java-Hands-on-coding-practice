import java.util.Scanner;

public class stringbuilder13 {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);

        StringBuilder sb= new StringBuilder("tony");
        System.out.println(sb);

        StringBuilder ab=  new StringBuilder("apna college");

        System.out.println(ab.charAt(1));

        sb.setCharAt(0, 'p');

        System.out.println(sb);
        sb.insert(0,'t');
        System.out.println(sb);
        sb.delete(1, 2);
        System.out.println(sb);
        sb.append(" stark");
        System.out.println(sb);
        System.out.println(sb.length());

       for(int i=0; i<sb.length()/2; i++){
        int start =i;
        int end=sb.length()-i-1;
        char startchar = sb.charAt(start);
        char endchar= sb.charAt(end);
        sb.setCharAt(start, endchar);
        sb.setCharAt(end, startchar);
       }
       System.out.println(sb);


        sc.close();
    }
}
