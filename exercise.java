import java.util.Scanner;

public class exercise {
     public static void average(int a ,int b ,int c ){
        float avg= (a+b+c)/3;
        System.out.println(avg);
        
    }
    public static void odd(int n){
      
        int num=1;
        int sum=0;
        for(int i=1;i<=n;i++){
           sum=sum+num;
           num=num+2;
        }
        System.out.println(sum);
    }
   
  public static void greater(int x,int y){
        if(x>y){
            System.out.println(x+" is greater number");
        }
        else if(x<y){
            System.out.println(y+" is greater number");
        }
        else{
            System.out.println("both are equal");
        }
    }
    
      public static void cofcircle(float r){
      double curicum= 2*(3.14)*r;
        System.out.println(curicum); 
    }
     
     public static void vote(int age){
        if(age>=18){
            System.out.println("your are eligible to vote !!");
        }
        else{
            System.out.println("your not eligible to vote !");
        }
     }
     public static void loop(){
        int count =0;
        do{
            System.out.println(count);
            count++;
        }while(count==0);
     }

     public static void countpno(int m){
        Scanner sc =new Scanner(System.in);
        int[] num = new int[m];
        for( int i=0; i<=m-1; i++){
           num[i]=sc.nextInt();
        }
        sc.close();
        int c1=0;
        int c2=0;
        int c3=0;
        for( int i=0; i<=m-1; i++){
            if(num[i]>0){
                c1++;
            }
            else if(num[i]<0){
                c2++;
            }
            else{
                c3++;
            }
        }
        
        System.out.println("postive numbers-"+c1+" negative numbers-"+c2+" zero-"+c3);

     } 
     
       public static void exponent(int e, int v){
        double expo=Math.pow(e, v);
        System.out.println(expo);
     }
      
     
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();

        // int n =sc.nextInt();

        // int x=sc.nextInt();
        // int y=sc.nextInt();

        // float r =sc.nextFloat();

        // int age=sc.nextInt();
        // int m=sc.nextInt();

        int e=sc.nextInt();
        int v=sc.nextInt();


        // average(a,b,c);
        // odd(n);
        // greater(x,y);
        // cofcircle(r);
        // vote(age);
        // loop();
        // countpno(m);
        exponent(e,v);





        sc.close();
     }
}
