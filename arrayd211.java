import java.util.Scanner;

public class arrayd211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
     
        int[][] array= new int [rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                array[i][j]=sc.nextInt();
            } System.out.println();
        }
        for(int i=0; i<1; i++){
            for(int j=0; j<cols; j++){
              System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=1; i<rows-1; i++){
            for(int j=cols-1; j>1; j--){
              System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=rows-1; i>1; i--){
            for(int j=cols-1; j>=0; j--){
              System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    
      
    
      


        sc.close();
    }
    
}