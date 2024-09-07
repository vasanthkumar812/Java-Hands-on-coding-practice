/**
 * nested
 */
public class nested {

    public static void main(String[] args) {
        int x=4;
        int y=4;
        int num=1;
        
        //pattern 1
        for(int a=1; a<=x; a++){
            for(int b=1; b<=y; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        //pattern 2
        for(int a=1; a<=x; a++){
            for(int b=1; b<=y; b++){
                if(a==1||b==1||a==x||b==y){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }  System.out.println();

         //pattern 3

        for(int a=1; a<=x; a++){
            for(int b=1; b<=a; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

         //pattern 4

        for(int a=x; a>=1; a--){
            for(int b=1; b<=a; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

         //pattern 5

        for(int a=1; a<=x; a++){
            for(int b=1; b<=x; b++){
                if(b<=x-a){
                    System.out.print("-");
                }
                else{
                    System.out.print("*");
                }
              
            }
            System.out.println();
        }
        System.out.println();

         //pattern 6

         for(int a=1; a<=x; a++){
            for(int b=1; b<=a; b++){
                System.out.print(b+" ");   
            }
            System.out.println();
        }
        System.out.println();

        //pattern 7

        for(int a=x; a>=1; a--){
            for(int b=1; b<=a; b++){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        //pattern 8
        for(int a=1; a<=x; a++){
            for(int b=1; b<=a; b++){
                System.out.print(num+" ");   
                num++;
            }
            System.out.println();
        }
        System.out.println();

        //pattern 9

        for(int a=1; a<=x; a++){
            for(int b=1; b<=a; b++){
                int sum=a+b;
                if(sum%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }    
            }
            System.out.println();
        }
        System.out.println();

        //pattern 10
        int z=4;
        int n=8;

        for(int i=1; i<=z; i++){
            for(int j=n-i+1; j>=1; j--){
                if(j<=n/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
        System.out.println();
        //pattern 11
        int r=5;
    
        for(int a=1; a<=r; a++){
            for(int b=1; b<=r-a; b++){
                
                 System.out.print("-");
            }
            for(int b=1; b<=a; b++){
                
                System.out.print(a+" ");
           }
            System.out.println();
        }
        System.out.println();


        int v = 5;
        for(int i=1; i<=v; i++) {
            //spaces
            for(int j=1; j<=v-i; j++) {
                System.out.print("-");
            }
 
 
            //first part
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
 
 
            //second part
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
 

















    }
}