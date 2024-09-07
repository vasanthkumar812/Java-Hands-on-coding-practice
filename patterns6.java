public class patterns6 {
    public static void main(String[] args) {
        int n=4;
        //part 1
        for(int i=1; i<=n; i++){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            
            for(int j=i;j<=2*n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //part 2
        for(int i=n; i>=1; i--){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            
            for(int j=i;j<=2*n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //pattern 11 rhombus
        int m=5;
        for(int i=1; i<=m; i++){
           
            //spaces
            for(int j=1;j<=m-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();

        }  
        System.out.println();
        //pyramid
        int a=5;
        for(int i=1; i<=a; i++){
           
            //spaces
            for(int j=1;j<=a-i; j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1;j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }    


         //pattern 13 palindrome
         int p=5;
         for(int i=1; i<=p; i++){
            
             //spaces
             for(int j=1;j<=p-i; j++){
                 System.out.print(" ");
             }
             //part 1
             for(int j=i; j>=1; j--){
                 System.out.print(j);
             }
             //part 2
             for(int j=2; j<=i; j++){
                System.out.print(j);
            }
             System.out.println();
 
         }   System.out.println();

        //pattern 14 diamond 
        int k=5;
        //part1
        for(int i=1; i<=k; i++){
           
            //spaces
            for(int j=1;j<=k-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();

        } 
         //part 2
        for(int i=k; i>=1; i--){
           
            //spaces
            for(int j=1;j<=k-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();

        }  
        System.out.println();

        int h=4;
        //part 1
        for(int i=1; i<=h; i++){
            //stars
        
                for(int j=1; j<=h; j++){
                    if (j==1||j==i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                 
                }
                for(int j=h; j>=1; j--){
                    if (j==1||j==i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                 
                }
            
            //stars
       

            System.out.println();
        }

        //part 2
        for(int i=n; i>=1; i--){
            for(int j=1; j<=h; j++){
                if (j==1||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
             
            }
            for(int j=h; j>=1; j--){
                if (j==1||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
             
            }
        
            System.out.println();
        }
        System.out.println();
          //pattern 11 rhombus
          m=5;
          for(int i=1; i<=m; i++){
             
              //spaces
              for(int j=1;j<=m-i; j++){
                  System.out.print(" ");
              }
              //stars
              if (i==1||i==m) {
                for(int j=1; j<=m; j++){
                    System.out.print("*");
                }
                
              }
              else{
                for(int j=1; j<=m; j++){
                    if(j==1||j==m){
                      System.out.print("*");
                    }
                    else{
                      System.out.print(" ");
                    }
                }

              }
             
              System.out.println();
  
          }  
          System.out.println();


        //pyramid
         a=5;
        for(int i=1; i<=a; i++){
           
            //spaces
            for(int j=1;j<=a-i; j++){
                System.out.print(" ");
            }
            //numbers
            int val=0;
            for(int j=1;j<=i; j++){
                
                val=val+1;
               if(j==1||j==i){
                System.out.print("1 ");
               }
               else{
                System.out.print(val+" ");
               }
               
            }
            System.out.println();
        }    


    

    }
}
