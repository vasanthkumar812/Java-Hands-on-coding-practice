public class bitmanip15 {
    public static void main(String[] args) {
        int n=5;//0101
        int pos= 2;
        int bitmask=1<<pos;
        //get
        if((bitmask&n)==0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }

        //set
       int newnum=bitmask|n;
       System.out.println(newnum);

       //clear
       int newbitmask=~(bitmask);
       int newclear= newbitmask&n;
       System.out.println(newclear);
       
       //update
       int oper=0;
       if (oper==1) {
        System.out.println(newnum);
        
       }
       else{
        System.out.println(newclear);
       }


    }
}
