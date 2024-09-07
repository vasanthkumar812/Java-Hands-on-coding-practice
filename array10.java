import java.util.Scanner;

public class array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int[] num=new int[size];
        //String name []=new String[size];
   /* for(int i=0; i<=size-1; i++){
        name[i]=sc.next();
    }
    for(int i=0; i<=size-1; i++){
        System.out.print(name[i]+" ");
    }*/
   
  /*for(int i=0; i<=size-1; i++){
    num[i]=sc.nextInt();
  }
  int min=num[0];
  int max=0;
  for(int i=0; i<=size-1; i++){
    if(num[i]<=min){
        min= num[i];
    }
    if(num[i]>max){
        max=num[i];
    }
    System.out.println(num[i]);
    }
   
    System.out.println(min+"is minimun");
    System.out.println(max+"is maximum");*/

    for(int i=0; i<=size-1; i++){
        num[i]=sc.nextInt();
      }int flag=0;
      for(int i=0; i<=size-2; i++){
        if(num[i]>num[i+1]){
          flag=1;

        }
        else{
          flag=0;
        }
      }
      if(flag==0){
        System.out.println("ascending order");
      }
      else{
        System.out.println("not in sorting method");
      }
      
  
sc.close();
    }
}
