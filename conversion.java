
import java.util.Scanner;
public class conversion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string: ");
        String data = sc.nextLine();
        String lower= data.toLowerCase();
        String upper= data.toUpperCase();
        System.out.println("Lower case: "+ lower);
        System.out.println("Upper case: "+upper);
    }
}
