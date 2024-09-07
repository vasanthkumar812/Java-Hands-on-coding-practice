import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = sc.nextLine().charAt(0);
        switch (choice) {
            case 'a': System.out.println("your option is a !");
                break;
            case 'b': System.out.println("your option is b !");
                break;
            case 'c': System.out.println("your option is c !");
                break;    
            case 'd': System.out.println("your option is d !");
                break;
            default: System.out.println("invalid option");
                break;
        } sc.close();
    }
}
