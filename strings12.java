import java.util.Scanner;
public class strings12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String str=sc.next();
       
        int n=sc.nextInt();
       
        String array[]=new String[n];
        int totlength=0;
        for (int i = 0; i <n; i++) {
            array[i]=sc.nextLine();
            totlength= totlength + array[i].length();
        }
        
        System.out.println(totlength);
               /*  String result="";
   for (int i = 0; i <str.length(); i++) {
    if(str.charAt(i)=='v'){
        result=result+"i";
    }
    else{
        result+=str.charAt(i);
    }

    }
    System.out.println(result);*/
    
   sc.close();



        
    }
}
