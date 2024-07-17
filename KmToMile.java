import java.util.Scanner;
public class KmToMile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter km: ");
        float km = sc.nextFloat();
        double mile = km / 1.6093;
        System.out.println("mile: "+ mile);
    }
}
