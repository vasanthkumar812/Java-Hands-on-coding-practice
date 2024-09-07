import java.util.ArrayList;

public class recursion3 {
    public static void printPermutation(String str, int idx, String perm) {
        if(str.length() == 0) {
            System.out.println(perm);
            return;
        }
       
        for(int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, idx+1, perm+currChar);
        }
    }
    public static int countpath(int i,int j,int m,int n){
        if(i==m-1||j==n-1){
            return 1;
        }
        return countpath(i+1, j, m, n)+countpath(i, j+1, m, n);
    }
    public static int placeTiles(int n, int m){
        if(n<m){
            return 1;
        } else if(n==m){
            return 2;
        }
        return placeTiles(n-1, m)+placeTiles(n-m, m);
    }
    public static int pairFriends(int n){
        if(n<=1){
            return 1;
        }
        return pairFriends(n-1)+(n-1)*pairFriends(n-2);
    }
    public static void printSubsets(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubsets(subset);
            return ;
        }
        findSubsets(n-1, subset);
        subset.add(n);
        findSubsets(n-1, subset);
        subset.remove(subset.size()-1);
    }

    public static void main(String args[]) {
        String str = "ad";
        printPermutation(str, 0, "");
        
        int m=2;
        int n=4;
        System.out.println(countpath(0,0,m,n));
        System.out.println(placeTiles(n,m));
        System.out.println(pairFriends(n));
        findSubsets(n,new ArrayList<Integer>());

        
    }
 
}
  