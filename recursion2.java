public class recursion2 {
public static void towerofHanoi(int n,String src,String helper,String dest) {
    if(n==1){
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        return;
    }
    towerofHanoi(n-1, src, dest, helper);
    System.out.println("transfer disk "+n+" from "+src+" to "+dest);

    towerofHanoi(n-1, helper, src, dest);

    
    
}
public static void revString(String str,int idx){
    if(idx==0){
        System.out.println(str.charAt(idx));
        return;
    }
    System.out.print(str.charAt(idx));
    revString(str, idx-1);
   
    }
    public static int first=-1;
    public static int last=-1;

    public static void findOccurance(String str1,int id, char element){
        if(id==str1.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str1.charAt(id);
        if (currChar==element) {
            if (first==-1) {
                first=id;
            }else{
                last=id;
            }
            
        }
        findOccurance(str1, id+1, element);

    }
    public static boolean isSorted(int arr[],int inx){
        if(inx==arr.length-1){
            return true;
        }
        if (arr[inx]<arr[inx+1]) {
            return isSorted(arr, inx+1);
            
        }
        else{
            return false;
        }
    }
    public static void moveallX(String str1,int id,int count,String newstr){
        if(id==str1.length()){
            for(int i=0;i<count;i++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        char currChar=str1.charAt(id);
        if (currChar=='x') {
            count++;
            moveallX(str1, id+1, count, newstr);
        }else{
            newstr+=currChar;
            moveallX(str1, id+1, count, newstr);
        }

    }

    public static void main(String[] args) {
        int n=1;
        String str="abcde";
        revString(str,str.length()-1);
        String str1="acxxcxfhxaac";
        int count=0;
        moveallX(str1,0,count,"");
        findOccurance(str1,0,'c');
        int arr[]={1,2,4,5};
        System.out.println(isSorted(arr,0));
        
       

        towerofHanoi(n,"S","H","D");
        
    }
}
