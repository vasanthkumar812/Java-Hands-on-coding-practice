import java.util.Scanner;

public class functions7 {

    //  public static int product(int a,int b) {
    //    return a*b;
    //}

    //factorial
    public static void fact(int m){
        int factorial=1;
        for(int i=m;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
    //prime
    public static void prime(int m){
        if(m%2!=0||m==2){
            System.out.println("number is prime");
        }
        else{
            System.out.println("not prime");
        }
    }
     //even
     public static void even(int m){
        if(m%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("not even");
        }
    }
      //table
      public static void table(int m){
        
        for(int i=1;i<=10;i++){
           System.out.println(m+" * "+i+" = "+m*i);
        }
        
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        fact(m);
        prime(m);
        even(m);
        table(m);
       
       // int a=sc.nextInt();
       // int b=sc.nextInt();
        // System.out.println(product( a,b));
    
        sc.close();
    }
    
}
