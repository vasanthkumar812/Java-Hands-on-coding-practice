import java.util.Scanner;

/**
 * recursion1
 */
public class recursion1 {
        

    public static void printsum(int n ,int sum){
        if(n==0){
           
            System.out.println(sum);
            return;
        }
        sum+=n;
       
        printsum(n-1,sum);

    }

    public static void printfact(int n ,int fact){
        if(n==0){
           
            System.out.println(fact);
            return;
        }
        fact*=n;
       
        printfact(n-1,fact);

    }
    public static void printfibo(int a,int b,int n){
        if(n==0){
            return;
        }
        System.out.println(a+b);
       
        printfibo(b,a+b,n-1);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        printsum(n,0);
        printfact(n,1);
        printfibo(0,1,n);

        sc.close();
    }
}