public class backtracking {
    public static void printPerm(String str,String perm,int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0, i) +str.substring(i+1);
            System.out.println(currChar);
            printPerm(newStr, perm, idx+1);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        printPerm(str, "", 1);

    }
}
